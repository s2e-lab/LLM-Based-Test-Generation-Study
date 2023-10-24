// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {

    /**
    * Test method for {@link DefaultNoteListModel#firstElement()}.
    */
    @Test
    void testFirstElement() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        instance.addElement(new AbstractNote() {
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
            public String getTags() {
                return "tags";
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
            public String getSourceAuthor() {
                return "sourceAuthor";
            }

            @Override
            public String getSourceCover() {
                return "sourceCover";
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
            public String getSourceTags() {
                return "sourceTags";
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
            public String getSourceLinkDate() {
                return "sourceLinkDate";
            }

            @Override
            public String getSourceLinkAuthor() {
                return "sourceLinkAuthor";
            }

            @Override
            public String getSourceLinkTags() {
                return "sourceLinkTags";
            }

            @Override
            public String getSourceLinkLink() {
                return "sourceLinkLink";
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
            public String getSourceLinkSourceAuthor() {
                return "sourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceCover() {
                return "sourceLinkSourceCover";
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
            public String getSourceLinkSourceTags() {
                return "sourceLinkSourceTags";
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
            public String getSourceLinkSourceLinkDate() {
                return "sourceLinkSourceLinkDate";
            }

            @Override
            public String getSourceLinkSourceLinkAuthor() {
                return "sourceLinkSourceLinkAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkTags() {
                return "sourceLinkSourceLinkTags";
            }

            @Override
            public String getSourceLinkSourceLinkLink() {
                return "sourceLinkSourceLinkLink";
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
            public String getSourceLinkSourceLinkSourceAuthor() {
                return "sourceLinkSourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceCover() {
                return "sourceLinkSourceLinkSourceCover";
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
            public String getSourceLinkSourceLinkSourceTags() {
                return "sourceLinkSourceLinkSourceTags";
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
            public String getSourceLinkSourceLinkSourceLinkDate() {
                return "sourceLinkSourceLinkSourceLinkDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkAuthor() {
                return "sourceLinkSourceLinkSourceLinkAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkTags() {
                return "sourceLinkSourceLinkSourceLinkTags";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkLink() {
                return "sourceLinkSourceLinkSourceLinkLink";
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
            public String getSourceLinkSourceLinkSourceLinkSourceAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceCover() {
                return "sourceLinkSourceLinkSourceLinkSourceCover";
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
            public String getSourceLinkSourceLinkSourceLinkSourceTags() {
                return "sourceLinkSourceLinkSourceLinkSourceTags";
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
            public String getSourceLinkSourceLinkSourceLinkSourceLinkDate() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkDate";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkTags() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkTags";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkLink() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkLink";
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
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceAuthor() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceAuthor";
            }

            @Override
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceCover() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceCover";
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
            public String getSourceLinkSourceLinkSourceLinkSourceLinkSourceTags() {
                return "sourceLinkSourceLinkSourceLinkSourceLinkSourceTags";
            }

            @Override
            public String