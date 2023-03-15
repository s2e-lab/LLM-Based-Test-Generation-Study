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
		
		private ComponentInfo componentInfo;
		
		private TreeMap<Integer, ComponentInfo> componentsById;
		
		private int id;
		
		private List<ComponentInfo> components;
		
		private TreeMap<String, MessageInfo> messagesByName;
		
		private MessageInfo messageInfo;
		
		private TreeMap<Integer, MessageInfo> messagesById;
		
		private List<MessageInfo> messages;
		
		private String version;
		
		private int loadCount;
		
		private boolean result2;
		
		private boolean result3;
		
		private boolean result4;
		
		private boolean result5;
		
		private boolean result6;
		
		private boolean result7;
		
		private boolean result8;
		
		private boolean result9;
		
		private boolean result10;
		
		private boolean result11;
		
		private boolean result12;
		
		private boolean result13;
		
		private boolean result14;
		
		private boolean result15;
		
		private boolean result16;
		
		private boolean result17;
		
		private boolean result18;
		
		private boolean result19;
		
		private boolean result20;
		
		private boolean result21;
		
		private boolean result22;
		
		private boolean result23;
		
		private boolean result24;
		
		private boolean result25;
		
		private boolean result26;
		
		private boolean result27;
		
		private boolean result28;
		
		private boolean result29;
		
		private boolean result30;
		
		private boolean result31;
		
		private boolean result32;
		
		private boolean result33;
		
		private boolean result34;
		
		private boolean result35;
		
		private boolean result36;
		
		private boolean result37;
		
		private boolean result38;
		
		private boolean result39;
		
		private boolean result40;
		
		private boolean result41;
		
		private boolean result42;
		
		private boolean result43;
		
		private boolean result44;
		
		private boolean result45;
		
		private boolean result46;
		
		private boolean result47;
		
		private boolean result48;
		
		private boolean result49;
		
		private boolean result50;
		
		private boolean result51;
		
		private boolean result52;
		
		private boolean result53;
		
		private boolean result54;
		
		private boolean result55;
		
		private boolean result56;
		
		private boolean result57;
		
		private boolean result58;
		
		private boolean result59;
		
		private boolean result60;
		
		private boolean result61;
		
		private boolean result62;
		
		private boolean result63;
		
		private boolean result64;
		
		private boolean result65;
		
		private boolean result66;
		
		private boolean result67;
		
		private boolean result68;
		
		private boolean result69;
		
		private boolean result70;
		
		private boolean result71;
		
		private boolean result72;
		
		private boolean result73;
		
		private boolean result74;
		
		private boolean result75;
		
		private boolean result76;
		
		private boolean result77;
		
		private boolean result78;
		
		private boolean result79;
		
		private boolean result80;
		
		private boolean result81;
		
		private boolean result82;
		
		private boolean result83;
		
		private boolean result84;
		
		private boolean result85;
		
		private boolean result86;
		
		private boolean result87;
		
		private boolean result88;
		
		private boolean result89;
		
		private boolean result90;
		
		private boolean result91;
		
		private boolean result92;
		
		private boolean result93;
		
		private boolean result94;
		
		private boolean result95;
		
		private boolean result96;
		
		private boolean result97;
		
		private boolean result98;
		
		private boolean result99;
		
		private boolean result100;
		
		private boolean result101;
		
		private boolean result102;
		
		private boolean result103;
		
		private boolean result104;
		
		private boolean result105;
		
		private boolean result106;
		
		private boolean result107;
		
		private boolean result108;
		
		private boolean result109;
		
		private boolean result110;
		
		private boolean result111;
		
		private boolean result112;
		
		private boolean result113;
		
		private boolean result114;
		
		private boolean result115;
		
		private boolean result116;
		
		private boolean result117;
		
		private boolean result118;
		
		private boolean result119;
		
		private boolean result120;
		
		private boolean result121;
		
		private boolean result122;
		
		private boolean result123;
		
		private boolean result124;
		
		private boolean result125;
		
		private boolean result126;
		
		private boolean result127;
		
		private boolean result128;
		
		private boolean result129;
		
		private boolean result130;
		
		private boolean result131;
		
		private boolean result132;
		
		private boolean result133;
		
		private boolean result134;
		
		private boolean result135;
		
		private boolean result136;
		
		private boolean result137;
		
		private boolean result138;
		
		private boolean result139;
		
		private boolean result140;
		
		private boolean result141;
		
		private boolean result142;
		
		private boolean result143;
		
		private boolean result144;
		
		private boolean result145;
		
		private boolean result146;
		
		private boolean result147;
		
		private boolean result148;
		
		private boolean result149;
		
		private boolean result150;
		
		private boolean result151;
		
		private boolean result152;
		
		private boolean result153;
		
		private boolean result154;
		
		private boolean result155;
		
		private boolean result156;
		
		private boolean result157;
		
		private boolean result158;
		
		private boolean result159;
		
		private boolean result160;
		
		private boolean result161;
		
		private boolean result162;
		
		private boolean result163;
		
		private boolean result164;
		
		private boolean result165;
		
		private boolean result166;
		
		private boolean result167;
		
		private boolean result168;
		
		private boolean result169;
		
		private boolean result170;
		
		private boolean result171;
		
		private boolean result172;
		
		private boolean result173;
		
		private boolean result174;
		
		private boolean result175;
		
		private boolean result176;
		
		private boolean result177;
		
		private boolean result178;
		
		private boolean result179;
		
		private boolean result180;
		
		private boolean result181;
		
		private boolean result182;
		
		private boolean result183;
		
		private boolean result184;
		
		private boolean result185;
		
		private boolean result186;
		
		private boolean result187;
		
		private boolean result188;
		
		private boolean result189;
		
		private boolean result190;
		
		private boolean result191;
		
		private boolean result192;
		
		private boolean result193;
		
		private boolean result194;
		
		private boolean result195;
		
		private boolean result196;
		
		private boolean result197;
		
		private boolean result198;
		
		private boolean result199;
		
		private boolean result200;
		
		private boolean result201;
		
		private boolean result202;
		
		private boolean result203;
		
		private boolean result204;
		
		private boolean result205;
		
		private boolean result206;
		
		private boolean result207;
		
		private boolean result208;
		
		private boolean result209;
		
		private boolean result210;
		
		private boolean result211;
		
		private boolean result212;
		
		private boolean result213;
		
		private boolean result214;
		
		private boolean result215;
		
		private boolean result216;
		
		private boolean result217;
		
		private boolean result218;
		
		private boolean result219;
		
		private boolean result220;
		
		private boolean result221;
		
		private boolean result222;
		
		private boolean result223;
		
		private boolean result224;
		
		private boolean result225;
		
		private boolean result226;
		
		private boolean result227;
		
		private boolean result228;
		
		private boolean result229;
		
		private boolean result230;
		
		private boolean result231;
		
		private boolean result232;
		
		private boolean result233;
		
		private boolean result234;
		
		private boolean result235;
		
		private boolean result236;
		
		private boolean result237;
		
		private boolean result238;
		
		private boolean result239;
		
		private boolean result240;
		
		private boolean result241;
		
		private boolean result242;
		
		private boolean result243;
		
		private boolean result244;
		
		private boolean result245;
		
		private boolean result246;
		
		private boolean result247;
		
		private boolean result248;
		
		private boolean result249;
		
		private boolean result250;
		
		private boolean result251;
		
		private boolean result252;
		
		private boolean result253;
		
		private boolean result254;
		
		private boolean result255;
		
		private boolean result256;
		
		private boolean result257;
		
		private boolean result258;
		
		private boolean result259;
		
		private boolean result260;
		
		private boolean result261;
		
		private boolean result262;
		
		private boolean result263;
		
		private boolean result264;
		
		private boolean result265;
		
		private boolean result266;
		
		private boolean result267;
		
		private boolean result268;
		
		private boolean result269;
		
		private boolean result270;
		
		private boolean result271;
		
		private boolean result272;
		
		private boolean result273;
		
		private boolean result274;
		
		private boolean result275;
		
		private boolean result276;
		
		private boolean result277;
		
		private boolean result278;
		
		private boolean result279;
		
		private boolean result280;
		
		private boolean result281;
		
		private boolean result282;
		
		private boolean result283;
		
		private boolean result284;
		
		private boolean result285;
		
		private boolean result286;
		
		private boolean result287;
		
		private boolean result288;
		
		private boolean result289;
		
		private boolean result290;
		
		private boolean result291;
		
		private boolean result292;
		
		private boolean result293;
		
		private boolean result294;
		
		private boolean result295;
		
		private boolean result296;
		
		private boolean result297;
		
		private boolean result298;
		
		private boolean result299;
		
		private boolean result300;
		
		private boolean result301;
		
		private boolean result302;
		
		private boolean result303;
		
		private boolean result304;
		
		private boolean result305;
		
		private boolean result306;
		
		private boolean result307;
		
		private boolean result308;
		
		private boolean result309;
		
		private boolean result310;
		
		private boolean result311;
		
		private boolean result312;
		
		private boolean result313;
		
		private boolean result314;
		
		private boolean result315;
		
		private boolean result316;
		
		private boolean result317;
		
		private boolean result318;
		
		private boolean result319;
		
		private boolean result320;
		
		private boolean result321;
		
		private boolean result322;
		
		private boolean result323;
		
		private boolean result324;
		
		private boolean result325;
		
		private boolean result326;
		
		private boolean result327;
		
		private boolean result328;
		
		private boolean result329;
		
		private boolean result330;
		
		private boolean result331;
		
		private boolean result332;
		
		private boolean result333;
		
		private boolean result334;
		
		private boolean result335;
		
		private boolean result336;
		
		private boolean result337;
		
		private boolean result338;
		
		private boolean result339;
		
		private boolean result340;
		
		private boolean