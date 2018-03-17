package main.java;

import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static final Pattern wordsPattern = Pattern.compile("byte|short|int|long|char|float|double|boolean|if|else|switch|" +
            "case|default|while|do|break|continue|for|try|catch|finally|throw|throws|private|protected|" +
            "public|import|package|class|interface|extends|implements|static|final|void|abstract|native|" +
            "new|return|this|super|synchronized|volatile|const|goto|instanceof|enum|assert");

    public static void main(String[] args) throws IOException {
        ByteIOStream.keywordsSearcher("src\\Example.java", "keyWords.txt");
    }
}