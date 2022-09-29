package AssistedProjects;

public class innerClassAssisted1 {

	 private String msg="NEW to java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", SELF LEARN ");}  
	 }  


	public static void main(String[] args) {

		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}
