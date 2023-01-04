package FileCRUD.FileOperations;

 //Import all java methods needed.

import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class CreateFile {


    public static void cFile (String path){

            //Wrapp whole method into (try...Catch) to costumize Exception when it occures
        try {
             // Creating object of Scanner class to get his methods
            Scanner scn = new Scanner(System.in);

            //Require from user to type file name , using nextLine(); that "Scanner" provides
            System.out.println("Type file name");
            String name = scn.nextLine();

            //  Creating object from "File" class
            File myObj = new File(path, name);

            //createNewFile(); method creats new file.
            //Method take path and file name from parametres given in Files object
            //Conditional statement down below show message to user if file is created or file does not exist
                if(myObj.createNewFile()){
                    System.out.println("New file is created : " + myObj.getName());
                } else {
                    System.out.println("File alredy exists: " + myObj.getAbsolutePath());
                }

                //scn.close(); closes Scanner session 
                scn.close();

                //The part bellow catch Exceptions and transfor it to normal error message  
        } catch (IOException e) {

            System.out.println("An error occurred");
            e.printStackTrace();
            
        }
    }
    
}
