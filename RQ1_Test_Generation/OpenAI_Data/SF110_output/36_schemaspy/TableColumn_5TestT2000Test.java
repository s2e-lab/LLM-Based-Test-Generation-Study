// TableColumn_5Test.java
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
* It contains ten unit test cases for the {@link TableColumn#allowsImpliedParents()} method.
*/
class TableColumn_5Test {

		private static final Logger logger = Logger.getLogger(TableColumn_5Test.class.getName());
		
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
		
		private static final boolean isAllEnabled = logger.isLoggable(Level.ALL);
		
		private static final boolean isConfigEnabled = logger.isLoggable(Level.CONFIG);
		
		private static final boolean isFineEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isFinerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isFinestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isSevereEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isWarningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isAllEnabled = logger.isLoggable(Level.ALL);
		
		private static final boolean isConfigEnabled = logger.isLoggable(Level.CONFIG);
		
		private static final boolean isFineEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isFinerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isFinestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isSevereEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isWarningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isAllEnabled = logger.isLoggable(Level.ALL);
		
		private static final boolean isConfigEnabled = logger.isLoggable(Level.CONFIG);
		
		private static final boolean isFineEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isFinerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isFinestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isSevereEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isWarningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isAllEnabled = logger.isLoggable(Level.ALL);
		
		private static final boolean isConfigEnabled = logger.isLoggable(Level.CONFIG);
		
		private static final boolean isFineEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isFinerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isFinestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isSevereEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isWarningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isAllEnabled = logger.isLoggable(Level.ALL);
		
		private static final boolean isConfigEnabled = logger.isLoggable(Level.CONFIG);
		
		private static final boolean isFineEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isFinerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isFinestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isSevereEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isWarningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isAllEnabled = logger.isLoggable(Level.ALL);
		
		private static final boolean isConfigEnabled = logger.isLoggable(Level.CONFIG);
		
		private static final boolean isFineEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isFinerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isFinestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isSevereEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isWarningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isAllEnabled = logger.isLoggable(Level.ALL);
		
		private static final boolean isConfigEnabled = logger.isLoggable(Level.CONFIG);
		
		private static final boolean isFineEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isFinerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isFinestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean isInfoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean isSevereEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isWarningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean isOffEnabled = logger.isLoggable(Level.OFF);
		
		private static final boolean isAllEnabled = logger