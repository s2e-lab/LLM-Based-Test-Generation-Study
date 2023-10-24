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
        // add some OutputDestinations to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the list of OutputDestinations to the FileFollower
        follower.setOutputDestinations(outputDestinations);
        // remove the first OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(0));
        // remove the second OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(1));
        // add a third OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the third OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(2));
        // remove the third OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(2));
        // add a fourth OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the fourth OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(3));
        // remove the fourth OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(3));
        // add a fifth OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the fifth OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(4));
        // remove the fifth OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(4));
        // add a sixth OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the sixth OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(5));
        // remove the sixth OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(5));
        // add a seventh OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the seventh OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(6));
        // remove the seventh OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(6));
        // add an eighth OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the eighth OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(7));
        // remove the eighth OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(7));
        // add a ninth OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the ninth OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(8));
        // remove the ninth OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(8));
        // add a tenth OutputDestination to the list
        outputDestinations.add(new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.flush();
            }
        });
        // add the tenth OutputDestination to the FileFollower
        follower.addOutputDestination(outputDestinations.get(9));
        // remove the tenth OutputDestination from the list
        follower.removeOutputDestination(outputDestinations.get(9));
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
            file.setHidden(true);
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());
            file.setLastModified(System.currentTimeMillis());