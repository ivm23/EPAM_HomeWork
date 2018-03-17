package test.java;
import main.java.ConverterUTF16;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConverterUTF16Test {

    @Test(expected = FileNotFoundException.class)
    public void convertTestShouldCatchFileNotFoundException() throws IOException {
        ConverterUTF16.convert("src\\inExample","src\\outputExample");
    }
}
