package filemanagementservice;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {
    public static void writeInformation(String filepath, String content) {

        FileWriter fileWriterObject = null;

        try {
            fileWriterObject = new FileWriter(filepath);
            fileWriterObject.write(content);

        } catch (IOException e) {
            System.out.println("Este o exceptie " + e.getStackTrace());
        }
        try {
            if (fileWriterObject != null) fileWriterObject.close();
        } catch (IOException e) {
            System.out.println("exceptia este " + e.getStackTrace());
        }
    }
    public static String writeContentIntoFileUsingBufferWriter( String filePatch ,String content){
        BufferedWriter bufferedWriter = null;
        try { bufferedWriter = new BufferedWriter( new FileWriter(filePatch)); bufferedWriter.write(content);
    }catch (IOException exception){
            System.out.println("Exceptia este " + exception.getStackTrace());
        }finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.out.println("A aparut o exceptie " + e.getStackTrace() + e.getLocalizedMessage() + e.getCause());;
            }
        }return bufferedWriter.toString();
        }

}