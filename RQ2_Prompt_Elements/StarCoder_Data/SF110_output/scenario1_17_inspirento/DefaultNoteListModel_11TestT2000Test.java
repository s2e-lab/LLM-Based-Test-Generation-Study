// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {

    private DefaultNoteListModel delegate;
    private List<NoteListDataListener> listeners;
    private AbstractNote obj;
    private int index;
    private NoteListDataEvent event;

    @Test
    void testRemoveElement_01() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
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
            public String getCover() {
                return "cover";
            }

            @Override
            public String getLink() {
                return "link";
            }
        };
        index = 0;
        event = new NoteListDataEvent(this, index, obj);
        delegate.addNoteListDataListener(listeners.get(0));

        // Act
        boolean an = delegate.removeElement(obj);

        // Assert
        assertTrue(an);
        assertEquals(1, listeners.size());
        assertEquals(1, listeners.get(0).getNoteListDataEvent().getNoteListData().size());
        assertEquals(event, listeners.get(0).getNoteListDataEvent());
    }

    @Test
    void testRemoveElement_02() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
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
            public String getCover() {
                return "cover";
            }

            @Override
            public String getLink() {
                return "link";
            }
        };
        index = 0;
        event = new NoteListDataEvent(this, index, obj);
        delegate.addNoteListDataListener(listeners.get(0));
        delegate.removeElement(obj);

        // Act
        boolean an = delegate.removeElement(obj);

        // Assert
        assertFalse(an);
        assertEquals(1, listeners.size());
        assertEquals(1, listeners.get(0).getNoteListDataEvent().getNoteListData().size());
        assertEquals(event, listeners.get(0).getNoteListDataEvent());
    }

    @Test
    void testRemoveElement_03() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
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
            public String getCover() {
                return "cover";
            }

            @Override
            public String getLink() {
                return "link";
            }
        };
        index = 0;
        event = new NoteListDataEvent(this, index, obj);
        delegate.addNoteListDataListener(listeners.get(0));
        delegate.removeElement(obj);

        // Act
        boolean an = delegate.removeElement(obj);

        // Assert
        assertFalse(an);
        assertEquals(1, listeners.size());
        assertEquals(1, listeners.get(0).getNoteListDataEvent().getNoteListData().size());
        assertEquals(event, listeners.get(0).getNoteListDataEvent());
    }

    @Test
    void testRemoveElement_04() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
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
            public String getCover() {
                return "cover";
            }

            @Override
            public String getLink() {
                return "link";
            }
        };
        index = 0;
        event = new NoteListDataEvent(this, index, obj);
        delegate.addNoteListDataListener(listeners.get(0));
        delegate.removeElement(obj);

        // Act
        boolean an = delegate.removeElement(obj);

        // Assert
        assertFalse(an);
        assertEquals(1, listeners.size());
        assertEquals(1, listeners.get(0).getNoteListDataEvent().getNoteListData().size());
        assertEquals(event, listeners.get(0).getNoteListDataEvent());
    }

    @Test
    void testRemoveElement_05() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
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
            public String getCover() {
                return "cover";
            }

            @Override
            public String getLink() {
                return "link";
            }
        };
        index = 0;
        event = new NoteListDataEvent(this, index, obj);
        delegate.addNoteListDataListener(listeners.get(0));
        delegate.removeElement(obj);

        // Act
        boolean an = delegate.removeElement(obj);

        // Assert
        assertFalse(an);
        assertEquals(1, listeners.size());
        assertEquals(1, listeners.get(0).getNoteListDataEvent().getNoteListData().size());
        assertEquals(event, listeners.get(0).getNoteListDataEvent());
    }

    @Test
    void testRemoveElement_06() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
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
            public String getCover() {
                return "cover";
            }

            @Override
            public String getLink() {
                return "link";
            }
        };
        index = 0;
        event = new NoteListDataEvent(this, index, obj);
        delegate.addNoteListDataListener(listeners.get(0));
        delegate.removeElement(obj);

        // Act
        boolean an = delegate.removeElement(obj);

        // Assert
        assertFalse(an);
        assertEquals(1, listeners.size());
        assertEquals(1, listeners.get(0).getNoteListDataEvent().getNoteListData().size());
        assertEquals(event, listeners.get(0).getNoteListDataEvent());
    }

    @Test
    void testRemoveElement_07() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj = new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
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
            public String getCover() {
                return "cover";
            }

            @Override
            public String getLink() {
                return "link";
            }
        };
        index = 0;
        event = new NoteListDataEvent(this, index, obj);
        delegate.addNoteListDataListener(listeners.get(0));
        delegate.removeElement(obj);

        // Act
        boolean an = delegate.removeElement(obj);

        // Assert
        assertFalse(an);
        assertEquals(1, listeners.size());
        assertEquals(1, listeners.get(0).getNoteListDataEvent().getNoteListData().size());
        assertEquals(event, listeners.get(0).getNoteListDataEvent());
    }

    @Test
    void testRemoveElement_08() {
        // Arrange
        delegate = new DefaultNoteListModel();
        listeners = new ArrayList<>();
        obj