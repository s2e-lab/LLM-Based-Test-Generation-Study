// SBMLFilter_1Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#getReader(String)} method.
*/
class SBMLFilter_1Test {

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_1() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_2() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_3() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_4() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_5() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_6() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_7() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_8() throws IOException {
        System.out.println("Testing getReader(String) with a valid SBML file ...");
        // Create a new SBMLFilter object
        SBMLFilter filter = new SBMLFilter();
        // Create a new File object
        File file = new File("src/test/resources/sbml/valid.xml");
        // Get the GraphReader object
        GraphReader reader = filter.getReader(file.getAbsolutePath());
        // Check if the GraphReader object is not null
        assertNotNull(reader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader class
        assertTrue(reader instanceof SBMLGraphReader);
        // Check if the GraphReader object is an instance of the SBMLGraphReader2 class
        assertFalse(reader instanceof SBMLGraphReader2);
    }

    /**
     * Test case for the {@link SBMLFilter#getReader(String)} method.
     * It tests the {@link SBMLFilter#getReader(String)} method with a valid SBML file.
     *
     * @author <NAME>
     * @throws IOException
     */
    @Test
    void test_getReader_9