// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactory_2Test {

    /**
    * Test case for the {@link ObjectFactory#createPagination()} method.
    */
    @Test
    void testCreatePagination() {
        Pagination pagination = ObjectFactory.createPagination();
        assertNotNull(pagination);
    }
}

// ObjectFactory_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactory_1Test {
		
    /**
    * Test case for the {@link ObjectFactory#createStaticPage()} method.
    */
    @Test
    void testCreateStaticPage() {
        StaticPage staticPage = ObjectFactory.createStaticPage();
        assertNotNull(staticPage);
    }
}

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
		
    /**
    * Test case for the {@link ObjectFactory#createPage()} method.
    */
    @Test
    void testCreatePage() {
        Page page = ObjectFactory.createPage();
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
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_3Test {
		
    /**
    * Test case for the {@link ObjectFactory#createPages()} method.
    */
    @Test
    void testCreatePages() {
        Pages pages = ObjectFactory.createPages();
        assertNotNull(pages);
    }
}
