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
        assertEquals(0, instance.size());
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
        assertTrue(instance.isEmpty());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#contains(java.lang.Object)} method.
*/
class DefaultNoteListModel_3Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#contains(java.lang.Object)}.
    */
    @Test
    void testContains() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public String getAbstract() {
                return null;
            }

            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getDate() {
                return null;
            }

            @Override
            public String getTags() {
                return null;
            }

            @Override
            public String getCover() {
                return null;
            }

            @Override
            public String getLink() {
                return null;
            }

            @Override
            public String getSource() {
                return null;
            }

            @Override
            public String getHtml() {
                return null;
            }
        };
        assertFalse(instance.contains(note));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(java.lang.Object)} method.
*/
class DefaultNoteListModel_4Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#indexOf(java.lang.Object)}.
    */
    @Test
    void testIndexOf() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public String getAbstract() {
                return null;
            }

            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getDate() {
                return null;
            }

            @Override
            public String getTags() {
                return null;
            }

            @Override
            public String getCover() {
                return null;
            }

            @Override
            public String getLink() {
                return null;
            }

            @Override
            public String getSource() {
                return null;
            }

            @Override
            public String getHtml() {
                return null;
            }
        };
        assertEquals(-1, instance.indexOf(note));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(java.lang.Object, int)} method.
*/
class DefaultNoteListModel_5Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#indexOf(java.lang.Object, int)}.
    */
    @Test
    void testIndexOf_1() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public String getAbstract() {
                return null;
            }

            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getDate() {
                return null;
            }

            @Override
            public String getTags() {
                return null;
            }

            @Override
            public String getCover() {
                return null;
            }

            @Override
            public String getLink() {
                return null;
            }

            @Override
            public String getSource() {
                return null;
            }

            @Override
            public String getHtml() {
                return null;
            }
        };
        assertEquals(-1, instance.indexOf(note, 0));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(java.lang.Object)} method.
*/
class DefaultNoteListModel_6Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(java.lang.Object)}.
    */
    @Test
    void testLastIndexOf() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public String getAbstract() {
                return null;
            }

            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getDate() {
                return null;
            }

            @Override
            public String getTags() {
                return null;
            }

            @Override
            public String getCover() {
                return null;
            }

            @Override
            public String getLink() {
                return null;
            }

            @Override
            public String getSource() {
                return null;
            }

            @Override
            public String getHtml() {
                return null;
            }
        };
        assertEquals(-1, instance.lastIndexOf(note));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(java.lang.Object, int)} method.
*/
class DefaultNoteListModel_7Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(java.lang.Object, int)}.
    */
    @Test
    void testLastIndexOf_1() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public String getAbstract() {
                return null;
            }

            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getDate() {
                return