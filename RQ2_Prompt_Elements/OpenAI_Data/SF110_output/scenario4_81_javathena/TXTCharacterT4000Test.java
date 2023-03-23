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
	* Test case 1.
	* Test the {@link TXTCharacter#load()} method with a valid file.
	* The file contains one character.
	* The expected result is a {@link IndexedFastMap} containing one {@link ROCharacter}.
	*/
	@Test
	void testLoad_1() {
		try {
			TXTCharacter txtCharacter = new TXTCharacter();
			txtCharacter.fileDB = "test/test_1.txt";
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtCharacter.load();
			assertEquals(1, indexedChar.size());
			ROCharacter character = indexedChar.get(1);
			assertEquals(1, character.getId());
			assertEquals("test", character.getName());
			assertEquals(JOB.NOVICE, character.getJob());
			assertEquals(1, character.getBaseLevel());
			assertEquals(1, character.getJobLevel());
			assertEquals(0, character.getBaseExp());
			assertEquals(0, character.getJobExp());
			assertEquals(0, character.getZeny());
			assertEquals(0, character.getStr());
			assertEquals(0, character.getAgi());
			assertEquals(0, character.getVit());
			assertEquals(0, character.getInt());
			assertEquals(0, character.getDex());
			assertEquals(0, character.getLuk());
			assertEquals(0, character.getMaxHp());
			assertEquals(0, character.getMaxSp());
			assertEquals(0, character.getHp());
			assertEquals(0, character.getSp());
			assertEquals(0, character.getStatusPoints());
			assertEquals(0, character.getSkillPoints());
			assertEquals(0, character.getOption());
			assertEquals(0, character.getKarma());
			assertEquals(0, character.getManner());
			assertEquals(0, character.getPartyId());
			assertEquals(0, character.getGuildId());
			assertEquals(0, character.getPetId());
			assertEquals(0, character.getHair());
			assertEquals(0, character.getHairColor());
			assertEquals(0, character.getClothesColor());
			assertEquals(0, character.getWeapon());
			assertEquals(0, character.getShield());
			assertEquals(0, character.getHeadBottom());
			assertEquals(0, character.getHeadTop());
			assertEquals(0, character.getHeadMid());
			assertEquals(0, character.getHairStyle());
			assertEquals(0, character.getClothesStyle());
			assertEquals(0, character.getRobe());
			assertEquals(0, character.getLastMap());
			assertEquals(0, character.getLastX());
			assertEquals(0, character.getLastY());
			assertEquals(0, character.getSaveMap());
			assertEquals(0, character.getSaveX());
			assertEquals(0, character.getSaveY());
			assertEquals(0, character.getPartnerId());
			assertEquals(0, character.getOnline());
			assertEquals(0, character.getFather());
			assertEquals(0, character.getMother());
			assertEquals(0, character.getChild());
			assertEquals(0, character.getFame());
			assertEquals(0, character.getUnbanTime());
			assertEquals(0, character.getFont());
			assertEquals(0, character.getUniqueId());
			assertEquals(0, character.getHotkeyRowshift());
			assertEquals(0, character.getClanId());
			assertEquals(0, character.getDeleted());
			assertEquals(0, character.getShowEquip());
			assertEquals(0, character.getMuteTime());
			assertEquals(0, character.getElementalLevel());
			assertEquals(0, character.getElementalExp());
			assertEquals(0, character.getElementalHp());
			assertEquals(0, character.getElementalMaxHp());
			assertEquals(0, character.getElementalSp());
			assertEquals(0, character.getElementalMaxSp());
			assertEquals(0, character.getElementalAtk());
			assertEquals(0, character.getElementalMatk());
			assertEquals(0, character.getElementalHit());
			assertEquals(0, character.getElementalFlee());
			assertEquals(0, character.getElementalDef());
			assertEquals(0, character.getElementalMdef());
			assertEquals(0, character.getElementalAspd());
			assertEquals(0, character.getElementalAmotion());
			assertEquals(0, character.getElementalMode());
			assertEquals(0, character.getElementalHpRate());
			assertEquals(0, character.getElementalSpRate());
			assertEquals(0, character.getElementalDefRate());
			assertEquals(0, character.getElementalAtkRate());
			assertEquals(0, character.getElementalMatkRate());
			assertEquals(0, character.getElementalSize());
			assertEquals(0, character.getElementalRace());
			assertEquals(0, character.getElementalElement());
			assertEquals(0, character.getElementalHpVal());
			assertEquals(0, character.getElementalSpVal());
			assertEquals(0, character.getElementalDefVal());
			assertEquals(0, character.getElementalAtkVal());
			assertEquals(0, character.getElementalMatkVal());
			assertEquals(0, character.getElementalHitVal());
			assertEquals(0, character.getElementalFleeVal());
			assertEquals(0, character.getElementalDef2Val());
			assertEquals(0, character.getElementalMdef2Val());
			assertEquals(0, character.getElementalCriticalVal());
			assertEquals(0, character.getElementalAtk2Val());
			assertEquals(0, character.getElementalMatk2Val());
			assertEquals(0, character.getElementalSpeedVal());
			assertEquals(0, character.getElementalAdelayVal());
			assertEquals(0, character.getElementalAmotionVal());
			assertEquals(0, character.getElementalBlv());
			assertEquals(0, character.getElementalJlvl());
			assertEquals(0, character.getElementalLvl());
			assertEquals(0, character.getElementalSkill());
			assertEquals(0, character.getElementalHpRateVal());
			assertEquals(0, character.getElementalSpRateVal());
			assertEquals(0, character.getElementalDefRateVal());
			assertEquals(0, character.getElementalAtkRateVal());
			assertEquals(0, character.getElementalMatkRateVal());
			assertEquals(0, character.getElementalSizeRateVal());
			assertEquals(0, character.getElementalRaceRateVal());
			assertEquals(0, character.getElementalElementRateVal());
			assertEquals(0, character.getElementalMode());
			assertEquals(0, character.getElementalHpRate());
			assertEquals(0, character.getElementalSpRate());
			assertEquals(0, character.getElementalDefRate());
			assertEquals(0, character.getElementalAtkRate());
			assertEquals(0, character.getElementalMatkRate());
			assertEquals(0, character.getElementalSize());
			assertEquals(0, character.getElementalRace());
			assertEquals(0, character.getElementalElement());
			assertEquals(0, character.getElementalHpVal());
			assertEquals(0, character.getElementalSpVal());
			assertEquals(0, character.getElementalDefVal());
			assertEquals(0, character.getElementalAtkVal());
			assertEquals(0, character.getElementalMatkVal());
			assertEquals(0, character.getElementalHitVal());
			assertEquals(0, character.getElementalFleeVal());
			assertEquals(0, character.getElementalDef2Val());
			assertEquals(0, character.getElementalMdef2Val());
			assertEquals(0, character.getElementalCriticalVal());
			assertEquals(0, character.getElementalAtk2Val());
			assertEquals(0, character.getElementalMatk2Val());
			assertEquals(0, character.getElementalSpeedVal());
			assertEquals(0, character.getElementalAdelayVal());
			assertEquals(0, character.getElementalAmotionVal());
			assertEquals(0, character.getElementalBlv());
			assertEquals(0, character.getElementalJlvl());
			assertEquals(0, character.getElementalLvl());
			assertEquals(0, character.getElementalSkill());
			assertEquals(0, character.getElementalHpRateVal());
			assertEquals(0, character.getElementalSpRateVal());
			assertEquals(0, character.getElementalDefRateVal());
			assertEquals(0, character.getElementalAtkRateVal());
			assertEquals(0, character.getElementalMatkRateVal());
			assertEquals(0, character.getElementalSizeRateVal());
			assertEquals(0, character.getElementalRaceRateVal());
			assertEquals(0, character.getElementalElementRateVal());
			assertEquals(0, character.getElementalMode());
			assertEquals(0, character.getElementalHpRate());
			assertEquals(0, character.getElementalSpRate());
			assertEquals(0, character.getElementalDefRate());
			assertEquals(0, character.getElementalAtkRate());
			assertEquals(0, character.getElementalMatkRate());
			assertEquals(0, character.getElementalSize());
			assertEquals(0, character.getElementalRace());
			assertEquals(0, character.getElementalElement());
			assertEquals(0, character.getElementalHpVal());
			assertEquals(0, character.getElementalSpVal());
			assertEquals(0, character.getElementalDefVal());
			assertEquals(0, character.getElementalAtkVal());
			assertEquals(0, character.getElementalMatkVal());
			assertEquals(0, character.getElementalHitVal());
			assertEquals(0, character.getElementalFleeVal());
			assertEquals(0, character.getElementalDef2Val());
			assertEquals(0, character.getElementalMdef2Val());
			assertEquals(0, character.getElementalCriticalVal());
			assertEquals(0, character.getElementalAtk2Val());
			assertEquals(0, character.getElementalMatk2Val());
			assertEquals(0, character.getElementalSpeedVal());
			assertEquals(0, character.getElementalAdelayVal());
			assertEquals(0, character.getElementalAmotionVal());
			assertEquals(0, character.getElementalBlv());
			assertEquals(0, character.getElementalJlvl());
			assertEquals(0, character.getElementalLvl());
			assertEquals(0, character.getElementalSkill());
			assertEquals(0, character.getElementalHpRateVal());
			assertEquals(0, character.getElementalSpRateVal());
			assertEquals(0, character.getElementalDefRateVal());
			assertEquals(0, character.getElementalAtkRateVal());
			assertEquals(0, character.getElementalMatkRateVal());
			assertEquals(0, character.getElementalSizeRateVal());
			assertEquals(0, character.getElementalRaceRateVal());
			assertEquals(0, character.getElementalElementRateVal());
			assertEquals(0, character.getElementalMode());
			assertEquals(0, character.getElementalHpRate());
			assertEquals(0, character.getElementalSpRate());
			assertEquals(0, character.getElementalDefRate());
			assertEquals(0, character.getElementalAtkRate());
			assertEquals(0, character.getElementalMatkRate());
			assertEquals(0, character.getElementalSize());
			assertEquals(0, character.getElementalRace());
			assertEquals(0, character.getElementalElement());
			assertEquals(0, character.getElementalHpVal());
			assertEquals(0, character.getElementalSpVal());
			assertEquals(0, character.getElementalDefVal());
			assertEquals(0, character.getElementalAtkVal());
			assertEquals(0, character.getElementalMatkVal());
			assertEquals(0, character.getElementalHitVal());
			assertEquals(0, character.getElementalFleeVal());
			assertEquals(0, character.getElementalDef2Val());
			assertEquals(0, character.getElementalMdef2Val());
			assertEquals(0, character.getElementalCriticalVal());
			assertEquals(0, character.getElementalAtk2Val());
			assertEquals(0, character.getElementalMatk2Val());
			assertEquals(0, character.getElementalSpeedVal());
			assertEquals(0, character.getElementalAdelayVal());
			assertEquals(0, character.getElementalAmotionVal());
			assertEquals(0, character.getElementalBlv());
			assertEquals(0, character.getElementalJlvl());
			assertEquals(0, character.getElementalLvl());
			assertEquals(0, character.getElementalSkill());
			assertEquals(0, character.getElementalHpRateVal());
			assertEquals(0, character.getElementalSpRateVal());
			assertEquals(0, character.getElementalDefRateVal());
			assertEquals(0, character.getElementalAtkRateVal());
			assertEquals(0, character.getElementalMatkRateVal());
			assertEquals(0, character.getElementalSizeRateVal());
			assertEquals(0, character.getElementalRaceRateVal