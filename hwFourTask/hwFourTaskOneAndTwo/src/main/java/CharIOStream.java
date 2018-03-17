package main.java;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharIOStream {

    public static StringBuilder readFile(String fileName) {

        try (BufferedReader fromFile = new BufferedReader(new FileReader(fileName))) {
            String readStrings = "";
            StringBuilder stringsFromBuffer = new StringBuilder();

            while ((readStrings = fromFile.readLine()) != null) {
                stringsFromBuffer.append(readStrings);
            }

            fromFile.close();
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
        try (PrintWriter outFile = new PrintWriter(outFileName)) {

            Matcher matcher = Main.wordsPattern.matcher(stringBuilderFromBuffer);
            String stringFromBuffer;
            int count = 0;

            while (matcher.find()) {
                stringFromBuffer = stringBuilderFromBuffer.substring(matcher.start(), matcher.end()) + " ";
                outFile.write(stringFromBuffer);
                count++;
            }

            String words = "\nNumber of found keywords: " + count;
            outFile.write(words);
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File %s not found", outFileName));
        } catch (IOException ex) {
            System.out.println("Error with IO");
        }
    }


    public static void keywordsSearcher(String fileName, String outFileName) throws FileNotFoundException, IOException {
        StringBuilder readFile = readFile(fileName);
        if (readFile != null) {
            findAndWriteKeywords(readFile, outFileName);
        } else {
            throw new IOException("Problems with file or IO");
        }
    }
}
