package ThreadCreation;

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s);
    } 
} 
public class customException 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("Exception"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("custom"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
