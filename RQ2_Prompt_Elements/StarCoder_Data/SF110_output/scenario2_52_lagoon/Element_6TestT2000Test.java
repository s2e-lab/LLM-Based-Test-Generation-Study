// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {

    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        assertEquals(0, element.numberOfNamespaceMappings());
    }
}

// Element_7Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_7Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        assertEquals(1, element.numberOfNamespaceMappings());
    }
}

// Element_8Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_8Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix", "uri");
        assertEquals(1, element.numberOfNamespaceMappings());
    }
}

// Element_9Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_9Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix2", "uri");
        assertEquals(2, element.numberOfNamespaceMappings());
    }
}

// Element_10Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_10Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix2", "uri");
        element.addNamespaceMapping("prefix", "uri");
        assertEquals(2, element.numberOfNamespaceMappings());
    }
}

// Element_11Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_11Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix2", "uri");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix3", "uri");
        assertEquals(3, element.numberOfNamespaceMappings());
    }
}

// Element_12Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_12Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix2", "uri");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix3", "uri");
        element.addNamespaceMapping("prefix", "uri");
        assertEquals(3, element.numberOfNamespaceMappings());
    }
}

// Element_13Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_13Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix2", "uri");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix3", "uri");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix4", "uri");
        assertEquals(4, element.numberOfNamespaceMappings());
    }
}

// Element_14Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_14Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings()} method.
    */
    @Test
    void numberOfNamespaceMappings() {
        Element element = new Element("root");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix2", "uri");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix3", "uri");
        element.addNamespaceMapping("prefix", "uri");
        element.addNamespaceMapping("prefix4", "uri");
        element.addNamespaceMapping("prefix", "uri");
        assertEquals(4, element.numberOfNamespaceMappings());
    }
}

// Element_15Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_15Test {
		
    /**
    * Test case for {@link Element#numberOfNamespaceMappings