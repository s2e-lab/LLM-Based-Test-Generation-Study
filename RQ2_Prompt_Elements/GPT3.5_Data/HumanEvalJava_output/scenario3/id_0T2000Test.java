// Here's the generated code for the test cases:

    @Test
    void testNoCloseElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 0.5;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testCloseElements() {
        List<Double> numbers = List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.3;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testCloseElements2() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        Double threshold = 0.3;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testNoCloseElements2() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        Double threshold = 0.05;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testCloseElements3() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        Double threshold = 0.95;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testNoCloseElements3() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        Double threshold = 0.8;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testCloseElements4() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.1;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testCloseElements5() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    @Test
    void testNoCloseElements4() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        Double threshold = 0.5;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }