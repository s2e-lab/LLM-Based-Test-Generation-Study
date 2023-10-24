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
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 10, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.println("clear");
            }
        };
        // add the new OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check if the new OutputDestination is in the list of OutputDestinations
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
    }
}

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
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 10, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.println("clear");
            }
        };
        // add the new OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check if the new OutputDestination is in the list of OutputDestinations
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        // remove the new OutputDestination from the FileFollower
        fileFollower.removeOutputDestination(outputDestination);
        // check if the new OutputDestination is not in the list of OutputDestinations
        assertFalse(fileFollower.getOutputDestinations().contains(outputDestination));
    }
}

// FileFollower_2Test.java
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
* It contains ten unit test cases for the {@link FileFollower#getOutputDestinations()} method.
*/
class FileFollower_2Test {
		
    /**
    * Test method for {@link ghm.follow.FileFollower#getOutputDestinations()}.
    */
    @Test
    void testGetOutputDestinations() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 10, 1000, null);
        // create a new OutputDestination
        OutputDestination outputDestination = new OutputDestination() {
            public void print(String s) {
                System.out.print(s);
            }

            public void clear() {
                System.out.println("clear");
            }
        };
        // add the new OutputDestination to the FileFollower
        fileFollower.addOutputDestination(outputDestination);
        // check if the new OutputDestination is in the list of OutputDestinations
        assertTrue(fileFollower.getOutputDestinations().contains(outputDestination));
        // remove the new OutputDestination from the FileFollower
        fileFollower.removeOutputDestination(outputDestination);
        // check if the new OutputDestination is not in the list of OutputDestinations
        assertFalse(fileFollower.getOutputDestinations().contains(outputDestination));
    }
}

// FileFollower_3Test.java
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
* It contains ten unit test cases for the {@link FileFollower#getFollowedFile()} method.
*/
class FileFollower_3Test {
		
    /**
    * Test method for {@link ghm.follow.FileFollower#getFollowedFile()}.
    */
    @Test
    void testGetFollowedFile() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 10, 1000, null);
        // check if the new FileFollower's followed file is the same as the one supplied in the constructor
        assertEquals(fileFollower.getFollowedFile(), new File("test.txt"));
    }
}

// FileFollower_4Test.java
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
* It contains ten unit test cases for the {@link FileFollower#isBeingFollowed()} method.
*/
class FileFollower_4Test {
		
    /**
    * Test method for {@link ghm.follow.FileFollower#isBeingFollowed()}.
    */
    @Test
    void testIsBeingFollowed() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 10, 1000, null);
        // check if the new FileFollower is not being followed
        assertFalse(fileFollower.isBeingFollowed());
    }
}

// FileFollower_5Test.java
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
* It contains ten unit test cases for the {@link FileFollower#isPaused()} method.
*/
class FileFollower_5Test {
		
    /**
    * Test method for {@link ghm.follow.FileFollower#isPaused()}.
    */
    @Test
    void testIsPaused() {
        // create a new FileFollower
        FileFollower fileFollower = new FileFollower(new File("test.txt"), 10, 1000, null);
        // check if the new FileFollower is not paused
        assertFalse(fileFollower.isPaused());
    }
}

// FileFollower_6Test.java
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
* It contains ten unit test cases for the {@link FileFollower#getBufferSize()} method.
*/
class FileFollower_6Test {
		
    /**
    * Test method for {@link ghm.