import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class watchTest {
    @Nested
    class EdgeCoverage{
        watch mainObj;
        @BeforeEach
        public void setup(){
            mainObj = new watch();
        }
        @Test
        public void EdgeCoverageCaseOne(){
            String[] res = mainObj.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("DATE", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void EdgeCoverageCaseTwo(){
            mainObj.input('a');
            String[] res = mainObj.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void EdgeCoverageCaseThree(){
            mainObj.input('a');
            mainObj.input('a');
            String[] res = mainObj.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void EdgeCoverageCaseFour(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseFive(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseSix(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseSeven(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseEight(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseNine(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseTen(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseEleven(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseTwelve(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseThirteen(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseFourteen(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseFifteen(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            String[] res = mainObj.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseSixteen(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('d');
            String[] res = mainObj.input('b');
            assertEquals("ALARM", res[0]);
            assertEquals("Alarm", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseSeventeen(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('d');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("ALARM", res[0]);
            assertEquals("Chime", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void EdgeCoverageCaseEighteen(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('d');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
    }
    @Nested
    class ADUP{
        watch mainObj;
        @BeforeEach
        public void setup(){
            mainObj = new watch();
        }
        @Test
        public void ADUPCaseOne(){
            String[] res = mainObj.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void ADUPCaseTwo(){
            mainObj.input('c');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }
        @Test
        public void ADUPCaseThree(){
            mainObj.input('c');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }
        @Test
        public void ADUPCaseFour(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }
        @Test
        public void ADUPFiveCase(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:2", res[3]);
        }
        @Test
        public void ADUPCaseSix(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseSeven(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseEight(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseNine(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPTCaseTen(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseEleven(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-2-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseTwelve(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseThirteen(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseFourteen(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2001-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUPCaseFifteen(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2002-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
    }

}
