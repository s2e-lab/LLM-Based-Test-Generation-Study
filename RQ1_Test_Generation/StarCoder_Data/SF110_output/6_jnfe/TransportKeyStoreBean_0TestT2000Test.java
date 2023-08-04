// TransportKeyStoreBean_0Test.java
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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_0Test {

    private final static String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";

    private final static String DEFAULT_KEYSTORE_TYPE = "pkcs12";

    private final static String DEFAULT_KEYSTORE_PASSWORD = "<PASSWORD>";

    private final static String DEFAULT_TRUSTSTORE_TYPE = "jks";

    private final static String DEFAULT_TRUSTSTORE = "file:#{ systemProperties['java.home'] }/lib/security/cacerts";

    private final static String DEFAULT_TRUSTSTORE_PASSWORD = "<PASSWORD>";

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_01() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_02() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_03() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_04() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_05() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_06() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_07() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_08() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_09() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }

    /**
     * Test of openTransportStore method, of class TransportKeyStoreBean.
     */
    @Test
    void testOpenTransportStore_10() throws Exception {
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
        instance.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
        instance.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
        instance.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
        instance.setTrustStoreType(DEFAULT_TRUSTSTORE_TYPE);
        instance.setTrustStore(DEFAULT_TRUSTSTORE);
        instance.setTrustStorePassword(DEFAULT_TRUSTSTORE_PASSWORD);
        KeyStore result = instance.openTransportStore();
        assertNotNull(result);
    }
}

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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_1Test {
		
    private final static String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";

    private final static String DEFAULT_KEYSTORE_TYPE = "pkcs12";

   