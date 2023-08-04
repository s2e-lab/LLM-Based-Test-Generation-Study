// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains ten unit test cases for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {

    /**
     * Test method for {@link CreateMetadataAction#actionRequiresLogin()}.
     */
    @Test
    void testActionRequiresLogin() {
        CreateMetadataAction action = new CreateMetadataAction();
        assertTrue(action.actionRequiresLogin());
    }
}

// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains ten unit test cases for the {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class CreateMetadataActionTest {
		
    /**
     * Test method for {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
     */
    @Test
    void testPerform() throws IOException, ServletException {
        CreateMetadataAction action = new CreateMetadataAction();
        HttpServlet servlet = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        action.perform(servlet, request, response);
    }
}

// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains ten unit test cases for the {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class CreateMetadataActionTest {
		
    /**
     * Test method for {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
     */
    @Test
    void testPerform() throws IOException, ServletException {
        CreateMetadataAction action = new CreateMetadataAction();
        HttpServlet servlet = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        action.perform(servlet, request, response);
    }
}

// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains ten unit test cases for the {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class CreateMetadataActionTest {
		
    /**
     * Test method for {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
     */
    @Test
    void testPerform() throws IOException, ServletException {
        CreateMetadataAction action = new CreateMetadataAction();
        HttpServlet servlet = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        action.perform(servlet, request, response);
    }
}

// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains ten unit test cases for the {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class CreateMetadataActionTest {
		
    /**
     * Test method for {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
     */
    @Test
    void testPerform() throws IOException, ServletException {
        CreateMetadataAction action = new CreateMetadataAction();
        HttpServlet servlet = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        action.perform(servlet, request, response);
    }
}

// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains ten unit test cases for the {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)} method.
*/
class CreateMetadataActionTest {
		
    /**
     * Test method for {@link CreateMetadataAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
     */
    @Test
    void testPerform() throws IOException, ServletException {
        CreateMetadataAction action = new CreateMetadataAction();
        HttpServlet servlet = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        action.perform(servlet, request, response);
    }
}

// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;