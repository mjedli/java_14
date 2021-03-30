/**
 * 
 */
package java_14;

/**
 * @author mjedli
 *
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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o1 = new Operation(10);
		System.out.println(o1.i()); // 10
		System.out.println(o1.Operation(5)); // 5*(10+5) - 150
	}

}
