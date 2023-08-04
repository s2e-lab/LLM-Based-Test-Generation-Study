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
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(false));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce2() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce3() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce4() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce5() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce6() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce7() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce8() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
    @Test
    void testBuildForce9() throws IOException {
        LagoonProcessor processor = new LagoonProcessor(new File("test/sitemap.xml"), new File("test/source"), new File("test/target"));
        assertTrue(processor.build(true));
    }

    /**
     * Test case for the {@link LagoonProcessor#build(boolean)} method.
     *
     * @throws IOException if any fatal error occur
     */
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
 * @author <NAME>
 */
class SitemapEntry {

    /**
     * The name of the entry.
     */
    private String name;

    /**
     * The path of the entry.
     */
    private String path;

    /**
     * The type of the entry.
     */
    private String type;

    /**
     * The source file of the entry.
     */
    private File sourceFile;

    /**
     * The target file of the entry.
     */
    private File targetFile;

    /**
     * The dependency of the entry.
     */
    private String dependency;

    /**
     * The processor of the entry.
     */
    private Processor processor;

    /**
     * The processor of the entry.
     */
    private List<Processor> processors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPreProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPreProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPreBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPostBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPreBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPreBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPreBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPreBuildPreProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostBuildPreProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostBuildPreBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPreBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPreBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPreBuildPostBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPreBuildPostBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostBuildPostBuildPostProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPreBuildPostBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPreBuildPostBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> postBuildPostBuildPostBuildPostBuildProcessors;

    /**
     * The processor of the entry.
     */
    private List<Processor> preBuildPreBuildPostBuildPostBuildPostProcessors;

   