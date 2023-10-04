package filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReadManager {
    public static void printDataFromAFile(File file) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" Fisierul nu a fost gasit: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("A aparut o eroare la citire " + e.getMessage());}}

    public static void printDataFromAFileUsingBufferReader(File file) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getStackTrace());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
                if (fileReader != null) fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();}}}

    public static void printDataFromAFileUsingFiles(File file) {
        try {
            System.out.println(Files.readString(file.toPath()));
        } catch (IOException e) {
            System.out.println("A aparut o eroare " + e.getStackTrace());
        }
    }
}
