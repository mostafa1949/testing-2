import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;


class WatchTest {
    @Test
    void Test1() throws IOException {
        Watch w1 = new Watch();
        w1.setinputString("abbcd");
        w1.States();
        Path realOutput_file = Paths.get("Output.txt");
        List<String> contentOf_realOutput_file = Files.readAllLines(realOutput_file);
        Path expectedOutput_file = Paths.get("Test1.txt");
        List<String> contentOf_expectedOutput_file = Files.readAllLines(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }

    @Test
    void Test2() throws IOException {
        Watch w2 = new Watch();
        w2.setinputString("Aa");
        w2.States();
        Path realOutput_file = Paths.get("Output.txt");
        List<String> contentOf_realOutput_file = Files.readAllLines(realOutput_file);
        Path expectedOutput_file = Paths.get("Test2.txt");
        List<String> contentOf_expectedOutput_file = Files.readAllLines(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test3() throws IOException {
        Watch question3_object = new Watch();
        question3_object.setinputString("aaa");
        question3_object.States();
        Path realOutput_file = Paths.get("Output.txt");
        List<String> contentOf_realOutput_file = Files.readAllLines(realOutput_file);
        Path expectedOutput_file = Paths.get("Test3.txt");
        List<String> contentOf_expectedOutput_file = Files.readAllLines(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test4() throws IOException {
        Watch question3_object = new Watch();
        question3_object.setinputString("cdb");
        question3_object.States();
        Path realOutput_file = Paths.get("Output.txt");
        List<String> contentOf_realOutput_file = Files.readAllLines(realOutput_file);
        Path expectedOutput_file = Paths.get("Test4.txt");
        List<String> contentOf_expectedOutput_file = Files.readAllLines(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test5() throws IOException {
        Watch question3_object = new Watch();
        question3_object.setinputString("");
        question3_object.States();
        Path realOutput_file = Paths.get("Output.txt");
        List<String> contentOf_realOutput_file = Files.readAllLines(realOutput_file);
        Path expectedOutput_file = Paths.get("Test5.txt");
        List<String> contentOf_expectedOutput_file = Files.readAllLines(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
    @Test
    void Test6() throws IOException {
        Watch question3_object = new Watch();
        question3_object.setinputString("caaaa");
        question3_object.States();
        Path realOutput_file = Paths.get("Output.txt");
        List<String> contentOf_realOutput_file = Files.readAllLines(realOutput_file);
        Path expectedOutput_file = Paths.get("Test6.txt");
        List<String> contentOf_expectedOutput_file = Files.readAllLines(expectedOutput_file);
        assertEquals(contentOf_expectedOutput_file, contentOf_realOutput_file);
    }
}