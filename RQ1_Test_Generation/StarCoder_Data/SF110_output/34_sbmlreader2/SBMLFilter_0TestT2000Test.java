// SBMLFilter_0Test.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilter_0Test {

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept00() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.xml");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept01() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept02() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept03() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.gz");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept04() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.bz2");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept05() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.zip");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept06() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.tar");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept07() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.tar.gz");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept08() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.tar.bz2");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept09() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.tgz");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept10() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.tbz2");
        assertTrue(filter.accept(file));
    }
}

// SBMLFilter_1Test.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilter_1Test {
		
    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept00() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.xml");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept01() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept02() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept03() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.gz");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept04() {
        SBMLFilter filter = new SBMLFilter();
        File file = new File("test.sbml.xml.bz2");
        assertTrue(filter.accept(file));
    }

    /**
     * Test case for {@link SBMLFilter#accept(File)}.
     * <p/>
     * Tests if the file name ends with .xml or .sbml.
     */
    @Test
    void testAccept05() {
        SBMLFilter filter