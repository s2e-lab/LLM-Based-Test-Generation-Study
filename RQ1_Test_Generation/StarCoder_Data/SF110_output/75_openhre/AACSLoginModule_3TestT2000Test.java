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
    * Test case for the {@link AACSLoginModule#logout()} method.
    * It tests the logout of a user with a valid username and password.
    *
    * @throws LoginException if the login fails.
    */
    @Test
    void testLogout() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a CallbackHandler
        CallbackHandler cbh = new CallbackHandler() {
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
        // initialize the LoginContext with the CallbackHandler
        lc.login(cbh);
        // create a Subject
        Subject subject = lc.getSubject();
        // create a new AACSLoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the AACSLoginModule
        aacsLoginModule.initialize(subject, cbh, null, null);
        // login the user
        aacsLoginModule.login();
        // commit the authentication
        aacsLoginModule.commit();
        // logout the user
        aacsLoginModule.logout();
        // check if the user is logged out
        assertTrue(aacsLoginModule.succeeded);
        assertTrue(aacsLoginModule.commitSucceeded);
        assertNull(aacsLoginModule.username);
        assertNull(aacsLoginModule.password);
        assertNull(aacsLoginModule.userPrincipal);
        assertNull(aacsLoginModule.rolePrincipal);
        assertNull(aacsLoginModule.user);
        assertNull(aacsLoginModule.login);
    }
}
