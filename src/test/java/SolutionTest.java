import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void bestClosingTimeTest1() {
        String customers = "YYNY";
        int expected = 2;
        int actual = new Solution().bestClosingTime(customers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bestClosingTimeTest2() {
        String customers = "NNNNN";
        int expected = 0;
        int actual = new Solution().bestClosingTime(customers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bestClosingTimeTest3() {
        String customers = "YYYY";
        int expected = 4;
        int actual = new Solution().bestClosingTime(customers);

        Assert.assertEquals(expected, actual);
    }
}
