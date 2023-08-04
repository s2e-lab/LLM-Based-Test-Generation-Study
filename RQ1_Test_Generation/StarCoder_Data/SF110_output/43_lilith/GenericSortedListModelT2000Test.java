// GenericSortedListModelTest.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenericSortedListModel}.
* It contains ten unit test cases for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {

    /**
    * Test method for {@link GenericSortedListModel#getElementAt(int)}.
    */
    @Test
    void testGetElementAt() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<Integer>();
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            data.add(i);
        }
        model.setData(data);
        for (int i = 0; i < 10; i++) {
            assertEquals(i, model.getElementAt(i).intValue());
        }
    }
}
