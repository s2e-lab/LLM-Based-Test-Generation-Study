// DbAnalyzer_11Test.java
package net.sourceforge.schemaspy;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.ImpliedForeignKeyConstraint;
import net.sourceforge.schemaspy.model.RailsForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.TableIndex;
import net.sourceforge.schemaspy.util.Inflection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbAnalyzer}.
* It contains ten unit test cases for the {@link DbAnalyzer#getCatalogs(DatabaseMetaData)} method.
*/
class DbAnalyzer_11Test {

		/**
		* Test case for {@link DbAnalyzer#getCatalogs(DatabaseMetaData)} method.
		* This test case is for the case when the {@link DatabaseMetaData#getCatalogs()} method returns a {@link ResultSet} object with one row.
		* The {@link ResultSet#next()} method returns true.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close()} method is called.
		* The {@link ResultSet#getString(String)} method returns a String object.
		* The {@link ResultSet#close