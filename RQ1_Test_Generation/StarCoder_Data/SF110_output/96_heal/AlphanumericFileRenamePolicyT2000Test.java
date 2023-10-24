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
     * when the original filename contains only alphanumeric characters.
     */
    @Test
    void testRename_AlphanumericFilename() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test.txt");
        File renamed = policy.rename(original);
        assertEquals("test.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a space.
     */
    @Test
    void testRename_AlphanumericFilenameWithSpace() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test file.txt");
        File renamed = policy.rename(original);
        assertEquals("test file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a period.
     */
    @Test
    void testRename_AlphanumericFilenameWithPeriod() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test.file.txt");
        File renamed = policy.rename(original);
        assertEquals("test.file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * an underscore.
     */
    @Test
    void testRename_AlphanumericFilenameWithUnderscore() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test_file.txt");
        File renamed = policy.rename(original);
        assertEquals("test_file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a hyphen.
     */
    @Test
    void testRename_AlphanumericFilenameWithHyphen() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test-file.txt");
        File renamed = policy.rename(original);
        assertEquals("test-file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a plus sign.
     */
    @Test
    void testRename_AlphanumericFilenameWithPlusSign() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test+file.txt");
        File renamed = policy.rename(original);
        assertEquals("test+file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a tilde.
     */
    @Test
    void testRename_AlphanumericFilenameWithTilde() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test~file.txt");
        File renamed = policy.rename(original);
        assertEquals("test~file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a colon.
     */
    @Test
    void testRename_AlphanumericFilenameWithColon() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test:file.txt");
        File renamed = policy.rename(original);
        assertEquals("test:file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a semicolon.
     */
    @Test
    void testRename_AlphanumericFilenameWithSemicolon() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test;file.txt");
        File renamed = policy.rename(original);
        assertEquals("test;file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a question mark.
     */
    @Test
    void testRename_AlphanumericFilenameWithQuestionMark() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test?file.txt");
        File renamed = policy.rename(original);
        assertEquals("test?file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a exclamation mark.
     */
    @Test
    void testRename_AlphanumericFilenameWithExclamationMark() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test!file.txt");
        File renamed = policy.rename(original);
        assertEquals("test!file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a dollar sign.
     */
    @Test
    void testRename_AlphanumericFilenameWithDollarSign() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test$file.txt");
        File renamed = policy.rename(original);
        assertEquals("test$file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a percent sign.
     */
    @Test
    void testRename_AlphanumericFilenameWithPercentSign() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test%file.txt");
        File renamed = policy.rename(original);
        assertEquals("test%file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a caret.
     */
    @Test
    void testRename_AlphanumericFilenameWithCaret() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test^file.txt");
        File renamed = policy.rename(original);
        assertEquals("test^file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a ampersand.
     */
    @Test
    void testRename_AlphanumericFilenameWithAmpersand() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test&file.txt");
        File renamed = policy.rename(original);
        assertEquals("test&file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a asterisk.
     */
    @Test
    void testRename_AlphanumericFilenameWithAsterisk() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test*file.txt");
        File renamed = policy.rename(original);
        assertEquals("test*file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a opening parenthesis.
     */
    @Test
    void testRename_AlphanumericFilenameWithOpeningParenthesis() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test(file.txt");
        File renamed = policy.rename(original);
        assertEquals("test(file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a closing parenthesis.
     */
    @Test
    void testRename_AlphanumericFilenameWithClosingParenthesis() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File original = new File("test)file.txt");
        File renamed = policy.rename(original);
        assertEquals("test)file.txt", renamed.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the original filename contains only alphanumeric characters and
     * a opening square bracket.
     */
    @Test
    void testRename_AlphanumericFilenameWithOpeningSquareBracket() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRename