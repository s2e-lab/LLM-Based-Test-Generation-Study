Here's an example of how you can write unit tests for the `Encode` class:

```
@Test
void testEncode_lowercase() {
    String message = "hello";
    String expected = "JGNNQ";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_uppercase() {
    String message = "WORLD";
    String expected = "dqtfn";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_mixedcase() {
    String message = "HeLLo WoRLd";
    String expected = "jGnnQ dQtfN";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_noVowels() {
    String message = "hmm";
    String expected = "JOO";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_allVowels() {
    String message = "aeiouAEIOU";
    String expected = "cgkqwCGKQW";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_emptyString() {
    String message = "";
    String expected = "";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_singleChar() {
    String message = "a";
    String expected = "C";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_specialChars() {
    String message = "!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/";
    String expected = "!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_numbers() {
    String message = "1234567890";
    String expected = "1234567890";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}

@Test
void testEncode_longString() {
    String message = "The quick brown fox jumps over the lazy dog.";
    String expected = "Ujg swkem dtqyp hqz lworu qxgt vjg ncba fqi.";
    String actual = Encode.encode(message);
    assertEquals(expected, actual);
}
```

These tests cover various scenarios such as lowercase, uppercase, mixed case, no vowels, all vowels, empty string, single character, special characters, numbers, and a long string. By testing these scenarios, we can ensure that the `Encode` class works as expected and handles different types of input correctly.