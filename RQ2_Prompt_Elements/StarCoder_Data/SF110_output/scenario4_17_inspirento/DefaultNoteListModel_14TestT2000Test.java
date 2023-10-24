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
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                fail("Should not be called.");
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
            public String getThumbnail() {
                return "thumbnail";
            }
        });
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
                return "