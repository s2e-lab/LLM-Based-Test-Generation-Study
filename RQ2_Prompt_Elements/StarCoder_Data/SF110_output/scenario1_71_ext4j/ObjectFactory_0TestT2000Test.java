// ObjectFactory_0Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_0Test {

    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_1Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_2Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_3Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_4Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_4Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_5Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_5Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_6Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_6Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_7Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_7Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_8Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_8Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// ObjectFactory_9Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_9Test {
		
    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }
}

// Page.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for page complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="page">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pageNo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalPage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalRecord" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pageSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "page")
public class Page {

    @XmlAttribute(name = "pageNo", required = true)
    protected int pageNo;
    @XmlAttribute(name = "totalPage", required = true)
    protected int totalPage;
    @XmlAttribute(name = "totalRecord", required = true)
    protected int totalRecord;
    @XmlAttribute(name = "pageSize", required = true)
    protected int pageSize;

    /**
     * Gets the value of the pageNo property.
     * 
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     */
    public void setPageNo(int value) {
        this.pageNo = value;
    }

    /**
     * Gets the value of the totalPage property.
     * 
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * Sets the value of the totalPage property.
     * 
     */
    public void setTotalPage(int value) {
        this.totalPage = value;
    }

    /**
     * Gets the value of the totalRecord property.
     * 
     */
    public int getTotalRecord