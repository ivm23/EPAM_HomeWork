package main.java;

import java.io.*;


public class ConverterUTF16 {

    public static void convert(String inFileName, String outFileName) throws IOException {
        BufferedReader inFile = new BufferedReader(new FileReader(inFileName));

        Writer outFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFileName), "UTF16"));

        String readedString = "";

        while ((readedString = inFile.readLine()) != null) {
            outFile.write(readedString);
        }
        inFile.close();
        outFile.close();
    }
}
