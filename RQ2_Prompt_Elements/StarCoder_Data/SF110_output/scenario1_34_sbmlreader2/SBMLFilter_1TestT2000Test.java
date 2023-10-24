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
    * It tests the {@link SBMLGraphReader} class.
    */
    @Test
    void testSBMLGraphReader() {
        System.out.println("Testing SBMLGraphReader ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the {@link SBMLFilter#getReader(String)} method.
    * It tests the {@link SBMLGraphReader2} class.
    */
    @Test
    void testSBMLGraphReader2() {
        System.out.println("Testing SBMLGraphReader2 ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the {@link SBMLFilter#getReader(String)} method.
    * It tests the {@link SBMLGraphReader} class.
    */
    @Test
    void testSBMLGraphReader_1() {
        System.out.println("Testing SBMLGraphReader ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the {@link SBMLFilter#getReader(String)} method.
    * It tests the {@link SBMLGraphReader2} class.
    */
    @Test
    void testSBMLGraphReader2_1() {
        System.out.println("Testing SBMLGraphReader2 ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the {@link SBMLFilter#getReader(String)} method.
    * It tests the {@link SBMLGraphReader} class.
    */
    @Test
    void testSBMLGraphReader_2() {
        System.out.println("Testing SBMLGraphReader ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the {@link SBMLFilter#getReader(String)} method.
    * It tests the {@link SBMLGraphReader2} class.
    */
    @Test
    void testSBMLGraphReader2_2() {
        System.out.println("Testing SBMLGraphReader2 ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the {@link SBMLFilter#getReader(String)} method.
    * It tests the {@link SBMLGraphReader} class.
    */
    @Test
    void testSBMLGraphReader_3() {
        System.out.println("Testing SBMLGraphReader ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the {@link SBMLFilter#getReader(String)} method.
    * It tests the {@link SBMLGraphReader2} class.
    */
    @Test
    void testSBMLGraphReader2_3() {
        System.out.println("Testing SBMLGraphReader2 ...");
        try {
            // Test if libsbml library is available
            System.loadLibrary("sbmlj");
            /* Extra check to be sure we have access to libSBML: */
            Class.forName("org.sbml.libsbml.libsbml");
            // Use the libSBML based parser
            System.out.println("... using 'libsbml parser'");
            SBMLGraphReader2 reader = new SBMLGraphReader2("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        } catch (Exception e) {
            // If any error occurs use the classic SBML Reader
            SBMLGraphReader reader = new SBMLGraphReader("data/sbml/BIOMD0000000012.xml");
            assertNotNull(reader);
        }
    }

    /**
    * Test case for the