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
		* Test case 1:
		* The element is not in the list.
		*/
		@Test
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addNoteListDataListener(new NoteListDataListener() {
						public void contentChanged(NoteListDataEvent e) {
						}
						public void itemAdded(NoteListDataEvent e) {
						}
						public void itemRemoved(NoteListDataEvent e) {
						}
				});
				AbstractNote note1 = new AbstractNote() {
						public String getTitle() {
								return "note1";
						}
						public String getContent() {
								return "content1";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note2 = new AbstractNote() {
						public String getTitle() {
								return "note2";
						}
						public String getContent() {
								return "content2";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note3 = new AbstractNote() {
						public String getTitle() {
								return "note3";
						}
						public String getContent() {
								return "content3";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note4 = new AbstractNote() {
						public String getTitle() {
								return "note4";
						}
						public String getContent() {
								return "content4";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note5 = new AbstractNote() {
						public String getTitle() {
								return "note5";
						}
						public String getContent() {
								return "content5";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note6 = new AbstractNote() {
						public String getTitle() {
								return "note6";
						}
						public String getContent() {
								return "content6";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note7 = new AbstractNote() {
						public String getTitle() {
								return "note7";
						}
						public String getContent() {
								return "content7";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note8 = new AbstractNote() {
						public String getTitle() {
								return "note8";
						}
						public String getContent() {
								return "content8";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note9 = new AbstractNote() {
						public String getTitle() {
								return "note9";
						}
						public String getContent() {
								return "content9";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note10 = new AbstractNote() {
						public String getTitle() {
								return "note10";
						}
						public String getContent() {
								return "content10";
						}
						public Date getDate() {
								return new Date();
						}
				};
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				model.addElement(note8);
				model.addElement(note9);
				model.addElement(note10);
				AbstractNote note11 = new AbstractNote() {
						public String getTitle() {
								return "note11";
						}
						public String getContent() {
								return "content11";
						}
						public Date getDate() {
								return new Date();
						}
				};
				assertEquals(-1, model.lastIndexOf(note11));
		}
		
		/**
		* Test case 2:
		* The element is in the list.
		*/
		@Test
		void testCase2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addNoteListDataListener(new NoteListDataListener() {
						public void contentChanged(NoteListDataEvent e) {
						}
						public void itemAdded(NoteListDataEvent e) {
						}
						public void itemRemoved(NoteListDataEvent e) {
						}
				});
				AbstractNote note1 = new AbstractNote() {
						public String getTitle() {
								return "note1";
						}
						public String getContent() {
								return "content1";
						}
						public Date getDate() {
								return new Date();
						}
				};
				AbstractNote note2 = new Abstract