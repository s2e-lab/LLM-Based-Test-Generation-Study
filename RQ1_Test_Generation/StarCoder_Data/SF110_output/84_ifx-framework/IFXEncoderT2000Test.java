// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains ten unit test cases for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {

    private IFXEncoder encoder;

    private IFXObject obj;

    private IFXObject obj2;

    private IFXObject obj3;

    private IFXObject obj4;

    private IFXObject obj5;

    private IFXObject obj6;

    private IFXObject obj7;

    private IFXObject obj8;

    private IFXObject obj9;

    private IFXObject obj10;

    private IFXObject obj11;

    private IFXObject obj12;

    private IFXObject obj13;

    private IFXObject obj14;

    private IFXObject obj15;

    private IFXObject obj16;

    private IFXObject obj17;

    private IFXObject obj18;

    private IFXObject obj19;

    private IFXObject obj20;

    private IFXObject obj21;

    private IFXObject obj22;

    private IFXObject obj23;

    private IFXObject obj24;

    private IFXObject obj25;

    private IFXObject obj26;

    private IFXObject obj27;

    private IFXObject obj28;

    private IFXObject obj29;

    private IFXObject obj30;

    private IFXObject obj31;

    private IFXObject obj32;

    private IFXObject obj33;

    private IFXObject obj34;

    private IFXObject obj35;

    private IFXObject obj36;

    private IFXObject obj37;

    private IFXObject obj38;

    private IFXObject obj39;

    private IFXObject obj40;

    private IFXObject obj41;

    private IFXObject obj42;

    private IFXObject obj43;

    private IFXObject obj44;

    private IFXObject obj45;

    private IFXObject obj46;

    private IFXObject obj47;

    private IFXObject obj48;

    private IFXObject obj49;

    private IFXObject obj50;

    private IFXObject obj51;

    private IFXObject obj52;

    private IFXObject obj53;

    private IFXObject obj54;

    private IFXObject obj55;

    private IFXObject obj56;

    private IFXObject obj57;

    private IFXObject obj58;

    private IFXObject obj59;

    private IFXObject obj60;

    private IFXObject obj61;

    private IFXObject obj62;

    private IFXObject obj63;

    private IFXObject obj64;

    private IFXObject obj65;

    private IFXObject obj66;

    private IFXObject obj67;

    private IFXObject obj68;

    private IFXObject obj69;

    private IFXObject obj70;

    private IFXObject obj71;

    private IFXObject obj72;

    private IFXObject obj73;

    private IFXObject obj74;

    private IFXObject obj75;

    private IFXObject obj76;

    private IFXObject obj77;

    private IFXObject obj78;

    private IFXObject obj79;

    private IFXObject obj80;

    private IFXObject obj81;

    private IFXObject obj82;

    private IFXObject obj83;

    private IFXObject obj84;

    private IFXObject obj85;

    private IFXObject obj86;

    private IFXObject obj87;

    private IFXObject obj88;

    private IFXObject obj89;

    private IFXObject obj90;

    private IFXObject obj91;

    private IFXObject obj92;

    private IFXObject obj93;

    private IFXObject obj94;

    private IFXObject obj95;

    private IFXObject obj96;

    private IFXObject obj97;

    private IFXObject obj98;

    private IFXObject obj99;

    private IFXObject obj100;

    private IFXObject obj101;

    private IFXObject obj102;

    private IFXObject obj103;

    private IFXObject obj104;

    private IFXObject obj105;

    private IFXObject obj106;

    private IFXObject obj107;

    private IFXObject obj108;

    private IFXObject obj109;

    private IFXObject obj110;

    private IFXObject obj111;

    private IFXObject obj112;

    private IFXObject obj113;

    private IFXObject obj114;

    private IFXObject obj115;

    private IFXObject obj116;

    private IFXObject obj117;

    private IFXObject obj118;

    private IFXObject obj119;

    private IFXObject obj120;

    private IFXObject obj121;

    private IFXObject obj122;

    private IFXObject obj123;

    private IFXObject obj124;

    private IFXObject obj125;

    private IFXObject obj126;

    private IFXObject obj127;

    private IFXObject obj128;

    private IFXObject obj129;

    private IFXObject obj130;

    private IFXObject obj131;

    private IFXObject obj132;

    private IFXObject obj133;

    private IFXObject obj134;

    private IFXObject obj135;

    private IFXObject obj136;

    private IFXObject obj137;

    private IFXObject obj138;

    private IFXObject obj139;

    private IFXObject obj140;

    private IFXObject obj141;

    private IFXObject obj142;

    private IFXObject obj143;

    private IFXObject obj144;

    private IFXObject obj145;

    private IFXObject obj146;

    private IFXObject obj147;

    private IFXObject obj148;

    private IFXObject obj149;

    private IFXObject obj150;

    private IFXObject obj151;

    private IFXObject obj152;

    private IFXObject obj153;

    private IFXObject obj154;

    private IFXObject obj155;

    private IFXObject obj156;

    private IFXObject obj157;

    private IFXObject obj158;

    private IFXObject obj159;

    private IFXObject obj160;

    private IFXObject obj161;

    private IFXObject obj162;

    private IFXObject obj163;

    private IFXObject obj164;

    private IFXObject obj165;

    private IFXObject obj166;

    private IFXObject obj167;

    private IFXObject obj168;

    private IFXObject obj169;

    private IFXObject obj170;

    private IFXObject obj171;

    private IFXObject obj172;

    private IFXObject obj173;

    private IFXObject obj174;

    private IFXObject obj175;

    private IFXObject obj176;

    private IFXObject obj177;

    private IFXObject obj178;

    private IFXObject obj179;

    private IFXObject obj180;

    private IFXObject obj181;

    private IFXObject obj182;

    private IFXObject obj183;

    private IFXObject obj184;

    private IFXObject obj185;

    private IFXObject obj186;

    private IFXObject obj187;

    private IFXObject obj188;

    private IFXObject obj189;

    private IFXObject obj190;

    private IFXObject obj191;

    private IFXObject obj192;

    private IFXObject obj193;

    private IFXObject obj194;

    private IFXObject obj195;

    private IFXObject obj196;

    private IFXObject obj197;

    private IFXObject obj198;

    private IFXObject obj199;

    private IFXObject obj200;

    private IFXObject obj201;

    private IFXObject obj202;

    private IFXObject obj203;

    private IFXObject obj204;

    private IFXObject obj205;

    private IFXObject obj206;

    private IFXObject obj207;

    private IFXObject obj208;

    private IFXObject obj209;

    private IFXObject obj210;

    private