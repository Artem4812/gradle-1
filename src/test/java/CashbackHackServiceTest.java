import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldGetCashback() {
        int actual = cashbackHackService.remain(700);
        int expected = 300;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shouldGetCashbackIfAmount1000() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shouldGetCashbackIfAmount0() {
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual,expected);


    }
}