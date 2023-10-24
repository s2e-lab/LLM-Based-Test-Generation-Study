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
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has not been initialized.
    */
    @Test
    void testAbort_1() {
        System.out.println("testAbort_1");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized.
    */
    @Test
    void testAbort_2() {
        System.out.println("testAbort_2");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized and
    * the login method has been called.
    */
    @Test
    void testAbort_3() {
        System.out.println("testAbort_3");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized,
    * the login method has been called and the commit method has been called.
    */
    @Test
    void testAbort_4() {
        System.out.println("testAbort_4");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.commit();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized,
    * the login method has been called and the commit method has been called.
    */
    @Test
    void testAbort_5() {
        System.out.println("testAbort_5");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.commit();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized,
    * the login method has been called and the commit method has been called.
    */
    @Test
    void testAbort_6() {
        System.out.println("testAbort_6");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.commit();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized,
    * the login method has been called and the commit method has been called.
    */
    @Test
    void testAbort_7() {
        System.out.println("testAbort_7");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.commit();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized,
    * the login method has been called and the commit method has been called.
    */
    @Test
    void testAbort_8() {
        System.out.println("testAbort_8");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.commit();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized,
    * the login method has been called and the commit method has been called.
    */
    @Test
    void testAbort_9() {
        System.out.println("testAbort_9");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.commit();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }

    /**
    * Test method for {@link AACSLoginModule#abort()}.
    * It tests the abort method when the login module has been initialized,
    * the login method has been called and the commit method has been called.
    */
    @Test
    void testAbort_10() {
        System.out.println("testAbort_10");
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        try {
            aacsLoginModule.initialize(new Subject(), null, null, null);
            aacsLoginModule.login();
            aacsLoginModule.commit();
            aacsLoginModule.abort();
        } catch (LoginException e) {
            fail("Unexpected LoginException");
        }
    }
}
