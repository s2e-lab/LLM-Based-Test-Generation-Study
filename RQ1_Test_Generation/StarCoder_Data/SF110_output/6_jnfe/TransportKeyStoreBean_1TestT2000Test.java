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

    private final static String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";

    private final static String DEFAULT_KEYSTORE_TYPE = "pkcs12";

    private final static String DEFAULT_KEYSTORE_PASSWORD = "<PASSWORD>";

    private final static String DEFAULT_TRUSTSTORE_TYPE = "jks";

    private final static String DEFAULT_TRUSTSTORE = "file:#{ systemProperties['java.home'] }/lib/security/cacerts";

    private final static String DEFAULT_TRUSTSTORE_PASSWORD = "<PASSWORD>";

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertNotNull(result);
        KeyStore ks = result.getKeyStore();
        assertNotNull(ks);
        assertEquals(DEFAULT_KEYSTORE_TYPE, ks.getType());
        assertEquals(DEFAULT_KEYSTORE_URI, ks.getProvider().getName());
        assertEquals(DEFAULT_KEYSTORE_PASSWORD, new String(ks.getKey("nfe", DEFAULT_KEYSTORE_PASSWORD.toCharArray())));
        assertEquals(DEFAULT_TRUSTSTORE_TYPE, ks.getProvider().getName());
        assertEquals(DEFAULT_TRUSTSTORE, ks.getProvider().getName());
        assertEquals(DEFAULT_TRUSTSTORE_PASSWORD, new String(ks.getKey("nfe", DEFAULT_TRUSTSTORE_PASSWORD.toCharArray())));
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
		
    private final static String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";

    private final static String DEFAULT_KEYSTORE_TYPE = "pkcs12";

    private final static String DEFAULT_KEYSTORE_PASSWORD = "<PASSWORD>";

    private final static String DEFAULT_TRUSTSTORE_TYPE = "jks";

    private final static String DEFAULT_TRUSTSTORE = "file:#{ systemProperties['java.home'] }/lib/security/cacerts";

    private final static String DEFAULT_TRUSTSTORE_PASSWORD = "<PASSWORD>";

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertNotNull(result);
        KeyStore ks = result.getKeyStore();
        assertNotNull(ks);
        assertEquals(DEFAULT_KEYSTORE_TYPE, ks.getType());
        assertEquals(DEFAULT_KEYSTORE_URI, ks.getProvider().getName());
        assertEquals(DEFAULT_KEYSTORE_PASSWORD, new String(ks.getKey("nfe", DEFAULT_KEYSTORE_PASSWORD.toCharArray())));
        assertEquals(DEFAULT_TRUSTSTORE_TYPE, ks.getProvider().getName());
        assertEquals(DEFAULT_TRUSTSTORE, ks.getProvider().getName());
        assertEquals(DEFAULT_TRUSTSTORE_PASSWORD, new String(ks.getKey("nfe", DEFAULT_TRUSTSTORE_PASSWORD.toCharArray())));
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
		
    private final static String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";

    private final static String DEFAULT_KEYSTORE_TYPE = "pkcs12";

    private final static String DEFAULT_KEYSTORE_PASSWORD = "<PASSWORD>";

    private final static String DEFAULT_TRUSTSTORE_TYPE = "jks";

    private final static String DEFAULT_TRUSTSTORE = "file:#{ systemProperties['java.home'] }/lib/security/cacerts";

    private final static String DEFAULT_TRUSTSTORE_PASSWORD = "<PASSWORD>";

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyManagerFactory result = instance.openTransportKeyManagerFactory();
        assertNotNull(result);
        KeyStore ks = result.getKeyStore();
        assertNotNull(ks);
        assertEquals(DEFAULT_KEYSTORE_TYPE, ks.getType());
        assertEquals(DEFAULT_KEYSTORE_URI, ks.getProvider().getName());
        assertEquals(DEFAULT_KEYSTORE_PASSWORD, new String(ks.getKey("nfe", DEFAULT_KEYSTORE_PASSWORD.toCharArray())));
        assertEquals(DEFAULT_TRUSTSTORE_TYPE, ks.getProvider().getName());
        assertEquals(DEFAULT_TRUSTSTORE, ks.getProvider().getName());
        assertEquals(DEFAULT_TRUSTSTORE_PASSWORD, new String(ks.getKey("nfe", DEFAULT_TRUSTSTORE_PASSWORD.toCharArray())));
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
		
    private final static String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";

    private final static String DEFAULT_KEYSTORE_TYPE = "pkcs12";

    private final static String DEFAULT_KEYSTORE_PASSWORD = "<PASSWORD>";

    private final static String DEFAULT_TRUSTSTORE_TYPE = "jks";

    private final static String DEFAULT_TRUSTSTORE = "file:#{ systemProperties['java.home'] }/lib/security/cacerts";

    private final static String DEFAULT_TRUSTSTORE_PASSWORD = "<PASSWORD>";

    /**
     * Test of openTransportKeyManagerFactory method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance