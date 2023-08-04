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

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with an empty stack.
    */
    @Test
    void testEmptyStack() {
        Message[] stack = NDC.getContextStack();
        assertEquals(0, stack.length);
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing one message.
    */
    @Test
    void testOneMessage() {
        NDC.push("message1");
        Message[] stack = NDC.getContextStack();
        assertEquals(1, stack.length);
        assertEquals("message1", stack[0].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing two messages.
    */
    @Test
    void testTwoMessages() {
        NDC.push("message1");
        NDC.push("message2");
        Message[] stack = NDC.getContextStack();
        assertEquals(2, stack.length);
        assertEquals("message2", stack[0].getMessage());
        assertEquals("message1", stack[1].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing three messages.
    */
    @Test
    void testThreeMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        Message[] stack = NDC.getContextStack();
        assertEquals(3, stack.length);
        assertEquals("message3", stack[0].getMessage());
        assertEquals("message2", stack[1].getMessage());
        assertEquals("message1", stack[2].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing four messages.
    */
    @Test
    void testFourMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        Message[] stack = NDC.getContextStack();
        assertEquals(4, stack.length);
        assertEquals("message4", stack[0].getMessage());
        assertEquals("message3", stack[1].getMessage());
        assertEquals("message2", stack[2].getMessage());
        assertEquals("message1", stack[3].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing five messages.
    */
    @Test
    void testFiveMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        Message[] stack = NDC.getContextStack();
        assertEquals(5, stack.length);
        assertEquals("message5", stack[0].getMessage());
        assertEquals("message4", stack[1].getMessage());
        assertEquals("message3", stack[2].getMessage());
        assertEquals("message2", stack[3].getMessage());
        assertEquals("message1", stack[4].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing six messages.
    */
    @Test
    void testSixMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        Message[] stack = NDC.getContextStack();
        assertEquals(6, stack.length);
        assertEquals("message6", stack[0].getMessage());
        assertEquals("message5", stack[1].getMessage());
        assertEquals("message4", stack[2].getMessage());
        assertEquals("message3", stack[3].getMessage());
        assertEquals("message2", stack[4].getMessage());
        assertEquals("message1", stack[5].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing seven messages.
    */
    @Test
    void testSevenMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        NDC.push("message7");
        Message[] stack = NDC.getContextStack();
        assertEquals(7, stack.length);
        assertEquals("message7", stack[0].getMessage());
        assertEquals("message6", stack[1].getMessage());
        assertEquals("message5", stack[2].getMessage());
        assertEquals("message4", stack[3].getMessage());
        assertEquals("message3", stack[4].getMessage());
        assertEquals("message2", stack[5].getMessage());
        assertEquals("message1", stack[6].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing eight messages.
    */
    @Test
    void testEightMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        NDC.push("message7");
        NDC.push("message8");
        Message[] stack = NDC.getContextStack();
        assertEquals(8, stack.length);
        assertEquals("message8", stack[0].getMessage());
        assertEquals("message7", stack[1].getMessage());
        assertEquals("message6", stack[2].getMessage());
        assertEquals("message5", stack[3].getMessage());
        assertEquals("message4", stack[4].getMessage());
        assertEquals("message3", stack[5].getMessage());
        assertEquals("message2", stack[6].getMessage());
        assertEquals("message1", stack[7].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing nine messages.
    */
    @Test
    void testNineMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        NDC.push("message7");
        NDC.push("message8");
        NDC.push("message9");
        Message[] stack = NDC.getContextStack();
        assertEquals(9, stack.length);
        assertEquals("message9", stack[0].getMessage());
        assertEquals("message8", stack[1].getMessage());
        assertEquals("message7", stack[2].getMessage());
        assertEquals("message6", stack[3].getMessage());
        assertEquals("message5", stack[4].getMessage());
        assertEquals("message4", stack[5].getMessage());
        assertEquals("message3", stack[6].getMessage());
        assertEquals("message2", stack[7].getMessage());
        assertEquals("message1", stack[8].getMessage());
    }

    /**
    * Test case for {@link NDC#getContextStack()} method.
    * It tests the method with a stack containing ten messages.
    */
    @Test
    void testTenMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        NDC.push("message7");
        NDC.push("message8");
        NDC.push("message9");
        NDC.push("message10");
        Message[] stack = NDC.getContextStack();
        assertEquals(10, stack.length);
        assertEquals("message10", stack[0].getMessage());
        assertEquals("message9", stack[1].getMessage());
        assertEquals("message8", stack[2].getMessage());
        assertEquals("message7", stack[3].getMessage());
        assertEquals("message6", stack[4].getMessage());
        assertEquals("message5", stack[5].getMessage());
        assertEquals("message4", stack[6].getMessage());
        assertEquals("message3", stack[7].getMessage());
        assertEquals("message2", stack[8].getMessage());
        assertEquals("message1", stack[9].getMessage());
    }
}
