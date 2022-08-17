import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldGetCashback() {
        int actual = cashbackHackService.remain(700);
        int expected = 300;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetCashbackIfAmount1000() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldGetCashbackIfAmount0() {
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

}
