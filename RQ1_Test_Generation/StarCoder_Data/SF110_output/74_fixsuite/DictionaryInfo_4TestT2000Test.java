// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {

    /**
    * Test method for {@link DictionaryInfo#getMessage(int)}.
    */
    @Test
    void testGetMessage() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIXT.1.1");
        MessageInfo messageInfo = new MessageInfo("FIXT.1.1", "Logon", "A", "Logon", 1);
        dictionaryInfo.addMessage(messageInfo);
        assertEquals(messageInfo, dictionaryInfo.getMessage(1));
    }
}
