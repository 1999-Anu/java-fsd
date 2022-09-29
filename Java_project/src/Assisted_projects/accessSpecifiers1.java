package Assisted_projects;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("This a default specifier"); 
     } 
} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}

