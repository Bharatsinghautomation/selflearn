package Polymorphism;

public class MethodOverRiding  {

	public void display () {
		System.out.println("this is bharat singh thakur");
	}
	
	public void text() {
		
		System.out.println("this is my mom sarita bai ");
	}
	
	public static void main(String[] args) {
		MethodOverRiding 	k = new MethodOverRiding();
		
		k.display();
		k.text();
	}
}
