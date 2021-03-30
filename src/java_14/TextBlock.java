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

	}

}
