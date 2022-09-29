package practise.projects_2;
import java.util.Scanner;

public class EmailValidation {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//Storing list of emailid in an array
		 String Array[]= {"anu@gmail.com",
				          "brintha89@gmail.com",
				          "kamali63@gmail.com",
				           "jessie4567@gmail.com",
				           "selva345@gmail.com",
				           "karan897@gmail.com",
				           "janani@96@gmail.como",
				           "raja98@gmail.com",
				           "raji56@gmail.com",
				           "sree567@gmail.com",
				           "chandr789@gmail.com"};
				
		 System.out.println("Enter the EmailId to search");
		//Get input from user to search emailid
	   String s=sc.next();
	   //Validating email
	      
	      for(int  i=0;i<Array.length;i++)
	       {
	    	  
	       if(Array[i].equals(s))
	       {
	       
	    	   System.out.println("EmailId validated");
	       
	       }
	      else {
	    	  System.out.println("Invalid email");
	      }
	       }
	    }

	
}
