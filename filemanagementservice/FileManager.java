package filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createTheFileIfDileNotExist(File file) throws IOException {
        return file.createNewFile();
    }
    public static void informIfTheFileExist(File file){
        if(file.exists()){
            System.out.println("File exist");
        }else {
            System.out.println("The file is not present");
        }
    }
    public static void printTheFileName( File fileName){
        System.out.println(fileName.getName());
    }
    public static void showDirectory (File fileDirectory){
        System.out.println(fileDirectory.getAbsoluteFile());
    }
    public static void canBeRead (File itIsRead){
        System.out.println(itIsRead.canRead());
    }
}
