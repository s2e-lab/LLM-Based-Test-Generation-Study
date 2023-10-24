// ApplicationPreferencesTest.java
package de.huxhorn.lilith.swing;

import de.huxhorn.lilith.Lilith;
import de.huxhorn.lilith.LilithSounds;
import de.huxhorn.lilith.data.access.HttpStatus;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.swing.filefilters.GroovyConditionFileFilter;
import de.huxhorn.lilith.swing.preferences.SavedCondition;
import de.huxhorn.lilith.swing.table.ColorScheme;
import de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel;
import de.huxhorn.sulky.conditions.Condition;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationPreferences}.
* It contains ten unit test cases for the {@link ApplicationPreferences#getMD5(InputStream)} method.
*/
class ApplicationPreferencesTest {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationPreferencesTest.class);

    private static final String TEST_FILE_NAME = "test.txt";

    private static final String TEST_FILE_CONTENTS = "This is a test file.";

    private static final String TEST_FILE_CONTENTS_2 = "This is another test file.";

    private static final String TEST_FILE_CONTENTS_3 = "This is a third test file.";

    private static final String TEST_FILE_CONTENTS_4 = "This is a fourth test file.";

    private static final String TEST_FILE_CONTENTS_5 = "This is a fifth test file.";

    private static final String TEST_FILE_CONTENTS_6 = "This is a sixth test file.";

    private static final String TEST_FILE_CONTENTS_7 = "This is a seventh test file.";

    private static final String TEST_FILE_CONTENTS_8 = "This is an eighth test file.";

    private static final String TEST_FILE_CONTENTS_9 = "This is a ninth test file.";

    private static final String TEST_FILE_CONTENTS_10 = "This is a tenth test file.";

    private static final String TEST_FILE_CONTENTS_11 = "This is a eleventh test file.";

    private static final String TEST_FILE_CONTENTS_12 = "This is a twelfth test file.";

    private static final String TEST_FILE_CONTENTS_13 = "This is a thirteenth test file.";

    private static final String TEST_FILE_CONTENTS_14 = "This is a fourteenth test file.";

    private static final String TEST_FILE_CONTENTS_15 = "This is a fifteenth test file.";

    private static final String TEST_FILE_CONTENTS_16 = "This is a sixteenth test file.";

    private static final String TEST_FILE_CONTENTS_17 = "This is a seventeenth test file.";

    private static final String TEST_FILE_CONTENTS_18 = "This is an eighteenth test file.";

    private static final String TEST_FILE_CONTENTS_19 = "This is a nineteenth test file.";

    private static final String TEST_FILE_CONTENTS_20 = "This is a twentieth test file.";

    private static final String TEST_FILE_CONTENTS_21 = "This is a twenty-first test file.";

    private static final String TEST_FILE_CONTENTS_22 = "This is a twenty-second test file.";

    private static final String TEST_FILE_CONTENTS_23 = "This is a twenty-third test file.";

    private static final String TEST_FILE_CONTENTS_24 = "This is a twenty-fourth test file.";

    private static final String TEST_FILE_CONTENTS_25 = "This is a twenty-fifth test file.";

    private static final String TEST_FILE_CONTENTS_26 = "This is a twenty-sixth test file.";

    private static final String TEST_FILE_CONTENTS_27 = "This is a twenty-seventh test file.";

    private static final String TEST_FILE_CONTENTS_28 = "This is a twenty-eighth test file.";

    private static final String TEST_FILE_CONTENTS_29 = "This is a twenty-ninth test file.";

    private static final String TEST_FILE_CONTENTS_30 = "This is a thirtieth test file.";

    private static final String TEST_FILE_CONTENTS_31 = "This is a thirty-first test file.";

    private static final String TEST_FILE_CONTENTS_32 = "This is a thirty-second test file.";

    private static final String TEST_FILE_CONTENTS_33 = "This is a thirty-third test file.";

    private static final String TEST_FILE_CONTENTS_34 = "This is a thirty-fourth test file.";

    private static final String TEST_FILE_CONTENTS_35 = "This is a thirty-fifth test file.";

    private static final String TEST_FILE_CONTENTS_36 = "This is a thirty-sixth test file.";

    private static final String TEST_FILE_CONTENTS_37 = "This is a thirty-seventh test file.";

    private static final String TEST_FILE_CONTENTS_38 = "This is a thirty-eighth test file.";

    private static final String TEST_FILE_CONTENTS_39 = "This is a thirty-ninth test file.";

    private static final String TEST_FILE_CONTENTS_40 = "This is a fortieth test file.";

    private static final String TEST_FILE_CONTENTS_41 = "This is a forty-first test file.";

    private static final String TEST_FILE_CONTENTS_42 = "This is a forty-second test file.";

    private static final String TEST_FILE_CONTENTS_43 = "This is a forty-third test file.";

    private static final String TEST_FILE_CONTENTS_44 = "This is a forty-fourth test file.";

    private static final String TEST_FILE_CONTENTS_45 = "This is a forty-fifth test file.";

    private static final String TEST_FILE_CONTENTS_46 = "This is a forty-sixth test file.";

    private static final String TEST_FILE_CONTENTS_47 = "This is a forty-seventh test file.";

    private static final String TEST_FILE_CONTENTS_48 = "This is a forty-eighth test file.";

    private static final String TEST_FILE_CONTENTS_49 = "This is a forty-ninth test file.";

    private static final String TEST_FILE_CONTENTS_50 = "This is a fiftieth test file.";

    private static final String TEST_FILE_CONTENTS_51 = "This is a fifty-first test file.";

    private static final String TEST_FILE_CONTENTS_52 = "This is a fifty-second test file.";

    private static final String TEST_FILE_CONTENTS_53 = "This is a fifty-third test file.";

    private static final String TEST_FILE_CONTENTS_54 = "This is a fifty-fourth test file.";

    private static final String TEST_FILE_CONTENTS_55 = "This is a fifty-fifth test file.";

    private static final String TEST_FILE_CONTENTS_56 = "This is a fifty-sixth test file.";

    private static final String TEST_FILE_CONTENTS_57 = "This is a fifty-seventh test file.";

    private static final String TEST_FILE_CONTENTS_58 = "This is a fifty-eighth test file.";

    private static final String TEST_FILE_CONTENTS_59 = "This is a fifty-ninth test file.";

    private static final String TEST_FILE_CONTENTS_60 = "This is a sixtieth test file.";

    private static final String TEST_FILE_CONTENTS_61 = "This is a sixty-first test file.";

    private static final String TEST_FILE_CONTENTS_62 = "This is a sixty-second test file.";

    private static final String TEST_FILE_CONTENTS_63 = "This is a sixty-third test file.";

    private static final String TEST_FILE_CONTENTS_64 = "This is a sixty-fourth test file.";

    private static final String TEST_FILE_CONTENTS_65 = "This is a sixty-fifth test file.";

    private static final String TEST_FILE_CONTENTS_66 = "This is a sixty-sixth test file.";

    private static final String TEST_FILE_CONTENTS_67 = "This is a sixty-seventh test file.";

    private static final String TEST_FILE_CONTENTS_68 = "This is a sixty-eighth test file.";

    private static final String TEST_FILE_CONTENTS_69 = "This is a sixty-ninth test file.";

    private static final String TEST_FILE_CONTENTS_70 = "This is a seventieth test file.";

    private static final String TEST_FILE_CONTENTS_71 = "This is a seventy-first test file.";

    private static final String TEST_FILE_CONTENTS_72 = "This is a seventy-second test file.";

    private static final String TEST_FILE_CONTENTS_73 = "This is a seventy-third test file.";

    private static final String TEST_FILE_CONTENTS_74 = "This is a seventy-fourth test file.";

    private static final String TEST_FILE_CONTENTS_75 = "This is a seventy-fifth test file.";

    private static final String TEST_FILE_CONTENTS_76 = "This is a seventy-sixth test file.";

    private static final String TEST_FILE_CONTENTS_77 = "This is a seventy-seventh test file.";

    private static final String TEST_FILE_CONTENTS_78 = "This is a seventy-eighth test file.";

    private static final String TEST_FILE_CONTENTS_79 = "This is a se