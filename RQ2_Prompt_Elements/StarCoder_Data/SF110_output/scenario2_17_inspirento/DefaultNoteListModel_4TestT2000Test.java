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
        };
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void onNoteListDataChanged(NoteListDataEvent e) {
                System.out.println("onNoteListDataChanged");
            }
        });
        model.addNote(note);
        assertEquals(0, model.indexOf(note));
    }
}
