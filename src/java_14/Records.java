/**
 * 
 */
package java_14;

/**
 * @author mjedli
 * you can see : https://docs.oracle.com/en/java/javase/15/language/records.html
 */
public class Records {

	
	// Record
	public record Operation(int i) {

		int Operation(int t) {
			return this.i*(10+t);
		}
		
	}
	
	/**
	 * @param args
	 * 
	 * Use record
	 */
	public static void main(String[] args) {
		
		Operation o1 = new Operation(10);
		System.out.println(o1.i()); // 10
		System.out.println(o1.Operation(5)); // 5*(10+5) - 150
	}

}
