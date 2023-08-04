// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
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
* Test class of {@link EditCopyrightHolderAction}.
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {

    /**
     * Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()}
     * when the action requires login.
     */
    @Test
    void testActionRequiresLogin() {
        EditCopyrightHolderAction action = new EditCopyrightHolderAction();
        assertTrue(action.actionRequiresLogin());
    }
}

// CopyrightHolderBean.java
package org.heal.module.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * A bean which represents a Copyright Holder.
 */
public class CopyrightHolderBean {

    private String name;
    private String email;
    private String url;
    private List<CompleteMetadataBean> metadata;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the metadata
     */
    public List<CompleteMetadataBean> getMetadata() {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(List<CompleteMetadataBean> metadata) {
        this.metadata = metadata;
    }

    /**
     * Adds a metadata to the list of metadata.
     * @param metadata the metadata to add
     */
    public void addMetadata(CompleteMetadataBean metadata) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<CompleteMetadataBean>();
        }
        this.metadata.add(metadata);
    }
}

// CopyrightHolderBeanTest.java
package org.heal.module.metadata;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CopyrightHolderBean}.
* It contains ten unit test cases for the {@link CopyrightHolderBean#addMetadata(CompleteMetadataBean)} method.
*/
class CopyrightHolderBeanTest {
		
    /**
     * Test case for {@link CopyrightHolderBean#addMetadata(CompleteMetadataBean)}
     * when the metadata is added to the list of metadata.
     */
    @Test
    void testAddMetadata() {
        CopyrightHolderBean bean = new CopyrightHolderBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        bean.addMetadata(metadata);
        assertEquals(1, bean.getMetadata().size());
    }
}

// CompleteMetadataBean.java
package org.heal.module.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * A bean which represents a complete metadata.
 */
public class CompleteMetadataBean {

    private String name;
    private String value;
    private List<CopyrightHolderBean> copyrightHolders;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the copyrightHolders
     */
    public List<CopyrightHolderBean> getCopyrightHolders() {
        return copyrightHolders;
    }

    /**
     * @param copyrightHolders the copyrightHolders to set
     */
    public void setCopyrightHolders(List<CopyrightHolderBean> copyrightHolders) {
        this.copyrightHolders = copyrightHolders;
    }

    /**
     * Adds a copyright holder to the list of copyright holders.
     * @param copyrightHolder the copyright holder to add
     */
    public void addCopyrightHolder(CopyrightHolderBean copyrightHolder) {
        if (this.copyrightHolders == null) {
            this.copyrightHolders = new ArrayList<CopyrightHolderBean>();
        }
        this.copyrightHolders.add(copyrightHolder);
    }
}

// CompleteMetadataBeanTest.java
package org.heal.module.metadata;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompleteMetadataBean}.
* It contains ten unit test cases for the {@link CompleteMetadataBean#addCopyrightHolder(CopyrightHolderBean)} method.
*/
class CompleteMetadataBeanTest {
		
    /**
     * Test case for {@link CompleteMetadataBean#addCopyrightHolder(CopyrightHolderBean)}
     * when the copyright holder is added to the list of copyright holders.
     */
    @Test
    void testAddCopyrightHolder() {
        CompleteMetadataBean bean = new CompleteMetadataBean();
        CopyrightHolderBean copyrightHolder = new CopyrightHolderBean();
        bean.addCopyrightHolder(copyrightHolder);
        assertEquals(1, bean.getCopyrightHolders().size());
    }
}

// CopyrightHolderBean.java
package org.heal.module.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * A bean which represents a Copyright Holder.
 */
public class CopyrightHolderBean {

    private String name;
    private String email;
    private String url;
    private List<CompleteMetadataBean> metadata;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the metadata
     */
    public List<CompleteMetadataBean> getMetadata() {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(List<CompleteMetadataBean> metadata) {
        this.metadata = metadata;
    }

    /**
     * Adds a metadata to the list of metadata.
     * @param metadata the metadata to add
     */
    public void addMetadata(CompleteMetadataBean metadata) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<CompleteMetadataBean>();
        }
        this.metadata.add(metadata);
    }
}

// CopyrightHolderBeanTest.java
package org.heal.module.metadata;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CopyrightHolderBean}.
* It contains ten unit test cases for the {@link CopyrightHolderBean#addMetadata(CompleteMetadataBean)} method.
*/
class CopyrightHolderBeanTest {
		
    /**
     * Test case for {@link CopyrightHolderBean#addMetadata(CompleteMetadataBean)}
     * when the metadata is added to the list of metadata.
     */
    @Test
    void testAddMetadata() {
        CopyrightHolderBean bean = new CopyrightHolderBean();
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        bean.addMetadata(metadata);
        assertEquals(1, bean.getMetadata().size());
    }
}

// CompleteMetadataBean.java
package org.heal.module.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * A bean which represents a complete metadata.
 */
public class CompleteMetadataBean {

    private String name;
    private String value;
    private List<CopyrightHolderBean> copyrightHolders;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the