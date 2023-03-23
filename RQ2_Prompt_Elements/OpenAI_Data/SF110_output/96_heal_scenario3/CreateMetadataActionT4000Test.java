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
	* Test case 1 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin1() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 2 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin2() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 3 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin3() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 4 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin4() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 5 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin5() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 6 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin6() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 7 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin7() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 8 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin8() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 9 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin9() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 10 for method {@link CreateMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin10() {
		CreateMetadataAction createMetadataAction = new CreateMetadataAction();
		boolean result = createMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
}

// DeleteMetadataAction.java
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

/**
 * An {@link Action} which deletes a metadata record from the database.
 */
public class DeleteMetadataAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin();
}

// DeleteMetadataActionTest.java
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
* Test class of {@link DeleteMetadataAction}.
* It contains ten unit test cases for the {@link DeleteMetadataAction#actionRequiresLogin()} method.
*/
class DeleteMetadataActionTest {
		
	/**
	* Test case 1 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin1() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 2 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin2() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 3 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin3() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 4 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin4() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 5 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin5() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 6 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin6() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 7 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin7() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 8 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin8() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 9 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin9() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 10 for method {@link DeleteMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin10() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		boolean result = deleteMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
}

// EditMetadataAction.java
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

/**
 * An {@link Action} which retrieves a metadata record from the database,
 * puts it into the session, and then directs the user to the editing
 * page.
 */
public class EditMetadataAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin();
}

// EditMetadataActionTest.java
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
* Test class of {@link EditMetadataAction}.
* It contains ten unit test cases for the {@link EditMetadataAction#actionRequiresLogin()} method.
*/
class EditMetadataActionTest {
		
	/**
	* Test case 1 for method {@link EditMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin1() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		boolean result = editMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 2 for method {@link EditMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin2() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		boolean result = editMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 3 for method {@link EditMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin3() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		boolean result = editMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 4 for method {@link EditMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin4() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		boolean result = editMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 5 for method {@link EditMetadataAction#actionRequiresLogin()}.
	* This test case tests the return value of the method.
	*/
	@Test
	public void testActionRequiresLogin5() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		boolean result = editMetadataAction.actionRequiresLogin();
		assertTrue(result);
	}
	
	/**
	* Test case 6