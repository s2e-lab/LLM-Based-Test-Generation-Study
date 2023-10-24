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
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
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
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getCoverAlt() {
                return "coverAlt";
            }

            @Override
            public String getCoverTitle() {
                return "coverTitle";
            }

            @Override
            public String getCoverLink() {
                return "coverLink";
            }

            @Override
            public String getCoverTarget() {
                return "coverTarget";
            }

            @Override
            public String getCoverRel() {
                return "coverRel";
            }

            @Override
            public String getCoverType() {
                return "coverType";
            }

            @Override
            public String getCoverData() {
                return "coverData";
            }

            @Override
            public String getCoverWidth() {
                return "coverWidth";
            }

            @Override
            public String getCoverHeight() {
                return "coverHeight";
            }

            @Override
            public String getCoverDataUri() {
                return "coverDataUri";
            }

            @Override
            public String getCoverDataBase64() {
                return "coverDataBase64";
            }

            @Override
            public String getCoverDataUriBase64() {
                return "coverDataUriBase64";
            }

            @Override
            public String getCoverDataBase64Uri() {
                return "coverDataBase64Uri";
            }

            @Override
            public String getCoverDataUriBase64Uri() {
                return "coverDataUriBase64Uri";
            }

            @Override
            public String getCoverDataUriBase64UriRel() {
                return "coverDataUriBase64UriRel";
            }

            @Override
            public String getCoverDataUriBase64UriTarget() {
                return "coverDataUriBase64UriTarget";
            }

            @Override
            public String getCoverDataUriBase64UriRelTarget() {
                return "coverDataUriBase64UriRelTarget";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetType() {
                return "coverDataUriBase64UriRelTargetType";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeData() {
                return "coverDataUriBase64UriRelTargetTypeData";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUri() {
                return "coverDataUriBase64UriRelTargetTypeDataUri";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataBase64() {
                return "coverDataUriBase64UriRelTargetTypeDataBase64";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataBase64Uri() {
                return "coverDataUriBase64UriRelTargetTypeDataBase64Uri";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64Uri() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64Uri";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRel() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRel";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriTarget() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriTarget";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTarget() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTarget";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetType() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetType";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeData() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeData";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUri() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUri";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataBase64() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataBase64";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataBase64Uri() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataBase64Uri";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64Uri() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64Uri";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRel() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRel";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriTarget() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriTarget";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTarget() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTarget";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetType() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetType";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeData() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeData";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUri() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUri";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataBase64() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataBase64";
            }

            @Override
            public String getCoverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64() {
                return "coverDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64UriRelTargetTypeDataUriBase64";
            }

            @Override
            public String getCoverDataUriBase64