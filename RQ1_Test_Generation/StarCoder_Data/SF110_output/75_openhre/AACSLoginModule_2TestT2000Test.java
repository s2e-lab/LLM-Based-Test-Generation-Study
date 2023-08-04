// AACSLoginModule_2Test.java
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
* It contains ten unit test cases for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModule_2Test {

    /**
    * Test case for the {@link AACSLoginModule#abort()} method.
    * It tests the abort method when the login succeeded but the commit failed.
    *
    * @throws LoginException if the login fails.
    */
    @Test
    void testAbort_1() throws LoginException {
        System.out.println("testAbort_1");
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // login succeeded
        assertTrue(aacsLoginModule.loginSucceeded);
        // commit failed
        assertFalse(aacsLoginModule.commitSucceeded);
        // abort the LoginModule
        lc.logout();
        // login failed
        assertFalse(aacsLoginModule.loginSucceeded);
        // commit failed
        assertFalse(aacsLoginModule.commitSucceeded);
    }

    /**
    * Test case for the {@link AACSLoginModule#abort()} method.
    * It tests the abort method when the login failed.
    *
    * @throws LoginException if the login fails.
    */
    @Test
    void testAbort_2() throws LoginException {
        System.out.println("testAbort_2");
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // login failed
        assertFalse(aacsLoginModule.loginSucceeded);
        // commit failed
        assertFalse(aacsLoginModule.commitSucceeded);
        // abort the LoginModule
        lc.logout();
        // login failed
        assertFalse(aacsLoginModule.loginSucceeded);
        // commit failed
        assertFalse(aacsLoginModule.commitSucceeded);
    }

    /**
    * Test case for the {@link AACSLoginModule#abort()} method.
    * It tests the abort method when the login succeeded and the commit succeeded.
    *
    * @throws LoginException if the login fails.
    */
    @Test
    void testAbort_3() throws LoginException {
        System.out.println("testAbort_3");
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // login succeeded
        assertTrue(aacsLoginModule.loginSucceeded);
        // commit succeeded
        assertTrue(aacsLoginModule.commitSucceeded);
        // abort the LoginModule
        lc.logout();
        // login failed
        assertFalse(aacsLoginModule.loginSucceeded);
        // commit failed
        assertFalse(aacsLoginModule.commitSucceeded);
    }
}
