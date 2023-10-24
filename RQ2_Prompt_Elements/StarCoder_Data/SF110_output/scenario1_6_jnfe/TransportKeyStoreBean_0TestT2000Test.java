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

    private static final Logger LOGGER = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);

    private static final String KEY_STORE_TYPE = "PKCS12";
    private static final String KEY_STORE_URI = "classpath:keystore.p12";
    private static final String KEY_STORE_PASSWORD = "<PASSWORD>";

    private static final String KEY_STORE_TYPE_INVALID = "PKCS12";
    private static final String KEY_STORE_URI_INVALID = "classpath:keystore.p12";
    private static final String KEY_STORE_PASSWORD_INVALID = "<PASSWORD>";

    private static final String KEY_STORE_TYPE_NULL = null;
    private static final String KEY_STORE_URI_NULL = null;
    private static final String KEY_STORE_PASSWORD_NULL = null;

    private static final String KEY_STORE_TYPE_EMPTY = "";
    private static final String KEY_STORE_URI_EMPTY = "";
    private static final String KEY_STORE_PASSWORD_EMPTY = "";

    private static final String KEY_STORE_TYPE_INVALID_NULL = null;
    private static final String KEY_STORE_URI_INVALID_NULL = null;
    private static final String KEY_STORE_PASSWORD_INVALID_NULL = null;

    private static final String KEY_STORE_TYPE_INVALID_EMPTY = "";
    private static final String KEY_STORE_URI_INVALID_EMPTY = "";
    private static final String KEY_STORE_PASSWORD_INVALID_EMPTY = "";

    private static final String KEY_STORE_TYPE_INVALID_BLANK = " ";
    private static final String KEY_STORE_URI_INVALID_BLANK = " ";
    private static final String KEY_STORE_PASSWORD_INVALID_BLANK = " ";

    private static final String KEY_STORE_TYPE_INVALID_TAB = "\t";
    private static final String KEY_STORE_URI_INVALID_TAB = "\t";
    private static final String KEY_STORE_PASSWORD_INVALID_TAB = "\t";

    private static final String KEY_STORE_TYPE_INVALID_NEW_LINE = "\n";
    private static final String KEY_STORE_URI_INVALID_NEW_LINE = "\n";
    private static final String KEY_STORE_PASSWORD_INVALID_NEW_LINE = "\n";

    private static final String KEY_STORE_TYPE_INVALID_CARRIAGE_RETURN = "\r";
    private static final String KEY_STORE_URI_INVALID_CARRIAGE_RETURN = "\r";
    private static final String KEY_STORE_PASSWORD_INVALID_CARRIAGE_RETURN = "\r";

    private static final String KEY_STORE_TYPE_INVALID_UNICODE = "\u0000";
    private static final String KEY_STORE_URI_INVALID_UNICODE = "\u0000";
    private static final String KEY_STORE_PASSWORD_INVALID_UNICODE = "\u0000";

    private static final String KEY_STORE_TYPE_INVALID_UNICODE_BREAK_LINE = "\u000A";
    private static final String KEY_STORE_URI_INVALID_UNICODE_BREAK_LINE = "\u000A";
    private static final String KEY_STORE_PASSWORD_INVALID_UNICODE_BREAK_LINE = "\u000A";

    private static final String KEY_STORE_TYPE_INVALID_UNICODE_CARRIAGE_RETURN = "\u000D";
    private static final String KEY_STORE_URI_INVALID_UNICODE_CARRIAGE_RETURN = "\u000D";
    private static final String KEY_STORE_PASSWORD_INVALID_UNICODE_CARRIAGE_RETURN = "\u000D";

    private static final String KEY_STORE_TYPE_INVALID_UNICODE_COMBINED = "\u0000\u000A\u000D";
    private static final String KEY_STORE_URI_INVALID_UNICODE_COMBINED = "\u0000\u000A\u000D";
    private static final String KEY_STORE_PASSWORD_INVALID_UNICODE_COMBINED = "\u0000\u000A\u000D";

    private static final String KEY_STORE_TYPE_INVALID_START_WITH_NUMBER = "1PKCS12";
    private static final String KEY_STORE_URI_INVALID_START_WITH_NUMBER = "1PKCS12";
    private static final String KEY_STORE_PASSWORD_INVALID_START_WITH_NUMBER = "1PKCS12";

    private static final String KEY_STORE_TYPE_INVALID_START_WITH_SPECIAL_CHAR = "$PKCS12";
    private static final String KEY_STORE_URI_INVALID_START_WITH_SPECIAL_CHAR = "$PKCS12";
    private static final String KEY_STORE_PASSWORD_INVALID_START_WITH_SPECIAL_CHAR = "$PKCS12";

    private static final String KEY_STORE_TYPE_INVALID_END_WITH_NUMBER = "PKCS121";
    private static final String KEY_STORE_URI_INVALID_END_WITH_NUMBER = "PKCS121";
    private static final String KEY_STORE_PASSWORD_INVALID_END_WITH_NUMBER = "PKCS121";

    private static final String KEY_STORE_TYPE_INVALID_END_WITH_SPECIAL_CHAR = "PKCS12$";
    private static final String KEY_STORE_URI_INVALID_END_WITH_SPECIAL_CHAR = "PKCS12$";
    private static final String KEY_STORE_PASSWORD_INVALID_END_WITH_SPECIAL_CHAR = "PKCS12$";

    private static final String KEY_STORE_TYPE_INVALID_WITH_NUMBERS = "1PKCS121";
    private static final String KEY_STORE_URI_INVALID_WITH_NUMBERS = "1PKCS121";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_NUMBERS = "1PKCS121";

    private static final String KEY_STORE_TYPE_INVALID_WITH_SPECIAL_CHARS = "$PKCS12$";
    private static final String KEY_STORE_URI_INVALID_WITH_SPECIAL_CHARS = "$PKCS12$";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_SPECIAL_CHARS = "$PKCS12$";

    private static final String KEY_STORE_TYPE_INVALID_WITH_NUMBERS_AND_SPECIAL_CHARS = "1PKCS12$";
    private static final String KEY_STORE_URI_INVALID_WITH_NUMBERS_AND_SPECIAL_CHARS = "1PKCS12$";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_NUMBERS_AND_SPECIAL_CHARS = "1PKCS12$";

    private static final String KEY_STORE_TYPE_INVALID_WITH_SPECIAL_CHARS_AND_NUMBERS = "$PKCS121";
    private static final String KEY_STORE_URI_INVALID_WITH_SPECIAL_CHARS_AND_NUMBERS = "$PKCS121";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_SPECIAL_CHARS_AND_NUMBERS = "$PKCS121";

    private static final String KEY_STORE_TYPE_INVALID_WITH_UPPER_CASE = "PKCS12";
    private static final String KEY_STORE_URI_INVALID_WITH_UPPER_CASE = "PKCS12";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_UPPER_CASE = "PKCS12";

    private static final String KEY_STORE_TYPE_INVALID_WITH_LOWER_CASE = "pkcs12";
    private static final String KEY_STORE_URI_INVALID_WITH_LOWER_CASE = "pkcs12";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_LOWER_CASE = "pkcs12";

    private static final String KEY_STORE_TYPE_INVALID_WITH_UPPER_AND_LOWER_CASE = "Pkcs12";
    private static final String KEY_STORE_URI_INVALID_WITH_UPPER_AND_LOWER_CASE = "Pkcs12";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_UPPER_AND_LOWER_CASE = "Pkcs12";

    private static final String KEY_STORE_TYPE_INVALID_WITH_SPACE_TAB_AND_CARRIAGE_RETURN = " PKCS12\t\r";
    private static final String KEY_STORE_URI_INVALID_WITH_SPACE_TAB_AND_CARRIAGE_RETURN = " PKCS12\t\r";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_SPACE_TAB_AND_CARRIAGE_RETURN = " PKCS12\t\r";

    private static final String KEY_STORE_TYPE_INVALID_WITH_SPACE_TAB_AND_NEW_LINE = " PKCS12\t\n";
    private static final String KEY_STORE_URI_INVALID_WITH_SPACE_TAB_AND_NEW_LINE = " PKCS12\t\n";
    private static final String KEY_STORE_PASSWORD_INVALID_WITH_SPACE_TAB_AND_NEW_LINE = " PKCS12\t\n";

    private static final String KEY_STORE_TYPE_INVALID_WITH_SPACE_TAB_AND_UNICODE = " PKCS12\t\u0