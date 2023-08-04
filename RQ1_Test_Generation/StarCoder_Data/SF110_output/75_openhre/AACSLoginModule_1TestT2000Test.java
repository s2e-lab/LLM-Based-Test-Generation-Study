// AACSLoginModule_1Test.java
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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_1Test {

    /**
    * Test case for the {@link AACSLoginModule#commit()} method.
    * It tests the case when the authentication succeeds.
    *
    * @throws LoginException if the authentication fails.
    */
    @Test
    void testCommit_1() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // perform the authentication
        lc.commit();
        // test the authentication
        assertTrue(aacsLoginModule.commitSucceeded);
    }
}

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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_2Test {
		
    /**
    * Test case for the {@link AACSLoginModule#commit()} method.
    * It tests the case when the authentication fails.
    *
    * @throws LoginException if the authentication fails.
    */
    @Test
    void testCommit_2() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // perform the authentication
        lc.commit();
        // test the authentication
        assertFalse(aacsLoginModule.commitSucceeded);
    }
}

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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_3Test {
		
    /**
    * Test case for the {@link AACSLoginModule#commit()} method.
    * It tests the case when the authentication fails.
    *
    * @throws LoginException if the authentication fails.
    */
    @Test
    void testCommit_3() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // perform the authentication
        lc.commit();
        // test the authentication
        assertFalse(aacsLoginModule.commitSucceeded);
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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_4Test {
		
    /**
    * Test case for the {@link AACSLoginModule#commit()} method.
    * It tests the case when the authentication fails.
    *
    * @throws LoginException if the authentication fails.
    */
    @Test
    void testCommit_4() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // perform the authentication
        lc.commit();
        // test the authentication
        assertFalse(aacsLoginModule.commitSucceeded);
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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_5Test {
		
    /**
    * Test case for the {@link AACSLoginModule#commit()} method.
    * It tests the case when the authentication fails.
    *
    * @throws LoginException if the authentication fails.
    */
    @Test
    void testCommit_5() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // perform the authentication
        lc.commit();
        // test the authentication
        assertFalse(aacsLoginModule.commitSucceeded);
    }
}

// AACSLoginModule_6Test.java
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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_6Test {
		
    /**
    * Test case for the {@link AACSLoginModule#commit()} method.
    * It tests the case when the authentication fails.
    *
    * @throws LoginException if the authentication fails.
    */
    @Test
    void testCommit_6() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacsLoginModule = new AACSLoginModule();
        // initialize the LoginModule
        lc.login();
        // perform the authentication
        lc.commit();
        // test the authentication
        assertFalse(aacsLoginModule.commitSucceeded);
    }
}

// AACSLoginModule_7Test.java
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
* It contains ten unit test cases for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_7Test {
		
    /**
    * Test case for the {@link AACSLoginModule#commit()} method.
    * It tests the case when the authentication fails.
    *
    * @throws LoginException if the authentication fails.
    */
    @Test
    void testCommit_7() throws LoginException {
        // create a LoginContext
        LoginContext lc = new LoginContext("AACSLoginModule");
        // create a LoginModule
        AACSLoginModule aacs