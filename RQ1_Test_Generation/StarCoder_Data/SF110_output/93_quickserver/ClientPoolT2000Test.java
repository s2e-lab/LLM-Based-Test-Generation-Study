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

    private static final Logger logger = Logger.getLogger(ClientPoolTest.class.getName());

    @Test
    void testShouldNioWriteHappen() {
        ClientPool clientPool = new ClientPool(new QSObjectPool(), new PoolConfig());
        clientPool.setMaxThreadsForNioWrite(0);
        assertTrue(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(1);
        assertTrue(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(2);
        assertTrue(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(3);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(4);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(5);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(6);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(7);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(8);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(9);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(10);
        assertFalse(clientPool.shouldNioWriteHappen());
        clientPool.setMaxThreadsForNioWrite(11);
        assertFalse(clientPool.shouldNioWriteHappen());
    }
}
