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
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {

    /**
    * Test method for {@link DefaultNoteListModel#remove(int)}.
    */
    @Test
    void testRemove() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote() {
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
            public String getSourceLink() {
                return "sourceLink";
            }

            @Override
            public String getSourceDate() {
                return "sourceDate";
            }

            @Override
            public String getSourceCover() {
                return "sourceCover";
            }

            @Override
            public String getSourceAuthor() {
                return "sourceAuthor";
            }

            @Override
            public String getSourceAbstract() {
                return "sourceAbstract";
            }

            @Override
            public String getSourceTitle() {
                return "sourceTitle";
            }

            @Override
            public String getSourceLinkTitle() {
                return "sourceLinkTitle";
            }

            @Override
            public String getSourceLinkAbstract() {
                return "sourceLinkAbstract";
            }

            @Override
            public String getSourceLinkCover() {
                return "sourceLinkCover";
            }

            @Override
            public String getSourceLinkAuthor() {
                return "sourceLinkAuthor";
            }

            @Override
            public String getSourceLinkDate() {
                return "sourceLinkDate";
            }

            @Override
            public String getSourceLinkSource() {
                return "sourceLinkSource";
            }

            @Override
            public String getSourceLinkSourceLink() {
                return "sourceLinkSourceLink";
            }

            @Override
            public String getSourceLinkSourceDate() {
                return "sourceLinkSourceDate";
            }

            @Override
            public String getSourceLinkSourceCover() {
                return "sourceLinkSourceCover";
            }

            @Override
            public String getSourceLinkSourceAuthor() {
                return "sourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceAbstract() {
                return "sourceLinkSourceAbstract";
            }

            @Override
            public String getSourceLinkSourceTitle() {
                return "sourceLinkSourceTitle";
            }

            @Override
            public String getSourceLinkSourceLinkTitle() {
                return "sourceLinkSourceLinkTitle";
            }

            @Override
            public String getSourceLinkSourceLinkAbstract() {
                return "sourceLinkSourceLinkAbstract";
            }

            @Override
            public String getSourceLinkSourceLinkCover() {
                return "sourceLinkSourceLinkCover";
            }

            @Override
            public String getSourceLinkSourceLinkAuthor() {
                return "sourceLinkSourceLinkAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkDate() {
                return "sourceLinkSourceLinkDate";
            }

            @Override
            public String getSourceLinkSourceLinkSource() {
                return "sourceLinkSourceLinkSource";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLink() {
                return "sourceLinkSourceLinkSourceLink";
            }

            @Override
            public String getSourceLinkSourceLinkSourceDate() {
                return "sourceLinkSourceLinkSourceDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceCover() {
                return "sourceLinkSourceLinkSourceCover";
            }

            @Override
            public String getSourceLinkSourceLinkSourceAuthor() {
                return "sourceLinkSourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceAbstract() {
                return "sourceLinkSourceLinkSourceAbstract";
            }

            @Override
            public String getSourceLinkSourceLinkSourceTitle() {
                return "sourceLinkSourceLinkSourceTitle";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkTitle() {
                return "sourceLinkSourceLinkSourceLinkTitle";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkAbstract() {
                return "sourceLinkSourceLinkSourceLinkAbstract";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkCover() {
                return "sourceLinkSourceLinkSourceLinkCover";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkAuthor() {
                return "sourceLinkSourceLinkSourceLinkAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkDate() {
                return "sourceLinkSourceLinkSourceLinkDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSource() {
                return "sourceLinkSourceLinkSourceLinkSource";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLink() {
                return "sourceLinkSourceLinkSourceLinkSourceLink";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceDate() {
                return "sourceLinkSourceLinkSourceLinkSourceDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceCover() {
                return "sourceLinkSourceLinkSourceLinkSourceCover";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceAbstract() {
                return "sourceLinkSourceLinkSourceLinkSourceAbstract";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceTitle() {
                return "sourceLinkSourceLinkSourceLinkSourceTitle";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkTitle() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkTitle";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkAbstract() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkAbstract";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkCover() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkCover";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkDate() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSource() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSource";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLink() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLink";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceDate() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceCover() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceCover";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceAbstract() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceAbstract";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceTitle() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceTitle";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkTitle() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkTitle";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkAbstract() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkAbstract";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkCover() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkCover";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkDate() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSource() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSource";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSourceLink() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSourceLink";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSourceDate() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSourceDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSourceCover() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSourceCover";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSourceAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceLinkSource