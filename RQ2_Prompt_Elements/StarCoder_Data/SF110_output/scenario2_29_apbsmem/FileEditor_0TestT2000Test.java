// FileEditor_0Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_0Test {

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test_files/apbs_output_test.txt";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_0args() {
        System.out.println("getEnergy");
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy("test_files/apbs_output_test.txt");
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String() {
        System.out.println("getEnergy");
        String filename = "test_files/apbs_output_test.txt";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_0args() {
        System.out.println("getEnergy");
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy("test_files/apbs_output_test.txt");
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String() {
        System.out.println("getEnergy");
        String filename = "test_files/apbs_output_test.txt";
        String energy = "elec";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy(filename, energy);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_0args() {
        System.out.println("getEnergy");
        String energy = "elec";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy("test_files/apbs_output_test.txt", energy);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_String() {
        System.out.println("getEnergy");
        String filename = "test_files/apbs_output_test.txt";
        String energy = "elec";
        String type = "kJ/mol";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy(filename, energy, type);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_String_0args() {
        System.out.println("getEnergy");
        String energy = "elec";
        String type = "kJ/mol";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy("test_files/apbs_output_test.txt", energy, type);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_String_String() {
        System.out.println("getEnergy");
        String filename = "test_files/apbs_output_test.txt";
        String energy = "elec";
        String type = "kJ/mol";
        String unit = "kcal/mol";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy(filename, energy, type, unit);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_String_String_0args() {
        System.out.println("getEnergy");
        String energy = "elec";
        String type = "kJ/mol";
        String unit = "kcal/mol";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy("test_files/apbs_output_test.txt", energy, type, unit);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_String_String_String() {
        System.out.println("getEnergy");
        String filename = "test_files/apbs_output_test.txt";
        String energy = "elec";
        String type = "kJ/mol";
        String unit = "kcal/mol";
        String unit2 = "kT";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy(filename, energy, type, unit, unit2);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_String_String_String_0args() {
        System.out.println("getEnergy");
        String energy = "elec";
        String type = "kJ/mol";
        String unit = "kcal/mol";
        String unit2 = "kT";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.3900E+01 kcal/mol", "-4.0350E+01 kT"};
        String[] result = instance.getEnergy("test_files/apbs_output_test.txt", energy, type, unit, unit2);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy_String_String_String_String_String_String() {
        System.out.println("getEnergy");
        String filename = "test_files/apbs_output_test.txt";
        String energy = "e