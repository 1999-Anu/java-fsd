package ThreadCreation;
 class Thread1 implements Runnable{
	 
	
	public void run() {
		for( int i =1 ;i<=5 ; i++) {
			System.out.println("first thread:" +i);
			try {
				Thread.sleep(100);
			   }
			catch (Exception e) {}
		} 
		
	}
}
 class Thread2 implements Runnable{
	 
	 
	public void run() {
		for ( int i =1 ; i<=5;i++) {
			System.out.println("second thread:" +i);
			try {
				Thread.sleep(100);
			}
			catch (Exception e) {}
			
		}
	}
}
public class RunnableThread {
	public static void main(String args[]) {
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		  
		t1.start();
		try {
			Thread.sleep(100);
		}
		catch (Exception e) {}
		
		t2.start();
		 
		
		
		
	}
	
}



