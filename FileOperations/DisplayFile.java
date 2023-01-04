package FileCRUD.FileOperations;


// import File java class 
import java.io.File;  


public class DisplayFile  
{  

    public static void printFileNames(String path){ 

      //Wrapp all code in (try...Catch) to edit Exceptions that occurres 
        try {
         
             //Creating a File object for directory
               File directoryPath = new File(path);

      //List of all files and directories
      File filesList[] = directoryPath.listFiles();

      System.out.println("\n" + "List of files and directories in the specified directory:" + "\n");

      //Loop through all files stored in arry above 
      for(File file : filesList) {
         System.out.println("File name: "+file.getName());
         System.out.println("File path: "+file.getAbsolutePath());
         System.out.println("Size :"+file.getTotalSpace());
         System.out.println(" ");
      }

      // Catch Exceptions to show simple error message insted of Exception
      } catch (NullPointerException e ) {
         System.out.println("\n" + ">>> File indicated is dosent exists <<<" + "\n");
      }
     
 
    } 
      
}  