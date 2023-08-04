// DictionaryInfo_5Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(String)} method.
*/
class DictionaryInfo_5Test {

    @Test
    void getMessage_1() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_2() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_3() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_4() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_5() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_6() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_7() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_8() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_9() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }

    @Test
    void getMessage_10() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.name = "1";
        dictionaryInfo.messagesByName.put("1", messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage("1"));
    }
}

// DictionaryInfo_5.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_6.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_7.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_8.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_9.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_10.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_11.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_12.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_13.java
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

    public MessageInfo getMessage(String name) {
        if (messagesByName != null)