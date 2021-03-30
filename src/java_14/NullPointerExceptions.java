/**
 * 
 */
package java_14;

/**
 * @author mjedli
 *
 */
public class NullPointerExceptions {

	/**
	 * @param args
	 * 
	 * Use NullPointerExecption message
	 */
	public static void main(String[] args) {

		
		//JEP 358 : Helpful NullPointerExceptions
		
		StringBuilder sb = new StringBuilder();
		sb.append("test").read();
		
		/*
			Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The method read() is undefined for the type StringBuilder

			at java_14.NullPointerExceptions.main(NullPointerExceptions.java:23)
		 */
		

		/*
		 * The null pointer exceptions is in the read() methode
		 * The method read() is undefined for the type StringBuilder
		 */
		
	}

}
