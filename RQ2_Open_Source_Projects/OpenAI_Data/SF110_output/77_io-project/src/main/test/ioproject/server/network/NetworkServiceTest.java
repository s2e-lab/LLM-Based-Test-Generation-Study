// NetworkServiceTest.java
package ioproject.server.network;

import java.io.IOException;
import java.net.SocketAddress;
import org.apache.mina.common.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationDecoder;
import org.apache.mina.filter.codec.serialization.ObjectSerializationEncoder;
import org.apache.mina.transport.socket.nio.SocketAcceptor;
import org.apache.mina.transport.socket.nio.SocketAcceptorConfig;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NetworkService}.
* It contains ten unit test cases for the {@link NetworkService#globalClientGroup()} method.
*/
class NetworkServiceTest {

		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull() {
				NetworkService networkService = new NetworkService();
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull2() {
				NetworkService networkService = new NetworkService(new IoAcceptor() {
						public void bind(SocketAddress arg0, IoHandler arg1, SocketAcceptorConfig arg2) throws IOException {
						}
						public void unbindAll() {
						}
				});
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull3() {
				NetworkService networkService = new NetworkService(new SocketAcceptor());
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull4() {
				NetworkService networkService = new NetworkService(new SocketAcceptor(1));
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull5() {
				NetworkService networkService = new NetworkService(new SocketAcceptor(1, new SocketAcceptorConfig()));
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull6() {
				NetworkService networkService = new NetworkService(new SocketAcceptor(1, new SocketAcceptorConfig() {
						public void getFilterChain().addLast("codec", new ProtocolCodecFilter(new ObjectSerializationEncoder(), new ObjectSerializationDecoder()));
				}));
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull7() {
				NetworkService networkService = new NetworkService(new SocketAcceptor(1, new SocketAcceptorConfig() {
						public void getFilterChain().addLast("codec", new ProtocolCodecFilter(new ObjectSerializationEncoder(), new ObjectSerializationDecoder()));
				}));
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull8() {
				NetworkService networkService = new NetworkService(new SocketAcceptor(1, new SocketAcceptorConfig() {
						public void getFilterChain().addLast("codec", new ProtocolCodecFilter(new ObjectSerializationEncoder(), new ObjectSerializationDecoder()));
				}));
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull9() {
				NetworkService networkService = new NetworkService(new SocketAcceptor(1, new SocketAcceptorConfig() {
						public void getFilterChain().addLast("codec", new ProtocolCodecFilter(new ObjectSerializationEncoder(), new ObjectSerializationDecoder()));
				}));
				assertNotNull(networkService.globalClientGroup());
		}
		
		/**
		 * Test case for {@link NetworkService#globalClientGroup()}.
		 * It tests if the global client group is not null.
		 */
		@Test
		void testGlobalClientGroupNotNull10() {
				NetworkService networkService = new NetworkService(new SocketAcceptor(1, new SocketAcceptorConfig() {
						public void getFilterChain().addLast("codec", new ProtocolCodecFilter(new ObjectSerializationEncoder(), new ObjectSerializationDecoder()));
				}));
				assertNotNull(networkService.globalClientGroup());
		}
}