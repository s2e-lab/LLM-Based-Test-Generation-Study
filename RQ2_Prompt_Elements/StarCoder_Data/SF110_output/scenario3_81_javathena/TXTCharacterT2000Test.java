// TXTCharacterTest.java
package org.character.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.character.data.config.CharConfig;
import org.javathena.core.data.Friend;
import org.javathena.core.data.Hotkey;
import org.javathena.core.data.IndexedFastMap;
import org.javathena.core.data.Item;
import org.javathena.core.data.PersistenteData;
import org.javathena.core.data.Point;
import org.javathena.core.data.ROCharacter;
import org.javathena.core.data.Skill;
import org.javathena.core.data.ROCharacter.JOB;
import org.javathena.core.utiles.Functions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TXTCharacter}.
* It contains ten unit test cases for the {@link TXTCharacter#load()} method.
*/
class TXTCharacterTest {

    /**
     * Test of load method, of class TXTCharacter.
     * @throws java.io.IOException
     */
    @Test
    void testLoad() throws IOException {
        System.out.println("load");
        TXTCharacter instance = new TXTCharacter();
        IndexedFastMap<Integer, ROCharacter> indexedChar = instance.load();
        assertEquals(indexedChar.size(), 10);
        for (int i = 0; i < indexedChar.size(); i++) {
            ROCharacter c = indexedChar.get(i);
            assertEquals(c.getJob(), JOB.WARRIOR);
            assertEquals(c.getLevel(), 10);
            assertEquals(c.getExp(), 100000000);
            assertEquals(c.getHp(), 100000000);
            assertEquals(c.getMp(), 100000000);
            assertEquals(c.getSp(), 100000000);
            assertEquals(c.getStr(), 100000000);
            assertEquals(c.getAgi(), 100000000);
            assertEquals(c.getVit(), 100000000);
            assertEquals(c.getInt(), 100000000);
            assertEquals(c.getDex(), 100000000);
            assertEquals(c.getLuk(), 100000000);
            assertEquals(c.getHpR(), 100000000);
            assertEquals(c.getMpR(), 100000000);
            assertEquals(c.getSpR(), 100000000);
            assertEquals(c.getStrR(), 100000000);
            assertEquals(c.getAgiR(), 100000000);
            assertEquals(c.getVitR(), 100000000);
            assertEquals(c.getIntR(), 100000000);
            assertEquals(c.getDexR(), 100000000);
            assertEquals(c.getLukR(), 100000000);
            assertEquals(c.getHpS(), 100000000);
            assertEquals(c.getMpS(), 100000000);
            assertEquals(c.getSpS(), 100000000);
            assertEquals(c.getStrS(), 100000000);
            assertEquals(c.getAgiS(), 100000000);
            assertEquals(c.getVitS(), 100000000);
            assertEquals(c.getIntS(), 100000000);
            assertEquals(c.getDexS(), 100000000);
            assertEquals(c.getLukS(), 100000000);
            assertEquals(c.getHpT(), 100000000);
            assertEquals(c.getMpT(), 100000000);
            assertEquals(c.getSpT(), 100000000);
            assertEquals(c.getStrT(), 100000000);
            assertEquals(c.getAgiT(), 100000000);
            assertEquals(c.getVitT(), 100000000);
            assertEquals(c.getIntT(), 100000000);
            assertEquals(c.getDexT(), 100000000);
            assertEquals(c.getLukT(), 100000000);
            assertEquals(c.getHpE(), 100000000);
            assertEquals(c.getMpE(), 100000000);
            assertEquals(c.getSpE(), 100000000);
            assertEquals(c.getStrE(), 100000000);
            assertEquals(c.getAgiE(), 100000000);
            assertEquals(c.getVitE(), 100000000);
            assertEquals(c.getIntE(), 100000000);
            assertEquals(c.getDexE(), 100000000);
            assertEquals(c.getLukE(), 100000000);
            assertEquals(c.getHpR(), 100000000);
            assertEquals(c.getMpR(), 100000000);
            assertEquals(c.getSpR(), 100000000);
            assertEquals(c.getStrR(), 100000000);
            assertEquals(c.getAgiR(), 100000000);
            assertEquals(c.getVitR(), 100000000);
            assertEquals(c.getIntR(), 100000000);
            assertEquals(c.getDexR(), 100000000);
            assertEquals(c.getLukR(), 100000000);
            assertEquals(c.getHpS(), 100000000);
            assertEquals(c.getMpS(), 100000000);
            assertEquals(c.getSpS(), 100000000);
            assertEquals(c.getStrS(), 100000000);
            assertEquals(c.getAgiS(), 100000000);
            assertEquals(c.getVitS(), 100000000);
            assertEquals(c.getIntS(), 100000000);
            assertEquals(c.getDexS(), 100000000);
            assertEquals(c.getLukS(), 100000000);
            assertEquals(c.getHpT(), 100000000);
            assertEquals(c.getMpT(), 100000000);
            assertEquals(c.getSpT(), 100000000);
            assertEquals(c.getStrT(), 100000000);
            assertEquals(c.getAgiT(), 100000000);
            assertEquals(c.getVitT(), 100000000);
            assertEquals(c.getIntT(), 100000000);
            assertEquals(c.getDexT(), 100000000);
            assertEquals(c.getLukT(), 100000000);
            assertEquals(c.getHpE(), 100000000);
            assertEquals(c.getMpE(), 100000000);
            assertEquals(c.getSpE(), 100000000);
            assertEquals(c.getStrE(), 100000000);
            assertEquals(c.getAgiE(), 100000000);
            assertEquals(c.getVitE(), 100000000);
            assertEquals(c.getIntE(), 100000000);
            assertEquals(c.getDexE(), 100000000);
            assertEquals(c.getLukE(), 100000000);
            assertEquals(c.getHpR(), 100000000);
            assertEquals(c.getMpR(), 100000000);
            assertEquals(c.getSpR(), 100000000);
            assertEquals(c.getStrR(), 100000000);
            assertEquals(c.getAgiR(), 100000000);
            assertEquals(c.getVitR(), 100000000);
            assertEquals(c.getIntR(), 100000000);
            assertEquals(c.getDexR(), 100000000);
            assertEquals(c.getLukR(), 100000000);
            assertEquals(c.getHpS(), 100000000);
            assertEquals(c.getMpS(), 1