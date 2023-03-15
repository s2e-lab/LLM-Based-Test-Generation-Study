// Dot_5Test.java
package net.sourceforge.schemaspy.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sourceforge.schemaspy.Config;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dot}.
* It contains ten unit test cases for the {@link Dot#generateDiagram(File, File)} method.
*/
class Dot_5Test {

		private static final String DOT_EXE = "dot";
		
		private static final String DOT_VERSION = "2.2.1";
		
		private static final String DOT_FORMAT = "png";
		
		private static final String DOT_RENDERER = "";
		
		private static final String DOT_RENDERER_CAIRO = ":cairo";
		
		private static final String DOT_RENDERER_GD = ":gd";
		
		private static final String DOT_RENDERER_NEATO = ":neato";
		
		private static final String DOT_RENDERER_TWOPI = ":twopi";
		
		private static final String DOT_RENDERER_CIRCO = ":circo";
		
		private static final String DOT_RENDERER_FDP = ":fdp";
		
		private static final String DOT_RENDERER_SVG = ":svg";
		
		private static final String DOT_RENDERER_PS = ":ps";
		
		private static final String DOT_RENDERER_VRML = ":vrml";
		
		private static final String DOT_RENDERER_PNG = ":png";
		
		private static final String DOT_RENDERER_JPEG = ":jpeg";
		
		private static final String DOT_RENDERER_GIF = ":gif";
		
		private static final String DOT_RENDERER_ISMAP = ":ismap";
		
		private static final String DOT_RENDERER_CMAP = ":cmap";
		
		private static final String DOT_RENDERER_CMAPX = ":cmapx";
		
		private static final String DOT_RENDERER_CMAPX_NP = ":cmapx_np";
		
		private static final String DOT_RENDERER_IMAP = ":imap";
		
		private static final String DOT_RENDERER_IMAP_NP = ":imap_np";
		
		private static final String DOT_RENDERER_SVGZ = ":svgz";
		
		private static final String DOT_RENDERER_PDF = ":pdf";
		
		private static final String DOT_RENDERER_PLAIN = ":plain";
		
		private static final String DOT_RENDERER_PLAIN_EXT = ":plain-ext";
		
		private static final String DOT_RENDERER_PS2 = ":ps2";
		
		private static final String DOT_RENDERER_PSD = ":psd";
		
		private static final String DOT_RENDERER_VTX = ":vtx";
		
		private static final String DOT_RENDERER_VTX_S = ":vtx_s";
		
		private static final String DOT_RENDERER_VRML_S = ":vrml_s";
		
		private static final String DOT_RENDERER_WBMP = ":wbmp";
		
		private static final String DOT_RENDERER_XDOT = ":xdot";
		
		private static final String DOT_RENDERER_XDOT_S = ":xdot_s";
		
		private static final String DOT_RENDERER_XDOT1_2 = ":xdot1.2";
		
		private static final String DOT_RENDERER_XDOT1_4 = ":xdot1.4";
		
		private static final String DOT_RENDERER_XDOT_XML = ":xdot_xml";
		
		private static final String DOT_RENDERER_NULL = ":null";
		
		private static final String DOT_RENDERER_NULL_S = ":null_s";
		
		private static final String DOT_RENDERER_NULL_W = ":null_w";
		
		private static final String DOT_RENDERER_NULL_W_S = ":null_w_s";
		
		private static final String DOT_RENDERER_NULL_C = ":null_c";
		
		private static final String DOT_RENDERER_NULL_C_S = ":null_c_s";
		
		private static final String DOT_RENDERER_NULL_C_W = ":null_c_w";
		
		private static final String DOT_RENDERER_NULL_C_W_S = ":null_c_w_s";
		
		private static final String DOT_RENDERER_NULL_C_W_S_2 = ":null_c_w_s_2";
		
		private static final String DOT_RENDERER_NULL_C_W_S_3 = ":null_c_w_s_3";
		
		private static final String DOT_RENDERER_NULL_C_W_S_4 = ":null_c_w_s_4";
		
		private static final String DOT_RENDERER_NULL_C_W_S_5 = ":null_c_w_s_5";
		
		private static final String DOT_RENDERER_NULL_C_W_S_6 = ":null_c_w_s_6";
		
		private static final String DOT_RENDERER_NULL_C_W_S_7 = ":null_c_w_s_7";
		
		private static final String DOT_RENDERER_NULL_C_W_S_8 = ":null_c_w_s_8";
		
		private static final String DOT_RENDERER_NULL_C_W_S_9 = ":null_c_w_s_9";
		
		private static final String DOT_RENDERER_NULL_C_W_S_10 = ":null_c_w_s_10";
		
		private static final String DOT_RENDERER_NULL_C_W_S_11 = ":null_c_w_s_11";
		
		private static final String DOT_RENDERER_NULL_C_W_S_12 = ":null_c_w_s_12";
		
		private static final String DOT_RENDERER_NULL_C_W_S_13 = ":null_c_w_s_13";
		
		private static final String DOT_RENDERER_NULL_C_W_S_14 = ":null_c_w_s_14";
		
		private static final String DOT_RENDERER_NULL_C_W_S_15 = ":null_c_w_s_15";
		
		private static final String DOT_RENDERER_NULL_C_W_S_16 = ":null_c_w_s_16";
		
		private static final String DOT_RENDERER_NULL_C_W_S_17 = ":null_c_w_s_17";
		
		private static final String DOT_RENDERER_NULL_C_W_S_18 = ":null_c_w_s_18";
		
		private static final String DOT_RENDERER_NULL_C_W_S_19 = ":null_c_w_s_19";
		
		private static final String DOT_RENDERER_NULL_C_W_S_20 = ":null_c_w_s_20";
		
		private static final String DOT_RENDERER_NULL_C_W_S_21 = ":null_c_w_s_21";
		
		private static final String DOT_RENDERER_NULL_C_W_S_22 = ":null_c_w_s_22";
		
		private static final String DOT_RENDERER_NULL_C_W_S_23 = ":null_c_w_s_23";
		
		private static final String DOT_RENDERER_NULL_C_W_S_24 = ":null_c_w_s_24";
		
		private static final String DOT_RENDERER_NULL_C_W_S_25 = ":null_c_w_s_25";
		
		private static final String DOT_RENDERER_NULL_C_W_S_26 = ":null_c_w_s_26";
		
		private static final String DOT_RENDERER_NULL_C_W_S_27 = ":null_c_w_s_27";
		
		private static final String DOT_RENDERER_NULL_C_W_S_28 = ":null_c_w_s_28";
		
		private static final String DOT_RENDERER_NULL_C_W_S_29 = ":null_c_w_s_29";
		
		private static final String DOT_RENDERER_NULL_C_W_S_30 = ":null_c_w_s_30";
		
		private static final String DOT_RENDERER_NULL_C_W_S_31 = ":null_c_w_s_31";
		
		private static final String DOT_RENDERER_NULL_C_W_S_32 = ":null_c_w_s_32";
		
		private static final String DOT_RENDERER_NULL_C_W_S_33 = ":null_c_w_s_33";
		
		private static final String DOT_RENDERER_NULL_C_W_S_34 = ":null_c_w_s_34";
		
		private static final String DOT_RENDERER_NULL_C_W_S_35 = ":null_c_w_s_35";
		
		private static final String DOT_RENDERER_NULL_C_W_S_36 = ":null_c_w_s_36";
		
		private static final String DOT_RENDERER_NULL_C_W_S_37 = ":null_c_w_s_37";
		
		private static final String DOT_RENDERER_NULL_C_W_S_38 = ":null_c_w_s_38";
		
		private static final String DOT_RENDERER_NULL_C_W_S_39 = ":null_c_w_s_39";
		
		private static final String DOT_RENDERER_NULL_C_W_S_40 = ":null_c_w_s_40";
		
		private static final String DOT_RENDERER_NULL_C_W_S_41 = ":null_c_w_s_41";
		
		private static final String DOT_RENDERER_NULL_C_W_S_42 = ":null_c_w_s_42";
		
		private static final String DOT_RENDERER_NULL_C_W_S_43 = ":null_c_w_s_43";
		
		private static final String DOT_RENDERER_NULL_C_W_S_44 = ":null_c_w_s_44";
		
		private static final String DOT_RENDERER_NULL_C_W_S_45 = ":null_c_w_s_45";
		
		private static final String DOT_RENDERER_NULL_C_W_S_46 = ":null_c_w_s_46";
		
		private static final String DOT_RENDERER_NULL_C_W_S_47 = ":null_c_w_s_47";
		
		private static final String DOT_RENDERER_NULL_C_W_S_48 = ":null_c_w_s_48";
		
		private static final String DOT_RENDERER_NULL_C_W_S_49 = ":null_c_w_s_49";
		
		private static final String DOT_RENDERER_NULL_C_W_S_50 = ":null_c_w_s_50";
		
		private static final String DOT_RENDERER_NULL_C_W_S_51 = ":null_c_w_s_51";
		
		private static final String DOT_RENDERER_NULL_C_W_S_52 = ":null_c_w_s_52";
		
		private static final String DOT_RENDERER_NULL_C_W_S_53 = ":null_c_w_s_53";
		
		private static final String DOT_RENDERER_NULL_C_W_S_54 = ":null_c_w_s_54";
		
		private static final String DOT_RENDERER_NULL_C_W_S_55 = ":null_c_w_s_55";
		
		private static final String DOT_RENDERER_NULL_C_W_S_56 = ":null_c_w_s_56";
		
		private static final String DOT_RENDERER_NULL_C_W_S_57 = ":null_c_w_s_57";
		
		private static final String DOT_RENDERER_NULL_C_W_S_58 = ":null_c_w_s_58";
		
		private static final String DOT_RENDERER_NULL_C_W_S_59 = ":null_c_w_s_59";
		
		private static final String DOT_RENDERER_NULL_C_W_S_60 = ":null_c_w_s_60";
		
		private static final String DOT_RENDERER_NULL_C_W_S_61 = ":null_c_w_s_61";
		
		private static final String DOT_RENDERER_NULL_C_W_S_62 = ":null_c_w_s_62";
		
		private static final String DOT_RENDERER_NULL_C_W_S_63 = ":null_c_w_s_63";
		
		private static final String DOT_RENDERER_NULL_C_W_S_64 = ":null_c_w_s_64";
		
		private static final String DOT_RENDERER_NULL_C_W_S_65 = ":null_c_w_s_65";
		
		private static final String DOT_RENDERER_NULL_C_W_S_66 = ":null_c_w_s_66";
		
		private static final String DOT_RENDERER_NULL_C_W_S_67 = ":null_c_w_s_67";
		
		private static final String DOT_RENDERER_NULL_C_W_S_68 = ":null_c_w_s_68";
		
		private static final String DOT_RENDERER_NULL_C_W_S_69 = ":null_c_w_s_69";
		
		private static final String DOT_RENDERER_NULL_C_W_S_70 = ":null_c_w_s_70";
		
		private static final String DOT_RENDERER_NULL_C_W_S_71 = ":null_c_w_s_71";
		
		private static final String DOT_RENDERER_NULL_C_W_S_72 = ":null_c_w_s_72";
		
		private static final String DOT_RENDERER_NULL_C_W_S_73 = ":null_c_w_s_73";
		
		private static final String DOT_RENDERER