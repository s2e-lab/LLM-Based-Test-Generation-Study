// ObjectFactory_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_3Test {

    /**
    * Test case for the {@link ObjectFactory#createPages()} method.
    */
    @Test
    void testCreatePages() {
        Pages pages = new ObjectFactory().createPages();
        assertNotNull(pages);
    }
}

// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_2Test {
		
    /**
    * Test case for the {@link ObjectFactory#createPages()} method.
    */
    @Test
    void testCreatePages() {
        Pages pages = new ObjectFactory().createPages();
        assertNotNull(pages);
    }
}

// ObjectFactory_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_1Test {
		
    /**
    * Test case for the {@link ObjectFactory#createPages()} method.
    */
    @Test
    void testCreatePages() {
        Pages pages = new ObjectFactory().createPages();
        assertNotNull(pages);
    }
}

// ObjectFactory_0Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_0Test {
		
    /**
    * Test case for the {@link ObjectFactory#createPages()} method.
    */
    @Test
    void testCreatePages() {
        Pages pages = new ObjectFactory().createPages();
        assertNotNull(pages);
    }
}

// Pages.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for pages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="current" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pages")
public class Pages {

    @XmlAttribute(name = "total", required = true)
    protected int total;
    @XmlAttribute(name = "current", required = true)
    protected int current;
    @XmlAttribute(name = "size", required = true)
    protected int size;

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the current property.
     * 
     */
    public int getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(int value) {
        this.current = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}

// Pages_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pages}.
* It contains ten unit test cases for the {@link Pages#getTotal()} method.
*/
class Pages_1Test {
		
    /**
    * Test case for the {@link Pages#getTotal()} method.
    */
    @Test
    void testGetTotal() {
        Pages pages = new Pages();
        pages.setTotal(1);
        assertEquals(1, pages.getTotal());
    }
}

// Pages_0Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pages}.
* It contains ten unit test cases for the {@link Pages#getTotal()} method.
*/
class Pages_0Test {
		
    /**
    * Test case for the {@link Pages#getTotal()} method.
    */
    @Test
    void testGetTotal() {
        Pages pages = new Pages();
        pages.setTotal(1);
        assertEquals(1, pages.getTotal());
    }
}

// Pages_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pages}.
* It contains ten unit test cases for the {@link Pages#getTotal()} method.
*/
class Pages_2Test {
		
    /**
    * Test case for the {@link Pages#getTotal()} method.
    */
    @Test
    void testGetTotal() {
        Pages pages = new Pages();
        pages.setTotal(1);
        assertEquals(1, pages.getTotal());
    }
}

// Pages_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pages}.
* It contains ten unit test cases for the {@link Pages#getTotal()} method.
*/
class Pages_3Test {
		
    /**
    * Test case for the {@link Pages#getTotal()} method.
    */
    @Test
    void testGetTotal() {
        Pages pages = new Pages();
        pages.setTotal(1);
        assertEquals(1, pages.getTotal());
    }
}

// Pages_4Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pages}.
* It contains ten unit test cases for the {@link Pages#getTotal()} method.
*/
class Pages_4Test {
		
    /**
    * Test case for the {@link Pages#getTotal()} method.
    */
    @Test
    void testGetTotal() {
        Pages pages = new Pages();
        pages.setTotal(1);
        assertEquals(1, pages.getTotal());
    }
}

// Pages_5Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pages}.
* It contains ten