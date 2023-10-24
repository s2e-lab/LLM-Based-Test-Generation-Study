// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {

    /**
    * Test method for {@link DefaultNoteListModel#capacity()}.
    */
    @Test
    void testCapacity() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        int expResult = 10;
        int result = instance.capacity();
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_1Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModel_1Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#size()}.
    */
    @Test
    void testSize() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#isEmpty()} method.
*/
class DefaultNoteListModel_2Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#isEmpty()}.
    */
    @Test
    void testIsEmpty() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_3Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#elements()}.
    */
    @Test
    void testElements() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        Enumeration<AbstractNote> result = instance.elements();
        assertNotNull(result);
    }
}

// DefaultNoteListModel_4Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#contains(com.allenstudio.ir.core.plugins.AbstractNote)} method.
*/
class DefaultNoteListModel_4Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#contains(com.allenstudio.ir.core.plugins.AbstractNote)}.
    */
    @Test
    void testContains() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote elem = null;
        boolean expResult = false;
        boolean result = instance.contains(elem);
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(com.allenstudio.ir.core.plugins.AbstractNote)} method.
*/
class DefaultNoteListModel_5Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#indexOf(com.allenstudio.ir.core.plugins.AbstractNote)}.
    */
    @Test
    void testIndexOf() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote elem = null;
        int expResult = -1;
        int result = instance.indexOf(elem);
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(com.allenstudio.ir.core.plugins.AbstractNote, int)} method.
*/
class DefaultNoteListModel_6Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#indexOf(com.allenstudio.ir.core.plugins.AbstractNote, int)}.
    */
    @Test
    void testIndexOf_0args() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote elem = null;
        int expResult = -1;
        int result = instance.indexOf(elem);
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(com.allenstudio.ir.core.plugins.AbstractNote)} method.
*/
class DefaultNoteListModel_7Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(com.allenstudio.ir.core.plugins.AbstractNote)}.
    */
    @Test
    void testLastIndexOf() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote elem = null;
        int expResult = -1;
        int result = instance.lastIndexOf(elem);
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(com.allenstudio.ir.core.plugins.AbstractNote, int)} method.
*/
class DefaultNoteListModel_8Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(com.allenstudio.ir.core.plugins.AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_0args() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote elem = null;
        int expResult = -1;
        int result = instance.lastIndexOf(elem);
        assertEquals(expResult, result);
    }
}

// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote