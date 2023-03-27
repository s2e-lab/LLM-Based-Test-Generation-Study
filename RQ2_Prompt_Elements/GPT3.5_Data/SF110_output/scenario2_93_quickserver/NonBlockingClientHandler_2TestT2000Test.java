@Test
void testGetMaxThreadAccessCount() {
    // Test case 1: Default value should be 1
    assertEquals(1, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 2: Set value to 5 and check if it returns 5
    NonBlockingClientHandler.setMaxThreadAccessCount(5);
    assertEquals(5, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 3: Set value to 0 and check if it returns 1 (minimum value)
    NonBlockingClientHandler.setMaxThreadAccessCount(0);
    assertEquals(1, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 4: Set value to -1 and check if it returns 1 (minimum value)
    NonBlockingClientHandler.setMaxThreadAccessCount(-1);
    assertEquals(1, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 5: Set value to Integer.MAX_VALUE and check if it returns Integer.MAX_VALUE
    NonBlockingClientHandler.setMaxThreadAccessCount(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 6: Set value to Integer.MIN_VALUE and check if it returns 1 (minimum value)
    NonBlockingClientHandler.setMaxThreadAccessCount(Integer.MIN_VALUE);
    assertEquals(1, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 7: Set value to 10 and check if it returns 10
    NonBlockingClientHandler.setMaxThreadAccessCount(10);
    assertEquals(10, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 8: Set value to 1 and check if it returns 1
    NonBlockingClientHandler.setMaxThreadAccessCount(1);
    assertEquals(1, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 9: Set value to 2 and check if it returns 2
    NonBlockingClientHandler.setMaxThreadAccessCount(2);
    assertEquals(2, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 10: Set value to 3 and check if it returns 3
    NonBlockingClientHandler.setMaxThreadAccessCount(3);
    assertEquals(3, NonBlockingClientHandler.getMaxThreadAccessCount());
}
}