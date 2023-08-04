// GetPage_0Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_0Test {

    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        assertFalse(getPage.hasMoreMessages());
    }
}

// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_1Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        assertTrue(getPage.hasMoreMessages());
    }
}

// GetPage_2Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_2Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        assertFalse(getPage.hasMoreMessages());
    }
}

// GetPage_3Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_3Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        assertFalse(getPage.hasMoreMessages());
    }
}

// GetPage_4Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_4Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        assertFalse(getPage.hasMoreMessages());
    }
}

// GetPage_5Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_5Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        assertFalse(getPage.hasMoreMessages());
    }
}

// GetPage_6Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_6Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        assertFalse(getPage.hasMoreMessages());
    }
}

// GetPage_7Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_7Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        assertFalse(getPage.hasMoreMessages());
    }
}

// GetPage_8Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_8Test {
		
    /**
    * Test method for {@link GetPage#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        GetPage getPage = new GetPage("http://www.google.de");
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText("test", new HttpAction());
        getPage.processReturningText