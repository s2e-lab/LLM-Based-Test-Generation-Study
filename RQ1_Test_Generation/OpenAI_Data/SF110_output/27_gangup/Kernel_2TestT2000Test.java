// Kernel_2Test.java
package module;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Kernel}.
* It contains ten unit test cases for the {@link Kernel#info()} method.
*/
class Kernel_2Test {

		/**
		* Test case for {@link Kernel#info()}.
		* It tests if the method returns a {@link ModuleInfo} object.
		*/
		@Test
		void testInfo() {
				Kernel kernel = new Kernel();
				assertTrue(kernel.info() instanceof ModuleInfo);
		}
}

// Kernel_3Test.java
package module;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Kernel}.
* It contains ten unit test cases for the {@link Kernel#register(Module)} method.
*/
class Kernel_3Test {
		
		/**
		* Test case for {@link Kernel#register(Module)}.
		* It tests if the method throws a {@link ModuleRegisterException} when the module is null.
		*/
		@Test
		void testRegister_1() {
				Kernel kernel = new Kernel();
				assertThrows(ModuleRegisterException.class, () -> kernel.register(null));
		}
		
		/**
		* Test case for {@link Kernel#register(Module)}.
		* It tests if the method throws a {@link ModuleRegisterException} when the module is already registered.
		*/
		@Test
		void testRegister_2() {
				Kernel kernel = new Kernel();
				Module module = new Module() {
						public void register(Kernel kernel) throws ModuleRegisterException {
								kernel.register(this);
						}
						public void unregister(Kernel kernel) throws ModuleRegisterException {
								kernel.unregister(this);
						}
						public void receiveMessage(Message msg) throws MessageDeliveryException {
								msg.setDelivered(true);
						}
						public void start() {
						}
						public ModuleInfo info() {
								return new ModuleInfo(this);
						}
						public Kernel getKernel() {
								return null;
						}
						public Thread getThread() {
								return null;
						}
				};
				assertThrows(ModuleRegisterException.class, () -> kernel.register(module));
		}
}

// Kernel_4Test.java
package module;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Kernel}.
* It contains ten unit test cases for the {@link Kernel#unregister(Module)} method.
*/
class Kernel_4Test {
		
		/**
		* Test case for {@link Kernel#unregister(Module)}.
		* It tests if the method throws a {@link ModuleRegisterException} when the module is null.
		*/
		@Test
		void testUnregister_1() {
				Kernel kernel = new Kernel();
				assertThrows(ModuleRegisterException.class, () -> kernel.unregister(null));
		}
		
		/**
		* Test case for {@link Kernel#unregister(Module)}.
		* It tests if the method throws a {@link ModuleRegisterException} when the module is not registered.
		*/
		@Test
		void testUnregister_2() {
				Kernel kernel = new Kernel();
				Module module = new Module() {
						public void register(Kernel kernel) throws ModuleRegisterException {
								kernel.register(this);
						}
						public void unregister(Kernel kernel) throws ModuleRegisterException {
								kernel.unregister(this);
						}
						public void receiveMessage(Message msg) throws MessageDeliveryException {
								msg.setDelivered(true);
						}
						public void start() {
						}
						public ModuleInfo info() {
								return new ModuleInfo(this);
						}
						public Kernel getKernel() {
								return null;
						}
						public Thread getThread() {
								return null;
						}
				};
				assertThrows(ModuleRegisterException.class, () -> kernel.unregister(module));
		}
}

// Kernel_5Test.java
package module;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Kernel}.
* It contains ten unit test cases for the {@link Kernel#subscribe(Module, String)} method.
*/
class Kernel_5Test {
		
		/**
		* Test case for {@link Kernel#subscribe(Module, String)}.
		* It tests if the method throws a {@link ModuleSubscriptionException} when the module is null.
		*/
		@Test
		void testSubscribe_1() {
				Kernel kernel = new Kernel();
				assertThrows(ModuleSubscriptionException.class, () -> kernel.subscribe(null, ""));
		}
		
		/**
		* Test case for {@link Kernel#subscribe(Module, String)}.
		* It tests if the method throws a {@link ModuleSubscriptionException} when the topic is null.
		*/
		@Test
		void testSubscribe_2() {
				Kernel kernel = new Kernel();
				Module module = new Module() {
						public void register(Kernel kernel) throws ModuleRegisterException {
								kernel.register(this);
						}
						public void unregister(Kernel kernel) throws ModuleRegisterException {
								kernel.unregister(this);
						}
						public void receiveMessage(Message msg) throws MessageDeliveryException {
								msg.setDelivered(true);
						}
						public void start() {
						}
						public ModuleInfo info() {
								return new ModuleInfo(this);
						}
						public Kernel getKernel() {
								return null;
						}
						public Thread getThread() {
								return null;
						}
				};