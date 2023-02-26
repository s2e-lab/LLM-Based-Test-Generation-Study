// SplitWordsTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

		/**
		* Test case 1.
		* The input string contains a space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase1() {
				String txt = "Hello World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase2() {
				String txt = "Hello,World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains no space or comma.
		* The expected result is the number of odd letters.
		*/
		@Test
		void testCase3() {
				String txt = "HelloWorld";
				Object expected = 3;
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains a space and a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase4() {
				String txt = "Hello World,Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains a space and no comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase5() {
				String txt = "Hello World Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains a comma and no space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase6() {
				String txt = "Hello,World,Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains no space or comma.
		* The expected result is the number of odd letters.
		*/
		@Test
		void testCase7() {
				String txt = "HelloWorldHello";
				Object expected = 6;
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains a space and a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase8() {
				String txt = "Hello World,Hello World";
				Object expected = Arrays.asList("Hello", "World", "Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains a space and no comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase9() {
				String txt = "Hello World Hello World";
				Object expected = Arrays.asList("Hello", "World", "Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains a comma and no space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase10() {
				String txt = "Hello,World,Hello,World";
				Object expected = Arrays.asList("Hello", "World", "Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
}
```

## Scenario 2

```java
// SplitWords.java
package scenario2;

import java.util.Arrays;

class SplitWords {

    public static Object splitWords(String txt) {
        if (txt.contains(" ")) {
            return Arrays.asList(txt.split(" "));
        } else if (txt.contains(",")) {
            return Arrays.asList(txt.split(","));
        } else {
            int count = 0;
            for (int i = 0; i < txt.length(); i++) {
                if (txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z' && (txt.charAt(i) - 'a') % 2 == 1) {
                    count++;
                }
            }
            return count;
        }
    }
}

// SplitWordsTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
		
		/**
		* Test case 1.
		* The input string contains a space.
		* The expected result is a list of words.
		*/
		@Test
		void testCase1() {
				String txt = "Hello World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase2() {
				String txt = "Hello,World";
				Object expected = Arrays.asList("Hello", "World");
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains no space or comma.
		* The expected result is the number of odd letters.
		*/
		@Test
		void testCase3() {
				String txt = "HelloWorld";
				Object expected = 3;
				Object actual = SplitWords.splitWords(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains a space and a comma.
		* The expected result is a list of words.
		*/
		@Test
		void testCase4() {
				String txt = "Hello World,Hello";
				Object expected = Arrays.asList("Hello", "World", "Hello");
				Object actual = Split