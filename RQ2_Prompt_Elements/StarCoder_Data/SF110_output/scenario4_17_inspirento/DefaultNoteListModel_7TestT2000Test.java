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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_01() {
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
        int index = 0;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_02() {
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
        int index = 1;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_03() {
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
        int index = 2;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_04() {
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
        int index = 3;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_05() {
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
        int index = 4;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_06() {
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
        int index = 5;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_07() {
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
        int index = 6;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_08() {
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
        int index = 7;
        int expResult = -1;
        int result = instance.lastIndexOf(note, index);
        assertEquals(expResult, result);
    }

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_09() {
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

            @