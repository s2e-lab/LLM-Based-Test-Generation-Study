// AntiShuffleTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

    /**
     * Test case for the {@link AntiShuffle#antiShuffle(String)} method.
     */
    @Test
    void testAntiShuffle() {
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
        assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z", AntiShuffle.antiShuffle("z y x w v u t s r q p o n m l k j i h g f e d c b a"));
    }
}
