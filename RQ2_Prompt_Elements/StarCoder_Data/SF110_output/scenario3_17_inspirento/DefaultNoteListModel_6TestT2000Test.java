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
        DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
        AbstractNote abstractNote = new AbstractNote() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public String getAbstract() {
                return null;
            }

            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getDate() {
                return null;
            }

            @Override
            public String getLink() {
                return null;
            }

            @Override
            public String getCover() {
                return null;
            }

            @Override
            public String getSource() {
                return null;
            }

            @Override
            public String getSourceLink() {
                return null;
            }

            @Override
            public String getSourceDate() {
                return null;
            }

            @Override
            public String getSourceAuthor() {
                return null;
            }

            @Override
            public String getSourceCover() {
                return null;
            }

            @Override
            public String getSourceAbstract() {
                return null;
            }

            @Override
            public String getSourceTitle() {
                return null;
            }

            @Override
            public String getSourceContent() {
                return null;
            }

            @Override
            public String getSourceContentAbstract() {
                return null;
            }

            @Override
            public String getSourceContentTitle() {
                return null;
            }

            @Override
            public String getSourceContentDate() {
                return null;
            }

            @Override
            public String getSourceContentAuthor() {
                return null;
            }

            @Override
            public String getSourceContentLink() {
                return null;
            }

            @Override
            public String getSourceContentCover() {
                return null;
            }

            @Override
            public String getSourceContentSource() {
                return null;
            }

            @Override
            public String getSourceContentSourceLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContent() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSource() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContent() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSource() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContent() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSource() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContent() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSource() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceLink() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceCover() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceContent() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceContentAbstract() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceContentTitle() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceContentDate() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceContentAuthor() {
                return null;
            }

            @Override
            public String getSourceContentSourceContentSourceContentSourceContentSourceContentSourceContentLink() {
                return null;
            }