package main.java;

import java.io.*;


public class ConverterUTF16 {

    public static void convert(String inFileName, String outFileName) throws IOException {
        try (BufferedReader inFile = new BufferedReader(new FileReader(inFileName))) {

            try (Writer outFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFileName), "UTF16"))) {

                String readString;

                while ((readString = inFile.readLine()) != null) {
                    System.out.println(readString);
                    outFile.write(readString);
                }
            }
            catch (FileNotFoundException ex) {
                System.out.println("outFile not found");
                throw new FileNotFoundException("outFile not found");
            }
            catch (IOException ex) {
                System.out.println("IOException with outFile");
                throw new IOException("IOException with outFile");
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("inFile not found");
            throw new FileNotFoundException("inFile not found");
        }
        catch (IOException ex) {
            System.out.println("IOException with inFile");
            throw new IOException("IOException with inFile");
        }
    }
}
