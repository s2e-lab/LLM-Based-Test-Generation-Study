// RIFInvokerTest.java
package com.densebrain.rif.client;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import org.apache.bcel.Constants;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.types.Invoke;
import com.densebrain.rif.client.service.types.InvokeResponse;
import com.densebrain.rif.util.ObjectUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFInvoker}.
* It contains ten unit test cases for the {@link RIFInvoker#invoke(String, Object[])} method.
*/
class RIFInvokerTest {

		private static final Log log = LogFactory.getLog(RIFInvokerTest.class);
		
		private static final String CLASS_NAME = "com.densebrain.rif.client.RIFInvokerTest";
		
		private static final String METHOD_NAME = "invoke";
		
		private static final String METHOD_NAME_1 = "invoke1";
		
		private static final String METHOD_NAME_2 = "invoke2";
		
		private static final String METHOD_NAME_3 = "invoke3";
		
		private static final String METHOD_NAME_4 = "invoke4";
		
		private static final String METHOD_NAME_5 = "invoke5";
		
		private static final String METHOD_NAME_6 = "invoke6";
		
		private static final String METHOD_NAME_7 = "invoke7";
		
		private static final String METHOD_NAME_8 = "invoke8";
		
		private static final String METHOD_NAME_9 = "invoke9";
		
		private static final String METHOD_NAME_10 = "invoke10";
		
		private static final String METHOD_NAME_11 = "invoke11";
		
		private static final String METHOD_NAME_12 = "invoke12";
		
		private static final String METHOD_NAME_13 = "invoke13";
		
		private static final String METHOD_NAME_14 = "invoke14";
		
		private static final String METHOD_NAME_15 = "invoke15";
		
		private static final String METHOD_NAME_16 = "invoke16";
		
		private static final String METHOD_NAME_17 = "invoke17";
		
		private static final String METHOD_NAME_18 = "invoke18";
		
		private static final String METHOD_NAME_19 = "invoke19";
		
		private static final String METHOD_NAME_20 = "invoke20";
		
		private static final String METHOD_NAME_21 = "invoke21";
		
		private static final String METHOD_NAME_22 = "invoke22";
		
		private static final String METHOD_NAME_23 = "invoke23";
		
		private static final String METHOD_NAME_24 = "invoke24";
		
		private static final String METHOD_NAME_25 = "invoke25";
		
		private static final String METHOD_NAME_26 = "invoke26";
		
		private static final String METHOD_NAME_27 = "invoke27";
		
		private static final String METHOD_NAME_28 = "invoke28";
		
		private static final String METHOD_NAME_29 = "invoke29";
		
		private static final String METHOD_NAME_30 = "invoke30";
		
		private static final String METHOD_NAME_31 = "invoke31";
		
		private static final String METHOD_NAME_32 = "invoke32";
		
		private static final String METHOD_NAME_33 = "invoke33";
		
		private static final String METHOD_NAME_34 = "invoke34";
		
		private static final String METHOD_NAME_35 = "invoke35";
		
		private static final String METHOD_NAME_36 = "invoke36";
		
		private static final String METHOD_NAME_37 = "invoke37";
		
		private static final String METHOD_NAME_38 = "invoke38";
		
		private static final String METHOD_NAME_39 = "invoke39";
		
		private static final String METHOD_NAME_40 = "invoke40";
		
		private static final String METHOD_NAME_41 = "invoke41";
		
		private static final String METHOD_NAME_42 = "invoke42";
		
		private static final String METHOD_NAME_43 = "invoke43";
		
		private static final String METHOD_NAME_44 = "invoke44";
		
		private static final String METHOD_NAME_45 = "invoke45";
		
		private static final String METHOD_NAME_46 = "invoke46";
		
		private static final String METHOD_NAME_47 = "invoke47";
		
		private static final String METHOD_NAME_48 = "invoke48";
		
		private static final String METHOD_NAME_49 = "invoke49";
		
		private static final String METHOD_NAME_50 = "invoke50";
		
		private static final String METHOD_NAME_51 = "invoke51";
		
		private static final String METHOD_NAME_52 = "invoke52";
		
		private static final String METHOD_NAME_53 = "invoke53";
		
		private static final String METHOD_NAME_54 = "invoke54";
		
		private static final String METHOD_NAME_55 = "invoke55";
		
		private static final String METHOD_NAME_56 = "invoke56";
		
		private static final String METHOD_NAME_57 = "invoke57";
		
		private static final String METHOD_NAME_58 = "invoke58";
		
		private static final String METHOD_NAME_59 = "invoke59";
		
		private static final String METHOD_NAME_60 = "invoke60";
		
		private static final String METHOD_NAME_61 = "invoke61";
		
		private static final String METHOD_NAME_62 = "invoke62";
		
		private static final String METHOD_NAME_63 = "invoke63";
		
		private static final String METHOD_NAME_64 = "invoke64";
		
		private static final String METHOD_NAME_65 = "invoke65";
		
		private static final String METHOD_NAME_66 = "invoke66";
		
		private static final String METHOD_NAME_67 = "invoke67";
		
		private static final String METHOD_NAME_68 = "invoke68";
		
		private static final String METHOD_NAME_69 = "invoke69";
		
		private static final String METHOD_NAME_70 = "invoke70";
		
		private static final String METHOD_NAME_71 = "invoke71";
		
		private static final String METHOD_NAME_72 = "invoke72";
		
		private static final String METHOD_NAME_73 = "invoke73";
		
		private static final String METHOD_NAME_74 = "invoke74";
		
		private static final String METHOD_NAME_75 = "invoke75";
		
		private static final String METHOD_NAME_76 = "invoke76";
		
		private static final String METHOD_NAME_77 = "invoke77";
		
		private static final String METHOD_NAME_78 = "invoke78";
		
		private static final String METHOD_NAME_79 = "invoke79";
		
		private static final String METHOD_NAME_80 = "invoke80";
		
		private static final String METHOD_NAME_81 = "invoke81";
		
		private static final String METHOD_NAME_82 = "invoke82";
		
		private static final String METHOD_NAME_83 = "invoke83";
		
		private static final String METHOD_NAME_84 = "invoke84";
		
		private static final String METHOD_NAME_85 = "invoke85";
		
		private static final String METHOD_NAME_86 = "invoke86";
		
		private static final String METHOD_NAME_87 = "invoke87";
		
		private static final String METHOD_NAME_88 = "invoke88";
		
		private static final String METHOD_NAME_89 = "invoke89";
		
		private static final String METHOD_NAME_90 = "invoke90";
		
		private static final String METHOD_NAME_91 = "invoke91";
		
		private static final String METHOD_NAME_92 = "invoke92";
		
		private static final String METHOD_NAME_93 = "invoke93";
		
		private static final String METHOD_NAME_94 = "invoke94";
