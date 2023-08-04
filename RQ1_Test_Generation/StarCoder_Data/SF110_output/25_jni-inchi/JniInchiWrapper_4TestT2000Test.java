// JniInchiWrapper_4Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_4Test {

    private static final String ID = "jniinchi";

    private static final String VERSION = "1.03_1";

    /**
    * Maximum time to wait for a lock (in seconds).
    */
    private static final int MAX_LOCK_TIMEOUT = 15;

    /**
    * Flag indicating windows or linux.
    */
    private static final boolean IS_WINDOWS = System.getProperty("os.name", "").toLowerCase().startsWith("windows");

    /**
    * Switch character for passing options. / in windows, - on other systems.
    */
    static final String flagChar = IS_WINDOWS ? "/" : "-";

    /**
    * Records whether native library has been loaded by system.
    */
    private static boolean libraryLoaded = false;

    private static JniInchiWrapper inchiWrapper;

    private static final Lock lock = new ReentrantLock(true);

    /**
    * Loads native library.
    * @throws JniInchiException Library failed to load
    */
    public static synchronized void loadLibrary() throws LoadNativeLibraryException {
        if (!libraryLoaded) {
            try {
                NativeLibraryLoader.loadLibrary(ID, VERSION);
                // Check expected version of native code loaded
                // Throws NativeCodeException if unable to make call / wrong version
                checkNativeCodeVersion();
                // Everything is set up!
                libraryLoaded = true;
            } catch (NativeCodeException ex) {
                System.err.println();
                System.err.println("Error loading JNI InChI native code.");
                System.err.println("You may need to compile the native code for your platform.");
                System.err.println("See http://jni-inchi.sourceforge.net for instructions.");
                System.err.println();
                throw new LoadNativeLibraryException(ex);
            }
        }
    }

    /**
    * Checks the expected native code version has been loaded.
    * @throws NativeCodeException
    */
    private static void checkNativeCodeVersion() throws NativeCodeException {
        // Get native code version string
        String nativeVersion;
        try {
            nativeVersion = JniInchiWrapper.LibInchiGetVersion();
        } catch (UnsatisfiedLinkError e) {
            throw new NativeCodeException("Unable get native code version", e);
        }
        // Compare to expected version
        if (!VERSION.equals(nativeVersion)) {
            throw new NativeCodeException("JNI InChI native code version mismatch: expected " + VERSION + ", found " + nativeVersion);
        }
    }

    private static synchronized JniInchiWrapper getWrapper() throws LoadNativeLibraryException {
        if (inchiWrapper == null) {
            loadLibrary();
            init();
            inchiWrapper = new JniInchiWrapper();
        }
        return inchiWrapper;
    }

    /**
    * Constructor
    */
    private JniInchiWrapper() throws LoadNativeLibraryException {
    }

    /**
    * Checks and canonicalises options.
    *
    * @param ops  List of INCHI_OPTION
    */
    protected static String checkOptions(List<INCHI_OPTION> ops) throws JniInchiException {
        if (ops == null) {
            throw new IllegalArgumentException("Null options");
        }
        StringBuffer sbOptions = new StringBuffer();
        for (int i = 0; i < ops.size(); i++) {
            Object op = ops.get(i);
            if (op instanceof INCHI_OPTION) {
                sbOptions.append(flagChar + ((INCHI_OPTION) op).name() + " ");
            } else {
                throw new JniInchiException("Unrecognised InChI option");
            }
        }
        return sbOptions.toString();
    }

    /**
    * Checks and canonicalises options.
    *
    * @param ops          Space delimited string of options to pass to InChI library.
    *                     Each option may optionally be preceded by a command line
    *                     switch (/ or -).
    */
    protected static String checkOptions(final String ops) throws JniInchiException {
        if (ops == null) {
            throw new IllegalArgumentException("Null options");
        }
        StringBuilder sbOptions = new StringBuilder();
        StringTokenizer tok = new StringTokenizer(ops);
        while (tok.hasMoreTokens()) {
            String op = tok.nextToken();
            if (op.startsWith("-") || op.startsWith("/")) {
                op = op.substring(1);
            }
            INCHI_OPTION option = INCHI_OPTION.valueOfIgnoreCase(op);
            if (option != null) {
                sbOptions.append(flagChar + option.name());
                if (tok.hasMoreTokens()) {
                    sbOptions.append(" ");
                }
            } else {
                throw new JniInchiException("Unrecognised InChI option");
            }
        }
        return sbOptions.toString();
    }

    /**
    * <p>Generates the InChI for a chemical structure.</p>
    *
    * <p>If no InChI creation/stereo modification options are specified then a standard
    * InChI is produced, otherwise the generated InChI will be a non-standard one.</p>
    *
    * <p><b>Valid options:</b></p>
    * <pre>
    *  Structure perception (compatible with stdInChI):
    *    /NEWPSOFF   /DoNotAddH   /SNon
    *  Stereo interpretation (lead to generation of non-standard InChI)
    *    /SRel /SRac /SUCF /ChiralFlagON /ChiralFlagOFF
    *  InChI creation options (lead to generation of non-standard InChI)
    *    /SUU /SLUUD   /FixedH  /RecMet  /KET /15T
    * </pre>
    *
    * <p><b>Other options:</b></p>
    * <pre>
    *  /AuxNone    Omit auxiliary information (default: Include)
    *  /Wnumber    Set time-out per structure in seconds; W0 means unlimited
    *              In InChI library the default value is unlimited
    *  /OutputSDF  Output SDfile instead of InChI
    *  /WarnOnEmptyStructure
    *              Warn and produce empty InChI for empty structure
    *  /SaveOpt    Save custom InChI creation options (non-standard InChI)
    * </pre>
    *
    * @param input
    * @return
    * @throws JniInchiException
    */
    @SuppressWarnings("unchecked")
    public static JniInchiOutput getInchi(JniInchiInput input) throws JniInchiException {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetINCHI(input);
        } finally {
            lock.unlock();
        }
    }

    /**
    * <p>Calculates the Standard InChI string for a chemical structure.</p>
    * <p>The only valid structure perception options are NEWPSOFF/DoNotAddH/SNon. In any other structural
    * perception options are specified then the calculation will fail.</p>
    * @param input
    * @return
    * @throws JniInchiException
    */
    @SuppressWarnings("unchecked")
    public static JniInchiOutput getStdInchi(JniInchiInput input) throws JniInchiException {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetStdINCHI(input);
        } finally {
            lock.unlock();
        }
    }

    /**
    * <p>Converts an InChI into an InChI for validation purposes (the same as the -InChI2InChI option).</p>
    * <p>This method may also be used to filter out specific layers. For instance, /Snon would remove the
    * stereochemical layer; Omitting /FixedH and/or /RecMet would remove Fixed-H or Reconnected layers.
    * In order to keep all InChI layers use options string "/FixedH /RecMet"; option /InChI2InChI is not needed.</p>
    * @param input
    * @return
    * @throws JniInchiException
    */
    public static JniInchiOutput getInchiFromInchi(JniInchiInputInchi input) throws JniInchiException {
        if (input == null) {
            throw new IllegalArgumentException("Null input");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetINCHIfromINCHI(input.getInchi(), input.getOptions());
        } finally {
            lock.unlock();
        }
    }

    /**
    * Generated 0D structure from an InChI string.
    * @param input
    * @return
    * @throws JniInchiException
    */
    public static JniInchiOutputStructure getStructureFromInchi(JniInchiInputInchi input) throws JniInchiException {
        if (input == null) {