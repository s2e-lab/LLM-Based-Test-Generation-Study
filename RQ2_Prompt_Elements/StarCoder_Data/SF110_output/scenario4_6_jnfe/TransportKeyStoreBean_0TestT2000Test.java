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

    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportStore()}.
    */
    @Test
    void openTransportStore() {
        try {
            TransportKeyStoreBean bean = new TransportKeyStoreBean();
            bean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
            bean.setKeyStoreType("pkcs12");
            bean.setKeyStorePassword("<PASSWORD>");
            bean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
            bean.setTrustStoreType("jks");
            bean.setTrustStorePassword("<PASSWORD>");
            KeyStore ks = bean.openTransportStore();
            assertNotNull(ks);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            fail(e.getMessage());
        }
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
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_1Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportStore()}.
    */
    @Test
    void openTransportStore() {
        try {
            TransportKeyStoreBean bean = new TransportKeyStoreBean();
            bean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
            bean.setKeyStoreType("pkcs12");
            bean.setKeyStorePassword("<PASSWORD>");
            bean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
            bean.setTrustStoreType("jks");
            bean.setTrustStorePassword("<PASSWORD>");
            KeyStore ks = bean.openTransportStore();
            assertNotNull(ks);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            fail(e.getMessage());
        }
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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_2Test {
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_2Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportStore()}.
    */
    @Test
    void openTransportStore() {
        try {
            TransportKeyStoreBean bean = new TransportKeyStoreBean();
            bean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
            bean.setKeyStoreType("pkcs12");
            bean.setKeyStorePassword("<PASSWORD>");
            bean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
            bean.setTrustStoreType("jks");
            bean.setTrustStorePassword("<PASSWORD>");
            KeyStore ks = bean.openTransportStore();
            assertNotNull(ks);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            fail(e.getMessage());
        }
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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_3Test {
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_3Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportStore()}.
    */
    @Test
    void openTransportStore() {
        try {
            TransportKeyStoreBean bean = new TransportKeyStoreBean();
            bean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
            bean.setKeyStoreType("pkcs12");
            bean.setKeyStorePassword("<PASSWORD>");
            bean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
            bean.setTrustStoreType("jks");
            bean.setTrustStorePassword("<PASSWORD>");
            KeyStore ks = bean.openTransportStore();
            assertNotNull(ks);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            fail(e.getMessage());
        }
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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_4Test {
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_4Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportStore()}.
    */
    @Test
    void openTransportStore() {
        try {
            TransportKeyStoreBean bean = new TransportKeyStoreBean();
            bean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
            bean.setKeyStoreType("pkcs12");
            bean.setKeyStorePassword("<PASSWORD>");
            bean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
            bean.setTrustStoreType("jks");
            bean.setTrustStorePassword("<PASSWORD>");
            KeyStore ks = bean.openTransportStore();
            assertNotNull(ks);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            fail(e.getMessage());
        }
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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_5Test {
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_5Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportStore()}.
    */
    @Test
    void openTransportStore() {
        try {
            TransportKeyStoreBean bean = new TransportKeyStoreBean();
            bean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
            bean.setKeyStoreType("pkcs12");
            bean.setKeyStorePassword("<PASSWORD>");
            bean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
            bean.setTrustStoreType("jks");
            bean.setTrustStorePassword("<PASSWORD>");
            KeyStore ks = bean.openTransportStore