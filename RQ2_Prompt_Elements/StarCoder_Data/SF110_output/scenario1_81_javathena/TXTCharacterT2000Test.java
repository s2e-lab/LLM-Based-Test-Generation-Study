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

    @Test
    void testLoad() throws IOException {
        TXTCharacter txtChar = new TXTCharacter();
        IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
        assertEquals(indexedChar.size(), 10);
        assertEquals(indexedChar.get(1).getChar_id(), 1);
        assertEquals(indexedChar.get(1).getName(), "Test");
        assertEquals(indexedChar.get(1).getJob(), JOB.WARRIOR);
        assertEquals(indexedChar.get(1).getLevel(), 1);
        assertEquals(indexedChar.get(1).getExp(), 0);
        assertEquals(indexedChar.get(1).getHp(), 100);
        assertEquals(indexedChar.get(1).getMp(), 100);
        assertEquals(indexedChar.get(1).getSp(), 100);
        assertEquals(indexedChar.get(1).getStr(), 10);
        assertEquals(indexedChar.get(1).getDex(), 10);
        assertEquals(indexedChar.get(1).getVit(), 10);
        assertEquals(indexedChar.get(1).getInt(), 10);
        assertEquals(indexedChar.get(1).getWis(), 10);
        assertEquals(indexedChar.get(1).getCon(), 10);
        assertEquals(indexedChar.get(1).getCha(), 10);
        assertEquals(indexedChar.get(1).getAp(), 10);
        assertEquals(indexedChar.get(1).getSpd(), 10);
        assertEquals(indexedChar.get(1).getLuk(), 10);
        assertEquals(indexedChar.get(1).getHp_regen(), 10);
        assertEquals(indexedChar.get(1).getMp_regen(), 10);
        assertEquals(indexedChar.get(1).getSp_regen(), 10);
        assertEquals(indexedChar.get(1).getStr_regen(), 10);
        assertEquals(indexedChar.get(1).getDex_regen(), 10);
        assertEquals(indexedChar.get(1).getVit_regen(), 10);
        assertEquals(indexedChar.get(1).getInt_regen(), 10);
        assertEquals(indexedChar.get(1).getWis_regen(), 10);
        assertEquals(indexedChar.get(1).getCon_regen(), 10);
        assertEquals(indexedChar.get(1).getCha_regen(), 10);
        assertEquals(indexedChar.get(1).getAp_regen(), 10);
        assertEquals(indexedChar.get(1).getSpd_regen(), 10);
        assertEquals(indexedChar.get(1).getLuk_regen(), 10);
        assertEquals(indexedChar.get(1).getHp_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getMp_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getSp_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getStr_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getDex_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getVit_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getInt_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getWis_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getCon_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getCha_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getAp_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getSpd_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getLuk_regen_rate(), 10);
        assertEquals(indexedChar.get(1).getHp_regen_max(), 10);
        assertEquals(indexedChar.get(1).getMp_regen_max(), 10);
        assertEquals(indexedChar.get(1).getSp_regen_max(), 10);
        assertEquals(indexedChar.get(1).getStr_regen_max(), 10);
        assertEquals(indexedChar.get(1).getDex_regen_max(), 10);
        assertEquals(indexedChar.get(1).getVit_regen_max(), 10);
        assertEquals(indexedChar.get(1).getInt_regen_max(), 10);
        assertEquals(indexedChar.get(1).getWis_regen_max(), 10);
        assertEquals(indexedChar.get(1).getCon_regen_max(), 10);
        assertEquals(indexedChar.get(1).getCha_regen_max(), 10);
        assertEquals(indexedChar.get(1).getAp_regen_max(), 10);
        assertEquals(indexedChar.get(1).getSpd_regen_max(), 10);
        assertEquals(indexedChar.get(1).getLuk_regen_max(), 10);
        assertEquals(indexedChar.get(1).getHp_regen_min(), 10);
        assertEquals(indexedChar.get(1).getMp_regen_min(), 10);
        assertEquals(indexedChar.get(1).getSp_regen_min(), 10);
        assertEquals(indexedChar.get(1).getStr_regen_min(), 10);
        assertEquals(indexedChar.get(1).getDex_regen_min(), 10);
        assertEquals(indexedChar.get(1).getVit_regen_min(), 10);
        assertEquals(indexedChar.get(1).getInt_regen_min(), 10);
        assertEquals(indexedChar.get(1).getWis_regen_min(), 10);
        assertEquals(indexedChar.get(1).getCon_regen_min(), 10);
        assertEquals(indexedChar.get(1).getCha_regen_min(), 10);
        assertEquals(indexedChar.get(1).getAp_regen_min(), 10);
        assertEquals(indexedChar.get(1).getSpd_regen_min(), 10);
        assertEquals(indexedChar.get(1).getLuk_regen_min(), 10);
        assertEquals(indexedChar.get(1).getHp_regen_base(), 10);
        assertEquals(indexedChar.get(1).getMp_regen_base(), 10);
        assertEquals(indexedChar.get(1).getSp_regen_base(), 10);
        assertEquals(indexedChar.get(1).getStr_regen_base(), 10);
        assertEquals(indexedChar.get(1).getDex_regen_base(), 10);
        assertEquals(indexedChar.get(1).getVit_regen_base(), 10);
        assertEquals(indexedChar.get(1).getInt_regen_base(), 10);
        assertEquals(indexedChar.get(1).getWis_regen_base(), 10);
        assertEquals(indexedChar.get(1).getCon_regen_base(), 10);
        assertEquals(indexedChar.get(1).getCha_regen_base(), 10);
        assertEquals(indexedChar.get(1).getAp_regen_base(), 10);
        assertEquals(indexedChar.get(1).getSpd_regen_base(), 10);
        assertEquals(indexedChar.get(1).getLuk_regen_base(), 10);
        assertEquals(indexedChar.get(1).getHp_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getMp_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getSp_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getStr_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getDex_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getVit_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getInt_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getWis_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getCon_regen_bonus(), 10);
        assertEquals(indexedChar.get(1).getCh