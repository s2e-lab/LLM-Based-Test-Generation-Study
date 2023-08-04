// Challenge_0Test.java
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
class Challenge_0Test {

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll() {
        System.out.println("roll");
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll();
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_0args() {
        System.out.println("roll");
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll();
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero() {
        System.out.println("roll");
        Hero hero = new Hero();
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Weapon() {
        System.out.println("roll");
        Hero hero = new Hero();
        Weapon w = new Weapon();
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, w);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod, mod2);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        int mod3 = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod, mod2, mod3);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        int mod3 = 0;
        int mod4 = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod, mod2, mod3, mod4);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int_int_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        int mod3 = 0;
        int mod4 = 0;
        int mod5 = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod, mod2, mod3, mod4, mod5);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int_int_int_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        int mod3 = 0;
        int mod4 = 0;
        int mod5 = 0;
        int mod6 = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod, mod2, mod3, mod4, mod5, mod6);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int_int_int_int_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        int mod3 = 0;
        int mod4 = 0;
        int mod5 = 0;
        int mod6 = 0;
        int mod7 = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod, mod2, mod3, mod4, mod5, mod6, mod7);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int_int_int_int_int_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        int mod3 = 0;
        int mod4 = 0;
        int mod5 = 0;
        int mod6 = 0;
        int mod7 = 0;
        int mod8 = 0;
        Challenge instance = new Challenge();
        String expResult = "missing Talent, Spell, ...";
        String result = instance.roll(hero, t, w, mod, mod2, mod3, mod4, mod5, mod6, mod7, mod8);
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Challenge.
     */
    @Test
    void testRoll_Hero_Talent_Weapon_int_int_int_int_int_int_int_int_int() {
        System.out.println("roll");
        Hero hero = new Hero();
        Talent t = new Talent();
        Weapon w = new Weapon();
        int mod = 0;
        int mod2 = 0;
        int mod3 = 0;
        int mod4 = 0;
        int mod5 = 0;
        int mod6 = 0;
        int mod7 = 0;
        int mod8 = 0;
        int mod9 = 0;
        Challenge instance