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
     * Test case for {@link DictionaryInfo#getMessage(String)}
     *
     * @throws Exception
     */
    @Test
    void getMessage() throws Exception {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.setMessages(new ArrayList<MessageInfo>());
        dictionaryInfo.setMessagesByName(new TreeMap<String, MessageInfo>());
        dictionaryInfo.setMessagesByMsgType(new TreeMap<String, MessageInfo>());
        dictionaryInfo.setMessagesByMsgSeqNum(new TreeMap<Integer, MessageInfo>());
        dictionaryInfo.setMessagesByMsgTag(new TreeMap<Integer, MessageInfo>());
        dictionaryInfo.setMessagesByMsgName(new TreeMap<String, MessageInfo>());
        dictionaryInfo.setMessagesByMsgNameAndTag(new TreeMap<String, TreeMap<Integer, MessageInfo>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgType(new TreeMap<String, TreeMap<String, MessageInfo>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<Integer, MessageInfo>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgTag(new TreeMap<String, TreeMap<Integer, MessageInfo>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgName(new TreeMap<String, TreeMap<String, MessageInfo>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndTag(new TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgType(new TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgTag(new TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgName(new TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgType(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgName(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgType(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgName(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgType(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgName(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgType(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgName(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgType(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgName(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndTag(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<Integer, MessageInfo>>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgType(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String, MessageInfo>>>>>>>>>());
        dictionaryInfo.setMessagesByMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgNameAndMsgSeqNum(new TreeMap<String, TreeMap<String, TreeMap<String, TreeMap<String