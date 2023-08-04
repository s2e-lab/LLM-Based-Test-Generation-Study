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
    * Test case of {@link DefaultNoteListModel#capacity()} method.
    */
    @Test
    void testCapacity() {
        DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
        assertEquals(0, defaultNoteListModel.capacity());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_1Test {
		
    /**
    * Test case of {@link DefaultNoteListModel#capacity()} method.
    */
    @Test
    void testCapacity() {
        DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        assertEquals(1, defaultNoteListModel.capacity());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_2Test {
		
    /**
    * Test case of {@link DefaultNoteListModel#capacity()} method.
    */
    @Test
    void testCapacity() {
        DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        assertEquals(2, defaultNoteListModel.capacity());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_3Test {
		
    /**
    * Test case of {@link DefaultNoteListModel#capacity()} method.
    */
    @Test
    void testCapacity() {
        DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        assertEquals(3, defaultNoteListModel.capacity());
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_4Test {
		
    /**
    * Test case of {@link DefaultNoteListModel#capacity()} method.
    */
    @Test
    void testCapacity() {
        DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
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
        });
        defaultNoteListModel.addNote(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getSummary() {
                return "summary";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate()