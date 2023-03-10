// ChallengeTest0.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains ten unit test cases for the {@link Challenge#roll()} method.
*/
class ChallengeTest0 {

	/**
	 * Test case for {@link Challenge#roll()} method.
	 * <br>
	 * This test case tests the {@link Challenge#roll()} method with a talent challenge.
	 * <br>
	 * The talent challenge is created with the following parameters:
	 * <ul>
	 * <li>talent name: "Klettern"</li>
	 * <li>modification: 0</li>
	 * <li>hero: "hero"</li>
	 * <li>silent: false</li>
	 * <li>response: "response"</li>
	 * </ul>
	 * The expected result is a string with the following content:
	 * <ul>
	 * <li>talent name</li>
	 * <li>attributes</li>
	 * <li>modification</li>
	 * <li>response</li>
	 * </ul>
	 */
	@Test
	void testRollTalent() {
		// create talent challenge
		Challenge challenge = new Challenge("Klettern", 0, new Hero("hero"), false, "response");
		// execute challenge
		String result = challenge.roll();
		// check result
		assertTrue(result.contains("Klettern"));
		assertTrue(result.contains("att:"));
		assertTrue(result.contains("mod:"));
		assertTrue(result.contains("to:"));
	}
	
	/**
	 * Test case for {@link Challenge#roll()} method.
	 * <br>
	 * This test case tests the {@link Challenge#roll()} method with an attribute challenge.
	 * <br>
	 * The attribute challenge is created with the following parameters:
	 * <ul>
	 * <li>attribute shortcut: "KK"</li>
	 * <li>hero: "hero"</li>
	 * <li>modification: 0</li>
	 * <li>silent: false</li>
	 * <li>response: "response"</li>
	 * </ul>
	 * The expected result is a string with the following content:
	 * <ul>
	 * <li>attribute shortcut</li>
	 * <li>modification</li>
	 * <li>response</li>
	 * </ul>
	 */
	@Test
	void testRollAttr() {
		// create attribute challenge
		Challenge challenge = new Challenge("KK", new Hero("hero"), 0, false, "response");
		// execute challenge
		String result = challenge.roll();
		// check result
		assertTrue(result.contains("KK"));
		assertTrue(result.contains("mod:"));
		assertTrue(result.contains("to:"));
	}
	
	/**
	 * Test case for {@link Challenge#roll()} method.
	 * <br>
	 * This test case tests the {@link Challenge#roll()} method with a fight challenge.
	 * <br>
	 * The fight challenge is created with the following parameters:
	 * <ul>
	 * <li>weapon: "weapon"</li>
	 * <li>attack: true</li>
	 * <li>hero: "hero"</li>
	 * <li>modification: 0</li>
	 * <li>silent: false</li>
	 * <li>response: "response"</li>
	 * </ul>
	 * The expected result is a string with the following content:
	 * <ul>
	 * <li>weapon name</li>
	 * <li>modification</li>
	 * <li>response</li>
	 * </ul>
	 */
	@Test
	void testRollFight() {
		// create fight challenge
		Challenge challenge = new Challenge(new Weapon("weapon"), true, new Hero("hero"), 0, false, "response");
		// execute challenge
		String result = challenge.roll();
		// check result
		assertTrue(result.contains("weapon"));
		assertTrue(result.contains("mod:"));
		assertTrue(result.contains("to:"));
	}
	
	/**
	 * Test case for {@link Challenge#roll()} method.
	 * <br>
	 * This test case tests the {@link Challenge#roll()} method with a talent challenge.
	 * <br>
	 * The talent challenge is created with the following parameters:
	 * <ul>
	 * <li>talent name: "Klettern"</li>
	 * <li>modification: 0</li>
	 * <li>hero: "hero"</li>
	 * <li>silent: false</li>
	 * <li>response: "response"</li>
	 * </ul>
	 * The expected result is a string with the following content:
	 * <ul>
	 * <li>talent name</li>
	 * <li>attributes</li>
	 * <li>modification</li>
	 * <li>response</li>
	 * </ul>
	 */
	@Test
	void testRollTalent2() {
		// create talent challenge
		Challenge challenge = new Challenge("Klettern", 0, new Hero("hero"), false, "response");
		// execute challenge
		String result = challenge.roll();
		// check result
		assertTrue(result.contains("Klettern"));
		assertTrue(result.contains("att:"));
		assertTrue(result.contains("mod:"));
		assertTrue(result.contains("to:"));
	}
	
	/**
	 * Test case for {@link Challenge#roll()} method.
	 * <br>
	 * This test case tests the {@link Challenge#roll()} method with an attribute challenge.
	 * <br>
	 * The attribute challenge is created with the following parameters:
	 * <ul>
	 * <li>attribute shortcut: "KK"</li>
	 * <li>hero: "hero"</li>
	 * <li>modification: 0</li>
	 * <li>silent: false</li>
	 * <li>response: "response"</li>
	 * </ul>
	 * The expected result is a string with the following content:
	 * <ul>
	 * <li>attribute shortcut</li>
	 * <li>modification</li>
	 * <li>response</li>
	 * </ul>
	 */
	@Test
	void testRollAttr2() {
		// create attribute challenge
		Challenge challenge = new Challenge("KK", new Hero("hero"), 0, false, "response");
		// execute challenge
		String result = challenge.roll();
		// check result
		assertTrue(result.contains("KK"));
		assertTrue(result.contains("mod:"));
		assertTrue(result.contains("to:"));
	}
	
	/**
	 * Test case for {@link Challenge#roll()} method.
	 * <br>
	 * This test case tests the {@link Challenge#roll()} method with a fight challenge.
	 * <br>
	 * The fight challenge is created with the following parameters:
	 * <ul>
	 * <li>weapon: "weapon"</li>
	 * <li>attack: true</li>
	 * <li>hero: "hero"</li>
	 * <li>modification: 0</li>
	 * <li>silent: false</li>
	 * <li>response: "response"</li>
	 * </ul>
	 * The expected result is a string with the following content:
	 * <ul>
	 * <li>weapon name</li>
	 * <li>modification</li>
	 * <li>response</li>
	 * </ul>
	 */
	@Test
	void testRollFight2() {
		// create fight challenge
		Challenge challenge = new Challenge(new Weapon("weapon"), true, new Hero("hero"), 0, false, "response");
		// execute challenge
		String result = challenge.roll();
		// check result
		assertTrue(result.contains("weapon"));
		assertTrue(result.contains("mod:"));
		assertTrue(result.contains("to:"));
	}
	
	/**
	 * Test case for