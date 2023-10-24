// DownloadQueueBean_0Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#removeAllFromQueue()} method.
*/
class DownloadQueueBean_0Test {

    /**
    * Test method for {@link DownloadQueueBean#removeAllFromQueue()}.
    */
    @Test
    void testRemoveAllFromQueue() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
        instance.addToQueue("7");
        instance.addToQueue("8");
        instance.addToQueue("9");
        instance.addToQueue("10");
        instance.removeAllFromQueue();
        assertEquals(0, instance.getNumEntries());
    }
}

// DownloadQueueBean_1Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#removeFromQueue(String)} method.
*/
class DownloadQueueBean_1Test {
		
    /**
    * Test method for {@link DownloadQueueBean#removeFromQueue(String)}.
    */
    @Test
    void testRemoveFromQueue() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
        instance.addToQueue("7");
        instance.addToQueue("8");
        instance.addToQueue("9");
        instance.addToQueue("10");
        instance.removeFromQueue("1");
        assertEquals(9, instance.getNumEntries());
    }
}

// DownloadQueueBean_2Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#addToQueue(String)} method.
*/
class DownloadQueueBean_2Test {
		
    /**
    * Test method for {@link DownloadQueueBean#addToQueue(String)}.
    */
    @Test
    void testAddToQueue() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
        instance.addToQueue("7");
        instance.addToQueue("8");
        instance.addToQueue("9");
        instance.addToQueue("10");
        assertEquals(10, instance.getNumEntries());
    }
}

// DownloadQueueBean_3Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#isQueuedAlready(String)} method.
*/
class DownloadQueueBean_3Test {
		
    /**
    * Test method for {@link DownloadQueueBean#isQueuedAlready(String)}.
    */
    @Test
    void testIsQueuedAlready() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
        instance.addToQueue("7");
        instance.addToQueue("8");
        instance.addToQueue("9");
        instance.addToQueue("10");
        assertTrue(instance.isQueuedAlready("1"));
    }
}

// DownloadQueueBean_4Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#getNumEntries()} method.
*/
class DownloadQueueBean_4Test {
		
    /**
    * Test method for {@link DownloadQueueBean#getNumEntries()}.
    */
    @Test
    void testGetNumEntries() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
        instance.addToQueue("7");
        instance.addToQueue("8");
        instance.addToQueue("9");
        instance.addToQueue("10");
        assertEquals(10, instance.getNumEntries());
    }
}

// DownloadQueueBean_5Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#removeFromQueue(String)} method.
*/
class DownloadQueueBean_5Test {
		
    /**
    * Test method for {@link DownloadQueueBean#removeFromQueue(String)}.
    */
    @Test
    void testRemoveFromQueue() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
        instance.addToQueue("7");
        instance.addToQueue("8");
        instance.addToQueue("9");
        instance.addToQueue("10");
        instance.removeFromQueue("1");
        assertEquals(9, instance.getNumEntries());
    }
}

// DownloadQueueBean_6Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#removeFromQueue(String)} method.
*/
class DownloadQueueBean_6Test {
		
    /**
    * Test method for {@link DownloadQueueBean#removeFromQueue(String)}.
    */
    @Test
    void testRemoveFromQueue() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
        instance.addToQueue("7");
        instance.addToQueue("8");
        instance.addToQueue("9");
        instance.addToQueue("10");
        instance.removeFromQueue("1");
        assertEquals(9, instance.getNumEntries());
    }
}

// DownloadQueueBean_7Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#removeFromQueue(String)} method.
*/
class DownloadQueueBean_7Test {
		
    /**
    * Test method for {@link DownloadQueueBean#removeFromQueue(String)}.
    */
    @Test
    void testRemoveFromQueue() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.addToQueue("1");
        instance.addToQueue("2");
        instance.addToQueue("3");
        instance.addToQueue("4");
        instance.addToQueue("5");
        instance.addToQueue("6");
       