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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_4Test {

    @Test
    void indexOf_01() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        assertEquals(-1, model.indexOf(note));
    }

    @Test
    void indexOf_02() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_03() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_04() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_05() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_06() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_07() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_08() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_09() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
    }

    @Test
    void indexOf_10() {
        DefaultNoteListModel model = new DefaultNoteListModel();
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }
        };
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        model.add(note);
        assertEquals(0, model.indexOf(note));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_5Test {
		
    @Test
    void indexOf_01() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
            @Override
            public String getTitle() {