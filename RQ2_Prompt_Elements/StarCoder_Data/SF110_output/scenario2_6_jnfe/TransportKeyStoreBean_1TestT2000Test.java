// TransportKeyStoreBean_1Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_1Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_1Test.class);

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        LOGGER.info("openTransportKeyManagerFactory");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStorePassword("<PASSWORD>");
        instance.setKeyStorePath("src/test/resources/keystore.jks");
        KeyManagerFactory expResult = instance.openTransportKeyManagerFactory();
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertEquals(expResult, result);
    }
}

// TransportKeyStoreBean_2Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_2Test {
		
    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_2Test.class);

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        LOGGER.info("openTransportKeyManagerFactory");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStorePassword("<PASSWORD>");
        instance.setKeyStorePath("src/test/resources/keystore.jks");
        KeyManagerFactory expResult = instance.openTransportKeyManagerFactory();
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertEquals(expResult, result);
    }
}

// TransportKeyStoreBean_3Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_3Test {
		
    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_3Test.class);

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        LOGGER.info("openTransportKeyManagerFactory");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStorePassword("<PASSWORD>");
        instance.setKeyStorePath("src/test/resources/keystore.jks");
        KeyManagerFactory expResult = instance.openTransportKeyManagerFactory();
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertEquals(expResult, result);
    }
}

// TransportKeyStoreBean_4Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_4Test {
		
    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_4Test.class);

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        LOGGER.info("openTransportKeyManagerFactory");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStorePassword("<PASSWORD>");
        instance.setKeyStorePath("src/test/resources/keystore.jks");
        KeyManagerFactory expResult = instance.openTransportKeyManagerFactory();
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertEquals(expResult, result);
    }
}

// TransportKeyStoreBean_5Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_5Test {
		
    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_5Test.class);

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        LOGGER.info("openTransportKeyManagerFactory");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStorePassword("<PASSWORD>");
        instance.setKeyStorePath("src/test/resources/keystore.jks");
        KeyManagerFactory expResult = instance.openTransportKeyManagerFactory();
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertEquals(expResult, result);
    }
}

// TransportKeyStoreBean_6Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_6Test {
		
    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_6Test.class);

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        LOGGER.info("openTransportKeyManagerFactory");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStorePassword("<PASSWORD>");
        instance.setKeyStorePath("src/test/resources/keystore.jks");
        KeyManagerFactory expResult = instance.openTransportKeyManagerFactory();
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertEquals(expResult, result);
    }
}

// TransportKeyStoreBean_7Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_7Test {
		
    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_7Test.class);

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        LOGGER.info("openTransportKeyManagerFactory");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStorePassword("<PASSWORD>");
        instance.setKeyStorePath("src/test/resources/keystore.jks");
        KeyManagerFactory expResult = instance.openTransportKeyManagerFactory();
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertEquals(expResult, result);
    }
}

// TransportKeyStoreBean_8Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.