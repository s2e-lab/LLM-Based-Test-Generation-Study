// TableColumn_0Test.java
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
* It contains ten unit test cases for the {@link TableColumn#getParentConstraint(TableColumn)} method.
*/
class TableColumn_0Test {

		private static final Logger logger = Logger.getLogger(TableColumn_0Test.class.getName());
		
		private static final boolean finerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean finestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean infoEnabled = logger.isLoggable(Level.INFO);
		
		private static final boolean warningEnabled = logger.isLoggable(Level.WARNING);
		
		private static final boolean severeEnabled = logger.isLoggable(Level.SEVERE);
		
		private static final boolean isDebugEnabled = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_0 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_0 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_1 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_1 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_2 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_2 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_3 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_3 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_4 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_4 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_5 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_5 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_6 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_6 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_7 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_7 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_8 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_8 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_9 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_9 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_10 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_10 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_11 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_11 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_12 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_12 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_13 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_13 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_14 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_14 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_15 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_15 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_16 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_16 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_17 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_17 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_18 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_18 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_19 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_19 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_20 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_20 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_21 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_21 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_22 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_22 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_23 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_23 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_24 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_24 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_25 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_25 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_26 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_26 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_27 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_27 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_28 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_28 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_29 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_29 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_30 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_30 = logger.isLoggable(Level.FINER);
		
		private static final boolean isDebugEnabled_31 = logger.isLoggable(Level.FINE);
		
		private static final boolean isTraceEnabled_31 = logger.isLoggable(Level.FINER);
		
	