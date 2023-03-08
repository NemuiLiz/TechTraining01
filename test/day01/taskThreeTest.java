package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class taskThreeTest {
    //values to test: 0, 2, 13
    //Test cases:
    @Test
    public void shouldBeDivisible() {
        int zero = 0;
        int two = 2;

        assertTrue(taskThree.isDivisibleByTwo(two));
        assertTrue(taskThree.isDivisibleByTwo(zero));

    }
    @Test
    public void shouldNotBeDivisible() {
        int thirteen = 13;
        int twentyone = 21;

        assertFalse(taskThree.isDivisibleByTwo(thirteen));
        assertFalse(taskThree.isDivisibleByTwo(twentyone));
    }
}