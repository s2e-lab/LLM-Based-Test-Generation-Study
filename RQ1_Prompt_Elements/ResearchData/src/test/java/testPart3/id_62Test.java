class DerivativeTest {
    @Test
    void testDerivative() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(1);
        xs.add(2);
        xs.add(4);
        xs.add(5);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(4);
        result.add(12);
        result.add(20);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative2() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(6);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative3() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(2);
        xs.add(1);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(2);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative4() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(2);
        xs.add(1);
        xs.add(0);
        xs.add(4);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(2);
        result.add(0);
        result.add(16);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative5() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative6() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(1);
        xs.add(2);
        xs.add(4);
        xs.add(5);
        List<Object> result = new ArrayList<Object>();
        result.add(1);
        result.add(4);
        result.add(12);
        result.add(20);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative7() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(6);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative8() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(2);
        xs.add(1);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(2);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative9() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(2);
        xs.add(1);
        xs.add(0);
        xs.add(4);
        List<Object> result = new ArrayList<Object>();
        result.add(2);
        result.add(2);
        result.add(0);
        result.add(16);
        assertEquals(result, Derivative.derivative(xs));
    }
    @Test
    void testDerivative10() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, Derivative.derivative(xs));
    }
}