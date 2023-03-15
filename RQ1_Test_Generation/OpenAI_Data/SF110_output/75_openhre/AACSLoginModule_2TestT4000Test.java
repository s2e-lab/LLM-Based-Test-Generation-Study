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
	* Test case for {@link AACSLoginModule#abort()} method.
	*
	* <p>
	*
	* @exception LoginException if the abort fails.
	*
	* @return false if this LoginModule's own login and/or commit attempts
	* 		failed, and true otherwise.
	*/
	@Test
	void testAbort() throws LoginException {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testAbort not implemented");
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
	* Test case for {@link AACSLoginModule#commit()} method.
	*
	* <p>
	*
	* @exception LoginException if the commit fails.
	*
	* @return true if this LoginModule's own login and commit
	* 		attempts succeeded, or false otherwise.
	*/
	@Test
	void testCommit() throws LoginException {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testCommit not implemented");
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
* It contains ten unit test cases for the {@link AACSLoginModule#initialize(Subject, CallbackHandler, Map, Map)} method.
*/
class AACSLoginModule_4Test {
		
	/**
	* Test case for {@link AACSLoginModule#initialize(Subject, CallbackHandler, Map, Map)} method.
	*
	* <p>
	*
	* @param subject the <code>Subject</code> to be authenticated. <p>
	*
	* @param callbackHandler a <code>CallbackHandler</code> for communicating
	* 			with the end user (prompting for user names and
	* 			passwords, for example). <p>
	*
	* @param sharedState shared <code>LoginModule</code> state. <p>
	*
	* @param options options specified in the login
	* 			<code>Configuration</code> for this particular
	* 			<code>LoginModule</code>.
	*/
	@Test
	void testInitialize() {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testInitialize not implemented");
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
* It contains ten unit test cases for the {@link AACSLoginModule#login()} method.
*/
class AACSLoginModule_5Test {
		
	/**
	* Test case for {@link AACSLoginModule#login()} method.
	*
	* <p>
	*
	* @return true in all cases since this <code>LoginModule</code>
	* 		should not be ignored.
	*
	* @exception FailedLoginException if the authentication fails. <p>
	*
	* @exception LoginException if this <code>LoginModule</code>
	* 		is unable to perform the authentication.
	*/
	@Test
	void testLogin() throws LoginException {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testLogin not implemented");
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
* It contains ten unit test cases for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModule_6Test {
		
	/**
	* Test case for {@link AACSLoginModule#logout()} method.
	*
	* <p>
	*
	* @exception LoginException if the logout fails.
	*
	* @return true in all cases since this <code>LoginModule</code>
	*          should not be ignored.
	*/
	@Test
	void testLogout() throws LoginException {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testLogout not implemented");
	}
}

// AACSUserPrincipal.java
/*
 *   CVS $Id: AACSUserPrincipal.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 * 
 *   ====================================================================
 *                 Open Source Health Records Exchange
 *   ====================================================================
 *
 *   Copyright (C) 2005 Browsersoft Inc.
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License, version 2, 
 *   as published by the Free Software Foundation.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   The GNU General Public License is available at
 *   http://www.fsf.org/licensing/licenses/gpl.html
 *
 *   Email: info@openhre.org
 *   Web:   http://www.openhre.org
 */
package com.browsersoft.jaas;

import java.security.Principal;

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents a user.
 *
 * <p> Principals such as this <code>AACSUserPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @version $Id: AACSUserPrincipal.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 */
public class AACSUserPrincipal implements Principal, java.io.Serializable {
    /**
     * @serial
     */
    private String name;

    /**
     * Create an AACSUserPrincipal with a username.
     *
     * <p>
     *
     * @param name the username for this user.
     *
     * @exception NullPointerException if the <code>name</code>
     *			is <code>null</code>.
     */
    public AACSUserPrincipal(String name) {
        if (name == null) throw new NullPointerException("illegal null input");
        this.name = name;
    }

    /**
     * Return the username for this <code>AACSUserPrincipal</code>.
     *
     * <p>
     *
     * @return the username for this <code>AACSUserPrincipal</code>
     */
    public String getName() {
        return name;
    }

    /**
     * Return a string representation of this <code>AACSUserPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>AACSUserPrincipal</code>.
     */
    public String toString() {
        return ("AACSUserPrincipal:  " + name);
    }

    /**
     * Compares the specified Object with this <code>AACSUserPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>AACSUserPrincipal</code> and the two AACSUserPrincipals
     * have the same username.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *		<code>AACSUserPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *		<code>AACSUserPrincipal</code>.
     */
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof AACSUserPrincipal)) return false;
        AACSUserPrincipal that = (AACSUserPrincipal) o;
        if (this.getName().equals(that.getName())) return true;
        return false;
    }

    /**
     * Return a hash code for this <code>AACSUserPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>AACSUserPrincipal</code>.
     */
    public int hashCode() {
        return name.hashCode();
    }
}

// AACSUserPrincipal_2Test.java
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
* Test class of {@link AACSUserPrincipal}.
* It contains ten unit test cases for the {@link AACSUserPrincipal#equals(Object)} method.
*/
class AACSUserPrincipal_2Test {
		
	/**
	* Test case for {@link AACSUserPrincipal#equals(Object)} method.
	*
	* <p>
	*
	* @param o Object to be compared for equality with this
	*		<code>AACSUserPrincipal</code>.
	*
	* @return true if the specified Object is equal equal to this
	*		<code>AACSUserPrincipal</code>.
	*/
	@Test
	void testEquals() {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testEquals not implemented");
	}
}

// AACSUserPrincipal_3Test.java
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
* Test class of {@link AACSUserPrincipal}.
* It contains ten unit test cases for the {@link AACSUserPrincipal#hashCode()} method.
*/
class AACSUserPrincipal_3Test {
		
	/**
	* Test case for {@link AACSUserPrincipal#hashCode()} method.
	*
	* <p>
	*
	* @return a hash code for this <code>AACSUserPrincipal</code>.
	*/
	@Test
	void testHashCode() {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testHashCode not implemented");
	}
}

// AACSUserPrincipal_4Test.java
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
* Test class of {@link AACSUserPrincipal}.
* It contains ten unit test cases for the {@link AACSUserPrincipal#toString()} method.
*/
class AACSUserPrincipal_4Test {
		
	/**
	* Test case for {@link AACSUserPrincipal#toString()} method.
	*
	* <p>
	*
	* @return a string representation of this <code>AACSUserPrincipal</code>.
	*/
	@Test
	void testToString() {
		// TODO: implement this test case
		// ensure that the test case has not been implemented yet
		fail("testToString not implemented");
	}
}

// AACSUserPrincipal_5Test.java
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
* Test class of {@link AACSUserPrincipal}.