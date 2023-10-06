package Polymorphism;

public class MethodOverLoading {

	
	public void display() {
		System.out.println("bharat is s a child of sarita bai ");
	
	}
	
	public void text() {
		System.out.println("shetal also a child of sarita bai ");
	}
	
	
	public void clear () {
		System.out.println("thd this is my family ");
	}
	
	public static void main(String[] args) {
		MethodOverLoading n= new MethodOverLoading() ;
		
		n.display();
		n.text();
		n.clear();
	
		
		
		

	}

}
