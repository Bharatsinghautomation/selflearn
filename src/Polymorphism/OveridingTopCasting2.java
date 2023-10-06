package Polymorphism;

public class  OveridingTopCasting2 extends OveridingTopCasting{ 

	public void market() {
		System.out.println("Hyderabad");
		super.apple();
	}
	
	public void wholesale() {
		super.sugger();
		System.out.println("ameerpet");
	
	}
	
	public static void main(String[] args) {
		OveridingTopCasting2 l = new OveridingTopCasting2();
		l.market();
		l.wholesale();
	
	}

}
