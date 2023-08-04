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

    /**
    * Test method for {@link DictionaryInfo#getMessage(String)}.
    */
    @Test
    void testGetMessage() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIXT.1.1");
        MessageInfo messageInfo = new MessageInfo("FIXT.1.1", "Logon", "A", "Logon", "Logon", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "N", "Y", "