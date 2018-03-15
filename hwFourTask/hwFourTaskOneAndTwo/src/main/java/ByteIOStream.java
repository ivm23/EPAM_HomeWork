package main.java;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByteIOStream {

    public static Pattern getWordsPattern() {
        return Pattern.compile("byte|short|int|long|char|float|double|boolean|if|else|switch|" +
                "case|default|while|do|break|continue|for|try|catch|finally|throw|throws|private|protected|" +
                "public|import|package|class|interface|extends|implements|static|final|void|abstract|native|" +
                "new|return|this|super|synchronized|volatile|const|goto|instanceof|enum|assert");
    }

    public static StringBuilder readFile(String fileName) throws FileNotFoundException, IOException {

        BufferedInputStream fromFile = new BufferedInputStream(new FileInputStream(fileName));
        int readedBytes = 0;
        StringBuilder stringsFromBuffer = new StringBuilder();

        while ((readedBytes = fromFile.read()) != -1) {
            stringsFromBuffer.append((char) readedBytes);
        }

        fromFile.close();
        return stringsFromBuffer;
    }

    private static void findAndWriteKeywords(StringBuilder stringBuilderFromBuffer, String outFileName) throws IOException {
        FileOutputStream outFile = new FileOutputStream(outFileName);

        Matcher matcher = getWordsPattern().matcher(stringBuilderFromBuffer);
        String stringFromBuffer;
        int count = 0;

        while (matcher.find()) {
            stringFromBuffer = stringBuilderFromBuffer.substring(matcher.start(), matcher.end()) + " ";
            outFile.write(stringFromBuffer.getBytes());
            count++;
        }

        String words = "Number of found keywords: " + count;
        outFile.write(words.getBytes());
        outFile.close();
    }

    public static void keywordsSearcher(String fileName, String outFileName) throws FileNotFoundException, IOException {
            findAndWriteKeywords(readFile(fileName), outFileName);
    }
}
