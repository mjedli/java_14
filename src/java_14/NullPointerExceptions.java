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
	 */
	public static void main(String[] args) {

		
		//JEP 358 : Helpful NullPointerExceptions
		
		StringBuilder sb = new StringBuilder
		sb.append("test").read();
		
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Syntax error, insert "( )" to complete ClassInstanceCreationExpression
	Syntax error, insert ";" to complete BlockStatements
	The method read() is undefined for the type StringBuilder

	at java_14/java_14.All.main(All.java:19)
		 */
		

		/*
		 * The null pointer exceptions is in the read() methode
		 * The method read() is undefined for the type StringBuilder
		 */
		
	}

}
