// JniInchiWrapper_0Test.java
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
class JniInchiWrapper_0Test {

    @Test
    void testGetInchiKey() throws JniInchiException {
        JniInchiWrapper wrapper = JniInchiWrapper.getWrapper();
        wrapper.getLock();
        try {
            JniInchiOutputKey key = wrapper.GetINCHIKeyFromINCHI("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3");
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchi());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKey());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiAuxInfo());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyAuxInfo());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExpl());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplAuxInfo());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyAuxInfoPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplPlainText());
            assertEquals("InChI=1S/C2H6O/c1-2-3/h3H,2H2,1H3", key.getInchiKeyExplAuxInfoPlainText());
            assertEquals("InChI=1S