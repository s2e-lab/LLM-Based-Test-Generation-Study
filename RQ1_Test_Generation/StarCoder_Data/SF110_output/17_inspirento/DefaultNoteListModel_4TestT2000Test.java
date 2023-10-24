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

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote)}.
    */
    @Test
    void testIndexOf() {
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

            @Override
            public String getSource() {
                return "source";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getComments() {
                return "comments";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        };
        model.addElement(note);
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_1() {
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

            @Override
            public String getSource() {
                return "source";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getComments() {
                return "comments";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        };
        model.addElement(note);
        assertEquals(-1, model.indexOf(note, 1));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)}.
    */
    @Test
    void testLastIndexOf() {
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

            @Override
            public String getSource() {
                return "source";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getComments() {
                return "comments";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        };
        model.addElement(note);
        assertEquals(0, model.lastIndexOf(note));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)}.
    */
    @Test
    void testLastIndexOf_1() {
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

            @Override
            public String getSource() {
                return "source";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getComments() {
                return "comments";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        };
        model.addElement(note);
        assertEquals(-1, model.lastIndexOf(note, 1));
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {
		
    /**
    * Test method for {@link DefaultNoteListModel#elementAt(int)}.
    */
    @Test
    void testElementAt() {
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

            @Override
            public String getSource() {
                return "source";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getComments() {
                return "comments";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom