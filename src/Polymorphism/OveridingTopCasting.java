package Polymorphism;

public class OveridingTopCasting {

	public void apple () {
		System.out.println("this apple is a kashmeri ");
	}
    
	public void sugger () {
		System.out.println(" this is a chincholi sugarcane company sugar ");
	}
		
	public static void main(String[] args) {
		
		OveridingTopCasting h=new OveridingTopCasting();
		h.apple();
		h.sugger();
	

	}

}
