package NonPrimitiveDataType;

public class SpaceRemoveInString {

	public static void main(String[] args) {
	
		
		String ss = "thakur bharat singh ";
		System.out.println(ss);
		
		// to remove the space from given string 
		
		System.out.println(ss.replace(" ",""));
		
		
		// to print every word after space 
		 
		
		 System.out.println(ss.replace(""," "));
		

		 // contains 
		 
		 
		 String s2= "Automation using a selenium";
		 
		 System.out.println(s2.contains("selenium"));
		 
		 
		 System.out.println(s2.contains("java"));
		 
		 // CONCAT 
		 
		 String  s11 = "hii bharat singh";
		 String  s22 = " how are you";
		 
	System.out.println(s11+s22);
	
		 // substring 
	
	
	   String s33 = "welcome to java class";
	    
	    System.out.println(s33.substring(11,15));
	    
	    System.out.println(s33.substring(0,7));
	
	  // case conversion
	    
	    String s34 = "hello world" ;
	 
	    
	    System.out.println(s34.toUpperCase());
	
	    System.out.println(s34.toLowerCase());
	    
	    // split method 
	    
	  String a= "this is java code with salenium split ";
	  String []ar_str=a.split(" ");
	  for(String b:ar_str) 
	  {
	     System.out.println(b);
   }
     
	  
	  // split method by me 
	  String b= "i try my self again with another letter b ";
	  String []ar_abc=b.split(" ");
	  for (String c:ar_abc)
	  {
		  
		  System.out.println(c);
		 
	  }
	  
	  
	  
	  // importent 
	  
	  
	  String str1  ="shivangi";
	  System.out.println(str1);
	  
	  
	
	 
	}
	   
	   
		 
		
	private static void split(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
