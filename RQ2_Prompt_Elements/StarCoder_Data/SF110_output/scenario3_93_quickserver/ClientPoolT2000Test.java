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
     * Method to suggest if nio write should be sent for processing.
     *
     * @since 1.4.6
     */
    @Test
    void shouldNioWriteHappen() {
        ClientPool clientPool = new ClientPool() {
            @Override
            public boolean shouldNioWriteHappen() {
                return true;
            }
        };
        assertTrue(clientPool.shouldNioWriteHappen());
    }
}
