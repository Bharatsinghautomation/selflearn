package ClassesAndVariables;

public class MethodOvenrLoading {

	public void add() {
		int numberone = 10;
		int numbertwo =20;
		System.out.println(numberone + numbertwo);
	}
	
	public void add(int num1,int num2) {
		System.out.println(num1 +num2);
	}
	
	public void add(int num1,int num2, int  num3) {
		System.out.println(num1 +num2+num3);
	}
	
	public void add(float num1,int num2, int  num3) {
		System.out.println(num1 +num2+num3);
	}
	
	public void MethodOverloading() {
		
	}
	public static void main (String[]args) {
		MethodOvenrLoading load = new MethodOvenrLoading();
		load.add();
		load.add(5, 10);
		load.add(10,20, 30);
		load.add(10.1f, 10, 10);
	}
}
