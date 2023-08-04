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
     * when the filename contains only alphanumeric characters.
     */
    @Test
    void testRenameAlphanumeric() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a space.
     */
    @Test
    void testRenameAlphanumericWithSpace() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a period.
     */
    @Test
    void testRenameAlphanumericWithPeriod() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test.file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test.file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and an underscore.
     */
    @Test
    void testRenameAlphanumericWithUnderscore() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test_file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test_file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a hyphen.
     */
    @Test
    void testRenameAlphanumericWithHyphen() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test-file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test-file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a tilde.
     */
    @Test
    void testRenameAlphanumericWithTilde() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test~file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test~file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a plus sign.
     */
    @Test
    void testRenameAlphanumericWithPlusSign() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test+file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test+file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a comma.
     */
    @Test
    void testRenameAlphanumericWithComma() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test,file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test,file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a colon.
     */
    @Test
    void testRenameAlphanumericWithColon() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test:file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test:file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a semicolon.
     */
    @Test
    void testRenameAlphanumericWithSemicolon() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test;file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test;file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a question mark.
     */
    @Test
    void testRenameAlphanumericWithQuestionMark() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test?file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test?file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a exclamation mark.
     */
    @Test
    void testRenameAlphanumericWithExclamationMark() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test!file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test!file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a dollar sign.
     */
    @Test
    void testRenameAlphanumericWithDollarSign() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test$file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test$file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a percent sign.
     */
    @Test
    void testRenameAlphanumericWithPercentSign() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test%file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test%file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a ampersand.
     */
    @Test
    void testRenameAlphanumericWithAmpersand() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test&file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test&file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a asterisk.
     */
    @Test
    void testRenameAlphanumericWithAsterisk() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test*file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test*file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a open parenthesis.
     */
    @Test
    void testRenameAlphanumericWithOpenParenthesis() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test(file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test(file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a close parenthesis.
     */
    @Test
    void testRenameAlphanumericWithCloseParenthesis() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test)file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test)file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(File)}
     * when the filename contains only alphanumeric characters and a open bracket.
     */
    @Test
    void testRenameAlphanumericWithOpenBracket() {
        AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
        File file = new File("test[file.txt");
        File renamedFile = policy.rename(file);
        assertEquals("test[file.txt", renamedFile.getName());
    }

    /**
     * Test case for {@link AlphanumericFileRenamePolicy#rename(