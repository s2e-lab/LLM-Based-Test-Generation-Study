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
     * <p/>
     * The test case checks if the method returns an empty array if the NDC stack is empty.
     */
    @Test
    void testGetContextStackEmpty() {
        Message[] contextStack = NDC.getContextStack();
        assertEquals(0, contextStack.length);
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with one message if the NDC stack contains one message.
     */
    @Test
    void testGetContextStackOneMessage() {
        NDC.push("message");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(1, contextStack.length);
        assertEquals("message", contextStack[0].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with two messages if the NDC stack contains two messages.
     */
    @Test
    void testGetContextStackTwoMessages() {
        NDC.push("message1");
        NDC.push("message2");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(2, contextStack.length);
        assertEquals("message2", contextStack[0].getMessage());
        assertEquals("message1", contextStack[1].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with three messages if the NDC stack contains three messages.
     */
    @Test
    void testGetContextStackThreeMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(3, contextStack.length);
        assertEquals("message3", contextStack[0].getMessage());
        assertEquals("message2", contextStack[1].getMessage());
        assertEquals("message1", contextStack[2].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with four messages if the NDC stack contains four messages.
     */
    @Test
    void testGetContextStackFourMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(4, contextStack.length);
        assertEquals("message4", contextStack[0].getMessage());
        assertEquals("message3", contextStack[1].getMessage());
        assertEquals("message2", contextStack[2].getMessage());
        assertEquals("message1", contextStack[3].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with five messages if the NDC stack contains five messages.
     */
    @Test
    void testGetContextStackFiveMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(5, contextStack.length);
        assertEquals("message5", contextStack[0].getMessage());
        assertEquals("message4", contextStack[1].getMessage());
        assertEquals("message3", contextStack[2].getMessage());
        assertEquals("message2", contextStack[3].getMessage());
        assertEquals("message1", contextStack[4].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with six messages if the NDC stack contains six messages.
     */
    @Test
    void testGetContextStackSixMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(6, contextStack.length);
        assertEquals("message6", contextStack[0].getMessage());
        assertEquals("message5", contextStack[1].getMessage());
        assertEquals("message4", contextStack[2].getMessage());
        assertEquals("message3", contextStack[3].getMessage());
        assertEquals("message2", contextStack[4].getMessage());
        assertEquals("message1", contextStack[5].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with seven messages if the NDC stack contains seven messages.
     */
    @Test
    void testGetContextStackSevenMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        NDC.push("message7");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(7, contextStack.length);
        assertEquals("message7", contextStack[0].getMessage());
        assertEquals("message6", contextStack[1].getMessage());
        assertEquals("message5", contextStack[2].getMessage());
        assertEquals("message4", contextStack[3].getMessage());
        assertEquals("message3", contextStack[4].getMessage());
        assertEquals("message2", contextStack[5].getMessage());
        assertEquals("message1", contextStack[6].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with eight messages if the NDC stack contains eight messages.
     */
    @Test
    void testGetContextStackEightMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        NDC.push("message7");
        NDC.push("message8");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(8, contextStack.length);
        assertEquals("message8", contextStack[0].getMessage());
        assertEquals("message7", contextStack[1].getMessage());
        assertEquals("message6", contextStack[2].getMessage());
        assertEquals("message5", contextStack[3].getMessage());
        assertEquals("message4", contextStack[4].getMessage());
        assertEquals("message3", contextStack[5].getMessage());
        assertEquals("message2", contextStack[6].getMessage());
        assertEquals("message1", contextStack[7].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with nine messages if the NDC stack contains nine messages.
     */
    @Test
    void testGetContextStackNineMessages() {
        NDC.push("message1");
        NDC.push("message2");
        NDC.push("message3");
        NDC.push("message4");
        NDC.push("message5");
        NDC.push("message6");
        NDC.push("message7");
        NDC.push("message8");
        NDC.push("message9");
        Message[] contextStack = NDC.getContextStack();
        assertEquals(9, contextStack.length);
        assertEquals("message9", contextStack[0].getMessage());
        assertEquals("message8", contextStack[1].getMessage());
        assertEquals("message7", contextStack[2].getMessage());
        assertEquals("message6", contextStack[3].getMessage());
        assertEquals("message5", contextStack[4].getMessage());
        assertEquals("message4", contextStack[5].getMessage());
        assertEquals("message3", contextStack[6].getMessage());
        assertEquals("message2", contextStack[7].getMessage());
        assertEquals("message1", contextStack[8].getMessage());
    }

    /**
     * Test case for {@link NDC#getContextStack()} method.
     * <p/>
     * The test case checks if the method returns an array with ten messages if the NDC stack contains ten messages.
     */
    @Test
    void testGetContextStackTenMessages() {
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
        Message[] contextStack = NDC.getContextStack();
        assertEquals(10, contextStack