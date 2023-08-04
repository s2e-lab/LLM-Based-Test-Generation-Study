// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {

    /**
    * Test case of {@link FieldInfo#isValidValue(String)} method.
    */
    @Test
    void testIsValidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue(new ValueInfo("Y"));
        fieldInfo.addValidValue(new ValueInfo("N"));
        fieldInfo.addValidValue(new ValueInfo("A"));
        fieldInfo.addValidValue(new ValueInfo("D"));
        fieldInfo.addValidValue(new ValueInfo("I"));
        fieldInfo.addValidValue(new ValueInfo("R"));
        fieldInfo.addValidValue(new ValueInfo("C"));
        fieldInfo.addValidValue(new ValueInfo("P"));
        fieldInfo.addValidValue(new ValueInfo("S"));
        fieldInfo.addValidValue(new ValueInfo("T"));
        fieldInfo.addValidValue(new ValueInfo("M"));
        fieldInfo.addValidValue(new ValueInfo("L"));
        fieldInfo.addValidValue(new ValueInfo("O"));
        fieldInfo.addValidValue(new ValueInfo("E"));
        fieldInfo.addValidValue(new ValueInfo("U"));
        fieldInfo.addValidValue(new ValueInfo("V"));
        fieldInfo.addValidValue(new ValueInfo("W"));
        fieldInfo.addValidValue(new ValueInfo("X"));
        fieldInfo.addValidValue(new ValueInfo("Z"));
        fieldInfo.addValidValue(new ValueInfo("0"));
        fieldInfo.addValidValue(new ValueInfo("1"));
        fieldInfo.addValidValue(new ValueInfo("2"));
        fieldInfo.addValidValue(new ValueInfo("3"));
        fieldInfo.addValidValue(new ValueInfo("4"));
        fieldInfo.addValidValue(new ValueInfo("5"));
        fieldInfo.addValidValue(new ValueInfo("6"));
        fieldInfo.addValidValue(new ValueInfo("7"));
        fieldInfo.addValidValue(new ValueInfo("8"));
        fieldInfo.addValidValue(new ValueInfo("9"));
        fieldInfo.addValidValue(new ValueInfo("10"));
        fieldInfo.addValidValue(new ValueInfo("11"));
        fieldInfo.addValidValue(new ValueInfo("12"));
        fieldInfo.addValidValue(new ValueInfo("13"));
        fieldInfo.addValidValue(new ValueInfo("14"));
        fieldInfo.addValidValue(new ValueInfo("15"));
        fieldInfo.addValidValue(new ValueInfo("16"));
        fieldInfo.addValidValue(new ValueInfo("17"));
        fieldInfo.addValidValue(new ValueInfo("18"));
        fieldInfo.addValidValue(new ValueInfo("19"));
        fieldInfo.addValidValue(new ValueInfo("20"));
        fieldInfo.addValidValue(new ValueInfo("21"));
        fieldInfo.addValidValue(new ValueInfo("22"));
        fieldInfo.addValidValue(new ValueInfo("23"));
        fieldInfo.addValidValue(new ValueInfo("24"));
        fieldInfo.addValidValue(new ValueInfo("25"));
        fieldInfo.addValidValue(new ValueInfo("26"));
        fieldInfo.addValidValue(new ValueInfo("27"));
        fieldInfo.addValidValue(new ValueInfo("28"));
        fieldInfo.addValidValue(new ValueInfo("29"));
        fieldInfo.addValidValue(new ValueInfo("30"));
        fieldInfo.addValidValue(new ValueInfo("31"));
        fieldInfo.addValidValue(new ValueInfo("32"));
        fieldInfo.addValidValue(new ValueInfo("33"));
        fieldInfo.addValidValue(new ValueInfo("34"));
        fieldInfo.addValidValue(new ValueInfo("35"));
        fieldInfo.addValidValue(new ValueInfo("36"));
        fieldInfo.addValidValue(new ValueInfo("37"));
        fieldInfo.addValidValue(new ValueInfo("38"));
        fieldInfo.addValidValue(new ValueInfo("39"));
        fieldInfo.addValidValue(new ValueInfo("40"));
        fieldInfo.addValidValue(new ValueInfo("41"));
        fieldInfo.addValidValue(new ValueInfo("42"));
        fieldInfo.addValidValue(new ValueInfo("43"));
        fieldInfo.addValidValue(new ValueInfo("44"));
        fieldInfo.addValidValue(new ValueInfo("45"));
        fieldInfo.addValidValue(new ValueInfo("46"));
        fieldInfo.addValidValue(new ValueInfo("47"));
        fieldInfo.addValidValue(new ValueInfo("48"));
        fieldInfo.addValidValue(new ValueInfo("49"));
        fieldInfo.addValidValue(new ValueInfo("50"));
        fieldInfo.addValidValue(new ValueInfo("51"));
        fieldInfo.addValidValue(new ValueInfo("52"));
        fieldInfo.addValidValue(new ValueInfo("53"));
        fieldInfo.addValidValue(new ValueInfo("54"));
        fieldInfo.addValidValue(new ValueInfo("55"));
        fieldInfo.addValidValue(new ValueInfo("56"));
        fieldInfo.addValidValue(new ValueInfo("57"));
        fieldInfo.addValidValue(new ValueInfo("58"));
        fieldInfo.addValidValue(new ValueInfo("59"));
        fieldInfo.addValidValue(new ValueInfo("60"));
        fieldInfo.addValidValue(new ValueInfo("61"));
        fieldInfo.addValidValue(new ValueInfo("62"));
        fieldInfo.addValidValue(new ValueInfo("63"));
        fieldInfo.addValidValue(new ValueInfo("64"));
        fieldInfo.addValidValue(new ValueInfo("65"));
        fieldInfo.addValidValue(new ValueInfo("66"));
        fieldInfo.addValidValue(new ValueInfo("67"));
        fieldInfo.addValidValue(new ValueInfo("68"));
        fieldInfo.addValidValue(new ValueInfo("69"));
        fieldInfo.addValidValue(new ValueInfo("70"));
        fieldInfo.addValidValue(new ValueInfo("71"));
        fieldInfo.addValidValue(new ValueInfo("72"));
        fieldInfo.addValidValue(new ValueInfo("73"));
        fieldInfo.addValidValue(new ValueInfo("74"));
        fieldInfo.addValidValue(new ValueInfo("75"));
        fieldInfo.addValidValue(new ValueInfo("76"));
        fieldInfo.addValidValue(new ValueInfo("77"));
        fieldInfo.addValidValue(new ValueInfo("78"));
        fieldInfo.addValidValue(new ValueInfo("79"));
        fieldInfo.addValidValue(new ValueInfo("80"));
        fieldInfo.addValidValue(new ValueInfo("81"));
        fieldInfo.addValidValue(new ValueInfo("82"));
        fieldInfo.addValidValue(new ValueInfo("83"));
        fieldInfo.addValidValue(new ValueInfo("84"));
        fieldInfo.addValidValue(new ValueInfo("85"));
        fieldInfo.addValidValue(new ValueInfo("86"));
        fieldInfo.addValidValue(new ValueInfo("87"));
        fieldInfo.addValidValue(new ValueInfo("88"));
        fieldInfo.addValidValue(new ValueInfo("89"));
        fieldInfo.addValidValue(new ValueInfo("90"));
        fieldInfo.addValidValue(new ValueInfo("91"));
        fieldInfo.addValidValue(new ValueInfo("92"));
        fieldInfo.addValidValue(new ValueInfo("93"));
        fieldInfo.addValidValue(new ValueInfo("94"));
        fieldInfo.addValidValue(new ValueInfo("95"));
        fieldInfo.addValidValue(new ValueInfo("96"));
        fieldInfo.addValidValue(new ValueInfo("97"));
        fieldInfo.addValidValue(new ValueInfo("98"));
        fieldInfo.addValidValue(new ValueInfo("99"));
        fieldInfo.addValidValue(new ValueInfo("100"));
        fieldInfo.addValidValue(new ValueInfo("101"));
        fieldInfo.addValidValue(new ValueInfo("102"));
        fieldInfo.addValidValue(new ValueInfo("103"));
        fieldInfo.addValidValue(new ValueInfo("104"));
        fieldInfo.addValidValue(new ValueInfo("105"));
        fieldInfo.addValidValue(new ValueInfo("106"));
        fieldInfo.addValidValue(new ValueInfo("107"));
        fieldInfo.addValidValue(new ValueInfo("108"));
        fieldInfo.addValidValue(new ValueInfo("109"));
        fieldInfo.addValidValue(new ValueInfo("110"));
        fieldInfo.addValidValue(new ValueInfo("111"));
        fieldInfo.addValidValue(new ValueInfo