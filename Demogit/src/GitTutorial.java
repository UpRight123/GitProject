

public class GitTutorial {

	public static void main(String[] args) {
		if (20>10)
	    {
	        
	        System.out.println("Condition is true");
	    }
		
		/*int num1[] = {1, 2, 3, 4};
	      System.out.println(num1[5]);
	      
	      ReadFile.myName(); */
	      
	      try {
	          int num[] = {1, 2, 3, 4};
	          System.out.println("Access element five :" + num[5]);
	       } catch (ArrayIndexOutOfBoundsException a) {
	          System.out.println("Exception thrown  :" + a);
	       }catch (Exception e) {
	          System.out.println("Exception is " +e);
	       }finally {
             System.out.println("Execute the code");
	       }
	      


	}

}
