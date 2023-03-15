// SnapshotListModelTest.java
// $Id: SnapshotListModel.java,v 1.1 2008/09/23 04:48:18 jchapman0 Exp $
package com.jchapman.jipsnapman.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.AbstractListModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SnapshotListModel}.
* It contains ten unit test cases for the {@link SnapshotListModel#getElementAt(int)} method.
*/
class SnapshotListModelTest {

	/**
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link SnapshotListModel#getSize()} method.
	* Test case for {@link SnapshotListModel#addSnapshot(Snapshot)} method.
	* Test case for {@link SnapshotListModel#getElementAt(int)} method.
	* Test case for {@link Snap