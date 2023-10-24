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
        Vector<AbstractNote> vector = new Vector<AbstractNote>();
        vector.add(new AbstractNote() {
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
        });
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void onNoteListDataChanged(NoteListDataEvent e) {
                assertEquals(vector, e.getNoteList());
            }
        });
        model.setNoteList(vector);
        assertEquals(vector, model.elements());
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
        DefaultNoteListModel model = new DefaultNoteListModel();
        Vector<AbstractNote> vector = new Vector<AbstractNote>();
        vector.add(new AbstractNote() {
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
        });
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void onNoteListDataChanged(NoteListDataEvent e) {
                assertEquals(vector, e.getNoteList());
            }
        });
        model.setNoteList(vector);
        assertEquals(vector, model.elements());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_4Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#elements()}.
     */
    @Test
    void testElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        Vector<AbstractNote> vector = new Vector<AbstractNote>();
        vector.add(new AbstractNote() {
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
        });
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void onNoteListDataChanged(NoteListDataEvent e) {
                assertEquals(vector, e.getNoteList());
            }
        });
        model.setNoteList(vector);
        assertEquals(vector, model.elements());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_5Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#elements()}.
     */
    @Test
    void testElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        Vector<AbstractNote> vector = new Vector<AbstractNote>();
        vector.add(new AbstractNote() {
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
        });
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void onNoteListDataChanged(NoteListDataEvent e) {
                assertEquals(vector, e.getNoteList());
            }
        });
        model.setNoteList(vector);
        assertEquals(vector, model.elements());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_6Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#elements()}.
     */
    @Test
    void testElements() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        Vector<AbstractNote> vector = new Vector<AbstractNote>();
        vector.add(new AbstractNote() {
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
        });
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void onNoteListDataChanged(NoteListDataEvent e) {
                assertEquals(vector, e.getNoteList());
            }
        });
        model.setNoteList(vector);
        assertEquals(vector, model.elements());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#elements()} method.
*/