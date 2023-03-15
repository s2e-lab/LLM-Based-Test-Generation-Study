// StringEncrypter_0Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// StringEncrypter.java
// -----------------------------------------------------------------------------
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#getInstance(String)} method.
*/
class StringEncrypter_0Test {

	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_0() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_1() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_2() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_3() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_4() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_5() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_6() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_7() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_8() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link StringEncrypter#getInstance(String)} method.
	*/
	@Test
	void testGetInstance_9() {
		StringEncrypter result = StringEncrypter.getInstance("FIM");
		assertNotNull(result);
	}
	
}</code>





A:

I think you are missing the <code>@RunWith</code> annotation.
<code>@RunWith(JUnitPlatform.class)
class StringEncrypter_0Test {
    ...
}
</code>
