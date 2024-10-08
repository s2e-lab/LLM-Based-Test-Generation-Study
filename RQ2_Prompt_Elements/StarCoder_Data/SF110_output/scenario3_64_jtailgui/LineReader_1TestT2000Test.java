// LineReader_1Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains ten unit test cases for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {

    /**
     * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
     *
     * @throws java.io.IOException if an I/O error occurs
     */
    @Test
    void testReadBlock() throws IOException {
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
        JTailLogger.setTrace(true);
        JTailLogger.setInfo(true);
        JTailLogger.setWarn(true);
        JTailLogger.setErr(true);
        JTailLogger.setFatal(true);
        JTailLogger.setOff(true);
        JTailLogger.setAll(true);
        JTailLogger.setDebug(false);
        JTailLogger.setTrace(false);
        JTailLogger.setInfo(false);
        JTailLogger.setWarn(false);
        JTailLogger.setErr(false);
        JTailLogger.setFatal(false);
        JTailLogger.setOff(false);
        JTailLogger.setAll(false);
        JTailLogger.setDebug(true);
       