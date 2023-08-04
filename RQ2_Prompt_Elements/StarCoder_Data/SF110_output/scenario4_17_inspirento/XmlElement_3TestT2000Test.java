// XmlElement_3Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {

    /**
    * Test method for {@link XmlElement#addSubElement(String, String)}.
    */
    @Test
    void testAddSubElement() {
        XmlElement xmlElement = new XmlElement("root");
        xmlElement.addSubElement("sub1", "data1");
        xmlElement.addSubElement("sub2", "data2");
        xmlElement.addSubElement("sub3", "data3");
        xmlElement.addSubElement("sub4", "data4");
        xmlElement.addSubElement("sub5", "data5");
        xmlElement.addSubElement("sub6", "data6");
        xmlElement.addSubElement("sub7", "data7");
        xmlElement.addSubElement("sub8", "data8");
        xmlElement.addSubElement("sub9", "data9");
        xmlElement.addSubElement("sub10", "data10");
        xmlElement.addSubElement("sub11", "data11");
        xmlElement.addSubElement("sub12", "data12");
        xmlElement.addSubElement("sub13", "data13");
        xmlElement.addSubElement("sub14", "data14");
        xmlElement.addSubElement("sub15", "data15");
        xmlElement.addSubElement("sub16", "data16");
        xmlElement.addSubElement("sub17", "data17");
        xmlElement.addSubElement("sub18", "data18");
        xmlElement.addSubElement("sub19", "data19");
        xmlElement.addSubElement("sub20", "data20");
        xmlElement.addSubElement("sub21", "data21");
        xmlElement.addSubElement("sub22", "data22");
        xmlElement.addSubElement("sub23", "data23");
        xmlElement.addSubElement("sub24", "data24");
        xmlElement.addSubElement("sub25", "data25");
        xmlElement.addSubElement("sub26", "data26");
        xmlElement.addSubElement("sub27", "data27");
        xmlElement.addSubElement("sub28", "data28");
        xmlElement.addSubElement("sub29", "data29");
        xmlElement.addSubElement("sub30", "data30");
        xmlElement.addSubElement("sub31", "data31");
        xmlElement.addSubElement("sub32", "data32");
        xmlElement.addSubElement("sub33", "data33");
        xmlElement.addSubElement("sub34", "data34");
        xmlElement.addSubElement("sub35", "data35");
        xmlElement.addSubElement("sub36", "data36");
        xmlElement.addSubElement("sub37", "data37");
        xmlElement.addSubElement("sub38", "data38");
        xmlElement.addSubElement("sub39", "data39");
        xmlElement.addSubElement("sub40", "data40");
        xmlElement.addSubElement("sub41", "data41");
        xmlElement.addSubElement("sub42", "data42");
        xmlElement.addSubElement("sub43", "data43");
        xmlElement.addSubElement("sub44", "data44");
        xmlElement.addSubElement("sub45", "data45");
        xmlElement.addSubElement("sub46", "data46");
        xmlElement.addSubElement("sub47", "data47");
        xmlElement.addSubElement("sub48", "data48");
        xmlElement.addSubElement("sub49", "data49");
        xmlElement.addSubElement("sub50", "data50");
        xmlElement.addSubElement("sub51", "data51");
        xmlElement.addSubElement("sub52", "data52");
        xmlElement.addSubElement("sub53", "data53");
        xmlElement.addSubElement("sub54", "data54");
        xmlElement.addSubElement("sub55", "data55");
        xmlElement.addSubElement("sub56", "data56");
        xmlElement.addSubElement("sub57", "data57");
        xmlElement.addSubElement("sub58", "data58");
        xmlElement.addSubElement("sub59", "data59");
        xmlElement.addSubElement("sub60", "data60");
        xmlElement.addSubElement("sub61", "data61");
        xmlElement.addSubElement("sub62", "data62");
        xmlElement.addSubElement("sub63", "data63");
        xmlElement.addSubElement("sub64", "data64");
        xmlElement.addSubElement("sub65", "data65");
        xmlElement.addSubElement("sub66", "data66");
        xmlElement.addSubElement("sub67", "data67");
        xmlElement.addSubElement("sub68", "data68");
        xmlElement.addSubElement("sub69", "data69");
        xmlElement.addSubElement("sub70", "data70");
        xmlElement.addSubElement("sub71", "data71");
        xmlElement.addSubElement("sub72", "data72");
        xmlElement.addSubElement("sub73", "data73");
        xmlElement.addSubElement("sub74", "data74");
        xmlElement.addSubElement("sub75", "data75");
        xmlElement.addSubElement("sub76", "data76");
        xmlElement.addSubElement("sub77", "data77");
        xmlElement.addSubElement("sub78", "data78");
        xmlElement.addSubElement("sub79", "data79");
        xmlElement.addSubElement("sub80", "data80");
        xmlElement.addSubElement("sub81", "data81");
        xmlElement.addSubElement("sub82", "data82");
        xmlElement.addSubElement("sub83", "data83");
        xmlElement.addSubElement("sub84", "data84");
        xmlElement.addSubElement("sub85", "data85");
        xmlElement.addSubElement("sub86", "data86");
        xmlElement.addSubElement("sub87", "data87");
        xmlElement.addSubElement("sub88", "data88");
        xmlElement.addSubElement("sub89", "data89");
        xmlElement.addSubElement("sub90", "data90");
        xmlElement.addSubElement("sub91", "data91");
        xmlElement.addSubElement("sub92", "data92");
        xmlElement.addSubElement("sub93", "data93");
        xmlElement.addSubElement("sub94", "data94");
        xmlElement.addSubElement("sub95", "data95");
        xmlElement.addSubElement("sub96", "data96");
        xmlElement.addSubElement("sub97", "data97");
        xmlElement.addSubElement("sub98", "data98");
        xmlElement.addSubElement("sub99", "data99");
        xmlElement.addSubElement("sub100", "data100");
        xmlElement.addSubElement("sub101", "data101");
        xmlElement.addSubElement("sub102", "data102");
        xmlElement.addSubElement("sub103", "data103");
        xmlElement.addSubElement("sub104", "data104");
        xmlElement.addSubElement("sub105", "data105");
        xmlElement.addSubElement("sub106", "data106");
        xmlElement.addSubElement("sub107", "data107");
        xmlElement.addSubElement("sub108", "data108");
        xmlElement.addSubElement("sub109", "data109");
        xmlElement.addSubElement("sub110", "data110");
        xmlElement.addSubElement("sub111", "data111");
        xmlElement.addSubElement("sub112", "data112");
        xmlElement.addSubElement("sub113", "data113");
        xmlElement.addSubElement("sub114", "data114");
        xmlElement.addSubElement("sub115", "data115");
        xmlElement.addSubElement("sub116", "data116");
        xmlElement.addSubElement("sub117", "data117");
        xmlElement.addSubElement("sub118", "data118");
        xmlElement.addSubElement("sub119", "data119");
        xmlElement.addSubElement("sub120", "data120");
        xmlElement.addSubElement("sub121", "