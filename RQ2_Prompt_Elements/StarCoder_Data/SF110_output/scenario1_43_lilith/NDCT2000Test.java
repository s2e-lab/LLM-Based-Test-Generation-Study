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
    void testEmptyContextStack() {
        Message[] contextStack = NDC.getContextStack();
        assertEquals(0, contextStack.length);
    }

    @Test
    void testSingleContextStack() {
        NDC.push("test");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(1, contextStack.length);
        assertEquals("test", contextStack[0].getMessage());
    }

    @Test
    void testMultipleContextStack() {
        NDC.push("test1");
        NDC.push("test2");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(2, contextStack.length);
        assertEquals("test2", contextStack[0].getMessage());
        assertEquals("test1", contextStack[1].getMessage());
    }

    @Test
    void testMultipleContextStackWithPop() {
        NDC.push("test1");
        NDC.push("test2");
        NDC.pop();
        Message[] contextStack = NDC.getContextStack();
        assertEquals(1, contextStack.length);
        assertEquals("test1", contextStack[0].getMessage());
    }

    @Test
    void testMultipleContextStackWithClear() {
        NDC.push("test1");
        NDC.push("test2");
        NDC.clear();
        Message[] contextStack = NDC.getContextStack();
        assertEquals(0, contextStack.length);
    }

    @Test
    void testMultipleContextStackWithPopAndClear() {
        NDC.push("test1");
        NDC.push("test2");
        NDC.pop();
        NDC.clear();
        Message[] contextStack = NDC.getContextStack();
        assertEquals(0, contextStack.length);
    }

    @Test
    void testMultipleContextStackWithClearAndPop() {
        NDC.push("test1");
        NDC.push("test2");
        NDC.clear();
        NDC.pop();
        Message[] contextStack = NDC.getContextStack();
        assertEquals(0, contextStack.length);
    }
}
