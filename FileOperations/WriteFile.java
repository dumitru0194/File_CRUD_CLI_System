package FileCRUD.FileOperations;

//Importing java classes 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WriteFile {
    public static void wFile(String fName) {

        //Usind (try...Catch) to catch Exceptions
        try {

            //Creating obj of class Scanner 
                Scanner scn = new Scanner(System.in);
                
                //Require file name from user
                System.out.println("Please type file name:");
                String fileN = scn.nextLine();

                //Require a text from user write in file 
                System.out.println("Now introduce text to file: " + fileN);
                String text = scn.nextLine();


                //FileWriters is writing text in file indicated
            FileWriter writeFile = new FileWriter(fName + "/" + fileN);
            writeFile.write(text);

            //Closing session
            writeFile.close();

                //Success message 
            System.out.println("File is edited succesfully");
            scn.close();

            //Catch Exception and edit it 
        } catch (IOException e) {
            System.out.println("An error occurred during edit this file");
            e.printStackTrace();
        }
           
    }
}
