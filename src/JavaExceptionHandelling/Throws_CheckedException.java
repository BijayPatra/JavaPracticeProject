package JavaExceptionHandelling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Throws_CheckedException
{   
	  
    //function to check if person is eligible to vote or not   
    public static void method() throws IOException
    {  
  
        FileReader file = new FileReader("C:\\ExceptionTest\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
    
        //throw  new FileNotFoundException();     
    }  
    //main method  
    public static void main(String args[]){  
        try  
        {  
            method();  
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
}    