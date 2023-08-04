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
* It contains ten unit test cases for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {

    /**
    * Test method for {@link DefaultNoteListModel#elements()}.
    */
    @Test
    void testElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title1";
            }

            @Override
            public String getAbstract() {
                return "abstract1";
            }

            @Override
            public String getAuthor() {
                return "author1";
            }

            @Override
            public String getDate() {
                return "date1";
            }

            @Override
            public String getTags() {
                return "tags1";
            }

            @Override
            public String getLink() {
                return "link1";
            }

            @Override
            public String getCover() {
                return "cover1";
            }

            @Override
            public String getContent() {
                return "content1";
            }
        };
        AbstractNote note2 = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title2";
            }

            @Override
            public String getAbstract() {
                return "abstract2";
            }

            @Override
            public String getAuthor() {
                return "author2";
            }

            @Override
            public String getDate() {
                return "date2";
            }

            @Override
            public String getTags() {
                return "tags2";
            }

            @Override
            public String getLink() {
                return "link2";
            }

            @Override
            public String getCover() {
                return "cover2";
            }

            @Override
            public String getContent() {
                return "content2";
            }
        };
        model.addElement(note1);
        model.addElement(note2);
        Enumeration<AbstractNote> elements = model.elements();
        assertTrue(elements.hasMoreElements());
        assertEquals(note1, elements.nextElement());
        assertTrue(elements.hasMoreElements());
        assertEquals(note2, elements.nextElement());
        assertFalse(elements.hasMoreElements());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#contains(Object)} method.
*/
class DefaultNoteListModel_3Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#contains(Object)}.
    */
    @Test
    void testContains() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title1";
            }

            @Override
            public String getAbstract() {
                return "abstract1";
            }

            @Override
            public String getAuthor() {
                return "author1";
            }

            @Override
            public String getDate() {
                return "date1";
            }

            @Override
            public String getTags() {
                return "tags1";
            }

            @Override
            public String getLink() {
                return "link1";
            }

            @Override
            public String getCover() {
                return "cover1";
            }

            @Override
            public String getContent() {
                return "content1";
            }
        };
        AbstractNote note2 = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title2";
            }

            @Override
            public String getAbstract() {
                return "abstract2";
            }

            @Override
            public String getAuthor() {
                return "author2";
            }

            @Override
            public String getDate() {
                return "date2";
            }

            @Override
            public String getTags() {
                return "tags2";
            }

            @Override
            public String getLink() {
                return "link2";
            }

            @Override
            public String getCover() {
                return "cover2";
            }

            @Override
            public String getContent() {
                return "content2";
            }
        };
        model.addElement(note1);
        model.addElement(note2);
        assertTrue(model.contains(note1));
        assertTrue(model.contains(note2));
        assertFalse(model.contains(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title3";
            }

            @Override
            public String getAbstract() {
                return "abstract3";
            }

            @Override
            public String getAuthor() {
                return "author3";
            }

            @Override
            public String getDate() {
                return "date3";
            }

            @Override
            public String getTags() {
                return "tags3";
            }

            @Override
            public String getLink() {
                return "link3";
            }

            @Override
            public String getCover() {
                return "cover3";
            }

            @Override
            public String getContent() {
                return "content3";
            }
        }));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(Object)} method.
*/
class DefaultNoteListModel_4Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#indexOf(Object)}.
    */
    @Test
    void testIndexOf() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note1 = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title1";
            }

            @Override
            public String getAbstract() {
                return "abstract1";
            }

            @Override
            public String getAuthor() {
                return "author1";
            }

            @Override
            public String getDate() {
                return "date1";
            }

            @Override
            public String getTags() {
                return "tags1";
            }

            @Override
            public String getLink() {
                return "link1";
            }

            @Override
            public String getCover() {
                return "cover1";
            }

            @Override
            public String getContent() {
                return "content1";
            }
        };
        AbstractNote note2 = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title2";
            }

            @Override
            public String getAbstract() {
                return "abstract2";
            }

            @Override
            public String getAuthor() {
                return "author2";
            }

            @Override
            public String getDate() {
                return "date2";
            }

            @Override
            public String getTags() {
                return "tags2";
            }

            @Override
            public String getLink() {
                return "link2";
            }

            @Override
            public String getCover() {
                return "cover2";
            }

            @Override
            public String getContent() {
                return "content2";
            }
        };
        model.addElement(note1);
        model.addElement(note2);
        assertEquals(0, model.indexOf(note1));
        assertEquals(1, model.indexOf(note2));
        assertEquals(-1, model.indexOf(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title3";
            }

            @Override
            public String getAbstract() {
                return "abstract3";
            }

            @Override
            public String getAuthor() {
                return "author3";
            }

            @Override
            public String getDate() {
                return "date3";
            }

            @Override
            public String getTags() {
                return "tags3";
            }

            @Override
            public String getLink() {
                return "link3";
            }

            @Override
            public String getCover() {
                return "cover3";
            }

            @Override
            public String getContent() {
                return "content3";
            }
        }));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(Object, int)} method.
*/
class DefaultNoteListModel_5Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#indexOf(Object, int)}.
    */