// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains ten unit test cases for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {

    @Test
    void getAttrValue() {
        Hero h = new Hero();
        h.addAttribute(new Attribute("STR", 10));
        h.addAttribute(new Attribute("INT", 10));
        h.addAttribute(new Attribute("WIL", 10));
        h.addAttribute(new Attribute("CHA", 10));
        assertEquals(10, h.getAttrValue("STR"));
        assertEquals(10, h.getAttrValue("INT"));
        assertEquals(10, h.getAttrValue("WIL"));
        assertEquals(10, h.getAttrValue("CHA"));
    }
}

// Attribute.java
package dsachat.share.hero;

import java.io.Serializable;

/**
 * an Attribute describes one attribute of an hero.
 *
 * @author bernshausen
 */
public class Attribute implements Serializable {

    private String shortcut;
    private int value;

    public Attribute(String shortcut, int value) {
        this.shortcut = shortcut;
        this.value = value;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

// AttributeTest.java
package dsachat.share.hero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Attribute}.
* It contains two unit test cases for the {@link Attribute#Attribute(String, int)} method.
*/
class AttributeTest {
		
    @Test
    void Attribute() {
        Attribute a = new Attribute("STR", 10);
        assertEquals("STR", a.getShortcut());
        assertEquals(10, a.getValue());
    }
}

// Talent.java
package dsachat.share.hero;

import java.io.Serializable;

/**
 * a Talent describes one talent of an hero.
 *
 * @author bernshausen
 */
public class Talent implements Serializable {

    private String name;
    private String shortcut;
    private String description;

    public Talent(String name, String shortcut, String description) {
        this.name = name;
        this.shortcut = shortcut;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// TalentTest.java
package dsachat.share.hero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Talent}.
* It contains two unit test cases for the {@link Talent#Talent(String, String, String)} method.
*/
class TalentTest {
		
    @Test
    void Talent() {
        Talent t = new Talent("Talent", "T", "Description");
        assertEquals("Talent", t.getName());
        assertEquals("T", t.getShortcut());
        assertEquals("Description", t.getDescription());
    }
}

// Spell.java
package dsachat.share.hero;

import java.io.Serializable;

/**
 * a Spell describes one spell of an hero.
 *
 * @author bernshausen
 */
public class Spell implements Serializable {

    private String name;
    private String shortcut;
    private String description;

    public Spell(String name, String shortcut, String description) {
        this.name = name;
        this.shortcut = shortcut;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// SpellTest.java
package dsachat.share.hero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Spell}.
* It contains two unit test cases for the {@link Spell#Spell(String, String, String)} method.
*/
class SpellTest {
		
    @Test
    void Spell() {
        Spell s = new Spell("Spell", "S", "Description");
        assertEquals("Spell", s.getName());
        assertEquals("S", s.getShortcut());
        assertEquals("Description", s.getDescription());
    }
}

// Weapon.java
package dsachat.share.hero;

import java.io.Serializable;

/**
 * a Weapon describes one weapon of an hero.
 *
 * @author bernshausen
 */
public class Weapon implements Serializable {

    private String name;
    private String shortcut;
    private String description;

    public Weapon(String name, String shortcut, String description) {
        this.name = name;
        this.shortcut = shortcut;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// WeaponTest.java
package dsachat.share.hero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Weapon}.
* It contains two unit test cases for the {@link Weapon#Weapon(String, String, String)} method.
*/
class WeaponTest {
		
    @Test
    void Weapon() {
        Weapon w = new Weapon("Weapon", "W", "Description");
        assertEquals("Weapon", w.getName());
        assertEquals("W", w.getShortcut());
        assertEquals("Description", w.getDescription());
    }
}

// HeroLoader.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;

/**
 * a HeroLoader loads a hero from a xml file.
 *
 * @author bernshausen
 */
public class HeroLoader implements Serializable {

    private String name;
    private Vector<Attribute> attributes;
    private Vector<Talent> talents;
    private Vector<Spell> spells;
    private Vector<Weapon> weapons;

    public HeroLoader(String name) {
        this.name = name;
        attributes = new Vector<Attribute>();
        talents = new Vector<Talent>();
        spells = new Vector<Spell>();
        weapons = new Vector<Weapon>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Vector<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Vector<Talent> getTalents() {
        return talents;
    }

    public void setTalents(Vector<Talent> talents) {
        this.talents = talents;
    }

    public Vector<Spell> getSpells() {
        return spells;
    }

    public void setSpells(Vector<Spell> spells) {
        this.spells = spells;
    }

    public Vector<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Vector<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void load(Document doc) {
        Element root = doc.getRootElement();
        setName(root.attributeValue("name"));
        Element atts = root.element("attributes");
        Iterator<Element> it = atts.elementIterator();
        while (it.hasNext()) {
            Element e = it.next();
            String name = e.attributeValue("name");
            int value = Integer.parseInt(e.attributeValue("value"));
            attributes.add(new Attribute(name, value));
        }
        Element tal =