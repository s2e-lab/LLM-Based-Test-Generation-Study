// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {

		private DictionaryInfo dictionaryInfo;
		
		private FieldInfo fieldInfo;
		
		private TreeMap<String, FieldInfo> fieldsByName;
		
		private String name;
		
		private FieldInfo result;
		
		private List<FieldInfo> fields;
		
		private TreeMap<Integer, FieldInfo> fieldsByTagNumber;
		
		private int tagNumber;
		
		private TreeMap<String, ComponentInfo> componentsByName;
		
		private TreeMap<Integer, ComponentInfo> componentsById;
		
		private TreeMap<String, MessageInfo> messagesByName;
		
		private TreeMap<Integer, MessageInfo> messagesById;
		
		private String version;
		
		private int loadCount;
		
		private boolean result2;
		
		private ComponentInfo componentInfo;
		
		private List<ComponentInfo> components;
		
		private MessageInfo messageInfo;
		
		private List<MessageInfo> messages;
		
		private FieldInfo fieldInfo2;
		
		private GroupInfo groupInfo;
		
		private FieldInfo fieldInfo3;
		
		private FieldInfo fieldInfo4;
		
		private FieldInfo fieldInfo5;
		
		private FieldInfo fieldInfo6;
		
		private FieldInfo fieldInfo7;
		
		private FieldInfo fieldInfo8;
		
		private FieldInfo fieldInfo9;
		
		private FieldInfo fieldInfo10;
		
		private FieldInfo fieldInfo11;
		
		private FieldInfo fieldInfo12;
		
		private FieldInfo fieldInfo13;
		
		private FieldInfo fieldInfo14;
		
		private FieldInfo fieldInfo15;
		
		private FieldInfo fieldInfo16;
		
		private FieldInfo fieldInfo17;
		
		private FieldInfo fieldInfo18;
		
		private FieldInfo fieldInfo19;
		
		private FieldInfo fieldInfo20;
		
		private FieldInfo fieldInfo21;
		
		private FieldInfo fieldInfo22;
		
		private FieldInfo fieldInfo23;
		
		private FieldInfo fieldInfo24;
		
		private FieldInfo fieldInfo25;
		
		private FieldInfo fieldInfo26;
		
		private FieldInfo fieldInfo27;
		
		private FieldInfo fieldInfo28;
		
		private FieldInfo fieldInfo29;
		
		private FieldInfo fieldInfo30;
		
		private FieldInfo fieldInfo31;
		
		private FieldInfo fieldInfo32;
		
		private FieldInfo fieldInfo33;
		
		private FieldInfo fieldInfo34;
		
		private FieldInfo fieldInfo35;
		
		private FieldInfo fieldInfo36;
		
		private FieldInfo fieldInfo37;
		
		private FieldInfo fieldInfo38;
		
		private FieldInfo fieldInfo39;
		
		private FieldInfo fieldInfo40;
		
		private FieldInfo fieldInfo41;
		
		private FieldInfo fieldInfo42;
		
		private FieldInfo fieldInfo43;
		
		private FieldInfo fieldInfo44;
		
		private FieldInfo fieldInfo45;
		
		private FieldInfo fieldInfo46;
		
		private FieldInfo fieldInfo47;
		
		private FieldInfo fieldInfo48;
		
		private FieldInfo fieldInfo49;
		
		private FieldInfo fieldInfo50;
		
		private FieldInfo fieldInfo51;
		
		private FieldInfo fieldInfo52;
		
		private FieldInfo fieldInfo53;
		
		private FieldInfo fieldInfo54;
		
		private FieldInfo fieldInfo55;
		
		private FieldInfo fieldInfo56;
		
		private FieldInfo fieldInfo57;
		
		private FieldInfo fieldInfo58;
		
		private FieldInfo fieldInfo59;
		
		private FieldInfo fieldInfo60;
		
		private FieldInfo fieldInfo61;
		
		private FieldInfo fieldInfo62;
		
		private FieldInfo fieldInfo63;
		
		private FieldInfo fieldInfo64;
		
		private FieldInfo fieldInfo65;
		
		private FieldInfo fieldInfo66;
		
		private FieldInfo fieldInfo67;
		
		private FieldInfo fieldInfo68;
		
		private FieldInfo fieldInfo69;
		
		private FieldInfo fieldInfo70;
		
		private FieldInfo fieldInfo71;
		
		private FieldInfo fieldInfo72;
		
		private FieldInfo fieldInfo73;
		
		private FieldInfo fieldInfo74;
		
		private FieldInfo fieldInfo75;
		
		private FieldInfo fieldInfo76;
		
		private FieldInfo fieldInfo77;
		
		private FieldInfo fieldInfo78;
		
		private FieldInfo fieldInfo79;
		
		private FieldInfo fieldInfo80;
		
		private FieldInfo fieldInfo81;
		
		private FieldInfo fieldInfo82;
		
		private FieldInfo fieldInfo83;
		
		private FieldInfo fieldInfo84;
		
		private FieldInfo fieldInfo85;
		
		private FieldInfo fieldInfo86;
		
		private FieldInfo fieldInfo87;
		
		private FieldInfo fieldInfo88;
		
		private FieldInfo fieldInfo89;
		
		private FieldInfo fieldInfo90;
		
		private FieldInfo fieldInfo91;
		
		private FieldInfo fieldInfo92;
		
		private FieldInfo fieldInfo93;
		
		private FieldInfo fieldInfo94;
		
		private FieldInfo fieldInfo95;
		
		private FieldInfo fieldInfo96;
		
		private FieldInfo fieldInfo97;
		
		private FieldInfo fieldInfo98;
		
		private FieldInfo fieldInfo99;
		
		private FieldInfo fieldInfo100;
		
		private FieldInfo fieldInfo101;
		
		private FieldInfo fieldInfo102;
		
		private FieldInfo fieldInfo103;
		
		private FieldInfo fieldInfo104;
		
		private FieldInfo fieldInfo105;
		
		private FieldInfo fieldInfo106;
		
		private FieldInfo fieldInfo107;
		
		private FieldInfo fieldInfo108;
		
		private FieldInfo fieldInfo109;
		
		private FieldInfo fieldInfo110;
		
		private FieldInfo fieldInfo111;
		
		private FieldInfo fieldInfo112;
		
		private FieldInfo fieldInfo113;
		
		private FieldInfo fieldInfo114;
		
		private FieldInfo fieldInfo115;
		
		private FieldInfo fieldInfo116;
		
		private FieldInfo fieldInfo117;
		
		private FieldInfo fieldInfo118;
		
		private FieldInfo fieldInfo119;
		
		private FieldInfo fieldInfo120;
		
		private FieldInfo fieldInfo121;
		
		private FieldInfo fieldInfo122;
		
		private FieldInfo fieldInfo123;
		
		private FieldInfo fieldInfo124;
		
		private FieldInfo fieldInfo125;
		
		private FieldInfo fieldInfo126;
		
		private FieldInfo fieldInfo127;
		
		private FieldInfo fieldInfo128;
		
		private FieldInfo fieldInfo129;
		
		private FieldInfo fieldInfo130;
		
		private FieldInfo fieldInfo131;
		
		private FieldInfo fieldInfo132;
		
		private FieldInfo fieldInfo133;
		
		private Field