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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore(true);
        assertTrue(getPage.hasMoreMessages());
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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore(false);
        assertFalse(getPage.hasMoreMessages());
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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore(null);
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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore("");
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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore(" ");
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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore("  ");
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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore("   ");
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
        GetPage getPage = new GetPage();
        getPage.setHttpAction(new HttpAction() {
            @Override
            public String getRequest() {
                return "http://www.example.com";
            }

            @Override
            public String processAllReturningText(String s) {
                return s;
            }
        });
        getPage.setPage("test");
        getPage.setNextPage("test");
        getPage.setHasMore("    ");