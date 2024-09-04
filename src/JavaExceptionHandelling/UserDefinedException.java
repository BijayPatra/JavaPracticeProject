package JavaExceptionHandelling;

class UserDefined extends Exception  
{  
    public UserDefined(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  
// Class that uses above MyException  
public class UserDefinedException  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefined("This is user-defined exception");  
        }  
        catch (UserDefined ude)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
    }  
}   