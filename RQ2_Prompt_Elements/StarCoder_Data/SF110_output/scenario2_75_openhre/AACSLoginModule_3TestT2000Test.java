// AACSLoginModule_3Test.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains ten unit test cases for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModule_3Test {

    /**
     * Test method for {@link AACSLoginModule#logout()}.
     * It tests the logout method with a null user.
     */
    @Test
    void testLogout_1() {
        System.out.println("logout_1");
        LoginModule lm = new AACSLoginModule();
        Subject subject = new Subject();
        CallbackHandler handler = new CallbackHandler() {
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (int i = 0; i < callbacks.length; i++) {
                    if (callbacks[i] instanceof NameCallback) {
                        NameCallback nc = (NameCallback) callbacks[i];
                        nc.setName("testUser");
                    } else if (callbacks[i] instanceof PasswordCallback) {
                        PasswordCallback pc = (PasswordCallback) callbacks[i];
                        pc.setPassword("<PASSWORD>".toCharArray());
                    } else {
                        throw new UnsupportedCallbackException(callbacks[i]);
                    }
                }
            }
        };
        try {
            lm.initialize(subject, handler, null, null);
            lm.login();
            lm.logout();
            assertTrue(subject.getPrincipals().isEmpty());
        } catch (LoginException e) {
            fail("Unexpected LoginException: " + e.getMessage());
        }
    }

    /**
     * Test method for {@link AACSLoginModule#logout()}.
     * It tests the logout method with a user.
     */
    @Test
    void testLogout_2() {
        System.out.println("logout_2");
        LoginModule lm = new AACSLoginModule();
        Subject subject = new Subject();
        CallbackHandler handler = new CallbackHandler() {
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (int i = 0; i < callbacks.length; i++) {
                    if (callbacks[i] instanceof NameCallback) {
                        NameCallback nc = (NameCallback) callbacks[i];
                        nc.setName("testUser");
                    } else if (callbacks[i] instanceof PasswordCallback) {
                        PasswordCallback pc = (PasswordCallback) callbacks[i];
                        pc.setPassword("<PASSWORD>".toCharArray());
                    } else {
                        throw new UnsupportedCallbackException(callbacks[i]);
                    }
                }
            }
        };
        try {
            lm.initialize(subject, handler, null, null);
            lm.login();
            lm.logout();
            assertTrue(subject.getPrincipals().isEmpty());
        } catch (LoginException e) {
            fail("Unexpected LoginException: " + e.getMessage());
        }
    }
}

// AACSLoginModule_4Test.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains ten unit test cases for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModule_4Test {
		
    /**
     * Test method for {@link AACSLoginModule#logout()}.
     * It tests the logout method with a null user.
     */
    @Test
    void testLogout_1() {
        System.out.println("logout_1");
        LoginModule lm = new AACSLoginModule();
        Subject subject = new Subject();
        CallbackHandler handler = new CallbackHandler() {
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (int i = 0; i < callbacks.length; i++) {
                    if (callbacks[i] instanceof NameCallback) {
                        NameCallback nc = (NameCallback) callbacks[i];
                        nc.setName("testUser");
                    } else if (callbacks[i] instanceof PasswordCallback) {
                        PasswordCallback pc = (PasswordCallback) callbacks[i];
                        pc.setPassword("<PASSWORD>".toCharArray());
                    } else {
                        throw new UnsupportedCallbackException(callbacks[i]);
                    }
                }
            }
        };
        try {
            lm.initialize(subject, handler, null, null);
            lm.login();
            lm.logout();
            assertTrue(subject.getPrincipals().isEmpty());
        } catch (LoginException e) {
            fail("Unexpected LoginException: " + e.getMessage());
        }
    }

    /**
     * Test method for {@link AACSLoginModule#logout()}.
     * It tests the logout method with a user.
     */
    @Test
    void testLogout_2() {
        System.out.println("logout_2");
        LoginModule lm = new AACSLoginModule();
        Subject subject = new Subject();
        CallbackHandler handler = new CallbackHandler() {
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (int i = 0; i < callbacks.length; i++) {
                    if (callbacks[i] instanceof NameCallback) {
                        NameCallback nc = (NameCallback) callbacks[i];
                        nc.setName("testUser");
                    } else if (callbacks[i] instanceof PasswordCallback) {
                        PasswordCallback pc = (PasswordCallback) callbacks[i];
                        pc.setPassword("<PASSWORD>".toCharArray());
                    } else {
                        throw new UnsupportedCallbackException(callbacks[i]);
                    }
                }
            }
        };
        try {
            lm.initialize(subject, handler, null, null);
            lm.login();
            lm.logout();
            assertTrue(subject.getPrincipals().isEmpty());
        } catch (LoginException e) {
            fail("Unexpected LoginException: " + e.getMessage());
        }
    }
}

// AACSLoginModule_5Test.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains ten unit test cases for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModule_5Test {
		
    /**
     * Test method for {@link AACSLoginModule#logout()}.
     * It tests the logout method with a null user.
     */
    @Test
    void testLogout_1() {
        System.out.println("logout_1");
        LoginModule lm = new AACSLoginModule();
        Subject subject = new Subject();
        CallbackHandler handler = new CallbackHandler() {
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (int i = 0; i < callbacks.length; i++) {
                    if (callbacks[i] instanceof NameCallback) {
                        NameCallback nc = (NameCallback) callbacks[i];
                        nc.setName("testUser");
                    } else if (callbacks[i] instanceof PasswordCallback) {
                        PasswordCallback pc = (PasswordCallback) callbacks[i];
                        pc.setPassword("<PASSWORD>".toCharArray());
                    } else {
                        throw new UnsupportedCallbackException(callbacks[i]);
                    }
                }
            }
        };
        try {
            lm.initialize(subject, handler, null, null);
            lm.login();
            lm.logout();
            assertTrue(subject.getPrincipals().isEmpty());
        } catch (LoginException e) {
            fail("Unexpected LoginException: " + e.getMessage());
        }
    }

    /**
     * Test method for {@link AACSLoginModule#logout()}.
     * It tests the logout method with a user.
     */
    @Test
    void testLogout_2() {
        System.out.println("logout_2");
        LoginModule lm = new AACSLoginModule();
        Subject subject = new Subject();
        CallbackHandler handler = new CallbackHandler() {
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (int i = 0; i < callbacks.length; i++) {
                    if (callbacks[i] instanceof NameCallback) {
                        NameCallback nc = (NameCallback) callbacks[i];
                        nc.setName("testUser");
                    } else if (callbacks[i] instanceof PasswordCallback) {
                        PasswordCallback pc = (PasswordCallback) callbacks[i];
                        pc.setPassword("<PASSWORD>".toCharArray());
                    } else {
                        throw new UnsupportedCallbackException(callbacks[i]);
                    }
                }
            }
        };
        try {
            lm.initialize(subject, handler, null, null);
            lm.login();
            lm.logout();
            assertTrue(subject.getPrincipals().isEmpty());
        } catch (LoginException e) {
            fail("Unexpected LoginException: " + e.getMessage());
        }
    }
}

// AACSLoginModule_6Test.java
package com.browsersoft.jaas;

