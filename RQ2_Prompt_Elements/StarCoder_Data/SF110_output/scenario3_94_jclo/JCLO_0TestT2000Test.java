// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {

    /**
     * Test case for the {@link JCLO#getValue(String)} method.
     * It tests the case when the variable is a primitive type.
     */
    @Test
    void getValue_primitiveType() {
        JCLO_0 obj = new JCLO_0();
        assertEquals(1, obj.getValue("intVar"));
        assertEquals(1.0, obj.getValue("doubleVar"));
        assertEquals(true, obj.getValue("booleanVar"));
        assertEquals('a', obj.getValue("charVar"));
        assertEquals("abc", obj.getValue("stringVar"));
    }

    /**
     * Test case for the {@link JCLO#getValue(String)} method.
     * It tests the case when the variable is an array.
     */
    @Test
    void getValue_array() {
        JCLO_0 obj = new JCLO_0();
        assertEquals(1, Array.get(obj.getValue("intArray"), 0));
        assertEquals(1.0, Array.get(obj.getValue("doubleArray"), 0));
        assertEquals(true, Array.get(obj.getValue("booleanArray"), 0));
        assertEquals('a', Array.get(obj.getValue("charArray"), 0));
        assertEquals("abc", Array.get(obj.getValue("stringArray"), 0));
    }

    /**
     * Test case for the {@link JCLO#getValue(String)} method.
     * It tests the case when the variable is an object.
     */
    @Test
    void getValue_object() {
        JCLO_0 obj = new JCLO_0();
        assertEquals(1, ((JCLO_0) obj.getValue("objVar")).getIntVar());
        assertEquals(1.0, ((JCLO_0) obj.getValue("objVar")).getDoubleVar());
        assertEquals(true, ((JCLO_0) obj.getValue("objVar")).isBooleanVar());
        assertEquals('a', ((JCLO_0) obj.getValue("objVar")).getCharVar());
        assertEquals("abc", ((JCLO_0) obj.getValue("objVar")).getStringVar());
    }

    /**
     * Test case for the {@link JCLO#getValue(String)} method.
     * It tests the case when the variable is a static variable.
     */
    @Test
    void getValue_staticVariable() {
        assertEquals(1, JCLO_0.getIntVar());
        assertEquals(1.0, JCLO_0.getDoubleVar());
        assertEquals(true, JCLO_0.isBooleanVar());
        assertEquals('a', JCLO_0.getCharVar());
        assertEquals("abc", JCLO_0.getStringVar());
    }

    /**
     * Test case for the {@link JCLO#getValue(String)} method.
     * It tests the case when the variable is a static array.
     */
    @Test
    void getValue_staticArray() {
        assertEquals(1, Array.get(JCLO_0.getIntArray(), 0));
        assertEquals(1.0, Array.get(JCLO_0.getDoubleArray(), 0));
        assertEquals(true, Array.get(JCLO_0.getBooleanArray(), 0));
        assertEquals('a', Array.get(JCLO_0.getCharArray(), 0));
        assertEquals("abc", Array.get(JCLO_0.getStringArray(), 0));
    }

    /**
     * Test case for the {@link JCLO#getValue(String)} method.
     * It tests the case when the variable is a static object.
     */
    @Test
    void getValue_staticObject() {
        assertEquals(1, ((JCLO_0) JCLO_0.getObjVar()).getIntVar());
        assertEquals(1.0, ((JCLO_0) JCLO_0.getObjVar()).getDoubleVar());
        assertEquals(true, ((JCLO_0) JCLO_0.getObjVar()).isBooleanVar());
        assertEquals('a', ((JCLO_0) JCLO_0.getObjVar()).getCharVar());
        assertEquals("abc", ((JCLO_0) JCLO_0.getObjVar()).getStringVar());
    }

    /**
     * Test case for the {@link JCLO#getValue(String)} method.
     * It tests the case when the variable is not found.
     */
    @Test
    void getValue_notFound() {
        JCLO_0 obj = new JCLO_0();
        assertThrows(IllegalArgumentException.class, () -> obj.getValue("notFound"));
    }
}

// JCLO_0.java
package edu.mscd.cs.jclo;

public class JCLO_0 implements JCLO {

    private int intVar = 1;
    private double doubleVar = 1.0;
    private boolean booleanVar = true;
    private char charVar = 'a';
    private String stringVar = "abc";

    private static int intVarStatic = 1;
    private static double doubleVarStatic = 1.0;
    private static boolean booleanVarStatic = true;
    private static char charVarStatic = 'a';
    private static String stringVarStatic = "abc";

    private int[] intArray = {1};
    private double[] doubleArray = {1.0};
    private boolean[] booleanArray = {true};
    private char[] charArray = {'a'};
    private String[] stringArray = {"abc"};

    private static int[] intArrayStatic = {1};
    private static double[] doubleArrayStatic = {1.0};
    private static boolean[] booleanArrayStatic = {true};
    private static char[] charArrayStatic = {'a'};
    private static String[] stringArrayStatic = {"abc"};

    private JCLO_0 objVar = new JCLO_0();
    private static JCLO_0 objVarStatic = new JCLO_0();

    public int getIntVar() {
        return intVar;
    }

    public double getDoubleVar() {
        return doubleVar;
    }

    public boolean isBooleanVar() {
        return booleanVar;
    }

    public char getCharVar() {
        return charVar;
    }

    public String getStringVar() {
        return stringVar;
    }

    public static int getIntVarStatic() {
        return intVarStatic;
    }

    public static double getDoubleVarStatic() {
        return doubleVarStatic;
    }

    public static boolean isBooleanVarStatic() {
        return booleanVarStatic;
    }

    public static char getCharVarStatic() {
        return charVarStatic;
    }

    public static String getStringVarStatic() {
        return stringVarStatic;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public double[] getDoubleArray() {
        return doubleArray;
    }

    public boolean[] getBooleanArray() {
        return booleanArray;
    }

    public char[] getCharArray() {
        return charArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public static int[] getIntArrayStatic() {
        return intArrayStatic;
    }

    public static double[] getDoubleArrayStatic() {
        return doubleArrayStatic;
    }

    public static boolean[] getBooleanArrayStatic() {
        return booleanArrayStatic;
    }

    public static char[] getCharArrayStatic() {
        return charArrayStatic;
    }

    public static String[] getStringArrayStatic() {
        return stringArrayStatic;
    }

    public JCLO_0 getObjVar() {
        return objVar;
    }

    public static JCLO_0 getObjVarStatic() {
        return objVarStatic;
    }

    public Object getValue(String key) {
        try {
            Field field = getClass().getDeclaredField(key);
            if (Modifier.isStatic(field.getModifiers())) {
                return field.get(null);
            } else {
                return field.get(this);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
