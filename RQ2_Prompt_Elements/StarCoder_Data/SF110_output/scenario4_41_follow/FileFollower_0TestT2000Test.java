// FileFollower_0Test.java
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
* It contains ten unit test cases for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {

    /**
    * Test method for {@link ghm.follow.FileFollower#addOutputDestination(OutputDestination)}.
    */
    @Test
    void testAddOutputDestination() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 1024, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        // add the OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
    }

    /**
    * Test method for {@link ghm.follow.FileFollower#addOutputDestination(OutputDestination)}.
    */
    @Test
    void testAddOutputDestination_0() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 1024, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        // add the OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        // add the same OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
    }

    /**
    * Test method for {@link ghm.follow.FileFollower#addOutputDestination(OutputDestination)}.
    */
    @Test
    void testAddOutputDestination_1() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 1024, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        // add the OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        // add a different OutputDestination to the FileFollower
        OutputDestination outputDestination2 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination2);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
    }

    /**
    * Test method for {@link ghm.follow.FileFollower#addOutputDestination(OutputDestination)}.
    */
    @Test
    void testAddOutputDestination_2() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 1024, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        // add the OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        // add a different OutputDestination to the FileFollower
        OutputDestination outputDestination2 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination2);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        // add a third OutputDestination to the FileFollower
        OutputDestination outputDestination3 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination3);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination3));
    }

    /**
    * Test method for {@link ghm.follow.FileFollower#addOutputDestination(OutputDestination)}.
    */
    @Test
    void testAddOutputDestination_3() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 1024, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        // add the OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        // add a different OutputDestination to the FileFollower
        OutputDestination outputDestination2 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination2);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        // add a third OutputDestination to the FileFollower
        OutputDestination outputDestination3 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination3);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination3));
        // add a fourth OutputDestination to the FileFollower
        OutputDestination outputDestination4 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination4);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination3));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination4));
    }

    /**
    * Test method for {@link ghm.follow.FileFollower#addOutputDestination(OutputDestination)}.
    */
    @Test
    void testAddOutputDestination_4() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 1024, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        // add the OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        // add a different OutputDestination to the FileFollower
        OutputDestination outputDestination2 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination2);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        // add a third OutputDestination to the FileFollower
        OutputDestination outputDestination3 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination3);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination3));
        // add a fourth OutputDestination to the FileFollower
        OutputDestination outputDestination4 = new OutputDestination() {
            public void print(String s) {
                System.out.println(s);
            }
        };
        fileFollower.addOutputDestination(outputDestination4);
        // check that the OutputDestination was added
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination2));
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination3));
        assertTrue(fileFollower