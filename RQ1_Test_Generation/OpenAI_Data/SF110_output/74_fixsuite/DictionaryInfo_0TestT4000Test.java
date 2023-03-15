// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {

		private DictionaryInfo dictionaryInfo;
		
		private FieldInfo fieldInfo;
		
		private TreeMap<Integer, FieldInfo> fieldsByTagNumber;
		
		private TreeMap<String, FieldInfo> fieldsByName;
		
		private List<FieldInfo> fields;
		
		private int tagNumber;
		
		private String name;
		
		private String type;
		
		private String description;
		
		private String value;
		
		private String enumType;
		
		private String fixVersion;
		
		private String category;
		
		private String group;
		
		private String component;
		
		private String usage;
		
		private String added;
		
		private String deprecated;
		
		private String updated;
		
		private String addedEP;
		
		private String deprecatedEP;
		
		private String updatedEP;
		
		private String addedFIX;
		
		private String deprecatedFIX;
		
		private String updatedFIX;
		
		private String addedFIXT;
		
		private String deprecatedFIXT;
		
		private String updatedFIXT;
		
		private String addedFIX50;
		
		private String deprecatedFIX50;
		
		private String updatedFIX50;
		
		private String addedFIX50SP1;
		
		private String deprecatedFIX50SP1;
		
		private String updatedFIX50SP1;
		
		private String addedFIX50SP2;
		
		private String deprecatedFIX50SP2;
		
		private String updatedFIX50SP2;
		
		private String addedFIXT11;
		
		private String deprecatedFIXT11;
		
		private String updatedFIXT11;
		
		private String addedFIXT12;
		
		private String deprecatedFIXT12;
		
		private String updatedFIXT12;
		
		private String addedFIXT13;
		
		private String deprecatedFIXT13;
		
		private String updatedFIXT13;
		
		private String addedFIXT14;
		
		private String deprecatedFIXT14;
		
		private String updatedFIXT14;
		
		private String addedFIXT15;
		
		private String deprecatedFIXT15;
		
		private String updatedFIXT15;
		
		private String addedFIXT16;
		
		private String deprecatedFIXT16;
		
		private String updatedFIXT16;
		
		private String addedFIXT17;
		
		private String deprecatedFIXT17;
		
		private String updatedFIXT17;
		
		private String addedFIXT18;
		
		private String deprecatedFIXT18;
		
		private String updatedFIXT18;
		
		private String addedFIXT19;
		
		private String deprecatedFIXT19;
		
		private String updatedFIXT19;
		
		private String addedFIXT20;
		
		private String deprecatedFIXT20;
		
		private String updatedFIXT20;
		
		private String addedFIXT21;
		
		private String deprecatedFIXT21;
		
		private String updatedFIXT21;
		
		private String addedFIXT22;
		
		private String deprecatedFIXT22;
		
		private String updatedFIXT22;
		
		private String addedFIXT23;
		
		private String deprecatedFIXT23;
		
		private String updatedFIXT23;
		
		private String addedFIXT24;
		
		private String deprecatedFIXT24;
		
		private String updatedFIXT24;
		
		private String addedFIXT25;
		
		private String deprecatedFIXT25;
		
		private String updatedFIXT25;
		
		private String addedFIXT26;
		
		private String deprecatedFIXT26;
		
		private String updatedFIXT26;
		
		private String addedFIXT27;
		
		private String deprecatedFIXT27;
		
		private String updatedFIXT27;
		
		private String addedFIXT28;
		
		private String deprecatedFIXT28;
		
		private String updatedFIXT28;
		
		private String addedFIXT29;
		
		private String deprecatedFIXT29;
		
		private String updatedFIXT29;
		
		private String addedFIXT30;
		
		private String deprecatedFIXT30;
		
		private String updatedFIXT30;
		
		private String addedFIXT31;
		
		private String deprecatedFIXT31;
		
		private String updatedFIXT31;
		
		private String addedFIXT32;
		
		private String deprecatedFIXT32;
		
		private String updatedFIXT32;
		
		private String addedFIXT33;
		
		private String deprecatedFIXT33;
		
		private String updatedFIXT33;
		
		private String addedFIXT34;
		
		private String deprecatedFIXT34;
		
		private String updatedFIXT34;
		
		private String addedFIXT35;
		
		private String deprecatedFIXT35;
		
		private String updatedFIXT35;
		
		private String addedFIXT36;
		
		private String deprecatedFIXT36;
		
		private String updatedFIXT36;
		
		private String addedFIXT37;
		
		private String deprecatedFIXT37;
		
		private String updatedFIXT37;
		
		private String addedFIXT38;
		
		private String deprecatedFIXT38;
		
		private String updatedFIXT38;
		
		private String addedFIXT39;
		
		private String deprecatedFIXT39;
		
		private String updatedFIXT39;
		
		private String addedFIXT40;
		
		private String deprecatedFIXT40;
		
		private String updatedFIXT40;
		
		private String addedFIXT41;
		
		private String deprecatedFIXT41;
		
		private String updatedFIXT41;
		
		private String addedFIXT42;
		
		private String deprecatedFIXT42;
		
		private String updatedFIXT42;
		
		private String addedFIXT43;
		
		private String deprecatedFIXT43;
		
		private String updatedFIXT43;
		
		private String addedFIXT44;
		
		private String deprecatedFIXT44;
		
		private String updatedFIXT44;
		
		private String addedFIXT45;
		
		private String deprecatedFIXT45;
		
		private String updatedFIXT45;
		
		private String addedFIXT46;
		
		private String deprecatedFIXT46;
		
		private String updatedFIXT46;
		
		private String addedFIXT47;
		
		private String deprecatedFIXT47;
		
		private String updatedFIXT47;
		
		private String addedFIXT48;
		
		private String deprecatedFIXT48;
		
		private String updatedFIXT48;
		
		private String addedFIXT49;
		
		private String deprecatedFIXT49;
		
		private String updatedFIXT49;
		
		private String addedFIXT50;
		
		private String deprecatedFIXT50;
		
		private String updatedFIXT50;
		
		private String addedFIXT51;
		
		private String deprecatedFIXT51;
		
		private String updatedFIXT51;
		
		private String addedFIXT52;
		
		private String deprecatedFIXT52;
		
		private String updatedFIXT52;
		
		private String addedFIXT53;
		
		private String deprecatedFIXT53;
		
		private String updatedFIXT53;
		
		private String addedFIXT54;
		
		private String deprecatedFIXT54;
		
		private String updatedFIXT54;
		
		private String addedFIXT55;
		
		private String deprecatedFIXT55;
		
		private String updatedFIXT55;
		
		private String addedFIXT56;
		
		private String deprecatedFIXT56;
		
		private String updatedFIXT56;
		
		private String addedFIXT57;
		
		private String deprecatedFIXT57;
		
		private String updatedFIXT57;
		
		private String addedFIXT58;
		
		private String deprecatedFIXT58;
		
		private String updatedFIXT58;
		
		private String addedFIXT59;
		
		private String deprecatedFIXT59;
		
		private String updatedFIXT59;
		
		private String addedFIXT60;
		
		private String deprecatedFIXT60;
		
		private String updatedFIXT60;
		
		private String addedFIXT61;
		
		private String deprecatedFIXT61;
		
		private String updatedFIXT61;
		
		private String addedFIXT62;
		
		private String deprecatedFIXT62;
		
		private String updatedFIXT62;
		
		private String addedFIXT63;
		
		private String deprecatedFIXT63;
		
		private String updatedFIXT63;
		
		private String addedFIXT64;
		
		private String deprecatedFIXT64;
		
		private String updatedFIXT64;
		
		private String addedFIXT65;
		
		private String deprecatedFIXT65;
		
		private String updatedFIXT65;
		
		private String addedFIXT66;
		
		private String deprecatedFIXT66;
		
		private String updatedFIXT66;
		
		private String addedFIXT67;
		
		private String deprecatedFIXT67;
		
		private String updatedFIXT67;
		
		private String addedFIXT68;
		
		private String deprecatedFIXT68;
		
		private String updatedFIXT68;
		
		private String addedFIXT69;
		
		private String deprecatedFIXT69;
		
		private String updatedFIXT69;
		
		private String addedFIXT70;
		
		private String deprecatedFIXT70;
		
		private String updatedFIXT70;
		
		private String addedFIXT71;
		
		private String deprecatedFIXT71;
		
		private String updatedFIXT71;
		
		private String addedFIXT72;
		
		private String deprecatedFIXT72;
		
		private String updatedFIXT72;
		
		private String addedFIXT73;
		
		private String deprecatedFIXT73;
		
		private String updatedFIXT73;
		
		private String addedFIXT74;
		
		private String deprecatedFIXT74;
		
		private String updatedFIXT74;
		
		private String addedFIXT75;
		
		private String deprecatedFIXT75;
		
		private String updatedFIXT75;
		
		private String addedFIXT76;
		
		private String deprecatedFIXT76;
		
		private String updatedFIXT76;
		
		private String addedFIXT77;
		
		private String deprecatedFIXT77;
		
		private String updatedFIXT77;
		
		private String addedFIXT78;
		
		private String deprecatedFIXT78;
		
		private String updatedFIXT78;
		
		private String addedFIXT79;
		
		private String deprecatedFIXT79;
		
		private String updatedFIXT79;
		
		private String addedFIXT80;
		
		private String deprecatedFIXT80;
		
		private String updatedFIXT80;
		
		private String addedFIXT81;
		
		private String deprecatedFIXT81;
		
		private String updatedFIXT81;
		
		private String addedFIXT82;
		
		private String deprecatedFIXT82;
		
		private String updatedFIXT82;
		
		private String addedFIXT83;
		
		private String deprecatedFIXT83;
		
		private String updatedFIXT83;
		
		private String addedFIXT84;
		
		private String deprecatedFIXT84;
		
		private String updatedFIXT84;
		
		private String addedFIXT85;
		
		private String deprecatedFIXT85;
		
		private String updatedFIXT85;
		
		private String addedFIXT86;
		
		private String deprecatedFIXT86;
		
		private String updatedFIXT86;
		
		private String addedFIXT87;
		
		private String deprecatedFIXT87;
		
		private String updatedFIXT87;
		
		private String addedFIXT88;
		
		private String deprecatedFIXT88;
		
		private String updatedFIXT88;
		
		private String addedFIXT89;
		
		private String deprecatedFIXT89;
		
		private String updatedFIXT89;
		
		private String addedFIXT90;
		
		private String deprecatedFIXT90;
		
		private String updatedFIXT90;
		
		private String addedFIXT91;
		
		private String deprecatedFIXT91;
		
		private String updatedFIXT91;
		
		private String addedFIXT92;
		
		private String deprecatedFIXT92;
		
		private String updatedFIXT92;
		
		private String addedFIXT93;
		
		private String deprecatedFIXT93;
		
		private String updatedFIXT93;
		
		private String addedFIXT94;
		
		private String deprecatedFIXT94;
		
		private String updatedFIXT94;
		
		private String addedFIXT95;
		
		private String deprecatedFIXT95;
		
		private String updatedFIXT95;
		
		private String addedFIXT96;
		
		private String deprecatedFIXT96;
		
		private String updatedFIXT96;
		
		private String addedFIXT97;
		
		private String deprecatedFIXT97;
		
		private String updatedFIXT97;
		
		private String addedFIXT98;
		
		private String deprecatedFIXT98;
		
		private String updatedFIXT98;
		
		private String addedFIXT99;
		
		private String deprecatedFIXT99;
		
		private String updatedFIXT99;
		
		private String addedFIXT100;
		
		private String deprecatedFIXT100;
		
		private String updatedFIXT100;
		
		private String addedFIXT101;
		
		private String deprecatedFIXT101;
		
		private String updatedFIXT101;
		
		private String addedFIXT102