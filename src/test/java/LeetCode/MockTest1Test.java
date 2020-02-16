package LeetCode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockTest1Test {
    MockTest1 mt1;

    @BeforeEach
    void setUp() {
        this.mt1 = new MockTest1();
    }

    @Test
    void canWinNim() {
        assert mt1.canWinNim(1);
        assert mt1.canWinNim(2);
        assert mt1.canWinNim(3);
        assertFalse(mt1.canWinNim(4));
    }

    @Test
    void hammingDistance(){
        assertEquals(2, mt1.hammingDistance(1, 4));
        assertEquals(0, mt1.hammingDistance(15, 15));
        assertEquals(4, mt1.hammingDistance(7, 16));
        assertEquals(0, mt1.hammingDistance(0, 0));
    }


}