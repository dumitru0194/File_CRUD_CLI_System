package FileCRUD.FileOperations;


//import all methods needed
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class ReadFile {

    public static void rFile (String fName) throws Exception{

          try {

            //Creating object of Scanner 
            Scanner newScanne = new Scanner(System.in);

            //Require file name from user
                System.out.println("Please type file name");
                String text = newScanne.nextLine();

                //Creating obj of File class
                File newObj = new File(fName + "/" + text);
                Scanner newScanner = new Scanner(newObj);

                //Loop through all line from file 
                while (newScanner.hasNextLine()){
                    String data = newScanner.nextLine();
                    System.out.println(data);
                }

                //Session closing
                newScanner.close();      
                newScanne.close();  

                //Catch Exacption to edit them 
            } catch (FileNotFoundException e){
                System.out.println("\n" + "File that you introduce is not found or is spelld incorrect" + "\n");
            }
                    
    }
}
