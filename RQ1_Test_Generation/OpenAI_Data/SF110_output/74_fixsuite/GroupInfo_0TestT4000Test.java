// GroupInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GroupInfo}.
* It contains ten unit test cases for the {@link GroupInfo#getField(int)} method.
*/
class GroupInfo_0Test {

		private GroupInfo groupInfo;
		
		private FieldInfo fieldInfo;
		
		private TreeMap<Integer, FieldInfo> fieldsByTagNumber;
		
		private TreeMap<String, FieldInfo> fieldsByName;
		
		private TreeMap<String, ComponentInfo> componentsByName;
		
		private TreeMap<Integer, ComponentInfo> componentsById;
		
		private TreeMap<Double, FixInfo> itemsByPosition;
		
		private HashMap<FixInfo, Double> itemsByContent;
		
		private List<FieldInfo> fields;
		
		private List<ComponentInfo> components;
		
		private List<FixInfo> items;
		
		private FieldInfo field;
		
		private ComponentInfo component;
		
		private FixInfo item;
		
		private double position;
		
		private int tagNumber;
		
		private String name;
		
		private int id;
		
		private String dataType;
		
		private String description;
		
		private String abbreviation;
		
		private String overrideXmlName;
		
		private String baseCategory;
		
		private String baseCategoryXmlName;
		
		private String unionDataType;
		
		private String usesEnumFromTag;
		
		private String comments;
		
		private int length;
		
		private String deprecatingVersion;
		
		private String requiringComponents;
		
		private HashMap<String, String> validValues;
		
		private HashMap<String, String> validValuesMap;
		
		private String key;
		
		private String value;
		
		private String key1;
		
		private String value1;
		
		private String key2;
		
		private String value2;
		
		private String key3;
		
		private String value3;
		
		private String key4;
		
		private String value4;
		
		private String key5;
		
		private String value5;
		
		private String key6;
		
		private String value6;
		
		private String key7;
		
		private String value7;
		
		private String key8;
		
		private String value8;
		
		private String key9;
		
		private String value9;
		
		private String key10;
		
		private String value10;
		
		private String key11;
		
		private String value11;
		
		private String key12;
		
		private String value12;
		
		private String key13;
		
		private String value13;
		
		private String key14;
		
		private String value14;
		
		private String key15;
		
		private String value15;
		
		private String key16;
		
		private String value16;
		
		private String key17;
		
		private String value17;
		
		private String key18;
		
		private String value18;
		
		private String key19;
		
		private String value19;
		
		private String key20;
		
		private String value20;
		
		private String key21;
		
		private String value21;
		
		private String key22;
		
		private String value22;
		
		private String key23;
		
		private String value23;
		
		private String key24;
		
		private String value24;
		
		private String key25;
		
		private String value25;
		
		private String key26;
		
		private String value26;
		
		private String key27;
		
		private String value27;
		
		private String key28;
		
		private String value28;
		
		private String key29;
		
		private String value29;
		
		private String key30;
		
		private String value30;
		
		private String key31;
		
		private String value31;
		
		private String key32;
		
		private String value32;
		
		private String key33;
		
		private String value33;
		
		private String key34;
		
		private String value34;
		
		private String key35;
		
		private String value35;
		
		private String key36;
		
		private String value36;
		
		private String key37;
		
		private String value37;
		
		private String key38;
		
		private String value38;
		
		private String key39;
		
		private String value39;
		
		private String key40;
		
		private String value40;
		
		private String key41;
		
		private String value41;
		
		private String key42;
		
		private String value42;
		
		private String key43;
		
		private String value43;
		
		private String key44;
		
		private String value44;
		
		private String key45;
		
		private String value45;
		
		private String key46;
		
		private String value46;
		
		private String key47;
		
		private String value47;
		
		private String key48;
		
		private String value48;
		
		private String key49;
		
		private String value49;
		
		private String key50;
		
		private String value50;
		
		private String key51;
		
		private String value51;
		
		private String key52;
		
		private String value52;
		
		private String key53;
		
		private String value53;
		
		private String key54;
		
		private String value54;
		
		private String key55;
		
		private String value55;
		
		private String key56;
		
		private String value56;
		
		private String key57;
		
		private String value57;
		
		private String key58;
		
		private String value58;
		
		private String key59;
		
		private String value59;
		
		private String key60;
		
		private String value60;
		
		private String key61;
		
		private String value61;
		
		private String key62;
		
		private String value62;
		
		private String key63;
		
		private String value63;
		
		private String key64;
		
		private String value64;
		
		private String key65;
		
		private String value65;
		
		private String key66;
		
		private String value66;
		
		private String key67;
		
		private String value67;
		
		private String key68;
		
		private String value68;
		
		private String key69;
		
		private String value69;
		
		private String key70;
		
		private String value70;
		
		private String key71;
		
		private String value71;
		
		private String key72;
		
		private String value72;
		
		private String key73;
		
		private String value73;
		
		private String key74;
		
		private String value74;
		
		private String key75;
		
		private String value75;
		
		private String key76;
		
		private String value76;
		
		private String key77;
		
		private String value77;
		
		private String key78;
		
		private String value78;
		
		private String key79;
		
		private String value79;
		
		private String key80;
		
		private String value80;
		
		private String key81;
		
		private String value81;
		
		private String key82;
		
		private String value82;
		
		private String key83;
		
		private String value83;
		
		private String key84;
		
		private String value84;
		
		private String key85;
		
		private String value85;
		
		private String key86;
		
		private String value86;
		
		private String key87;
		
		private String value87;
		
		private String key88;
		
		private String value88;
		
		private String key89;
		
		private String value89;
		
		private String key90;
		
		private String value90;
		
		private String key91;
		
		private String value91;
		
		private String key92;
		
		private String value92;
		
		private String key93;
		
		private String value93;
		
		private String key94;
		
		private String value94;
		
		private String key95;
		
		private String value95;
		
		private String key96;
		
		private String value96;
		
		private String key97;
		
		private String value97;
		
		private String key98;
		
		private String value98;
		
		private String key99;
		
		private String value99;
		
		private String key100;
		
		private String value100;
		
		private String key101;
		
		private String value101;
		
		private String key102;
		
		private String value102;
		
		private String key103;
		
		private String value103;
		
		private String key104;
		
		private String value104;
		
		private String key105;
		
		private String value105;
		
		private String key106;
		
		private String value106;
		
		private String key107;
		
		private String value107;
		
		private String key108;
		
		private String value108;
		
		private String key109;
		
		private String value109;
		
		private String key110;
		
		private String value110;
		
		private String key111;
		
		private String value111;
		
		private String key112;
		
		private String value112;
		
		private String key113;
		
		private String value113;
		
		private String key114;
		
		private String value114;
		
		private String key115;
		
		private String value115;
		
		private String key116;
		
		private String value116;
		
		private String key117;
		
		private String value117;
		
		private String key118;
		
		private String value118;
		
		private String key119;
		
		private String value119;
		
		private String key120;
		
		private String value120;
		
		private String key121;
		
		private String value121;
		
		private String key122;
		
		private String value122;
		
		private String key123;
		
		private String value123;
		
		private String key124;
		
		private String value124;
		
		private String key125;
		
		private String value125;
		
		private String key126;
		
		private String value126;
		
		private String key127;
		
		private String value127;
		
		private String key128;
		
		private String value128;
		
		private String key129;
		
		private String value129;
		
		private String key130;
		
		private String value130;
		
		private String key131;
		
		private String value131;
		
		private String key132;
		
		private String value132;
		
		private String key133;
		
		private String value133;
		
		private String key134;
		
		private String value134;
		
		private String key135;
		
		private String value135;
		
		private String key136;
		
		private String value136;
		
		private String key137;
		
		private String value137;
		
		private String key138;
		
		private String value138;
		
		private String key139;
		
		private String value139;
		
		private String key140;
		
		private String value140;
		
		private String key141;
		
		private String value141;
		
		private String key142;
		
		private String value142;
		
		private String key143;
		
		private String value143;
		
		private String key144;
		
		private String value144;
		
		private String key145;
		
		private String value145;
		
		private String key146;
		
		private String value146;
		
		private String key147;
		
		private String value147;
		
		private String key148;
		
		private String value148;
		
		private String key149;
		
		private String value149;
		
		private String key150;
		
		private String value150;
		
		private String key151;
		
		private String value151;
		
		private String key152;
		
		private String value152;
		
		private String key153;
		
		private String value153;
		
		private String key154;
		
		private String value154;
		
		private String key155;
		
		private String value155;
		
		private String key156;
		
		private String value156;
		
		private String key157;
		
		private String value157;
		
		private String key158;
		
		private String value158;
		
		private String key159;
		
		private String value159;
		
		private String key160;
		
		private String value160;
		
		private String key161;
		
		private String value161;
		
		private String key162;