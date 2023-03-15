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
		
		private ClientPool clientPool;
		
		private PoolConfig poolConfig;
		
		private QSObjectPool objectPool;
		
		private ClientThread clientThread;
		
		private Runnable runnable;
		
		private int maxThreadsForNioWrite;
		
		private int countNioWriteThreads;
		
		private boolean shouldNioWriteHappen;
		
		private void setUp() {
			poolConfig = new PoolConfig();
			objectPool = new QSObjectPool(poolConfig);
			clientPool = new ClientPool(objectPool, poolConfig);
			clientThread = new ClientThread(clientPool);
			runnable = new Runnable() {
				public void run() {
				}
			};
		}
		
		@Test
		void testShouldNioWriteHappen_1() {
			setUp();
			maxThreadsForNioWrite = 0;
			countNioWriteThreads = 0;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_2() {
			setUp();
			maxThreadsForNioWrite = 0;
			countNioWriteThreads = 1;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_3() {
			setUp();
			maxThreadsForNioWrite = 1;
			countNioWriteThreads = 0;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_4() {
			setUp();
			maxThreadsForNioWrite = 1;
			countNioWriteThreads = 1;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertFalse(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_5() {
			setUp();
			maxThreadsForNioWrite = 2;
			countNioWriteThreads = 0;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_6() {
			setUp();
			maxThreadsForNioWrite = 2;
			countNioWriteThreads = 1;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_7() {
			setUp();
			maxThreadsForNioWrite = 2;
			countNioWriteThreads = 2;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertFalse(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_8() {
			setUp();
			maxThreadsForNioWrite = 3;
			countNioWriteThreads = 0;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_9() {
			setUp();
			maxThreadsForNioWrite = 3;
			countNioWriteThreads = 1;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_10() {
			setUp();
			maxThreadsForNioWrite = 3;
			countNioWriteThreads = 2;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_11() {
			setUp();
			maxThreadsForNioWrite = 3;
			countNioWriteThreads = 3;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertFalse(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_12() {
			setUp();
			maxThreadsForNioWrite = 4;
			countNioWriteThreads = 0;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_13() {
			setUp();
			maxThreadsForNioWrite = 4;
			countNioWriteThreads = 1;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_14() {
			setUp();
			maxThreadsForNioWrite = 4;
			countNioWriteThreads = 2;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_15() {
			setUp();
			maxThreadsForNioWrite = 4;
			countNioWriteThreads = 3;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_16() {
			setUp();
			maxThreadsForNioWrite = 4;
			countNioWriteThreads = 4;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertFalse(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_17() {
			setUp();
			maxThreadsForNioWrite = 5;
			countNioWriteThreads = 0;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_18() {
			setUp();
			maxThreadsForNioWrite = 5;
			countNioWriteThreads = 1;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_19() {
			setUp();
			maxThreadsForNioWrite = 5;
			countNioWriteThreads = 2;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_20() {
			setUp();
			maxThreadsForNioWrite = 5;
			countNioWriteThreads = 3;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_21() {
			setUp();
			maxThreadsForNioWrite = 5;
			countNioWriteThreads = 4;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_22() {
			setUp();
			maxThreadsForNioWrite = 5;
			countNioWriteThreads = 5;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertFalse(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_23() {
			setUp();
			maxThreadsForNioWrite = 6;
			countNioWriteThreads = 0;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_24() {
			setUp();
			maxThreadsForNioWrite = 6;
			countNioWriteThreads = 1;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_25() {
			setUp();
			maxThreadsForNioWrite = 6;
			countNioWriteThreads = 2;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_26() {
			setUp();
			maxThreadsForNioWrite = 6;
			countNioWriteThreads = 3;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_27() {
			setUp();
			maxThreadsForNioWrite = 6;
			countNioWriteThreads = 4;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);
			clientPool.nioWriteStart();
			shouldNioWriteHappen = clientPool.shouldNioWriteHappen();
			assertTrue(shouldNioWriteHappen);
		}
		
		@Test
		void testShouldNioWriteHappen_28() {
			setUp();
			maxThreadsForNioWrite = 6;
			countNioWriteThreads = 5;
			clientPool.setMaxThreadsForNioWrite(maxThreadsForNioWrite);