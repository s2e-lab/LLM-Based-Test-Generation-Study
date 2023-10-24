// QueueDAO_0Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QueueDAO}.
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_0Test {

    private DataSource dataSource = null;
    private QueueDAO queueDAO = null;
    private MetadataDAO metadataDAO = null;

    /**
    * Sets up the test fixture.
    *
    * Called before every test case method.
    */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataSource = CommonDAO.getDataSource();
        queueDAO = new QueueDAO();
        metadataDAO = new MetadataDAO();
    }

    /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
    * Test case for {@link QueueDAO#getQueueByType(String)}
    */
    @org.junit.jupiter.api.Test
    void testGetQueueByType() {
        List<QueuedRecordBean> result = queueDAO.getQueueByType("test");
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}

// QueueDAO_1Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QueueDAO}.
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_1Test {
		
    private DataSource dataSource = null;
    private QueueDAO queueDAO = null;
    private MetadataDAO metadataDAO = null;

    /**
    * Sets up the test fixture.
    *
    * Called before every test case method.
    */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataSource = CommonDAO.getDataSource();
        queueDAO = new QueueDAO();
        metadataDAO = new MetadataDAO();
    }

    /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
    * Test case for {@link QueueDAO#getQueueByType(String)}
    */
    @org.junit.jupiter.api.Test
    void testGetQueueByType() {
        List<QueuedRecordBean> result = queueDAO.getQueueByType("test");
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}

// QueueDAO_2Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QueueDAO}.
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_2Test {
		
    private DataSource dataSource = null;
    private QueueDAO queueDAO = null;
    private MetadataDAO metadataDAO = null;

    /**
    * Sets up the test fixture.
    *
    * Called before every test case method.
    */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataSource = CommonDAO.getDataSource();
        queueDAO = new QueueDAO();
        metadataDAO = new MetadataDAO();
    }

    /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
    * Test case for {@link QueueDAO#getQueueByType(String)}
    */
    @org.junit.jupiter.api.Test
    void testGetQueueByType() {
        List<QueuedRecordBean> result = queueDAO.getQueueByType("test");
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}

// QueueDAO_3Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QueueDAO}.
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_3Test {
		
    private DataSource dataSource = null;
    private QueueDAO queueDAO = null;
    private MetadataDAO metadataDAO = null;

    /**
    * Sets up the test fixture.
    *
    * Called before every test case method.
    */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataSource = CommonDAO.getDataSource();
        queueDAO = new QueueDAO();
        metadataDAO = new MetadataDAO();
    }

    /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
    * Test case for {@link QueueDAO#getQueueByType(String)}
    */
    @org.junit.jupiter.api.Test
    void testGetQueueByType() {
        List<QueuedRecordBean> result = queueDAO.getQueueByType("test");
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}

// QueueDAO_4Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QueueDAO}.
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_4Test {
		
    private DataSource dataSource = null;
    private QueueDAO queueDAO = null;
    private MetadataDAO metadataDAO = null;

    /**
    * Sets up the test fixture.
    *
    * Called before every test case method.
    */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataSource = CommonDAO.getDataSource();
        queueDAO = new QueueDAO();
        metadataDAO = new MetadataDAO();
    }

    /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
    * Test case for {@link QueueDAO#getQueueByType(String)}
    */
    @org.junit.jupiter.api.Test
    void testGetQueueByType() {
        List<QueuedRecordBean> result = queueDAO.getQueueByType("test");
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}

// QueueDAO_5Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java