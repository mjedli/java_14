/**
 * 
 */
package java_14;

/**
 * @author mjedli
 *
 */
public class Switch {

	/**
	 * @param args
	 *
	 * Switch Expression (Standard) 
	 * you can see : https://docs.oracle.com/en/java/javase/15/language/switch-expressions.html
	 */
	public static void main(String[] args) {

		String s = "test";
		
		// avant java 12
		
		switch(s) {
			case "test" :
					System.out.println("go");  // go     
					break;
			 default:       
				 System.out.println("try again!");
				 break;
		}
		
		// java 12
		
		switch(s) {
			case "test" ->
					System.out.println("go");    // go   
			 default ->      
			 	System.out.println("try again!");
		}
		
		// java 13 14 introduction of yield 

		String message = switch(s) {
			case "test":
					System.out.println("go");   //go
					yield "1";
			 default:     
				 	System.out.println("try again!");
				 	yield "2";
		};
		
		System.out.println(message); // 1

	}

}
