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
* It contains ten unit test cases for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {

    /**
     * Test method for {@link DefaultNoteListModel#toArray()}.
     */
    @Test
    void testToArray() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void onNoteListDataChanged(NoteListDataEvent e) {
                fail("This method should not be called.");
            }
        });
        AbstractNote[] expResult = new AbstractNote[0];
        AbstractNote[] result = instance.toArray();
        assertArrayEquals(expResult, result);
    }
}
