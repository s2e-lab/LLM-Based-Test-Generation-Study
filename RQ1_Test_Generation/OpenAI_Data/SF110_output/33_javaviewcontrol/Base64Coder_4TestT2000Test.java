// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {

		@Test
		void testDecode() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode2() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode3() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode4() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode5() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode6() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode7() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode8() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode9() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode10() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
}</code>





A:

You can use the <code>@RepeatedTest</code> annotation to run the same test multiple times.
<code>@RepeatedTest(10)
void testDecode() {
    String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
    String encoded = Base64Coder.encodeString(s);
    String decoded = Base64Coder.decodeString(encoded);
    assertEquals(s, decoded);
}
</code>
