// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditControlledVocabularyAction}.
* It contains ten unit test cases for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {

    /**
     * Test case for {@link EditControlledVocabularyAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        EditControlledVocabularyAction editControlledVocabularyAction = new EditControlledVocabularyAction();
        boolean result = editControlledVocabularyAction.actionRequiresLogin();
        assertTrue(result);
    }
}

// EditControlledVocabularyAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;

/**
 * An {@link Action} which is called to edit a Controlled Vocabulary item.  If
 * there isn't an existing Controlled Vocabulary item which can be found to edit,
 * we assume that a new Controlled Vocabulary entry should be edited.
 */
public class EditControlledVocabularyAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditControlledVocabularyAction}.
* It contains ten unit test cases for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {
		
    /**
     * Test case for {@link EditControlledVocabularyAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        EditControlledVocabularyAction editControlledVocabularyAction = new EditControlledVocabularyAction();
        boolean result = editControlledVocabularyAction.actionRequiresLogin();
        assertTrue(result);
    }
}

// EditControlledVocabularyAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;

/**
 * An {@link Action} which is called to edit a Controlled Vocabulary item.  If
 * there isn't an existing Controlled Vocabulary item which can be found to edit,
 * we assume that a new Controlled Vocabulary entry should be edited.
 */
public class EditControlledVocabularyAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditControlledVocabularyAction}.
* It contains ten unit test cases for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {
		
    /**
     * Test case for {@link EditControlledVocabularyAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        EditControlledVocabularyAction editControlledVocabularyAction = new EditControlledVocabularyAction();
        boolean result = editControlledVocabularyAction.actionRequiresLogin();
        assertTrue(result);
    }
}

// EditControlledVocabularyAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;

/**
 * An {@link Action} which is called to edit a Controlled Vocabulary item.  If
 * there isn't an existing Controlled Vocabulary item which can be found to edit,
 * we assume that a new Controlled Vocabulary entry should be edited.
 */
public class EditControlledVocabularyAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditControlledVocabularyAction}.
* It contains ten unit test cases for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {
		
    /**
     * Test case for {@link EditControlledVocabularyAction#actionRequiresLogin()}
     * when the user is not logged in.
     */
    @Test
    void testActionRequiresLoginWhenUserIsNotLoggedIn() {
        EditControlledVocabularyAction editControlledVocabularyAction = new EditControlledVocabularyAction();
        boolean result = editControlledVocabularyAction.actionRequiresLogin();
        assertTrue(result);
    }
}

// EditControlledVocabularyAction.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;

/**
 * An {@link Action} which is called to edit a Controlled Vocabulary item.  If
 * there isn't an existing Controlled Vocabulary item which can be found to edit,
 * we assume