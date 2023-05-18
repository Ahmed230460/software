import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithDrawTest {
    WithDraw bank=new WithDraw();
    @Test
    void withDraw_1() {
        assertEquals(-1,bank.WithDraw_1(29000,49000));
        assertEquals(2000,bank.WithDraw_1(5000,3000));
        assertEquals(0,bank.WithDraw_1(1000,1000));
    }

    @Test
    void withDraw_2() {
        assertTrue(bank.WithDraw_2(5000,3000));
        assertTrue(bank.WithDraw_2(1000,1000));
        assertFalse(bank.WithDraw_2(29000,49000));
    }
}