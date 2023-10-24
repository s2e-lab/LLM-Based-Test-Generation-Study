// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {

    /**
    * Test method for {@link DictionaryInfo#getComponent(String)}.
    */
    @Test
    void testGetComponent() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("FIXT.1.1");
        dictionaryInfo.addComponent(new ComponentInfo(1, "StandardHeader"));
        dictionaryInfo.addComponent(new ComponentInfo(2, "StandardTrailer"));
        dictionaryInfo.addComponent(new ComponentInfo(3, "Instrument"));
        dictionaryInfo.addComponent(new ComponentInfo(4, "InstrumentExtension"));
        dictionaryInfo.addComponent(new ComponentInfo(5, "InstrumentParties"));
        dictionaryInfo.addComponent(new ComponentInfo(6, "InstrumentPtysSubGrp"));
        dictionaryInfo.addComponent(new ComponentInfo(7, "InstrumentPartiesSubGrp"));
        dictionaryInfo.addComponent(new ComponentInfo(8, "InstrumentLeg"));
        dictionaryInfo.addComponent(new ComponentInfo(9, "InstrumentLegExtension"));
        dictionaryInfo.addComponent(new ComponentInfo(10, "InstrumentLegGrp"));
        dictionaryInfo.addComponent(new ComponentInfo(11, "InstrumentLegGrpExtension"));
        dictionaryInfo.addComponent(new ComponentInfo(12, "InstrumentLegGrpParties"));
        dictionaryInfo.addComponent(new ComponentInfo(13, "InstrumentLegGrpPartiesSubGrp"));
        dictionaryInfo.addComponent(new ComponentInfo(14, "InstrumentLegGrpSubGrp"));
        dictionaryInfo.addComponent(new ComponentInfo(15, "InstrumentLegGrpSubGrp2"));
        dictionaryInfo.addComponent(new ComponentInfo(16, "InstrumentLegGrpSubGrp3"));
        dictionaryInfo.addComponent(new ComponentInfo(17, "InstrumentLegGrpSubGrp4"));
        dictionaryInfo.addComponent(new ComponentInfo(18, "InstrumentLegGrpSubGrp5"));
        dictionaryInfo.addComponent(new ComponentInfo(19, "InstrumentLegGrpSubGrp6"));
        dictionaryInfo.addComponent(new ComponentInfo(20, "InstrumentLegGrpSubGrp7"));
        dictionaryInfo.addComponent(new ComponentInfo(21, "InstrumentLegGrpSubGrp8"));
        dictionaryInfo.addComponent(new ComponentInfo(22, "InstrumentLegGrpSubGrp9"));
        dictionaryInfo.addComponent(new ComponentInfo(23, "InstrumentLegGrpSubGrp10"));
        dictionaryInfo.addComponent(new ComponentInfo(24, "InstrumentLegGrpSubGrp11"));
        dictionaryInfo.addComponent(new ComponentInfo(25, "InstrumentLegGrpSubGrp12"));
        dictionaryInfo.addComponent(new ComponentInfo(26, "InstrumentLegGrpSubGrp13"));
        dictionaryInfo.addComponent(new ComponentInfo(27, "InstrumentLegGrpSubGrp14"));
        dictionaryInfo.addComponent(new ComponentInfo(28, "InstrumentLegGrpSubGrp15"));
        dictionaryInfo.addComponent(new ComponentInfo(29, "InstrumentLegGrpSubGrp16"));
        dictionaryInfo.addComponent(new ComponentInfo(30, "InstrumentLegGrpSubGrp17"));
        dictionaryInfo.addComponent(new ComponentInfo(31, "InstrumentLegGrpSubGrp18"));
        dictionaryInfo.addComponent(new ComponentInfo(32, "InstrumentLegGrpSubGrp19"));
        dictionaryInfo.addComponent(new ComponentInfo(33, "InstrumentLegGrpSubGrp20"));
        dictionaryInfo.addComponent(new ComponentInfo(34, "InstrumentLegGrpSubGrp21"));
        dictionaryInfo.addComponent(new ComponentInfo(35, "InstrumentLegGrpSubGrp22"));
        dictionaryInfo.addComponent(new ComponentInfo(36, "InstrumentLegGrpSubGrp23"));
        dictionaryInfo.addComponent(new ComponentInfo(37, "InstrumentLegGrpSubGrp24"));
        dictionaryInfo.addComponent(new ComponentInfo(38, "InstrumentLegGrpSubGrp25"));
        dictionaryInfo.addComponent(new ComponentInfo(39, "InstrumentLegGrpSubGrp26"));
        dictionaryInfo.addComponent(new ComponentInfo(40, "InstrumentLegGrpSubGrp27"));
        dictionaryInfo.addComponent(new ComponentInfo(41, "InstrumentLegGrpSubGrp28"));
        dictionaryInfo.addComponent(new ComponentInfo(42, "InstrumentLegGrpSubGrp29"));
        dictionaryInfo.addComponent(new ComponentInfo(43, "InstrumentLegGrpSubGrp30"));
        dictionaryInfo.addComponent(new ComponentInfo(44, "InstrumentLegGrpSubGrp31"));
        dictionaryInfo.addComponent(new ComponentInfo(45, "InstrumentLegGrpSubGrp32"));
        dictionaryInfo.addComponent(new ComponentInfo(46, "InstrumentLegGrpSubGrp33"));
        dictionaryInfo.addComponent(new ComponentInfo(47, "InstrumentLegGrpSubGrp34"));
        dictionaryInfo.addComponent(new ComponentInfo(48, "InstrumentLegGrpSubGrp35"));
        dictionaryInfo.addComponent(new ComponentInfo(49, "InstrumentLegGrpSubGrp36"));
        dictionaryInfo.addComponent(new ComponentInfo(50, "InstrumentLegGrpSubGrp37"));
        dictionaryInfo.addComponent(new ComponentInfo(51, "InstrumentLegGrpSubGrp38"));
        dictionaryInfo.addComponent(new ComponentInfo(52, "InstrumentLegGrpSubGrp39"));
        dictionaryInfo.addComponent(new ComponentInfo(53, "InstrumentLegGrpSubGrp40"));
        dictionaryInfo.addComponent(new ComponentInfo(54, "InstrumentLegGrpSubGrp41"));
        dictionaryInfo.addComponent(new ComponentInfo(55, "InstrumentLegGrpSubGrp42"));
        dictionaryInfo.addComponent(new ComponentInfo(56, "InstrumentLegGrpSubGrp43"));
        dictionaryInfo.addComponent(new ComponentInfo(57, "InstrumentLegGrpSubGrp44"));
        dictionaryInfo.addComponent(new ComponentInfo(58, "InstrumentLegGrpSubGrp45"));
        dictionaryInfo.addComponent(new ComponentInfo(59, "InstrumentLegGrpSubGrp46"));
        dictionaryInfo.addComponent(new ComponentInfo(60, "InstrumentLegGrpSubGrp47"));
        dictionaryInfo.addComponent(new ComponentInfo(61, "InstrumentLegGrpSubGrp48"));
        dictionaryInfo.addComponent(new ComponentInfo(62, "InstrumentLegGrpSubGrp49"));
        dictionaryInfo.addComponent(new ComponentInfo(63, "InstrumentLegGrpSubGrp50"));
        dictionaryInfo.addComponent(new ComponentInfo(64, "InstrumentLegGrpSubGrp51"));
        dictionaryInfo.addComponent(new ComponentInfo(65, "InstrumentLegGrpSubGrp52"));
        dictionaryInfo.addComponent(new ComponentInfo(66, "InstrumentLegGrpSubGrp53"));
        dictionaryInfo.addComponent(new ComponentInfo(67, "InstrumentLegGrpSubGrp54"));
        dictionaryInfo.addComponent(new ComponentInfo(68, "InstrumentLegGrpSubGrp55"));
        dictionaryInfo.addComponent(new ComponentInfo(69, "InstrumentLegGrpSubGrp56"));
        dictionaryInfo.addComponent(new ComponentInfo(70, "InstrumentLegGrpSubGrp57"));
        dictionaryInfo.addComponent(new ComponentInfo(71, "InstrumentLegGrpSubGrp58"));
        dictionaryInfo.addComponent(new ComponentInfo(72, "InstrumentLegGrpSubGrp59"));
        dictionaryInfo.addComponent(new ComponentInfo(73, "InstrumentLegGrpSubGrp60"));
        dictionaryInfo.addComponent(new ComponentInfo(74, "InstrumentLegGrpSubGrp61"));
        dictionaryInfo.addComponent(new ComponentInfo(75, "InstrumentLegGrpSubGrp62"));
        dictionaryInfo.addComponent(new ComponentInfo(76, "InstrumentLegGrpSubGrp63"));
        dictionaryInfo.addComponent(new ComponentInfo(77, "InstrumentLegGrpSubGrp64"));
        dictionaryInfo.addComponent(new ComponentInfo(78, "InstrumentLegGrpSubGrp65"));
        dictionaryInfo.addComponent(new ComponentInfo(79, "InstrumentLegGrpSubGrp66"));
        dictionaryInfo.addComponent(new ComponentInfo(80, "InstrumentLegGrpSubGrp67"));
        dictionaryInfo.addComponent(new ComponentInfo(81, "InstrumentLegGrpSubGrp68"));
        dictionaryInfo.addComponent(new ComponentInfo(82, "InstrumentLegGrpSubGrp69"));
        dictionaryInfo.addComponent(new ComponentInfo(83, "InstrumentLegGrpSubGrp70"));
        dictionaryInfo.addComponent(new ComponentInfo(84, "InstrumentLegGrpSubGrp71"));
        dictionaryInfo.addComponent(new ComponentInfo(85, "InstrumentLegGrpSubGrp72"));
        dictionaryInfo.addComponent(new ComponentInfo(86, "InstrumentLegGrpSubGrp73"));
        dictionaryInfo.addComponent(new ComponentInfo(87, "InstrumentLegGrpSubGrp74"));
        dictionaryInfo.addComponent(new ComponentInfo(88, "InstrumentLegGrpSubGrp75"));
        dictionaryInfo.addComponent(new ComponentInfo(89, "InstrumentLegGrpSubGrp76"));
        dictionaryInfo.addComponent(new ComponentInfo(90, "InstrumentLegGrpSubGrp77"));
        dictionaryInfo.addComponent(new ComponentInfo(91, "InstrumentLegGrpSubGrp78"));
        dictionaryInfo.addComponent(new ComponentInfo(92, "InstrumentLegGrpSub