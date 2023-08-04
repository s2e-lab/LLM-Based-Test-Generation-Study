// LocalFileStorage_1Test.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorage_1Test {

    /**
    * Test method for {@link LocalFileStorage#fileLastModified(String)}.
    *
    * @throws java.io.IOException
    */
    @Test
    void testFileLastModified() throws java.io.IOException {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            assertEquals(0, storage.fileLastModified("test"));
            storage.createFile("test/file1").commit();
            assertEquals(0, storage.fileLastModified("test/file1"));
            storage.createFile("test/file2").commit();
            assertEquals(0, storage.fileLastModified("test/file2"));
            storage.createFile("test/file3").commit();
            assertEquals(0, storage.fileLastModified("test/file3"));
            storage.createFile("test/file4").commit();
            assertEquals(0, storage.fileLastModified("test/file4"));
            storage.createFile("test/file5").commit();
            assertEquals(0, storage.fileLastModified("test/file5"));
            storage.createFile("test/file6").commit();
            assertEquals(0, storage.fileLastModified("test/file6"));
            storage.createFile("test/file7").commit();
            assertEquals(0, storage.fileLastModified("test/file7"));
            storage.createFile("test/file8").commit();
            assertEquals(0, storage.fileLastModified("test/file8"));
            storage.createFile("test/file9").commit();
            assertEquals(0, storage.fileLastModified("test/file9"));
            storage.createFile("test/file10").commit();
            assertEquals(0, storage.fileLastModified("test/file10"));
            storage.createFile("test/file11").commit();
            assertEquals(0, storage.fileLastModified("test/file11"));
            storage.createFile("test/file12").commit();
            assertEquals(0, storage.fileLastModified("test/file12"));
            storage.createFile("test/file13").commit();
            assertEquals(0, storage.fileLastModified("test/file13"));
            storage.createFile("test/file14").commit();
            assertEquals(0, storage.fileLastModified("test/file14"));
            storage.createFile("test/file15").commit();
            assertEquals(0, storage.fileLastModified("test/file15"));
            storage.createFile("test/file16").commit();
            assertEquals(0, storage.fileLastModified("test/file16"));
            storage.createFile("test/file17").commit();
            assertEquals(0, storage.fileLastModified("test/file17"));
            storage.createFile("test/file18").commit();
            assertEquals(0, storage.fileLastModified("test/file18"));
            storage.createFile("test/file19").commit();
            assertEquals(0, storage.fileLastModified("test/file19"));
            storage.createFile("test/file20").commit();
            assertEquals(0, storage.fileLastModified("test/file20"));
            storage.createFile("test/file21").commit();
            assertEquals(0, storage.fileLastModified("test/file21"));
            storage.createFile("test/file22").commit();
            assertEquals(0, storage.fileLastModified("test/file22"));
            storage.createFile("test/file23").commit();
            assertEquals(0, storage.fileLastModified("test/file23"));
            storage.createFile("test/file24").commit();
            assertEquals(0, storage.fileLastModified("test/file24"));
            storage.createFile("test/file25").commit();
            assertEquals(0, storage.fileLastModified("test/file25"));
            storage.createFile("test/file26").commit();
            assertEquals(0, storage.fileLastModified("test/file26"));
            storage.createFile("test/file27").commit();
            assertEquals(0, storage.fileLastModified("test/file27"));
            storage.createFile("test/file28").commit();
            assertEquals(0, storage.fileLastModified("test/file28"));
            storage.createFile("test/file29").commit();
            assertEquals(0, storage.fileLastModified("test/file29"));
            storage.createFile("test/file30").commit();
            assertEquals(0, storage.fileLastModified("test/file30"));
            storage.createFile("test/file31").commit();
            assertEquals(0, storage.fileLastModified("test/file31"));
            storage.createFile("test/file32").commit();
            assertEquals(0, storage.fileLastModified("test/file32"));
            storage.createFile("test/file33").commit();
            assertEquals(0, storage.fileLastModified("test/file33"));
            storage.createFile("test/file34").commit();
            assertEquals(0, storage.fileLastModified("test/file34"));
            storage.createFile("test/file35").commit();
            assertEquals(0, storage.fileLastModified("test/file35"));
            storage.createFile("test/file36").commit();
            assertEquals(0, storage.fileLastModified("test/file36"));
            storage.createFile("test/file37").commit();
            assertEquals(0, storage.fileLastModified("test/file37"));
            storage.createFile("test/file38").commit();
            assertEquals(0, storage.fileLastModified("test/file38"));
            storage.createFile("test/file39").commit();
            assertEquals(0, storage.fileLastModified("test/file39"));
            storage.createFile("test/file40").commit();
            assertEquals(0, storage.fileLastModified("test/file40"));
            storage.createFile("test/file41").commit();
            assertEquals(0, storage.fileLastModified("test/file41"));
            storage.createFile("test/file42").commit();
            assertEquals(0, storage.fileLastModified("test/file42"));
            storage.createFile("test/file43").commit();
            assertEquals(0, storage.fileLastModified("test/file43"));
            storage.createFile("test/file44").commit();
            assertEquals(0, storage.fileLastModified("test/file44"));
            storage.createFile("test/file45").commit();
            assertEquals(0, storage.fileLastModified("test/file45"));
            storage.createFile("test/file46").commit();
            assertEquals(0, storage.fileLastModified("test/file46"));
            storage.createFile("test/file47").commit();
            assertEquals(0, storage.fileLastModified("test/file47"));
            storage.createFile("test/file48").commit();
            assertEquals(0, storage.fileLastModified("test/file48"));
            storage.createFile("test/file49").commit();
            assertEquals(0, storage.fileLastModified("test/file49"));
            storage.createFile("test/file50").commit();
            assertEquals(0, storage.fileLastModified("test/file50"));
            storage.createFile("test/file51").commit();
            assertEquals(0, storage.fileLastModified("test/file51"));
            storage.createFile("test/file52").commit();
            assertEquals(0, storage.fileLastModified("test/file52"));
            storage.createFile("test/file53").commit();
            assertEquals(0, storage.fileLastModified("test/file53"));
            storage.createFile("test/file54").commit();
            assertEquals(0, storage.fileLastModified("test/file54"));
            storage.createFile("test/file55").commit();
            assertEquals(0, storage.fileLastModified("test/file55"));
            storage.createFile("test/file56").commit();
            assertEquals(0, storage.fileLastModified("test/file56"));
            storage.createFile("test/file57").commit();
            assertEquals(0, storage.fileLastModified("test/file57"));
            storage.createFile("test/file58").commit();
            assertEquals(0, storage.fileLastModified("test/file58"));
            storage.createFile("test/file59").commit();
            assertEquals(0, storage.fileLastModified("test/file59"));
            storage.createFile("test/file60").commit();
            assertEquals(0, storage.fileLastModified("test/file60"));
            storage.createFile("test/file61").commit();
            assertEquals(0, storage.fileLastModified("test/file61"));
            storage.createFile("test/file62").commit();
            assertEquals(0, storage.fileLastModified("test/file62"));
            storage.createFile("test/file63").commit();
            assertEquals(0, storage.fileLastModified("test/file63"));
            storage.createFile("test/file64").commit();
            assertEquals(0, storage.fileLastModified("test/file64"));
            storage.createFile("test/file65").commit();