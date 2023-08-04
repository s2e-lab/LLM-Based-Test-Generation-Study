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
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getContent() {
                return "content";
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
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getPermalink() {
                return "permalink";
            }

            @Override
            public String getCustom(String key) {
                return "custom";
            }
        });
        model.addElement(new AbstractNote