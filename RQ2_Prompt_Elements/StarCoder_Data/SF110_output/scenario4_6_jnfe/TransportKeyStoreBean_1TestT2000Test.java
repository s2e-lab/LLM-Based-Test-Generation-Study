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

    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_1Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
    *
    * @throws Exception
    */
    @Test
    void openTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
        transportKeyStoreBean.setKeyStoreType("pkcs12");
        transportKeyStoreBean.setKeyStorePassword("<PASSWORD>");
        transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
        transportKeyStoreBean.setTrustStoreType("jks");
        transportKeyStoreBean.setTrustStorePassword("<PASSWORD>");
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
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
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_2Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
    *
    * @throws Exception
    */
    @Test
    void openTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
        transportKeyStoreBean.setKeyStoreType("pkcs12");
        transportKeyStoreBean.setKeyStorePassword("<PASSWORD>");
        transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
        transportKeyStoreBean.setTrustStoreType("jks");
        transportKeyStoreBean.setTrustStorePassword("<PASSWORD>");
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
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
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_3Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
    *
    * @throws Exception
    */
    @Test
    void openTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
        transportKeyStoreBean.setKeyStoreType("pkcs12");
        transportKeyStoreBean.setKeyStorePassword("<PASSWORD>");
        transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
        transportKeyStoreBean.setTrustStoreType("jks");
        transportKeyStoreBean.setTrustStorePassword("<PASSWORD>");
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
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
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_4Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
    *
    * @throws Exception
    */
    @Test
    void openTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
        transportKeyStoreBean.setKeyStoreType("pkcs12");
        transportKeyStoreBean.setKeyStorePassword("<PASSWORD>");
        transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
        transportKeyStoreBean.setTrustStoreType("jks");
        transportKeyStoreBean.setTrustStorePassword("<PASSWORD>");
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
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
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_5Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
    *
    * @throws Exception
    */
    @Test
    void openTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
        transportKeyStoreBean.setKeyStoreType("pkcs12");
        transportKeyStoreBean.setKeyStorePassword("<PASSWORD>");
        transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
        transportKeyStoreBean.setTrustStoreType("jks");
        transportKeyStoreBean.setTrustStorePassword("<PASSWORD>");
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
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
		
    private final static Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_6Test.class);

    /**
    * Test method for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
    *
    * @throws Exception
    */
    @Test
    void openTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
        transportKeyStoreBean.setKeyStoreType("pkcs12");
        transportKeyStoreBean.setKeyStorePassword("<PASSWORD>");
        transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
        transportKeyStoreBean.setTrustStoreType("jks");