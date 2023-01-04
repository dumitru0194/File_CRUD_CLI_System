package FileCRUD.FileOperations;


//importing java classes to use there methods
import java.io.File;
import java.util.Scanner;


public class DeleteFile {
    
           public static void dFile (String fName){

                    // Creating object of Scanner class to get his methods
                    Scanner scn = new Scanner(System.in);

                    //Require from user to type file name , using nextLine(); that "Scanner" provides
                    System.out.println("Type File Name" + "\n");
                    String fileName = scn.nextLine();

                //  Creating object from "File" class
                File delFile = new File(fName + '/' + fileName);

                //Conditional checks is file exist before starting delete method 
                //Also this coditional prints messages to user 

                if (!delFile.exists()){
        
                    System.out.println("\n" + ">>> File: " + delFile.getName() + " Does not exist <<<" + "\n");
        
                } else if (delFile.delete()){
                    System.out.println("\n" + ">>> File: " + delFile.getName() + "  has been deleted succsessfully");
                } else {
                    System.out.println("\n" + ">>> Faild to delete file: " + delFile.getName() + " <<< \n");
                }

                //Here is closing scanner session
                scn.close();
            }

}