package ThreadCreation;

public class Finally
{
    public static void main(String[] args)
    {
        int a=765,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\t result : " + rs);
        }
    }
}

