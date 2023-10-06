package ConstructorsConcept;

public class ConstructorConceptdemo2 {

	//constructor 
	String name ;
	int age;
	
	public ConstructorConceptdemo2() {
         System.out.println("default COnstructors");
	} 
	
	//constructor over loading 
	public ConstructorConceptdemo2(int i) {
        System.out.println("default COnstructors");
        System.out.println(i);
	}
	
	public ConstructorConceptdemo2(int i, int j ) {
        System.out.println("default COnstructors");
        System.out.println(i +" "+j);
	}
	
	public ConstructorConceptdemo2(float i, int j,int k) {
        System.out.println("default COnstructors");
        System.out.println(i +" "+j  +k);
	}
	
	public static void main(String[] args) {
		ConstructorConceptdemo2 obj = new ConstructorConceptdemo2();
		ConstructorConceptdemo2 obj1 = new ConstructorConceptdemo2(10);
		ConstructorConceptdemo2 obj2 = new ConstructorConceptdemo2(10,20);
		ConstructorConceptdemo2 obj3 = new ConstructorConceptdemo2(10.9f,20,30);
	}

}
