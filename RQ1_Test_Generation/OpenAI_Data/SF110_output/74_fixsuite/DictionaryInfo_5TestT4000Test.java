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
		 * Test case 1 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 1 is a positive test case.
		 * 
		 * Test case 1 tests the case where the message name is not null.
		 * 
		 * Test case 1 expects the method to return the message with the given name.
		 */
		@Test
		void testGetMessage_1() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Heartbeat");
				
				// Verify
				assertEquals(messageInfo, actual);
		}
		
		/**
		 * Test case 2 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 2 is a negative test case.
		 * 
		 * Test case 2 tests the case where the message name is null.
		 * 
		 * Test case 2 expects the method to return null.
		 */
		@Test
		void testGetMessage_2() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage(null);
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 3 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 3 is a negative test case.
		 * 
		 * Test case 3 tests the case where the message name is empty.
		 * 
		 * Test case 3 expects the method to return null.
		 */
		@Test
		void testGetMessage_3() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 4 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 4 is a negative test case.
		 * 
		 * Test case 4 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 4 expects the method to return null.
		 */
		@Test
		void testGetMessage_4() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("TestRequest");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 5 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 5 is a negative test case.
		 * 
		 * Test case 5 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 5 expects the method to return null.
		 */
		@Test
		void testGetMessage_5() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Heartbeat1");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 6 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 6 is a negative test case.
		 * 
		 * Test case 6 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 6 expects the method to return null.
		 */
		@Test
		void testGetMessage_6() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Heartbeat ");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 7 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 7 is a negative test case.
		 * 
		 * Test case 7 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 7 expects the method to return null.
		 */
		@Test
		void testGetMessage_7() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage(" Heartbeat");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 8 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 8 is a negative test case.
		 * 
		 * Test case 8 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 8 expects the method to return null.
		 */
		@Test
		void testGetMessage_8() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Heartbeat ");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 9 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 9 is a negative test case.
		 * 
		 * Test case 9 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 9 expects the method to return null.
		 */
		@Test
		void testGetMessage_9() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage(" Heartbeat ");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 10 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 10 is a negative test case.
		 * 
		 * Test case 10 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 10 expects the method to return null.
		 */
		@Test
		void testGetMessage_10() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Heartbeat Heartbeat");
				
				// Verify
				assertNull(actual);
		}
}

// MessageInfo.java
/**
 * MessageInfo.java 11:33:45 PM Apr 21, 2008
 *
 * <PRE>
 * Copyright (c) 2008, Jan Amoyo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     - Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     - Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 'AS IS';
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * </PRE>
 */
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX message.
 *
 * @author jramoyo
 */
public class MessageInfo {

    private int id;

    private String name;

    private String msgType;

    private String msgCategory;

    private boolean admin;

    private boolean app;

    private boolean repeatingGroup;

    private List<FieldInfo> header;

    private List<FieldInfo> trailer;

    private List<FieldInfo> body;

    private List<FieldInfo> all;

    private TreeMap<Integer, FieldInfo> fieldsByTagNumber;

    private TreeMap<String, FieldInfo> fieldsByName;

    private TreeMap<Integer, ComponentInfo> componentsById;

    private TreeMap<String, ComponentInfo> componentsByName;

    /**
     * Creates a new MessageInfo
     *
     * @param id - a message id
     * @param name - a message name
     */
    public MessageInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifies the id
     *
     * @param id - the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Modifies the name
     *
     * @param name - the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the msgType
     *
     * @return the msgType
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Modifies the msgType
     *
     * @param msgType - the msgType to set
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * Returns the msgCategory
     *
     * @return the msgCategory
     */
    public String getMsgCategory() {
        return msgCategory;
    }

    /**
     * Modifies the msgCategory
     *
     * @param msgCategory - the msgCategory to set
     */
    public void setMsgCategory(String msgCategory) {
        this.msgCategory = msgCategory;
    }

    /**
     * Returns whether the message is an admin message
     *
     * @return whether the message is an admin message
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Modifies whether the message is an admin message
     *
     * @param admin - whether the message is an admin message
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * Returns whether the message is an app message
     *
     * @return whether the message is an app message
     */
    public boolean isApp() {
        return app;
    }

    /**
     * Modifies whether the message is an app message
     *
     * @param app - whether the message is an app message
     */
    public void setApp(boolean app) {
        this.app = app;
    }

    /**
     * Returns whether the message is a repeating group
     *
     * @return whether the message is a repeating group
     */
    public boolean isRepeatingGroup() {
        return repeatingGroup;
    }

    /**
     * Modifies whether the message is a repeating group
     *
     * @param repeatingGroup - whether the message is a repeating group
     */
    public void setRepeatingGroup(boolean repeatingGroup) {
        this.repeatingGroup = repeatingGroup;
    }

    /**
     * Returns the header
     *
     * @return the header
     */
    public List<FieldInfo> getHeader() {
        return header;
    }

    /**
     * Modifies the header
     *
     * @param header - the header to set
     */
    public void setHeader(List<FieldInfo> header) {
        this.header = header;
    }

    /**
     * Returns the trailer
     *
     * @return the trailer
     */
    public List<FieldInfo> getTrailer() {
        return trailer;
    }

    /**
     * Modifies the trailer
     *
     * @param trailer - the trailer to set
     */
    public void setTrailer(List<FieldInfo> trailer) {
        this.trailer = trailer;
    }

    /**
     * Returns the body
     *
     * @return the body
     */
    public List<FieldInfo> getBody() {
        return body;
    }

    /**
     * Modifies the body
     *
     * @param body - the body to set
     */
    public void setBody(List<FieldInfo> body) {
        this.body = body;
    }

    /**
     * Returns the all
     *
     * @return the