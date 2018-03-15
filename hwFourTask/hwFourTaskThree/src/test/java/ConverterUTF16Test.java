package test.java;
import main.java.ConverterUTF16;
import org.junit.Test;

import java.io.IOException;

public class ConverterUTF16Test {

    @Test(expected = IOException.class)
    public void convertTestSgouldCatchIOException() throws IOException {
        ConverterUTF16.convert("C:\\Users\\marina\\IdeaProjects\\hwTreeTaskThree\\src\\inExample","C:\\Users\\marina\\IdeaProjects\\hwTreeTaskThree\\src\\outputExample");
    }

}
