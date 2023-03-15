// DefaultProviderTest.java
package dash.providerFactory;

import dash.ComponentProvider;
import dash.Provider;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultProvider}.
* It contains ten unit test cases for the {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
*/
class DefaultProviderTest {

	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is not null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNotNull() {
		Provider provider = new DefaultProvider();
		Provider threadLocalProvider = new Provider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "threadLocalProvider";
			}
		};
		ProviderFactory.threadLocalProvider.set(threadLocalProvider);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "componentProvider";
			}
		};
		assertEquals("threadLocalProvider", provider.lookup(String.class, "key", componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNull() {
		Provider provider = new DefaultProvider();
		ProviderFactory.threadLocalProvider.set(null);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "componentProvider";
			}
		};
		assertEquals("componentProvider", provider.lookup(String.class, "key", componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is null and the component provider is null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNull_ComponentProviderNull() {
		Provider provider = new DefaultProvider();
		ProviderFactory.threadLocalProvider.set(null);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return null;
			}
		};
		assertNull(provider.lookup(String.class, "key", componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is null and the component provider is not null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNull_ComponentProviderNotNull() {
		Provider provider = new DefaultProvider();
		ProviderFactory.threadLocalProvider.set(null);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "componentProvider";
			}
		};
		assertEquals("componentProvider", provider.lookup(String.class, "key", componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is not null and the component provider is null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNotNull_ComponentProviderNull() {
		Provider provider = new DefaultProvider();
		Provider threadLocalProvider = new Provider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "threadLocalProvider";
			}
		};
		ProviderFactory.threadLocalProvider.set(threadLocalProvider);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return null;
			}
		};
		assertEquals("threadLocalProvider", provider.lookup(String.class, "key", componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is not null and the component provider is not null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNotNull_ComponentProviderNotNull() {
		Provider provider = new DefaultProvider();
		Provider threadLocalProvider = new Provider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "threadLocalProvider";
			}
		};
		ProviderFactory.threadLocalProvider.set(threadLocalProvider);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "componentProvider";
			}
		};
		assertEquals("threadLocalProvider", provider.lookup(String.class, "key", componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is null and the component provider is null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNull_ComponentProviderNull_KeyNull() {
		Provider provider = new DefaultProvider();
		ProviderFactory.threadLocalProvider.set(null);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return null;
			}
		};
		assertNull(provider.lookup(String.class, null, componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is null and the component provider is not null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNull_ComponentProviderNotNull_KeyNull() {
		Provider provider = new DefaultProvider();
		ProviderFactory.threadLocalProvider.set(null);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "componentProvider";
			}
		};
		assertEquals("componentProvider", provider.lookup(String.class, null, componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is not null and the component provider is null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNotNull_ComponentProviderNull_KeyNull() {
		Provider provider = new DefaultProvider();
		Provider threadLocalProvider = new Provider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "threadLocalProvider";
			}
		};
		ProviderFactory.threadLocalProvider.set(threadLocalProvider);
		ComponentProvider componentProvider = new ComponentProvider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return null;
			}
		};
		assertEquals("threadLocalProvider", provider.lookup(String.class, null, componentProvider));
	}
	
	/**
	 * Test case for {@link DefaultProvider#lookup(Class, String, ComponentProvider)} method.
	 * It tests the case when the thread local provider is not null and the component provider is not null.
	 */
	@Test
	void testLookup_ThreadLocalProviderNotNull_ComponentProviderNotNull_KeyNull() {
		Provider provider = new DefaultProvider();
		Provider threadLocalProvider = new Provider() {
			public Object lookup(Class klazz, String key, ComponentProvider forTarget) {
				return "threadLocalProvider";
			}
		};
		ProviderFactory.threadLocalProvider.set(threadLocalProvider);
		ComponentProvider componentProvider