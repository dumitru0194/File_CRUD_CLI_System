package FileCRUD.FileOperations;


//Import File java class 
import java.io.File;

public class GetFileInfo {

    public static void giFile(String fName){

        //Creating File object with argument that represent path
        File nFile = new File(fName);

        // Checking if file exist before executing method
        if(nFile.exists()) {

            System.out.println("File name: " + nFile.getName());
            System.out.println("File absolute path: " + nFile.getAbsolutePath());
            System.out.println("File size in byts: " + nFile.length());
            System.out.println("File is writeable: " + nFile.canWrite());
            System.out.println("File is readable: " + nFile.canRead());

        } else {
            //If file does not exist , then mathod will display a message 
            System.out.println("File does not exist");
        }

    }
        
}
