// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains ten unit test cases for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {

    private static final transient Logger LOG = Logger.getLogger(BattleplayerTest.class.getName());

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds2() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds3() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(5, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds4() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(5, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(6, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds5() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(5, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(6, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(7, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds6() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(5, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(6, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(7, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(8, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds7() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(5, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(6, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(7, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(8, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(9, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds8() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(5, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(6, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(7, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(8, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(9, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(10, player.numberOfRounds());
    }

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
    void testNumberOfRounds9() {
        final Battleplan plan = new Battleplan();
        final Battleplayer player = new Battleplayer(plan);
        assertEquals(0, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(1, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(2, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(3, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(4, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(5, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(6, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(7, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(8, player.numberOfRounds());
        plan.addRound(new ArrayList<Combatant>());
        assertEquals(9,