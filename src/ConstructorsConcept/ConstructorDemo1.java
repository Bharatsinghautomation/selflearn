package ConstructorsConcept;

public class ConstructorDemo1 {

	
	static int   a;
	
	    ConstructorDemo1(){
		 a= 10;
		
		 showNum();
		 showNum();
	                  }
	public static void main(String[] args) {
		
		ConstructorDemo1 obj1 = new ConstructorDemo1();
		
		System.out.println("this is a main : " + a);

	    }

	public static void showNum() {
		a++;
		System.out.println("this is in show num: "  + a);
	
		
	}
	
	
	
     }
