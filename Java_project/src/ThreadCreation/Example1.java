package ThreadCreation;

class newException extends Exception{
	   String str1;
	   newException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Welcome to java");
			// I'm throwing the custom exception using throw
			throw new newException("This is My error Message");
		}
		catch(newException exp){
			System.out.println("Multithreading in java") ;
			System.out.println(exp) ;
		}
	   }
	}
