// TableColumn_6Test.java
package net.sourceforge.schemaspy.model;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableColumn}.
* It contains ten unit test cases for the {@link TableColumn#allowsImpliedChildren()} method.
*/
class TableColumn_6Test {

		private static final Logger logger = Logger.getLogger(TableColumn_6Test.class.getName());
		
		private static final boolean finerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean finestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean infoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean warningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean severeEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isDebugEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_6 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_6 = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled_6 = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled_6 = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled_6 = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled_6 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled_6 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled_6 = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_7 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_7 = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled_7 = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled_7 = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled_7 = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled_7 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled_7 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled_7 = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_8 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_8 = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled_8 = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled_8 = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled_8 = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled_8 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled_8 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled_8 = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_9 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_9 = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled_9 = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled_9 = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled_9 = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled_9 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled_9 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled_9 = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_10 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_10 = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled_10 = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled_10 = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled_10 = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled_10 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled_10 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled_10 = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_11 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_11 = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled_11 = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled_11 = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled_11 = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled_11 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled_11 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled_11 = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_12 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_12 = logger.isLoggable(Level.FINER);
		
		private static final boolean isVerboseEnabled_12 = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled_12 = logger.isLoggable(Level.INFO);
		
		private static final boolean isWarnEnabled_12 = logger.isLoggable(Level.WARNING);
		
		private static final boolean isErrorEnabled_12 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isFatalEnabled_12 = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isOffEnabled_12 = logger.isLoggable(Level.OFF);
		
		private static final boolean isDebugEnabled_13 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_13 = logger.isLoggable(Level.FINER);
