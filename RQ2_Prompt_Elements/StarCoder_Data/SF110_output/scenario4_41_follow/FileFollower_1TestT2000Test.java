// FileFollower_1Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {

    /**
    * Test method for {@link ghm.follow.FileFollower#removeOutputDestination(OutputDestination)}.
    */
    @Test
    void testRemoveOutputDestination() {
        // create a file to follow
        File file = new File("test.txt");
        // create a FileFollower
        FileFollower follower = new FileFollower(file);
        // create a list of OutputDestinations
        List<OutputDestination> outputDestinations = new ArrayList<OutputDestination>();
        // create a few OutputDestinations
        OutputDestination destination1 = new OutputDestination() {
            public void print(String s) {
                System.out.println("destination1: " + s);
            }
        };
        OutputDestination destination2 = new OutputDestination() {
            public void print(String s) {
                System.out.println("destination2: " + s);
            }
        };
        OutputDestination destination3 = new OutputDestination() {
            public void print(String s) {
                System.out.println("destination3: " + s);
            }
        };
        // add the OutputDestinations to the list
        outputDestinations.add(destination1);
        outputDestinations.add(destination2);
        outputDestinations.add(destination3);
        // add the list to the FileFollower
        follower.setOutputDestinations(outputDestinations);
        // remove the first OutputDestination
        follower.removeOutputDestination(destination1);
        // remove the second OutputDestination
        follower.removeOutputDestination(destination2);
        // remove the third OutputDestination
        follower.removeOutputDestination(destination3);
        // start the FileFollower
        follower.start();
        // write some text to the file
        try {
            file.createNewFile();
            file.setLastModified(System.currentTimeMillis());
            file.setReadOnly();
            file.setWritable(false);
            file.setReadable(false);
            file.setExecutable(false);
            file.setWritable(false, false);
            file.setReadable(false, false);
            file.setExecutable(false, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file.setReadOnly();
            file.setReadOnly(false);
            file.setWritable(true);
            file.setWritable(true, false);
            file.setReadable(true);
            file.setReadable(true, false);
            file.setExecutable(true);
            file.setExecutable(true, false);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis(), false);
            file.setLastModified(System.currentTimeMillis(), true);
            file