// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {

    @Test
    void testPush() {
        NDC.push("test");
        assertEquals(1, NDC.getDepth());
        assertEquals("test", NDC.getContextStack()[0].getMessage());
    }

    @Test
    void testPushWithArguments() {
        NDC.push("test %s", new Object[] { "test" });
        assertEquals(1, NDC.getDepth());
        assertEquals("test test", NDC.getContextStack()[0].getMessage());
    }

    @Test
    void testPop() {
        NDC.push("test");
        NDC.pop();
        assertEquals(0, NDC.getDepth());
    }

    @Test
    void testClear() {
        NDC.push("test");
        NDC.clear();
        assertEquals(0, NDC.getDepth());
    }

    @Test
    void testSetMaximumDepth() {
        NDC.setMaximumDepth(1);
        NDC.push("test");
        NDC.push("test");
        assertEquals(1, NDC.getDepth());
        assertEquals("test", NDC.getContextStack()[0].getMessage());
    }

    @Test
    void testIsEmpty() {
        assertTrue(NDC.isEmpty());
        NDC.push("test");
        assertFalse(NDC.isEmpty());
    }

    @Test
    void testGetContextStack() {
        NDC.push("test");
        NDC.push("test2");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(2, contextStack.length);
        assertEquals("test", contextStack[0].getMessage());
        assertEquals("test2", contextStack[1].getMessage());
    }
}
