// IndexingCallableTest.java
package de.huxhorn.lilith.swing.callables;

import de.huxhorn.sulky.codec.filebuffer.DefaultDataStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultFileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultIndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.FileHeader;
import de.huxhorn.sulky.codec.filebuffer.FileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.IndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.SparseDataStrategy;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexingCallable}.
* It contains ten unit test cases for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {

		private final Logger logger = LoggerFactory.getLogger(IndexingCallableTest.class);
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' does not exist.
		* Expected result: FileNotFoundException.
		*/
		@Test
		public void testCall_1() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertThrows(FileNotFoundException.class, () -&gt; {
						indexingCallable.call();
				});
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is not a file.
		* Expected result: FileNotFoundException.
		*/
		@Test
		public void testCall_2() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertThrows(FileNotFoundException.class, () -&gt; {
						indexingCallable.call();
				});
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_3() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_4() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_5() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_6() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_7() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_8() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_9() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_10() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
}

// IndexingTask.java
/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 Joern Huxhorn
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.swing.taskmanager;

import de.huxhorn.lilith.swing.LilithActionId;
import de.huxhorn.lilith.swing.LilithKeyStrokes;
import de.huxhorn.lilith.swing.ViewContainer;
import de.huxhorn.lilith.swing.actions.BasicFilterAction;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.FilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.LoggingFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.MessageFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.SourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ThreadFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ThrowableFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.TimeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.TypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.VersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewContainerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewVersionFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewerFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewerSourceFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewerTypeFilterType;
import de.huxhorn.lilith.swing.actions.BasicFilterAction.ViewerViewerViewerViewerViewerViewerViewerVersionFilterType;
import de.huxhorn.lilith.swing.actions.Basic