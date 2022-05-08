import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindElementTest {
    @Test
    public void TestZerosMax()
    {
        int array[]= {0,0,0,0,0,0};
        assertEquals(0,FindElement.maxfind(array));
    }
    @Test
    public void TestZerosMin()
    {
        int array[]= {0,0,0,0,0,0};
        assertEquals(0,FindElement.minfind(array));
    }
    @Test
    public void TestPositivesMin()
    {
        int array[]= {5,22,33,7,9,9};
        assertEquals(5,FindElement.minfind(array));
    }
    @Test
    public void TestPositivesMax()
    {
        int array[]= {5,22,33,7,9,9};
        assertEquals(33,FindElement.maxfind(array));
    }

    @Test
    public void TestNegativesMin()
    {
        int array[]= {-88,-9,-2,-34,-41,-99};
        assertEquals(-99,FindElement.minfind(array));
    }
    @Test
    public void TestNegativesMax()
    {
        int array[]= {-88,-9,-2,-34,-41,-99};
        assertEquals(-2,FindElement.maxfind(array));
    }
    @Test
    public void TestMixedNumsMin()
    {
        int array[]= {-88,9,-2,34,-41,99};
        assertEquals(-88,FindElement.minfind(array));
    }
    @Test
    public void TestMixedNumsMax()
    {
        int array[]= {-88,9,-2,34,-41,99};
        assertEquals(99,FindElement.maxfind(array));
    }
    @Test
    public void TestLargeNumsMin()
    {
        int array[]= {-88993,92911,-2333,34123,-4139,993213};
        assertEquals(-88993,FindElement.minfind(array));
    }
    @Test
    public void TestLargeNumsMax()
    {
        int array[]= {-88993,92911,-2333,34123,-4139,993213};
        assertEquals(993213,FindElement.maxfind(array));
    }
}