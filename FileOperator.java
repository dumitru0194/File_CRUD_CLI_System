package FileCRUD;


//Import java classes needed for runing this code
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import FileCRUD.FileOperations.*;

import java.io.File;


public class FileOperator {

    
    

    public static void main(String[] args) {

            //Emmbed all method in (Try...Catch) to catch Exception throwen by java
        try {

          //Create a object of class Scanner
        Scanner input = new Scanner(System.in);
        
        
            //Select path for file manipulation
        System.out.println("\n" + ">>> Insert Operation Path or file <<<" + "\n");
        String path = input.nextLine();

                    //We have import 'File' class to use his method exists();
                File fileCheck = new File(path);
                boolean exists = fileCheck.exists();

                //If statment checks if path exists
                    
                if(path == ""){
                    
                    input.close();
                    throw new IOException();
                    
                } else if (!exists){
                    input.close();
                    throw new FileNotFoundException();
                }
             

            //Display to user a list with operation that program can handle.
            //Introducing "ID" of operation , program procide (switch) statment.
        System.out.println(">>> Choose operation by introducing it number <<<" + "\n" + "\n");
        System.out.println("\n" + "ID    Opertion" + "\n" + "\n" + "1 -- Show all files" + "\n" + "2 -- Create File" + "\n" + "3 -- Write File" + "\n" + "4 -- Read file" + "\n" + "5 -- Delete File" + "\n" + "6 -- Get Info File" + "\n" + "\n");
        int num = input.nextInt();
        
                    
                        //In this section program roll method that has been selected.
                    switch(num){

                        case 1:
                            DisplayFile.printFileNames(path);
                            break;

                        case 2:
                            CreateFile.cFile(path);
                            break;

                        case 3:
                            WriteFile.wFile(path);
                            break;

                        case 4:
                            ReadFile.rFile(path);
                            break;

                        case 5: 
                            DeleteFile.dFile(path);
                            break;

                        case 6: 
                            GetFileInfo.giFile(path);
                            break;

                            default:
                            System.out.println(">>> Something went wrong, restart program <<<");
                    }

            
        //  Close(); method of Scanner class , close strem of terminal.
        input.close();



                    //   Catch takes a parameter that refers to kind of Exception is occurind during execution
                    //   (e) is a object of type of Exception 

        } catch (InputMismatchException e) {

            System.out.println(">>> Data is incorect, you should type a ID of operation <<<");
            

            //Catch can be call more than one time 
        } catch (FileNotFoundException e) {
            System.out.println("\n" + ">>> This file or path are wrong, please review them <<<" + "\n");
        
        } catch (IOException e){
            System.out.println(">>> You have typed nothing <<<" + "\n");
        

        } catch (Exception e){
            e.printStackTrace();
        }
        
        

        
    }
}
