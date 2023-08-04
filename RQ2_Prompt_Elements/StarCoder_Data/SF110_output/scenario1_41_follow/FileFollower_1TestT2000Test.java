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

    private static final Logger LOGGER = Logger.getLogger(FileFollower_1Test.class.getName());

    /**
     * Test of removeOutputDestination method, of class FileFollower.
     */
    @Test
    void testRemoveOutputDestination() {
        LOGGER.log(Level.INFO, "testRemoveOutputDestination");
        File file = new File("src/test/resources/test.txt");
        FileFollower instance = new FileFollower(file);
        OutputDestination outputDestination = new OutputDestination() {
            @Override
            public void write(String string) {
                LOGGER.log(Level.INFO, "write: {0}", string);
            }
        };
        instance.addOutputDestination(outputDestination);
        assertTrue(instance.removeOutputDestination(outputDestination));
        assertFalse(instance.removeOutputDestination(outputDestination));
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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_2Test {
		
    private static final Logger LOGGER = Logger.getLogger(FileFollower_2Test.class.getName());

    /**
     * Test of removeOutputDestination method, of class FileFollower.
     */
    @Test
    void testRemoveOutputDestination() {
        LOGGER.log(Level.INFO, "testRemoveOutputDestination");
        File file = new File("src/test/resources/test.txt");
        FileFollower instance = new FileFollower(file);
        OutputDestination outputDestination = new OutputDestination() {
            @Override
            public void write(String string) {
                LOGGER.log(Level.INFO, "write: {0}", string);
            }
        };
        instance.addOutputDestination(outputDestination);
        assertTrue(instance.removeOutputDestination(outputDestination));
        assertFalse(instance.removeOutputDestination(outputDestination));
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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_3Test {
		
    private static final Logger LOGGER = Logger.getLogger(FileFollower_3Test.class.getName());

    /**
     * Test of removeOutputDestination method, of class FileFollower.
     */
    @Test
    void testRemoveOutputDestination() {
        LOGGER.log(Level.INFO, "testRemoveOutputDestination");
        File file = new File("src/test/resources/test.txt");
        FileFollower instance = new FileFollower(file);
        OutputDestination outputDestination = new OutputDestination() {
            @Override
            public void write(String string) {
                LOGGER.log(Level.INFO, "write: {0}", string);
            }
        };
        instance.addOutputDestination(outputDestination);
        assertTrue(instance.removeOutputDestination(outputDestination));
        assertFalse(instance.removeOutputDestination(outputDestination));
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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_4Test {
		
    private static final Logger LOGGER = Logger.getLogger(FileFollower_4Test.class.getName());

    /**
     * Test of removeOutputDestination method, of class FileFollower.
     */
    @Test
    void testRemoveOutputDestination() {
        LOGGER.log(Level.INFO, "testRemoveOutputDestination");
        File file = new File("src/test/resources/test.txt");
        FileFollower instance = new FileFollower(file);
        OutputDestination outputDestination = new OutputDestination() {
            @Override
            public void write(String string) {
                LOGGER.log(Level.INFO, "write: {0}", string);
            }
        };
        instance.addOutputDestination(outputDestination);
        assertTrue(instance.removeOutputDestination(outputDestination));
        assertFalse(instance.removeOutputDestination(outputDestination));
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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_5Test {
		
    private static final Logger LOGGER = Logger.getLogger(FileFollower_5Test.class.getName());

    /**
     * Test of removeOutputDestination method, of class FileFollower.
     */
    @Test
    void testRemoveOutputDestination() {
        LOGGER.log(Level.INFO, "testRemoveOutputDestination");
        File file = new File("src/test/resources/test.txt");
        FileFollower instance = new FileFollower(file);
        OutputDestination outputDestination = new OutputDestination() {
            @Override
            public void write(String string) {
                LOGGER.log(Level.INFO, "write: {0}", string);
            }
        };
        instance.addOutputDestination(outputDestination);
        assertTrue(instance.removeOutputDestination(outputDestination));
        assertFalse(instance.removeOutputDestination(outputDestination));
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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_6Test {
		
    private static final Logger LOGGER = Logger.getLogger(FileFollower_6Test.class.getName());

    /**
     * Test of removeOutputDestination method, of class FileFollower.
     */
    @Test
    void testRemoveOutputDestination() {
        LOGGER.log(Level.INFO, "testRemoveOutputDestination");
        File file = new File("src/test/resources/test.txt");
        FileFollower instance = new FileFollower(file);
        OutputDestination outputDestination = new OutputDestination() {
            @Override
            public void write(String string) {
                LOGGER.log(Level.INFO, "write: {0}", string);
            }
        };
        instance.addOutputDestination(outputDestination);
        assertTrue(instance.removeOutputDestination(outputDestination));
        assertFalse(instance.removeOutputDestination(outputDestination));
    }
}

// FileFollower_7Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
