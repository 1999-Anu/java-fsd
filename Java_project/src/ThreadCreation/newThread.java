package ThreadCreation;

public class newThread extends Thread
{
 	public void run()
 	{
  		System.out.println("New Thread started.....");
  		for( int i=0;i<=5;i++) {
  			System.out.println(i);
  		}
}
 	public static void main( String args[] )
 	{
  		newThread mt = new  newThread();
  		mt.start();
 	}
}
