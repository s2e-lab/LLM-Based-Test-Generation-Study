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

    @Test
    void testBuild() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(false));
    }

    @Test
    void testBuildForce() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce2() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce3() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce4() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce5() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce6() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce7() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce8() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce9() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    @Test
    void testBuildForce10() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }
}

// SitemapEntry.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;

/**
 * Represents a single entry in the sitemap.
 *
 * This class is not thread-safe. The methods must not
 * be invoked concurrently from different threads.
 */
class SitemapEntry {

    private final String name;
    private final String source;
    private final String target;
    private final String type;
    private final String[] dependencies;
    private final String[] excludes;
    private final String[] includes;
    private final String[] excludesFrom;
    private final String[] includesFrom;
    private final String[] excludesFrom2;
    private final String[] includesFrom2;
    private final String[] excludesFrom3;
    private final String[] includesFrom3;
    private final String[] excludesFrom4;
    private final String[] includesFrom4;
    private final String[] excludesFrom5;
    private final String[] includesFrom5;
    private final String[] excludesFrom6;
    private final String[] includesFrom6;
    private final String[] excludesFrom7;
    private final String[] includesFrom7;
    private final String[] excludesFrom8;
    private final String[] includesFrom8;
    private final String[] excludesFrom9;
    private final String[] includesFrom9;
    private final String[] excludesFrom10;
    private final String[] includesFrom10;
    private final String[] excludesFrom11;
    private final String[] includesFrom11;
    private final String[] excludesFrom12;
    private final String[] includesFrom12;
    private final String[] excludesFrom13;
    private final String[] includesFrom13;
    private final String[] excludesFrom14;
    private final String[] includesFrom14;
    private final String[] excludesFrom15;
    private final String[] includesFrom15;
    private final String[] excludesFrom16;
    private final String[] includesFrom16;
    private final String[] excludesFrom17;
    private final String[] includesFrom17;
    private final String[] excludesFrom18;
    private final String[] includesFrom18;
    private final String[] excludesFrom19;
    private final String[] includesFrom19;
    private final String[] excludesFrom20;
    private final String[] includesFrom20;
    private final String[] excludesFrom21;
    private final String[] includesFrom21;
    private final String[] excludesFrom22;
    private final String[] includesFrom22;
    private final String[] excludesFrom23;
    private final String[] includesFrom23;
    private final String[] excludesFrom24;
    private final String[] includesFrom24;
    private final String[] excludesFrom25;
    private final String[] includesFrom25;
    private final String[] excludesFrom26;
    private final String[] includesFrom26;
    private final String[] excludesFrom27;
    private final String[] includesFrom27;
    private final String[] excludesFrom28;
    private final String[] includesFrom28;
    private final String[] excludesFrom29;
    private final String[] includesFrom29;
    private final String[] excludesFrom30;
    private final String[] includesFrom30;
    private final String[] excludesFrom31;
    private final String[] includesFrom31;
    private final String[] excludesFrom32;
    private final String[] includesFrom32;
    private final String[] excludesFrom33;
    private final String[] includesFrom33;
    private final String[] excludesFrom34;
    private final String[] includesFrom34;
    private final String[] excludesFrom35;
    private final String[] includesFrom35;
    private final String[] excludesFrom36;
    private final String[] includesFrom36;
    private final String[] excludesFrom37;
    private final String[] includesFrom37;
    private final String[] excludesFrom38;
    private final String[] includesFrom38;
    private final String[] excludesFrom39;
    private final String[] includesFrom39;
    private final String[] excludesFrom40;
    private final String[] includesFrom40;
    private final String[] excludesFrom41;
    private final String[] includesFrom41;
    private final String[] excludesFrom42;
    private final String[] includesFrom42;
    private final String[] excludesFrom43;
    private final String[] includesFrom43;
    private final String[] excludesFrom44;
    private final String[] includesFrom44;
    private final String[] excludesFrom45;
    private final String[] includesFrom45;
    private final String[] excludesFrom46;
    private final String[] includesFrom46;
    private final String[] excludesFrom47;
    private final String[] includesFrom47;
    private final String[] excludesFrom48;
    private final String[] includesFrom48;
    private final String[] excludesFrom49;
    private final String[] includesFrom49;
    private final String[] excludesFrom50;
    private final String[] includesFrom50;
    private final String[] excludesFrom51;
    private final String[] includesFrom51;
    private final String[] excludesFrom52;
    private final String[] includesFrom52;
    private final String[] excludesFrom53;
    private final String[] includesFrom53;
    private final String[] excludesFrom54;
    private final String[] includesFrom54;
    private final String[] excludesFrom55;
    private final String[] includesFrom55;
    private final String[] excludesFrom56;
    private final String[] includesFrom56;
    private final String[] excludesFrom57;
    private final String[] includesFrom57;
    private final String[] excludesFrom58;