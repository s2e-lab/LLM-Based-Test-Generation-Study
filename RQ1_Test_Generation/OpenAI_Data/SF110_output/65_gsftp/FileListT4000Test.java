// FileListTest.java
/**
 * Subclass of java.awt.List which allows the List to be treated as though
 * it directly help FileListItems instead of Strings.  Handles the setting
 * and getting of the List's contents as FileListItems.
 */
package com.isnetworks.ssh;

import java.awt.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileList}.
* It contains ten unit test cases for the {@link FileList#getFileListItem(String)} method.
*/
class FileListTest {

		/**
		* Test case 1 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is null.
		*/
		@Test
		void testGetFileListItem1() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNull(fileList.getFileListItem(null));
		}
		
		/**
		* Test case 2 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is empty.
		*/
		@Test
		void testGetFileListItem2() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNull(fileList.getFileListItem(""));
		}
		
		/**
		* Test case 3 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is not in the list.
		*/
		@Test
		void testGetFileListItem3() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNull(fileList.getFileListItem("test4"));
		}
		
		/**
		* Test case 4 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is in the list.
		*/
		@Test
		void testGetFileListItem4() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNotNull(fileList.getFileListItem("test1"));
		}
		
		/**
		* Test case 5 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is in the list.
		*/
		@Test
		void testGetFileListItem5() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNotNull(fileList.getFileListItem("test2"));
		}
		
		/**
		* Test case 6 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is in the list.
		*/
		@Test
		void testGetFileListItem6() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNotNull(fileList.getFileListItem("test3"));
		}
		
		/**
		* Test case 7 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is in the list.
		*/
		@Test
		void testGetFileListItem7() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNotNull(fileList.getFileListItem("test1"));
		}
		
		/**
		* Test case 8 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is in the list.
		*/
		@Test
		void testGetFileListItem8() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNotNull(fileList.getFileListItem("test2"));
		}
		
		/**
		* Test case 9 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is in the list.
		*/
		@Test
		void testGetFileListItem9() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNotNull(fileList.getFileListItem("test3"));
		}
		
		/**
		* Test case 10 for {@link FileList#getFileListItem(String)} method.
		* It tests the case when the given String is in the list.
		*/
		@Test
		void testGetFileListItem10() {
				FileList fileList = new FileList();
				Vector<FileListItem> listItems = new Vector<FileListItem>();
				listItems.add(new FileListItem("test1", false, 0, 0));
				listItems.add(new FileListItem("test2", false, 0, 0));
				listItems.add(new FileListItem("test3", false, 0, 0));
				fileList.setListItems(listItems);
				assertNotNull(fileList.getFileListItem("test1"));
		}
}