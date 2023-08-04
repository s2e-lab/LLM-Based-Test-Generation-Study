// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {

    @Test
    void getComponent_1() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_2() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_3() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_4() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_5() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_6() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_7() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_8() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_9() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }

    @Test
    void getComponent_10() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
        ComponentInfo componentInfo = new ComponentInfo();
        componentInfo.setId(1);
        dictionaryInfo.componentsById.put(1, componentInfo);
        assertEquals(componentInfo, dictionaryInfo.getComponent(1));
    }
}

// DictionaryInfo_1.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class DictionaryInfo {

    public ComponentInfo getComponent(int id) {
        if (componentsById != null) {
            return componentsById.get(id);
        }
        return null;
    }
}

// ComponentInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_1.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_2.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_3.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_4.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_5.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_6.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_7.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class ComponentInfo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}

// ComponentInfo_8.java
package org.fixsuite