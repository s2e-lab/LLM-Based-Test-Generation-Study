// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains ten unit test cases for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuild() throws IOException {
        // Create a temporary directory
        File tempDir = Utils.createTempDir();
        // Create a temporary sitemap file
        File sitemapFile = new File(tempDir, "sitemap.xml");
        // Create a temporary source directory
        File sourceDir = new File(tempDir, "source");
        sourceDir.mkdir();
        // Create a temporary target directory
        File targetDir = new File(tempDir, "target");
        targetDir.mkdir();
        // Create a temporary file in the source directory
        File sourceFile = new File(sourceDir, "index.html");
        sourceFile.createNewFile();
        // Create a temporary file in the target directory
        File targetFile = new File(targetDir, "index.html");
        targetFile.createNewFile();
        // Create a temporary file in the target directory
        File targetFile2 = new File(targetDir, "index2.html");
        targetFile2.createNewFile();
        // Create a temporary file in the target directory
        File targetFile3 = new File(targetDir, "index3.html");
        targetFile3.createNewFile();
        // Create a temporary file in the target directory
        File targetFile4 = new File(targetDir, "index4.html");
        targetFile4.createNewFile();
        // Create a temporary file in the target directory
        File targetFile5 = new File(targetDir, "index5.html");
        targetFile5.createNewFile();
        // Create a temporary file in the target directory
        File targetFile6 = new File(targetDir, "index6.html");
        targetFile6.createNewFile();
        // Create a temporary file in the target directory
        File targetFile7 = new File(targetDir, "index7.html");
        targetFile7.createNewFile();
        // Create a temporary file in the target directory
        File targetFile8 = new File(targetDir, "index8.html");
        targetFile8.createNewFile();
        // Create a temporary file in the target directory
        File targetFile9 = new File(targetDir, "index9.html");
        targetFile9.createNewFile();
        // Create a temporary file in the target directory
        File targetFile10 = new File(targetDir, "index10.html");
        targetFile10.createNewFile();
        // Create a temporary file in the target directory
        File targetFile11 = new File(targetDir, "index11.html");
        targetFile11.createNewFile();
        // Create a temporary file in the target directory
        File targetFile12 = new File(targetDir, "index12.html");
        targetFile12.createNewFile();
        // Create a temporary file in the target directory
        File targetFile13 = new File(targetDir, "index13.html");
        targetFile13.createNewFile();
        // Create a temporary file in the target directory
        File targetFile14 = new File(targetDir, "index14.html");
        targetFile14.createNewFile();
        // Create a temporary file in the target directory
        File targetFile15 = new File(targetDir, "index15.html");
        targetFile15.createNewFile();
        // Create a temporary file in the target directory
        File targetFile16 = new File(targetDir, "index16.html");
        targetFile16.createNewFile();
        // Create a temporary file in the target directory
        File targetFile17 = new File(targetDir, "index17.html");
        targetFile17.createNewFile();
        // Create a temporary file in the target directory
        File targetFile18 = new File(targetDir, "index18.html");
        targetFile18.createNewFile();
        // Create a temporary file in the target directory
        File targetFile19 = new File(targetDir, "index19.html");
        targetFile19.createNewFile();
        // Create a temporary file in the target directory
        File targetFile20 = new File(targetDir, "index20.html");
        targetFile20.createNewFile();
        // Create a temporary file in the target directory
        File targetFile21 = new File(targetDir, "index21.html");
        targetFile21.createNewFile();
        // Create a temporary file in the target directory
        File targetFile22 = new File(targetDir, "index22.html");
        targetFile22.createNewFile();
        // Create a temporary file in the target directory
        File targetFile23 = new File(targetDir, "index23.html");
        targetFile23.createNewFile();
        // Create a temporary file in the target directory
        File targetFile24 = new File(targetDir, "index24.html");
        targetFile24.createNewFile();
        // Create a temporary file in the target directory
        File targetFile25 = new File(targetDir, "index25.html");
        targetFile25.createNewFile();
        // Create a temporary file in the target directory
        File targetFile26 = new File(targetDir, "index26.html");
        targetFile26.createNewFile();
        // Create a temporary file in the target directory
        File targetFile27 = new File(targetDir, "index27.html");
        targetFile27.createNewFile();
        // Create a temporary file in the target directory
        File targetFile28 = new File(targetDir, "index28.html");
        targetFile28.createNewFile();
        // Create a temporary file in the target directory
        File targetFile29 = new File(targetDir, "index29.html");
        targetFile29.createNewFile();
        // Create a temporary file in the target directory
        File targetFile30 = new File(targetDir, "index30.html");
        targetFile30.createNewFile();
        // Create a temporary file in the target directory
        File targetFile31 = new File(targetDir, "index31.html");
        targetFile31.createNewFile();
        // Create a temporary file in the target directory
        File targetFile32 = new File(targetDir, "index32.html");
        targetFile32.createNewFile();
        // Create a temporary file in the target directory
        File targetFile33 = new File(targetDir, "index33.html");
        targetFile33.createNewFile();
        // Create a temporary file in the target directory
        File targetFile34 = new File(targetDir, "index34.html");
        targetFile34.createNewFile();
        // Create a temporary file in the target directory
        File targetFile35 = new File(targetDir, "index35.html");
        targetFile35.createNewFile();
        // Create a temporary file in the target directory
        File targetFile36 = new File(targetDir, "index36.html");
        targetFile36.createNewFile();
        // Create a temporary file in the target directory
        File targetFile37 = new File(targetDir, "index37.html");
        targetFile37.createNewFile();
        // Create a temporary file in the target directory
        File targetFile38 = new File(targetDir, "index38.html");
        targetFile38.createNewFile();
        // Create a temporary file in the target directory
        File targetFile39 = new File(targetDir, "index39.html");
        targetFile39.createNewFile();
        // Create a temporary file in the target directory
        File targetFile40 = new File(targetDir, "index40.html");
        targetFile40.createNewFile();
        // Create a temporary file in the target directory
        File targetFile41 = new File(targetDir, "index41.html");
        targetFile41.createNewFile();
        // Create a temporary file in the target directory
        File targetFile42 = new File(targetDir, "index42.html");
        targetFile42.createNewFile();
        // Create a temporary file in the target directory
        File targetFile43 = new File(targetDir, "index43.html");
        targetFile43.createNewFile();
        // Create a temporary file in the target directory
        File targetFile44 = new File(targetDir, "index44.html");
        targetFile44.createNewFile();
        // Create a temporary file in the target directory
        File targetFile45 = new File(targetDir, "index45.html");
        targetFile45.createNewFile();
        // Create a temporary file in the target directory
        File targetFile46 = new File(targetDir, "index46.html");
        targetFile46.createNewFile();
        // Create a temporary file in the target directory
        File targetFile47 = new File(targetDir, "index47.html");
        targetFile47.createNewFile();
        // Create a temporary file in the target directory
        File targetFile48 = new File(targetDir,