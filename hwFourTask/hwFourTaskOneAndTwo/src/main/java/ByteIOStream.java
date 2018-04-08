package main.java;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByteIOStream {

    public static StringBuilder readFile(String fileName) {

        try (BufferedInputStream fromFile = new BufferedInputStream(new FileInputStream(fileName))) {
            int readBytes = 0;
            StringBuilder stringsFromBuffer = new StringBuilder();

            while ((readBytes = fromFile.read()) != -1) {
                stringsFromBuffer.append((char) readBytes);
            }

            return stringsFromBuffer;
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File %s not found", fileName));
            return null;
        } catch (IOException ex) {
            System.out.println("Error with IO");
            return null;
        }
    }

    private static void findAndWriteKeywords(StringBuilder stringBuilderFromBuffer, String outFileName) {
        try (FileOutputStream outFile = new FileOutputStream(outFileName)) {

            Matcher matcher = Main.wordsPattern.matcher(stringBuilderFromBuffer);
            String stringFromBuffer;
            int count = 0;

            while (matcher.find()) {
                stringFromBuffer = stringBuilderFromBuffer.substring(matcher.start(), matcher.end()) + " ";
                outFile.write(stringFromBuffer.getBytes());
                count++;
            }

            String words = "\nNumber of found keywords: " + count;
            outFile.write(words.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File %s not found", outFileName));
        } catch (IOException ex) {
            System.out.println("Error with IO");
        }
    }

    public static void keywordsSearcher(String fileName, String outFileName) throws IOException {
        StringBuilder readFile = readFile(fileName);
        if (readFile != null) {
            findAndWriteKeywords(readFile, outFileName);
        } else {
            throw new IOException("Problems with file or IO");
        }
    }
}
