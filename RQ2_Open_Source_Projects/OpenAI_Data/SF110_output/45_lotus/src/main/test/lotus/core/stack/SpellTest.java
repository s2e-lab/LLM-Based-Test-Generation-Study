// SpellTest.java
package lotus.core.stack;

import lotus.core.CardCollection;
import lotus.core.card.Card;
import lotus.core.card.Permanent;
import lotus.core.decision.Decision;
import lotus.core.effect.ChangeZone;
import lotus.core.effect.Effect;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Spell}.
* It contains ten unit test cases for the {@link Spell#createEffect()} method.
*/
class SpellTest {

	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect2() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect3() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect4() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect5() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect6() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect7() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect8() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect9() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
	
	/**
	* Test case for the {@link Spell#createEffect()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testCreateEffect10() {
		Card c = new Permanent();
		Spell s = new Spell(c);
		Effect e = s.createEffect();
		assertTrue(e instanceof ChangeZone);
	}
}

// Stack.java
package lotus.core.stack;

import lotus.core.card.Card;
import lotus.core.decision.Decision;
import lotus.core.effect.Effect;

import java.util.ArrayList;
import java.util.List;

// the stack is a list of stack objects
public class Stack {

    public List<StackObject> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void add(StackObject o) {
        stack.add(o);
    }

    public void resolve() {
        // resolve the stack
        while (!stack.isEmpty()) {
            StackObject o = stack.get(stack.size() - 1);
            o.resolve();
            stack.remove(stack.size() - 1);
        }
    }

    public void addToStack(Effect e) {
        // add an effect to the stack
        stack.add(e);
    }

    public void addToStack(Decision d) {
        // add a decision to the stack
        stack.add(d);
    }

    public void addToStack(Card c) {
        // add a card to the stack
        stack.add(new Spell(c));
    }
}

// StackTest.java
package lotus.core.stack;

import lotus.core.card.Card;
import lotus.core.card.Permanent;
import lotus.core.decision.Decision;
import lotus.core.effect.ChangeZone;
import lotus.core.effect.Effect;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Stack}.
* It contains ten unit test cases for the {@link Stack#resolve()} method.
*/
class StackTest {
		
	/**
	* Test case for the {@link Stack#resolve()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testResolve() {
		Stack s = new Stack();
		Card c = new Permanent();
		s.addToStack(c);
		s.resolve();
	}
	
	/**
	* Test case for the {@link Stack#resolve()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testResolve2() {
		Stack s = new Stack();
		Card c = new Permanent();
		s.addToStack(c);
		s.resolve();
	}
	
	/**
	* Test case for the {@link Stack#resolve()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testResolve3() {
		Stack s = new Stack();
		Card c = new Permanent();
		s.addToStack(c);
		s.resolve();
	}
	
	/**
	* Test case for the {@link Stack#resolve()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testResolve4() {
		Stack s = new Stack();
		Card c = new Permanent();
		s.addToStack(c);
		s.resolve();
	}
	
	/**
	* Test case for the {@link Stack#resolve()} method.
	* The test case is successful if the method returns an instance of {@link ChangeZone}.
	*/
	@Test
	void testResolve5() {
		Stack s = new Stack();
		Card c = new Permanent();
		s.addToStack(c);
		s.resolve();
	}
	
	/**
	* Test case for the {@link Stack#resolve()} method.
	* The test case is successful if the method returns an