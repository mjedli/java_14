/**
 * 
 */
package java_14;

/**
 * @author mjedli
 *
 */
public class TextBlock {

	/**
	 * @param args
	 * 
	 * Text Blocks (Second Preview)
	 * 
	 */
	public static void main(String[] args) {
	
		String html = """
	              <html>
	                  <body>
	                      <p>Hello, world</p>
	                  </body>
	              </html>
	              """;
		
		System.out.println(html);
		
		/*
		 <html>
    		<body>
        		<p>Hello, world</p>
    		</body>
		</html>
		 */
		
		String text = """
                test \
                test 2 \
                test 3 \
                """;
		
		System.out.println(text); // test test 2 test 3
		
		String text2 = """
                test \s
                test 2 \s
                test 3 \s
                """;
		
		System.out.println(text2); // test test 2 test 3
		
		/*
			test  
test 2  
test 3 
		 */

	}

}
