import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class oddOrEvenTest {
    @Test
    public void TestSmallEvenPositiveNums() { assertTrue(oddOrEven.evenCheck(10));}
    @Test
    public void TestLargeEvenPositiveNums()
    {
        assertFalse(oddOrEven.oddCheck(1200));
    }
    @Test
    public void TestSmallOddPositiveNums()
    {
        assertTrue(oddOrEven.oddCheck(9));
    }
    @Test
    public void TestLargeOddPositiveNums()
    {
        assertTrue(oddOrEven.oddCheck(1203));
    }
    @Test
    public void TestNegativeNums()
    {
        assertFalse(oddOrEven.oddCheck(-10));
    }
    @Test
    public void TestZero()
    {
        assertFalse(oddOrEven.oddCheck(0));
    }
    @Test
    public void TestSmallEvenPositiveNumsOnEven()
    {
        assertTrue(oddOrEven.evenCheck(10));
    }
    @Test
    public void TestLargeEvenPositiveNumsOnEven()
    {
        assertTrue(oddOrEven.evenCheck(1200));
    }
    @Test
    public void TestSmallOddPositiveNumsOnEven() { assertFalse(oddOrEven.evenCheck(9));}
    @Test
    public void TestLargeOddPositiveNumsOnEven()
    {
        assertFalse(oddOrEven.evenCheck(1203));
    }
    @Test
    public void TestNegativeNumsOnEven()
    {
        assertFalse(oddOrEven.evenCheck(-10));
    }
    @Test
    public void TestZeroOnEven()
    {
        assertTrue(oddOrEven.evenCheck(0));
    }
}