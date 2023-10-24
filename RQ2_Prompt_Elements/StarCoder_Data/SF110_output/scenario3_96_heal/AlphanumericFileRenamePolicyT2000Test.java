// AlphanumericFileRenamePolicyTest.java
package org.heal.servlet.upload;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AlphanumericFileRenamePolicy}.
* It contains ten unit test cases for the {@link AlphanumericFileRenamePolicy#rename(File)} method.
*/
class AlphanumericFileRenamePolicyTest {

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename is <code>null</code>.
     */
    @Test
    void testRename_originalFileIsNull() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(null);
        assertNull(file);
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename is empty.
     */
    @Test
    void testRename_originalFileIsEmpty() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File(""));
        assertNull(file);
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters.
     */
    @Test
    void testRename_originalFileContainsOnlyAlphanumericCharacters() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123"));
        assertEquals("abc123", file.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters
     * and a dot.
     */
    @Test
    void testRename_originalFileContainsOnlyAlphanumericCharactersAndADot() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123.txt"));
        assertEquals("abc123.txt", file.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters
     * and an underscore.
     */
    @Test
    void testRename_originalFileContainsOnlyAlphanumericCharactersAndAnUnderscore() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123_txt"));
        assertEquals("abc123_txt", file.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters
     * and a space.
     */
    @Test
    void testRename_originalFileContainsOnlyAlphanumericCharactersAndASpace() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123 txt"));
        assertEquals("abc123 txt", file.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains non-alphanumeric characters.
     */
    @Test
    void testRename_originalFileContainsNonAlphanumericCharacters() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123.txt.zip"));
        assertEquals("abc123.txt.zip", file.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains non-alphanumeric characters
     * and a dot.
     */
    @Test
    void testRename_originalFileContainsNonAlphanumericCharactersAndADot() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123.txt.zip.tar"));
        assertEquals("abc123.txt.zip.tar", file.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains non-alphanumeric characters
     * and an underscore.
     */
    @Test
    void testRename_originalFileContainsNonAlphanumericCharactersAndAnUnderscore() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123.txt.zip_tar"));
        assertEquals("abc123.txt.zip_tar", file.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains non-alphanumeric characters
     * and a space.
     */
    @Test
    void testRename_originalFileContainsNonAlphanumericCharactersAndASpace() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = policy.rename(new File("abc123.txt.zip tar"));
        assertEquals("abc123.txt.zip tar", file.getName());
    }
}
