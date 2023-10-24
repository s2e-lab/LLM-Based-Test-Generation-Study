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

    private static final String KEYSTORE_PATH = "src/test/resources/keystore.jks";
    private static final String KEYSTORE_PASSWORD = "<PASSWORD>";

    private static final String KEYSTORE_TYPE = "JKS";

    private static final String KEY_MANAGER_FACTORY_ALGORITHM = "SunX509";

    private static final String KEY_MANAGER_FACTORY_PROVIDER = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "com.sun.net.ssl.internal.ssl.Provider";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_VERSION_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_INFO_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME = "SunJSSE version 1.8";

    private static final String KEY_MANAGER_FACTORY_PROVIDER_CLASS_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME_NAME