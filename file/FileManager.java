package file;

import java.io.*;

public class FileManager {

    public static void writeFile(String fileName, String data) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

            bw.write(data);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error Writing File.");
        }

    }

    public static void readFile(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println("File Not Found.");

        }

    }

}