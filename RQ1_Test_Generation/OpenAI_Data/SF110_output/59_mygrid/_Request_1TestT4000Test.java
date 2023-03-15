// _Request_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getTypeDesc()} method.
*/
class _Request_1Test {

	/**
	* Test case for the {@link _Request#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_Request _request = new _Request();
		assertNotNull(_request.getTypeDesc());
	}
}

// _Request_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Request_2Test {
		
	/**
	* Test case for the {@link _Request#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetSerializer() {
		_Request _request = new _Request();
		assertNotNull(_request.getSerializer("", null, null));
	}
}

// _Request_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Request_3Test {
		
	/**
	* Test case for the {@link _Request#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetDeserializer() {
		_Request _request = new _Request();
		assertNotNull(_request.getDeserializer("", null, null));
	}
}

// _Request_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_4Test {
		
	/**
	* Test case for the {@link _Request#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Request _request = new _Request();
		assertTrue(_request.equals(null));
	}
}

// _Request_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_5Test {
		
	/**
	* Test case for the {@link _Request#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Request _request = new _Request();
		assertTrue(_request.equals(_request));
	}
}

// _Request_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_6Test {
		
	/**
	* Test case for the {@link _Request#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Request _request = new _Request();
		assertFalse(_request.equals(new Object()));
	}
}

// _Request_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_7Test {
		
	/**
	* Test case for the {@link _Request#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Request _request = new _Request();
		assertFalse(_request.equals(new _Request()));
	}
}

// _Request_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_8Test {
		
	/**
	* Test case for the {@link _Request#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Request _request = new _Request();
		assertFalse(_request.equals(new _Request()));
	}
}

// _Request_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_9Test {
		
	/**
	* Test case for the {@link _Request#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Request _request = new _Request();
		assertFalse(_request.equals(new _Request()));
	}
}

// _Request_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#equals(java.lang.Object)} method.
*/
class _Request_10Test {
		
	/**
	* Test case for the {@link _Request#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Request _request = new _Request();
		assertFalse(_request.equals(new _Request()));
	}
}

// _Request_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_11Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_12Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_12Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_13Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_13Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_14Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_14Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_15Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_15Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_16Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_16Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_17Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_17Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_18Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_18Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_19Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_19Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_20Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_20Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_21Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_21Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_22Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_22Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_23Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains ten unit test cases for the {@link _Request#hashCode()} method.
*/
class _Request_23Test {
		
	/**
	* Test case for the {@link _Request#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Request _request = new _Request();
		assertEquals(1, _request.hashCode());
	}
}

// _Request_24Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class