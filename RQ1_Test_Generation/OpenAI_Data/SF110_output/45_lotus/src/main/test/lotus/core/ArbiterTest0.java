// ArbiterTest0.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.decision.*;
import lotus.core.stack.Spell;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Arbiter}.
* It contains ten unit test cases for the {@link Arbiter#isLegal(Decision, Player)} method.
*/
class ArbiterTest0 {

	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal0() {
		Player p = new Player();
		Decision d = new PassDecision();
		assertTrue(Arbiter.isLegal(d, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal1() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal2() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal3() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal4() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal5() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal6() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal7() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal8() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
	/**
	* Test case for {@link Arbiter#isLegal(Decision, Player)}.
	* The test case is passed if the method returns true.
	*/
	@Test
	void testIsLegal9() {
		Player p = new Player();
		Card c = new Card();
		Spell s = new Spell(c);
		assertTrue(Arbiter.isLegal(s, p));
	}
	
}

// ArbiterTest1.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.decision.*;
import lotus.core.stack.Spell;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Arbiter}.
* It contains ten unit test cases for the {@link Arbiter#getLegalPlayerDecisions(Player)} method.
*/
class ArbiterTest1 {
		
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.
	*/
	@Test
	void testGetLegalPlayerDecisions0() {
		Player p = new Player();
		ArrayList<Decision> decisions = Arbiter.getLegalPlayerDecisions(p);
		assertTrue(decisions.contains(new PassDecision()));
	}
	
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.
	*/
	@Test
	void testGetLegalPlayerDecisions1() {
		Player p = new Player();
		ArrayList<Decision> decisions = Arbiter.getLegalPlayerDecisions(p);
		assertTrue(decisions.contains(new PassDecision()));
	}
	
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.
	*/
	@Test
	void testGetLegalPlayerDecisions2() {
		Player p = new Player();
		ArrayList<Decision> decisions = Arbiter.getLegalPlayerDecisions(p);
		assertTrue(decisions.contains(new PassDecision()));
	}
	
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.
	*/
	@Test
	void testGetLegalPlayerDecisions3() {
		Player p = new Player();
		ArrayList<Decision> decisions = Arbiter.getLegalPlayerDecisions(p);
		assertTrue(decisions.contains(new PassDecision()));
	}
	
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.
	*/
	@Test
	void testGetLegalPlayerDecisions4() {
		Player p = new Player();
		ArrayList<Decision> decisions = Arbiter.getLegalPlayerDecisions(p);
		assertTrue(decisions.contains(new PassDecision()));
	}
	
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.
	*/
	@Test
	void testGetLegalPlayerDecisions5() {
		Player p = new Player();
		ArrayList<Decision> decisions = Arbiter.getLegalPlayerDecisions(p);
		assertTrue(decisions.contains(new PassDecision()));
	}
	
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.
	*/
	@Test
	void testGetLegalPlayerDecisions6() {
		Player p = new Player();
		ArrayList<Decision> decisions = Arbiter.getLegalPlayerDecisions(p);
		assertTrue(decisions.contains(new PassDecision()));
	}
	
	/**
	* Test case for {@link Arbiter#getLegalPlayerDecisions(Player)}.
	* The test case is passed if the method returns a list containing a PassDecision.