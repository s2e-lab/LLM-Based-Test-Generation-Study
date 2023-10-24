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

    private final static String DEFAULT_ACCOUNT_FILE = "save/athena.txt";

    private final static int VERSION_LENGTH = 18;

    private final static String DEFAULT_FRIEND_FILE = "save/friends.txt";

    private final static String DEFAULT_HOTKEYS_FILE = "save/hotkeys.txt";

    private String fileDB = CharConfig.getCharConfig().getDbPath() != null ? CharConfig.getCharConfig().getDbPath() : DEFAULT_ACCOUNT_FILE;

    private String friendDB = DEFAULT_FRIEND_FILE;

    private String hotkeyDB = DEFAULT_HOTKEYS_FILE;

    /**
     * Test case for the {@link TXTCharacter#load()} method.
     * It tests the loading of a character with a valid format version.
     *
     * @throws IOException
     */
    @Test
    void testLoad() throws IOException {
        TXTCharacter txtChar = new TXTCharacter();
        IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
        assertEquals(1, indexedChar.size());
        ROCharacter char1 = indexedChar.get(1);
        assertEquals(1, char1.getId());
        assertEquals(JOB.WARRIOR, char1.getJob());
        assertEquals(1, char1.getLevel());
        assertEquals(1, char1.getExp());
        assertEquals(1, char1.getHp());
        assertEquals(1, char1.getMp());
        assertEquals(1, char1.getSp());
        assertEquals(1, char1.getStr());
        assertEquals(1, char1.getAgi());
        assertEquals(1, char1.getVit());
        assertEquals(1, char1.getInt());
        assertEquals(1, char1.getDex());
        assertEquals(1, char1.getLuk());
        assertEquals(1, char1.getHpR());
        assertEquals(1, char1.getMpR());
        assertEquals(1, char1.getSpR());
        assertEquals(1, char1.getStrR());
        assertEquals(1, char1.getAgiR());
        assertEquals(1, char1.getVitR());
        assertEquals(1, char1.getIntR());
        assertEquals(1, char1.getDexR());
        assertEquals(1, char1.getLukR());
        assertEquals(1, char1.getHpS());
        assertEquals(1, char1.getMpS());
        assertEquals(1, char1.getSpS());
        assertEquals(1, char1.getStrS());
        assertEquals(1, char1.getAgiS());
        assertEquals(1, char1.getVitS());
        assertEquals(1, char1.getIntS());
        assertEquals(1, char1.getDexS());
        assertEquals(1, char1.getLukS());
        assertEquals(1, char1.getHpE());
        assertEquals(1, char1.getMpE());
        assertEquals(1, char1.getSpE());
        assertEquals(1, char1.getStrE());
        assertEquals(1, char1.getAgiE());
        assertEquals(1, char1.getVitE());
        assertEquals(1, char1.getIntE());
        assertEquals(1, char1.getDexE());
        assertEquals(1, char1.getLukE());
        assertEquals(1, char1.getHpR());
        assertEquals(1, char1.getMpR());
        assertEquals(1, char1.getSpR());
        assertEquals(1, char1.getStrR());
        assertEquals(1, char1.getAgiR());
        assertEquals(1, char1.getVitR());
        assertEquals(1, char1.getIntR());
        assertEquals(1, char1.getDexR());
        assertEquals(1, char1.getLukR());
        assertEquals(1, char1.getHpS());
        assertEquals(1, char1.getMpS());
        assertEquals(1, char1.getSpS());
        assertEquals(1, char1.getStrS());
        assertEquals(1, char1.getAgiS());
        assertEquals(1, char1.getVitS());
        assertEquals(1, char1.getIntS());
        assertEquals(1, char1.getDexS());
        assertEquals(1, char1.getLukS());
        assertEquals(1, char1.getHpE());
        assertEquals(1, char1.getMpE());
        assertEquals(1, char1.getSpE());
        assertEquals(1, char1.getStrE());
        assertEquals(1, char1.getAgiE());
        assertEquals(1, char1.getVitE());
        assertEquals(1, char1.getIntE());
        assertEquals(1, char1.getDexE());
        assertEquals(1, char1.getLukE());
        assertEquals(1, char1.getHpR());
        assertEquals(1, char1.getMpR());
        assertEquals(1, char1.getSpR());
        assertEquals(1, char1.getStrR());
        assertEquals(1, char1.getAgiR());
        assertEquals(1, char1.getVitR());
        assertEquals(1, char1.getIntR());
        assertEquals(1, char1.getDexR());
        assertEquals(1, char1.getLukR());
        assertEquals(1, char1.getHpS());
        assertEquals(1, char1.getMpS());
        assertEquals(1, char1.getSpS());
        assertEquals(1, char1.getStrS());
        assertEquals(1, char1.getAgiS());
        assertEquals(1, char1.getVitS());
        assertEquals(1, char1.getIntS());
        assertEquals(1, char1.getDexS());
        assertEquals(1, char1.getLukS());
        assertEquals(1, char1.getHpE());
        assertEquals(1, char1.getMpE());
        assertEquals(1, char1.getSpE());
        assertEquals(1, char1.getStrE());
        assertEquals(1, char1.getAgiE());
        assertEquals(1, char1.getVitE());
        assertEquals(1, char1.getIntE());
        assertEquals(1, char1.getDexE());
        assertEquals(1, char1.getLukE());
        assertEquals(1, char1.getHpR());
        assertEquals(1, char1.getMpR());
        assertEquals(1, char1.getSpR());
        assertEquals(1, char1.getStrR());
        assertEquals(1, char1.getAgiR());
        assertEquals(1, char1.getVitR());
        assertEquals(1, char1.getIntR());
        assertEquals(1, char1.getDexR());
        assertEquals(1, char1.getLukR());
        assertEquals(1, char1.getHpS());
        assertEquals(1, char1.getMpS());
        assertEquals(1, char1.getSpS());
        assertEquals(1, char1.getStrS());
        assertEquals(1, char1.getAgiS());
        assertEquals(1, char1.getVitS());
        assertEquals(1, char1.getIntS());
        assertEquals(1, char1.getDexS());
        assertEquals(1, char1.getLukS());
        assertEquals(1, char1.getHpE());
        assertEquals(1, char1.getMpE());
        assertEquals(1, char1.getSpE());
        assertEquals(1, char1.getStrE());
        assertEquals(1, char1.getAgiE());
        assertEquals(1, char1.getVitE());
        assertEquals(1, char1.getIntE());
        assertEquals(1, char1.getDexE());
        assertEquals(1, char1.getLukE());
        assertEquals(1, char1.getHpR());
        assertEquals(1, char1.getMpR());
        assertEquals(1, char1.getSpR());
        assertEquals(1, char1.getStrR());
        assertEquals(1, char1.getAgiR());
        assertEquals(1, char1.getVitR());
        assertEquals(1, char1.getIntR());
        assertEquals(1, char1.getDexR());
        assertEquals(1, char1.getLukR());
        assertEquals(1, char1.getHpS());
        assertEquals(1, char1.getMpS());
        assertEquals(1, char1.getSpS());
        assertEquals(1, char1.getStrS());
        assertEquals(1, char1.getAgiS());
        assertEquals(1, char1.getVitS());
        assertEquals(1, char1.getIntS());
        assertEquals(1, char1.getDexS());
        assertEquals(1, char1.getLukS());
        assertEquals(1, char1.getHpE());
        assertEquals(1, char1.getMpE());
        assertEquals(1, char1.getSpE());
        assertEquals(1, char1.getStrE());
        assertEquals(1, char1.getAgiE());
        assertEquals(1, char1