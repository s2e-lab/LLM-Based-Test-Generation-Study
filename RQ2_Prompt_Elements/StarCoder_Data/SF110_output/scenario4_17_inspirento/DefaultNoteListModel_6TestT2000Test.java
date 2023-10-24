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
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addNoteListDataListener(new NoteListDataListener() {
            @Override
            public void noteListDataChanged(NoteListDataEvent e) {
                System.out.println("NoteListDataEvent: " + e.toString());
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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
            public String getCover() {
                return "cover";
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

           