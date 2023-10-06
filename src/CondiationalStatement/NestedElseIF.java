package CondiationalStatement;

public class NestedElseIF {

	public static void main(String[] args, Object chrome) {
	
  
		String browser ="safari";
		 
		
		if (browser.equals(chrome))
		 {
			 System.out.println("launch a crome browser");
			  }
		else if (browser.equals("ie"))
		{
		System.out.println("launch a ie browser");
		}

		else if (browser.equals("safari"))
		{
	System.out.println("launch a safari browser");
	}
		
		else if (browser.equals("opera"))
		{
		System.out.println("launcha a oper browswe");
		}
		
		else 
		{
		System.out.println("pass  valid browser");
		}
		
	
	}

}