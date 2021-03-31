/**
 * 
 */
package java_14;

/**
 * @author mjedli
 *
 * You can see : https://docs.oracle.com/en/java/javase/14/language/pattern-matching-instanceof-operator.html
 */
public class Instanceof {

	/**
	 * @param args
	 * 
	 * Using instanceof Pattern Matching
	 * 
	 */
	public static void main(String[] args) {
		
		String Obj = "test";
		
		// before java 14
		
		if (Obj instanceof String) {    
		    String s = (String) Obj; // use s
		    System.out.println(s); // test
		}

		// after java 14
		
		if (Obj instanceof String s) {    
			
		    System.out.println(s); // test
		}
		

	}

}
