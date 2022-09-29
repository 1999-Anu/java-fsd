package AssistedProjects;

class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println(" private access specifier"); 
    } 
} 

public class accessSpecifiers2 {

	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
       

	}
}
