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
        model.setData(new ArrayList<Integer>());
        assertEquals(0, model.getSize());
        assertEquals(null, model.getElementAt(0));
        assertEquals(null, model.getElementAt(1));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        assertEquals(1, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(null, model.getElementAt(1));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        assertEquals(2, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(null, model.getElementAt(2));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        assertEquals(3, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(null, model.getElementAt(3));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);
        assertEquals(4, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(4, model.getElementAt(3));
        assertEquals(null, model.getElementAt(4));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);
        model.add(5);
        assertEquals(5, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(4, model.getElementAt(3));
        assertEquals(5, model.getElementAt(4));
        assertEquals(null, model.getElementAt(5));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);
        model.add(5);
        model.add(6);
        assertEquals(6, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(4, model.getElementAt(3));
        assertEquals(5, model.getElementAt(4));
        assertEquals(6, model.getElementAt(5));
        assertEquals(null, model.getElementAt(6));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);
        model.add(5);
        model.add(6);
        model.add(7);
        assertEquals(7, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(4, model.getElementAt(3));
        assertEquals(5, model.getElementAt(4));
        assertEquals(6, model.getElementAt(5));
        assertEquals(7, model.getElementAt(6));
        assertEquals(null, model.getElementAt(7));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);
        model.add(5);
        model.add(6);
        model.add(7);
        model.add(8);
        assertEquals(8, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(4, model.getElementAt(3));
        assertEquals(5, model.getElementAt(4));
        assertEquals(6, model.getElementAt(5));
        assertEquals(7, model.getElementAt(6));
        assertEquals(8, model.getElementAt(7));
        assertEquals(null, model.getElementAt(8));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);
        model.add(5);
        model.add(6);
        model.add(7);
        model.add(8);
        model.add(9);
        assertEquals(9, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(4, model.getElementAt(3));
        assertEquals(5, model.getElementAt(4));
        assertEquals(6, model.getElementAt(5));
        assertEquals(7, model.getElementAt(6));
        assertEquals(8, model.getElementAt(7));
        assertEquals(9, model.getElementAt(8));
        assertEquals(null, model.getElementAt(9));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(10));

        model.setData(new ArrayList<Integer>());
        model.add(1);
        model.add(2);
        model.add(3);
        model.add(4);
        model.add(5);
        model.add(6);
        model.add(7);
        model.add(8);
        model.add(9);
        model.add(10);
        assertEquals(10, model.getSize());
        assertEquals(1, model.getElementAt(0));
        assertEquals(2, model.getElementAt(1));
        assertEquals(3, model.getElementAt(2));
        assertEquals(4, model.getElementAt(3));
        assertEquals(5, model.getElementAt(4));
        assertEquals(6, model.getElementAt(5));
        assertEquals(7, model.getElementAt(6));
        assertEquals(8, model.getElementAt(7));
        assertEquals(9, model.getElementAt(8));
        assertEquals(10, model.getElementAt(9));
        assertEquals(null, model.getElementAt(10));
        assertEquals(null, model.getElementAt(-1));
        assertEquals(null, model.getElementAt(100));
    }
}

// GenericSortedListModel.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;

public class GenericSortedListModel<T extends Comparable> extends AbstractListModel {

    private final List<T> data;

    private final Comparator<T> comparator;

    public GenericSortedListModel() {
        this(null);
    }

    public GenericSortedListModel(Comparator<T> comparator) {
        this.data = new ArrayList<T>();
        this.comparator = comparator;
    }

    public void setData(List<T> data) {
        this.data.clear();
        this.data.addAll(data);
        Collections.sort(this.data, this.comparator);
        fireContentsChanged(this, 0, this.data.size());
    }

    public List<T> getData() {
        return this.data;
    }

    public void add(T element) {
        this.data.add(element);
        Collections.sort(this.data, this.comparator);
        fireContentsChanged(this, 0, this.data.size());