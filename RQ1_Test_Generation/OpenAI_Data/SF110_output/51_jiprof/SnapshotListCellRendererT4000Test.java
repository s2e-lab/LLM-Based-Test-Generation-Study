// SnapshotListCellRendererTest.java
// $Id: SnapshotListCellRenderer.java,v 1.1 2008/09/23 04:48:17 jchapman0 Exp $
package com.jchapman.jipsnapman.gui;

import java.text.MessageFormat;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import org.yasl.arch.resources.YASLResourceManager;
import com.jchapman.jipsnapman.models.Snapshot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SnapshotListCellRenderer}.
* It contains ten unit test cases for the {@link SnapshotListCellRenderer#getListCellRendererComponent(JList, Object, int, boolean, boolean)} method.
*/
class SnapshotListCellRendererTest {

	/**
	* Test case for {@link SnapshotListCellRenderer#getListCellRendererComponent(JList, Object, int, boolean, boolean)}
	* with the following parameters:
	* <ul>
	* <li>list = null</li>
	* <li>value = null</li>
	* <li>index = 0</li>
	* <li>isSelected = false</li>
	* <li>cellHasFocus = false</li>
	* </ul>
	*
	* @throws Exception
	* 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							