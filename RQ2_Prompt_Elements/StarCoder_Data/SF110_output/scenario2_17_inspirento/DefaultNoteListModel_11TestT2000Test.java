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

    /**
     * Test method for {@link DefaultNoteListModel#removeElement(AbstractNote)}.
     */
    @Test
    void testRemoveElement() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                fail("This method should not be called.");
            }
        });
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
        instance.removeElement(note);
    }
}

// DefaultNoteListModel_12Test.java
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
class DefaultNoteListModel_12Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#removeElement(AbstractNote)}.
     */
    @Test
    void testRemoveElement() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                fail("This method should not be called.");
            }
        });
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
        instance.removeElement(note);
    }
}

// DefaultNoteListModel_13Test.java
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
class DefaultNoteListModel_13Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#removeElement(AbstractNote)}.
     */
    @Test
    void testRemoveElement() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                fail("This method should not be called.");
            }
        });
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
        instance.removeElement(note);
    }
}

// DefaultNoteListModel_14Test.java
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
class DefaultNoteListModel_14Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#removeElement(AbstractNote)}.
     */
    @Test
    void testRemoveElement() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                fail("This method should not be called.");
            }
        });
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
        instance.removeElement(note);
    }
}

// DefaultNoteListModel_15Test.java
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
class DefaultNoteListModel_15Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#removeElement(AbstractNote)}.
     */
    @Test
    void testRemoveElement() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                fail("This method should not be called.");
            }
        });
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
        instance.removeElement(note);
    }
}

// DefaultNoteListModel_16Test.java
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
class DefaultNoteListModel_16Test {
		
    /**
     * Test method for {@link DefaultNoteListModel#removeElement(AbstractNote)}.
     */
    @Test
    void testRemoveElement() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                fail("This method should not be called.");
            }
        });
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
           