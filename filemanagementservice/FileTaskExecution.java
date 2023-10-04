package filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject = new File("C:\\Users\\DButuc\\OneDrive - ENDAVA\\Desktop\\AutomationCourse\\DraftRepo\\filemanagementservice/testInput.txt");
        FileManager.createTheFileIfDileNotExist(fileObject);
        FileManager.informIfTheFileExist(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.showDirectory(fileObject);
        FileManager.canBeRead(fileObject);

        String filePath = "C:\\Users\\DButuc\\OneDrive - ENDAVA\\Desktop\\AutomationCourse\\DraftRepo\\filemanagementservice/testOutput.txt";
        OutputFileWriterManager.writeInformation(fileObject.getPath(), " De ce cursurile de Java sunt mereu pline?");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filePath, "Pentru că toată lumea vrea să afle cum să evite \"NullPointerException\" în viața reală!");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReadManager.printDataFromAFile(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFileUsingFiles(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObjectUsedForReading);
    }

}
