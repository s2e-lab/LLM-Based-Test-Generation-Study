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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_01() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 0);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_02() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, -1);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_03() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 1);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_04() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 2);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_05() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 3);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_06() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 4);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_07() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 5);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_08() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 6);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_09() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getContent() {
                return "content";
            }
        };
        int expResult = -1;
        int result = instance.indexOf(note, 7);
        assertEquals(