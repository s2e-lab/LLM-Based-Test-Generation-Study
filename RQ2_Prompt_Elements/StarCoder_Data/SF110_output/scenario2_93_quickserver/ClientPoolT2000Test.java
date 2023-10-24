// ClientPoolTest.java
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPool}.
* It contains ten unit test cases for the {@link ClientPool#shouldNioWriteHappen()} method.
*/
class ClientPoolTest {

    /**
     * Method to test the {@link ClientPool#shouldNioWriteHappen()} method.
     * It checks if nio write should be sent for processing.
     *
     * @since 1.4.6
     */
    @Test
    void shouldNioWriteHappen() {
        ClientPool clientPool = new ClientPool();
        clientPool.maxThreadsForNioWrite = 0;
        clientPool.countNioWriteThreads = 0;
        assertTrue(clientPool.shouldNioWriteHappen());
        clientPool.maxThreadsForNioWrite = 1;
        clientPool.countNioWriteThreads = 0;
        assertTrue(clientPool.shouldNioWriteHappen());
        clientPool.maxThreadsForNioWrite = 1;
        clientPool.countNioWriteThreads = 1;
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.maxThreadsForNioWrite = 2;
        clientPool.countNioWriteThreads = 1;
        assertTrue(clientPool.shouldNioWriteHappen());
        clientPool.maxThreadsForNioWrite = 2;
        clientPool.countNioWriteThreads = 2;
        assertFalse(clientPool.shouldNioWriteHappen());
    }
}
