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

    @Test
    void shouldNioWriteHappen() {
        ClientPool clientPool = new ClientPool(null, null) {
            protected void nioWriteStart() {
                //do nothing
            }

            protected void nioWriteEnd() {
                //do nothing
            }
        };

        clientPool.setMaxThreadsForNioWrite(0);
        assertFalse(clientPool.shouldNioWriteHappen());

        clientPool.setMaxThreadsForNioWrite(1);
        assertTrue(clientPool.shouldNioWriteHappen());

        clientPool.setMaxThreadsForNioWrite(2);
        assertTrue(clientPool.shouldNioWriteHappen());

        clientPool.setMaxThreadsForNioWrite(3);
        assertFalse(clientPool.shouldNioWriteHappen());
    }
}
