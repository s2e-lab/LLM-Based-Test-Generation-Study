// XmlElement_9Test.java
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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String)} method.
*/
class XmlElement_9Test {

    /**
    * Test method for {@link XmlElement#addSubElement(String)}.
    */
    @Test
    void testAddSubElement() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = root.addSubElement("child1");
        XmlElement child2 = root.addSubElement("child2");
        XmlElement child3 = root.addSubElement("child3");
        XmlElement child4 = child3.addSubElement("child4");
        XmlElement child5 = child3.addSubElement("child5");
        XmlElement child6 = child3.addSubElement("child6");
        XmlElement child7 = child6.addSubElement("child7");
        XmlElement child8 = child6.addSubElement("child8");
        XmlElement child9 = child6.addSubElement("child9");
        XmlElement child10 = child9.addSubElement("child10");
        XmlElement child11 = child9.addSubElement("child11");
        XmlElement child12 = child9.addSubElement("child12");
        XmlElement child13 = child12.addSubElement("child13");
        XmlElement child14 = child12.addSubElement("child14");
        XmlElement child15 = child12.addSubElement("child15");
        XmlElement child16 = child15.addSubElement("child16");
        XmlElement child17 = child15.addSubElement("child17");
        XmlElement child18 = child15.addSubElement("child18");
        XmlElement child19 = child18.addSubElement("child19");
        XmlElement child20 = child18.addSubElement("child20");
        XmlElement child21 = child18.addSubElement("child21");
        XmlElement child22 = child21.addSubElement("child22");
        XmlElement child23 = child21.addSubElement("child23");
        XmlElement child24 = child21.addSubElement("child24");
        XmlElement child25 = child24.addSubElement("child25");
        XmlElement child26 = child24.addSubElement("child26");
        XmlElement child27 = child24.addSubElement("child27");
        XmlElement child28 = child27.addSubElement("child28");
        XmlElement child29 = child27.addSubElement("child29");
        XmlElement child30 = child27.addSubElement("child30");
        XmlElement child31 = child30.addSubElement("child31");
        XmlElement child32 = child30.addSubElement("child32");
        XmlElement child33 = child30.addSubElement("child33");
        XmlElement child34 = child33.addSubElement("child34");
        XmlElement child35 = child33.addSubElement("child35");
        XmlElement child36 = child33.addSubElement("child36");
        XmlElement child37 = child36.addSubElement("child37");
        XmlElement child38 = child36.addSubElement("child38");
        XmlElement child39 = child36.addSubElement("child39");
        XmlElement child40 = child39.addSubElement("child40");
        XmlElement child41 = child39.addSubElement("child41");
        XmlElement child42 = child39.addSubElement("child42");
        XmlElement child43 = child42.addSubElement("child43");
        XmlElement child44 = child42.addSubElement("child44");
        XmlElement child45 = child42.addSubElement("child45");
        XmlElement child46 = child45.addSubElement("child46");
        XmlElement child47 = child45.addSubElement("child47");
        XmlElement child48 = child45.addSubElement("child48");
        XmlElement child49 = child48.addSubElement("child49");
        XmlElement child50 = child48.addSubElement("child50");
        XmlElement child51 = child48.addSubElement("child51");
        XmlElement child52 = child51.addSubElement("child52");
        XmlElement child53 = child51.addSubElement("child53");
        XmlElement child54 = child51.addSubElement("child54");
        XmlElement child55 = child54.addSubElement("child55");
        XmlElement child56 = child54.addSubElement("child56");
        XmlElement child57 = child54.addSubElement("child57");
        XmlElement child58 = child57.addSubElement("child58");
        XmlElement child59 = child57.addSubElement("child59");
        XmlElement child60 = child57.addSubElement("child60");
        XmlElement child61 = child60.addSubElement("child61");
        XmlElement child62 = child60.addSubElement("child62");
        XmlElement child63 = child60.addSubElement("child63");
        XmlElement child64 = child63.addSubElement("child64");
        XmlElement child65 = child63.addSubElement("child65");
        XmlElement child66 = child63.addSubElement("child66");
        XmlElement child67 = child66.addSubElement("child67");
        XmlElement child68 = child66.addSubElement("child68");
        XmlElement child69 = child66.addSubElement("child69");
        XmlElement child70 = child69.addSubElement("child70");
        XmlElement child71 = child69.addSubElement("child71");
        XmlElement child72 = child69.addSubElement("child72");
        XmlElement child73 = child72.addSubElement("child73");
        XmlElement child74 = child72.addSubElement("child74");
        XmlElement child75 = child72.addSubElement("child75");
        XmlElement child76 = child75.addSubElement("child76");
        XmlElement child77 = child75.addSubElement("child77");
        XmlElement child78 = child75.addSubElement("child78");
        XmlElement child79 = child78.addSubElement("child79");
        XmlElement child80 = child78.addSubElement("child80");
        XmlElement child81 = child78.addSubElement("child81");
        XmlElement child82 = child81.addSubElement("child82");
        XmlElement child83 = child81.addSubElement("child83");
        XmlElement child84 = child81.addSubElement("child84");
        XmlElement child85 = child84.addSubElement("child85");
        XmlElement child86 = child84.addSubElement("child86");
        XmlElement child87 = child84.addSubElement("child87");
        XmlElement child88 = child87.addSubElement("child88");
        XmlElement child89 = child87.addSubElement("child89");
        XmlElement child90 = child87.addSubElement("child90");
        XmlElement child91 = child90.addSubElement("child91");
        XmlElement child92 = child90.addSubElement("child92");
        XmlElement child93 = child90.addSubElement("child93");
        XmlElement child94 = child93.addSubElement("child94");
        XmlElement child95 = child93.addSubElement("child95");
        XmlElement child96 = child93.addSubElement("child96");
        XmlElement child97 = child96.addSubElement("child97");
        XmlElement child98 = child96.addSubElement("child98");
        XmlElement child99 = child96.addSubElement("child99");
        XmlElement child100 = child99.addSubElement("child100");
        XmlElement child101 = child99.addSubElement("child101");
        XmlElement child102 = child99.addSubElement("child102");
        XmlElement child103 = child102.addSubElement("child103");
        XmlElement child104 = child102.addSubElement("child104");
        XmlElement child105 = child102.addSubElement("child105");
        XmlElement child106 = child105.addSubElement("child106");
        XmlElement child107 = child105.addSubElement("child107");
        XmlElement child108 = child105.addSubElement("child108");
        XmlElement child109 = child108.addSubElement("child109");
        XmlElement child