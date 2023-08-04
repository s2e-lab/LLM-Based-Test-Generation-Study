// AACSLoginModule_0Test.java
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
class AACSLoginModule_0Test {

    /**
     * Test case for the {@link AACSLoginModule#login()} method.
     * It tests the login of a user with a valid password.
     */
    @Test
    void login_01() {
        System.out.println("login_01");
        // Create a LoginContext and try to login with a valid user name and password.
        LoginContext loginContext = null;
        try {
            loginContext = new LoginContext("jaas-aacs-login-module-01", new CallbackHandler() {
                public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                    for (int i = 0; i < callbacks.length; i++) {
                        if (callbacks[i] instanceof NameCallback) {
                            NameCallback nameCallback = (NameCallback) callbacks[i];
                            nameCallback.setName("testUser");
                        } else if (callbacks[i] instanceof PasswordCallback) {
                            PasswordCallback passwordCallback = (PasswordCallback) callbacks[i];
                            passwordCallback.setPassword("<PASSWORD>".toCharArray());
                        } else {
                            throw new UnsupportedCallbackException(callbacks[i]);
                        }
                    }
                }
            });
            loginContext.login();
        } catch (LoginException e) {
            fail("Login failed: " + e.getMessage());
        }
        // Check if the user has been authenticated.
        Subject subject = loginContext.getSubject();
        Set<User> users = subject.getPrincipals(User.class);
        assertEquals(1, users.size());
        User user = users.iterator().next();
        assertEquals("testUser", user.getName());
        // Check if the user has been granted the AACSPrincipal.
        Set<AACSPrincipal> principals = subject.getPrincipals(AACSPrincipal.class);
        assertEquals(1, principals.size());
        AACSPrincipal principal = principals.iterator().next();
        assertEquals("testUser", principal.getName());
        // Check if the user has been granted the AACSRole.
        Set<AACSRole> roles = subject.getPrincipals(AACSRole.class);
        assertEquals(1, roles.size());
        AACSRole role = roles.iterator().next();
        assertEquals("testRole", role.getName());
        // Check if the user has been granted the AACSPermission.
        Set<AACSPermission> permissions = subject.getPrincipals(AACSPermission.class);
        assertEquals(1, permissions.size());
        AACSPermission permission = permissions.iterator().next();
        assertEquals("testPermission", permission.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions.size());
        AACSResourcePermission resourcePermission = resourcePermissions.iterator().next();
        assertEquals("testResourcePermission", resourcePermission.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions2 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions2.size());
        AACSResourcePermission resourcePermission2 = resourcePermissions2.iterator().next();
        assertEquals("testResourcePermission", resourcePermission2.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions3 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions3.size());
        AACSResourcePermission resourcePermission3 = resourcePermissions3.iterator().next();
        assertEquals("testResourcePermission", resourcePermission3.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions4 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions4.size());
        AACSResourcePermission resourcePermission4 = resourcePermissions4.iterator().next();
        assertEquals("testResourcePermission", resourcePermission4.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions5 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions5.size());
        AACSResourcePermission resourcePermission5 = resourcePermissions5.iterator().next();
        assertEquals("testResourcePermission", resourcePermission5.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions6 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions6.size());
        AACSResourcePermission resourcePermission6 = resourcePermissions6.iterator().next();
        assertEquals("testResourcePermission", resourcePermission6.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions7 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions7.size());
        AACSResourcePermission resourcePermission7 = resourcePermissions7.iterator().next();
        assertEquals("testResourcePermission", resourcePermission7.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions8 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions8.size());
        AACSResourcePermission resourcePermission8 = resourcePermissions8.iterator().next();
        assertEquals("testResourcePermission", resourcePermission8.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions9 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions9.size());
        AACSResourcePermission resourcePermission9 = resourcePermissions9.iterator().next();
        assertEquals("testResourcePermission", resourcePermission9.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions10 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions10.size());
        AACSResourcePermission resourcePermission10 = resourcePermissions10.iterator().next();
        assertEquals("testResourcePermission", resourcePermission10.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions11 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions11.size());
        AACSResourcePermission resourcePermission11 = resourcePermissions11.iterator().next();
        assertEquals("testResourcePermission", resourcePermission11.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions12 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions12.size());
        AACSResourcePermission resourcePermission12 = resourcePermissions12.iterator().next();
        assertEquals("testResourcePermission", resourcePermission12.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions13 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions13.size());
        AACSResourcePermission resourcePermission13 = resourcePermissions13.iterator().next();
        assertEquals("testResourcePermission", resourcePermission13.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions14 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions14.size());
        AACSResourcePermission resourcePermission14 = resourcePermissions14.iterator().next();
        assertEquals("testResourcePermission", resourcePermission14.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions15 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions15.size());
        AACSResourcePermission resourcePermission15 = resourcePermissions15.iterator().next();
        assertEquals("testResourcePermission", resourcePermission15.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions16 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions16.size());
        AACSResourcePermission resourcePermission16 = resourcePermissions16.iterator().next();
        assertEquals("testResourcePermission", resourcePermission16.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions17 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions17.size());
        AACSResourcePermission resourcePermission17 = resourcePermissions17.iterator().next();
        assertEquals("testResourcePermission", resourcePermission17.getName());
        // Check if the user has been granted the AACSResourcePermission.
        Set<AACSResourcePermission> resourcePermissions18 = subject.getPrincipals(AACSResourcePermission.class);
        assertEquals(1, resourcePermissions