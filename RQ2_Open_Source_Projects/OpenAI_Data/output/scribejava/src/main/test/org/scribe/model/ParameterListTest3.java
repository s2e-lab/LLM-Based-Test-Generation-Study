// ParameterListTest3.java
package org.scribe.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterList}.
* It contains ten unit test cases for the {@link ParameterList#contains(Parameter)} method.
*/
class ParameterListTest3 {

		private ParameterList parameterList;
		
		private Parameter parameter;
		
		private Parameter parameter2;
		
		private Parameter parameter3;
		
		private Parameter parameter4;
		
		private Parameter parameter5;
		
		private Parameter parameter6;
		
		private Parameter parameter7;
		
		private Parameter parameter8;
		
		private Parameter parameter9;
		
		private Parameter parameter10;
		
		private Parameter parameter11;
		
		private Parameter parameter12;
		
		private Parameter parameter13;
		
		private Parameter parameter14;
		
		private Parameter parameter15;
		
		private Parameter parameter16;
		
		private Parameter parameter17;
		
		private Parameter parameter18;
		
		private Parameter parameter19;
		
		private Parameter parameter20;
		
		private Parameter parameter21;
		
		private Parameter parameter22;
		
		private Parameter parameter23;
		
		private Parameter parameter24;
		
		private Parameter parameter25;
		
		private Parameter parameter26;
		
		private Parameter parameter27;
		
		private Parameter parameter28;
		
		private Parameter parameter29;
		
		private Parameter parameter30;
		
		private Parameter parameter31;
		
		private Parameter parameter32;
		
		private Parameter parameter33;
		
		private Parameter parameter34;
		
		private Parameter parameter35;
		
		private Parameter parameter36;
		
		private Parameter parameter37;
		
		private Parameter parameter38;
		
		private Parameter parameter39;
		
		private Parameter parameter40;
		
		private Parameter parameter41;
		
		private Parameter parameter42;
		
		private Parameter parameter43;
		
		private Parameter parameter44;
		
		private Parameter parameter45;
		
		private Parameter parameter46;
		
		private Parameter parameter47;
		
		private Parameter parameter48;
		
		private Parameter parameter49;
		
		private Parameter parameter50;
		
		private Parameter parameter51;
		
		private Parameter parameter52;
		
		private Parameter parameter53;
		
		private Parameter parameter54;
		
		private Parameter parameter55;
		
		private Parameter parameter56;
		
		private Parameter parameter57;
		
		private Parameter parameter58;
		
		private Parameter parameter59;
		
		private Parameter parameter60;
		
		private Parameter parameter61;
		
		private Parameter parameter62;
		
		private Parameter parameter63;
		
		private Parameter parameter64;
		
		private Parameter parameter65;
		
		private Parameter parameter66;
		
		private Parameter parameter67;
		
		private Parameter parameter68;
		
		private Parameter parameter69;
		
		private Parameter parameter70;
		
		private Parameter parameter71;
		
		private Parameter parameter72;
		
		private Parameter parameter73;
		
		private Parameter parameter74;
		
		private Parameter parameter75;
		
		private Parameter parameter76;
		
		private Parameter parameter77;
		
		private Parameter parameter78;
		
		private Parameter parameter79;
		
		private Parameter parameter80;
		
		private Parameter parameter81;
		
		private Parameter parameter82;
		
		private Parameter parameter83;
		
		private Parameter parameter84;
		
		private Parameter parameter85;
		
		private Parameter parameter86;
		
		private Parameter parameter87;
		
		private Parameter parameter88;
		
		private Parameter parameter89;
		
		private Parameter parameter90;
		
		private Parameter parameter91;
		
		private Parameter parameter92;
		
		private Parameter parameter93;
		
		private Parameter parameter94;
		
		private Parameter parameter95;
		
		private Parameter parameter96;
		
		private Parameter parameter97;
		
		private Parameter parameter98;
		
		private Parameter parameter99;
		
		private Parameter parameter100;
		
		private Parameter parameter101;
		
		private Parameter parameter102;
		
		private Parameter parameter103;
		
		private Parameter parameter104;
		
		private Parameter parameter105;
		
		private Parameter parameter106;
		
		private Parameter parameter107;
		
		private Parameter parameter108;
		
		private Parameter parameter109;
		
		private Parameter parameter110;
		
		private Parameter parameter111;
		
		private Parameter parameter112;
		
		private Parameter parameter113;
		
		private Parameter parameter114;
		
		private Parameter parameter115;
		
		private Parameter parameter116;
		
		private Parameter parameter117;
		
		private Parameter parameter118;
		
		private Parameter parameter119;
		
		private Parameter parameter120;
		
		private Parameter parameter121;
		
		private Parameter parameter122;
		
		private Parameter parameter123;
		
		private Parameter parameter124;
		
		private Parameter parameter125;
		
		private Parameter parameter126;
		
		private Parameter parameter127;
		
		private Parameter parameter128;
		
		private Parameter parameter129;
		
		private Parameter parameter130;
		
		private Parameter parameter131;
		
		private Parameter parameter132;
		
		private Parameter parameter133;
		
		private Parameter parameter134;
		
		private Parameter parameter135;
		
		private Parameter parameter136;
		
		private Parameter parameter137;
		
		private Parameter parameter138;
		
		private Parameter parameter139;
		
		private Parameter parameter140;
		
		private Parameter parameter141;
		
		private Parameter parameter142;
		
		private Parameter parameter143;
		
		private Parameter parameter144;
		
		private Parameter parameter145;
		
		private Parameter parameter146;
		
		private Parameter parameter147;
		
		private Parameter parameter148;
		
		private Parameter parameter149;
		
		private Parameter parameter150;
		
		private Parameter parameter151;
		
		private Parameter parameter152;
		
		private Parameter parameter153;
		
		private Parameter parameter154;
		
		private Parameter parameter155;
		
		private Parameter parameter156;
		
		private Parameter parameter157;
		
		private Parameter parameter158;
		
		private Parameter parameter159;
		
		private Parameter parameter160;
		
		private Parameter parameter161;
		
		private Parameter parameter162;
		
		private Parameter parameter163;
		
		private Parameter parameter164;
		
		private Parameter parameter165;
		
		private Parameter parameter166;
		
		private Parameter parameter167;
		
		private Parameter parameter168;
		
		private Parameter parameter169;
		
		private Parameter parameter170;
		
		private Parameter parameter171;
		
		private Parameter parameter172;
		
		private Parameter parameter173;
		
		private Parameter parameter174;
		
		private Parameter parameter175;
		
		private Parameter parameter176;
		
		private Parameter parameter177;
		
		private Parameter parameter178;
		
		private Parameter parameter179;
		
		private Parameter parameter180;
		
		private Parameter parameter181;
		
		private Parameter parameter182;
		
		private Parameter parameter183;
		
		private Parameter parameter184;
		
		private Parameter parameter185;
		
		private Parameter parameter186;
		
		private Parameter parameter187;
		
		private Parameter parameter188;
		
		private Parameter parameter189;
		
		private Parameter parameter190;
		
		private Parameter parameter191;
		
		private Parameter parameter192;
		
		private Parameter parameter193;
		
		private Parameter parameter194;
		
		private Parameter parameter195;
		
		private Parameter parameter196;
		
		private Parameter parameter197;
		
		private Parameter parameter198;
		
		private Parameter parameter199;
		
		private Parameter parameter200;
		
		private Parameter parameter201;
		
		private Parameter parameter202;
		
		private Parameter parameter203;
		
		private Parameter parameter204;
		
		private Parameter parameter205;
		
		private Parameter parameter206;
		
		private Parameter parameter207;
		
		private Parameter parameter208;
		
		private Parameter parameter209;
		
		private Parameter parameter210;
		
		private Parameter parameter211;
		
		private Parameter parameter212;
		
		private Parameter parameter213;
		
		private Parameter parameter214;
		
		private Parameter parameter215;
		
		private Parameter parameter216;
		
		private Parameter parameter217;
		
		private Parameter parameter218;
		
		private Parameter parameter219;
		
		private Parameter parameter220;
		
		private Parameter parameter221;
		
		private Parameter parameter222;
		
		private Parameter parameter223;
		
		private Parameter parameter224;
		
		private Parameter parameter225;
		
		private Parameter parameter226;
		
		private Parameter parameter227;
		
		private Parameter parameter228;
		
		private Parameter parameter229;
		
		private Parameter parameter230;
		
		private Parameter parameter231;
		
		private Parameter parameter232;
		
		private Parameter parameter233;
		
		private Parameter parameter234;
		
		private Parameter parameter235;
		
		private Parameter parameter236;
		
		private Parameter parameter237;
		
		private Parameter parameter238;
		
		private Parameter parameter239;
		
		private Parameter parameter240;
		
		private Parameter parameter241;
		
		private Parameter parameter242;
		
		private Parameter parameter243;
		
		private Parameter parameter244;
		
		private Parameter parameter245;
		
		private Parameter parameter246;
		
		private Parameter parameter247;
		
		private Parameter parameter248;
		
		private Parameter parameter249;
		
		private Parameter parameter250;
		
		private Parameter parameter251;
		
		private Parameter parameter252;
		
		private Parameter parameter253;
		
		private Parameter parameter254;
		
		private Parameter parameter255;
		
		private Parameter parameter256;
		
		private Parameter parameter257;
		
		private Parameter parameter258;
		
		private Parameter parameter259;
		
		private Parameter parameter260;
		
		private Parameter parameter261;
		
		private Parameter parameter262;
		
		private Parameter parameter263;
		
		private Parameter parameter264;
		
		private Parameter parameter265;
		
		private Parameter parameter266;
		
		private Parameter parameter267;
		
		private Parameter parameter268;
		
		private Parameter parameter269;
		
		private Parameter parameter270;
		
		private Parameter parameter271;
		
		private Parameter parameter272;
		
		private Parameter parameter273;
		
		private Parameter parameter274;
		
		private Parameter parameter275;
		
		private Parameter parameter276;
		
		private Parameter parameter277;
		
		private Parameter parameter278;
		
		private Parameter parameter279;
		
		private Parameter parameter280;
		
		private Parameter parameter281;
		
		private Parameter parameter282;
		
		private Parameter parameter283;
		
		private Parameter parameter284;
		
		private Parameter parameter285;
		
		private Parameter parameter286;
		
		private Parameter parameter287;
		
		private Parameter parameter288;
		
		private Parameter parameter289;
		
		private Parameter parameter290;
		
		private Parameter parameter291;
		
		private Parameter parameter292;
		
		private Parameter parameter293;
		
		private Parameter parameter294;
		
		private Parameter parameter295;
		
		private Parameter parameter296;
		
		private Parameter parameter297;
		
		private Parameter parameter298;
		
		private Parameter parameter299;
		
		private Parameter parameter300;
		
		private Parameter parameter301;
		
		private Parameter parameter302;
		
		private Parameter parameter303;
		
		private Parameter parameter304;
		
		private Parameter parameter305;
		
		private Parameter parameter306;
		
		private Parameter parameter307;
		
		private Parameter parameter308;
		
		private Parameter parameter309;
		
		private Parameter parameter310;
		
		private Parameter parameter311;
		
		private Parameter parameter312;
		
		private Parameter parameter313;
		
		private Parameter parameter314;
		
		private Parameter parameter315;
		
		private Parameter parameter316;
		
		private Parameter parameter317;
		
		private Parameter parameter318;
		
		private Parameter parameter319;
		
		private Parameter parameter320;
		
		private Parameter parameter321;
		
		private Parameter parameter322;
		
		private Parameter parameter323;
		
		private Parameter parameter324;
		
		private Parameter parameter325;
		
		private Parameter parameter326;
		
		private Parameter parameter327;
		
		private Parameter parameter328;
		
		private Parameter parameter329;
		
		private Parameter parameter330;
		
		private Parameter parameter331;
		
		private Parameter parameter332;
		
		private