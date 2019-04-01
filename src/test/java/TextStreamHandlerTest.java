package test.java;

import java.io.*;
import org.junit.Test;
import main.java.BinaryStreamsHandler;
import static org.junit.Assert.*;
public class TextStreamHandlerTest {
    @Test
    public void testingAmountOfKeyWords() {
        BinaryStreamsHandler handler = new BinaryStreamsHandler("input.txt", "output2.txt");
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("output2.txt")))) {
            String[] arrayOfFileContent = bufferedReader.readLine().split("\\s");

            assertEquals("38", arrayOfFileContent[arrayOfFileContent.length-1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
