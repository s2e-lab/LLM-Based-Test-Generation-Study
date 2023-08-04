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
    * Test case for the {@link GenericSortedListModel#getElementAt(int)} method.
    * It tests the case where the requested index is out of bounds.
    */
    @Test
    void testGetElementAtOutOfBounds() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<Integer>() {
            @Override
            public Integer getElementAt(int index) {
                return index;
            }
        };
        assertThrows(IndexOutOfBoundsException.class, () -> model.getElementAt(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> model.getElementAt(10));
    }

    /**
    * Test case for the {@link GenericSortedListModel#getElementAt(int)} method.
    * It tests the case where the requested index is in bounds.
    */
    @Test
    void testGetElementAtInBounds() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<Integer>() {
            @Override
            public Integer getElementAt(int index) {
                return index;
            }
        };
        assertEquals(0, model.getElementAt(0));
        assertEquals(1, model.getElementAt(1));
        assertEquals(2, model.getElementAt(2));
        assertEquals(3, model.getElementAt(3));
        assertEquals(4, model.getElementAt(4));
        assertEquals(5, model.getElementAt(5));
        assertEquals(6, model.getElementAt(6));
        assertEquals(7, model.getElementAt(7));
        assertEquals(8, model.getElementAt(8));
        assertEquals(9, model.getElementAt(9));
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

    private final List<T> list = new ArrayList<T>();

    /**
    * Adds the specified element to the model.
    *
    * @param element the element to add
    */
    public void addElement(T element) {
        list.add(element);
        Collections.sort(list);
        fireContentsChanged(this, 0, list.size() - 1);
    }

    /**
    * Removes the specified element from the model.
    *
    * @param element the element to remove
    */
    public void removeElement(T element) {
        int index = list.indexOf(element);
        if (index != -1) {
            list.remove(index);
            fireContentsChanged(this, index, index);
        }
    }

    /**
    * Returns the value at the specified index.
    *
    * @param index the requested index
    * @return the value at <code>index</code>
    */
    public T getElementAt(int index) {
        return list.get(index);
    }

    /**
    * Returns the number of elements in the model.
    *
    * @return the number of elements in the model
    */
    public int getSize() {
        return list.size();
    }
}

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
* It contains ten unit test cases for the {@link GenericSortedListModel#addElement(Comparable)} method.
*/
class GenericSortedListModelTest {
		
    /**
    * Test case for the {@link GenericSortedListModel#addElement(Comparable)} method.
    * It tests the case where the specified element is <code>null</code>.
    */
    @Test
    void testAddElementNull() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<Integer>();
        assertThrows(NullPointerException.class, () -> model.addElement(null));
    }

    /**
    * Test case for the {@link GenericSortedListModel#addElement(Comparable)} method.
    * It tests the case where the specified element is not <code>null</code>.
    */
    @Test
    void testAddElementNotNull() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<Integer>();
        model.addElement(1);
        model.addElement(2);
        model.addElement(3);
        model.addElement(4);
        model.addElement(5);
        model.addElement(6);
        model.addElement(7);
        model.addElement(8);
        model.addElement(9);
        model.addElement(10);
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

    private final List<T> list = new ArrayList<T>();

    /**
    * Adds the specified element to the model.
    *
    * @param element the element to add
    */
    public void addElement(T element) {
        list.add(element);
        Collections.sort(list);
        fireContentsChanged(this, 0, list.size() - 1);
    }

    /**
    * Removes the specified element from the model.
    *
    * @param element the element to remove
    */
    public void removeElement(T element) {
        int index = list.indexOf(element);
        if (index != -1) {
            list.remove(index);
            fireContentsChanged(this, index, index);
        }
    }

    /**
    * Returns the value at the specified index.
    *
    * @param index the requested index
    * @return the value at <code>index</code>
    */
    public T getElementAt(int index) {
        return list.get(index);
    }

    /**
    * Returns the number of elements in the model.
    *
    * @return the number of elements in the model
    */
    public int getSize() {
        return list.size();
    }
}

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
* It contains ten unit test cases for the {@link GenericSortedListModel#removeElement(Comparable)} method.
*/
class GenericSortedListModelTest {
		
    /**
    * Test case for the {@link GenericSortedListModel#removeElement(Comparable)} method.
    * It tests the case where the specified element is <code>null</code>.
    */
    @Test
    void testRemoveElementNull() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<Integer>();
        assertThrows(NullPointerException.class, () -> model.removeElement(null));
    }

    /**
    * Test case for the {@link GenericSortedListModel#removeElement(Comparable)} method.
    * It tests the case where the specified element is not <code>null</code>.
    */
    @Test
    void testRemoveElementNotNull() {
        GenericSortedListModel<Integer> model = new GenericSortedListModel<Integer>();
        model.addElement(1);
        model.addElement(2);
        model.addElement(3);
        model.addElement(4);
        model.addElement(5);
        model.addElement(6);
        model.addElement(7);
        model.addElement(8);
        model.addElement(9);
        model.addElement(10);
        model.removeElement(1);
        model.removeElement(2);
        model.removeElement(3);
        model.removeElement(4);
        model.removeElement(5);
        model.removeElement(6);
        model.removeElement(7);
        model.removeElement(8);
        model.removeElement(9);
        model.removeElement(10);
        assertEquals(0, model.getSize());
    }
}

// GenericSortedList