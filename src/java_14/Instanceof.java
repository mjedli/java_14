/**
 * 
 */
package java_14;

/**
 * @author mjedli
 *
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
		    System.out.println(s);
		}

		// after java 14
		
		if (Obj instanceof String s) {    
			
		    System.out.println(s);
		}
		

	}

}
