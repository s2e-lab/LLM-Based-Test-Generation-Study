// TableColumn_3Test.java
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
* It contains ten unit test cases for the {@link TableColumn#getChildConstraint(TableColumn)} method.
*/
class TableColumn_3Test {

		private static final Logger logger = Logger.getLogger(TableColumn_3Test.class.getName());
		
		private static final boolean finerEnabled = logger.isLoggable(Level.FINER);
		
		private static final boolean finestEnabled = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_2 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_3 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_4 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_5 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_6 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_7 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_8 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_9 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_10 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_11 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_12 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_13 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_14 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_15 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_16 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_17 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_18 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_19 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_20 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_21 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_22 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_23 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_24 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_25 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_26 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_27 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_28 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_29 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_30 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_31 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_32 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_33 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_34 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_35 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_36 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_37 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_38 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_39 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_40 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_41 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_42 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_43 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_44 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_45 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_46 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_47 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_48 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_49 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_50 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_51 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_52 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_53 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_54 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_55 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_56 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_57 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_58 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_59 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_60 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_61 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_62 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_63 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_64 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_65 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_66 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_67 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_68 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_69 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_70 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_71 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_72 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_73 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_74 = logger.isLoggable(Level.FINEST);
		
		private static final boolean finestEnabled_75 = logger.isLoggable(Level.FINEST