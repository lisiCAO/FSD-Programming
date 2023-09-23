package Lisi;

public class twoDimensionArrayPattern {
	public class JavaPattern {
	    public static void main(String[] args) {
	        // declare a two-dimension array to store "JAVA" pattern
	        char[][] pattern = {
	            { ' ', ' ', 'J', ' ', ' ', 'a', ' ', ' ', 'v', ' ', ' ', ' ', 'v', ' ', ' ', 'a', ' ' },
	            { ' ', ' ', 'J', ' ', ' ', 'a', ' ', 'a', ' ', 'v', ' ', ' ', 'v', ' ', ' ', 'a', ' ', 'a' },
	            { 'J', ' ', ' ', 'J', ' ', 'a', 'a', 'a', 'a', 'a', ' ', ' ', 'V', ' ', 'V', ' ', 'a', 'a', 'a', 'a', 'a' },
	            { ' ', 'J', 'J', ' ', 'a', ' ', ' ', ' ', ' ', 'a', ' ', ' ', 'V', ' ', ' ', 'a', ' ', ' ', ' ', ' ', 'a' }
	        };
	        
	        // iterate array and print result
	        for (int i = 0; i < pattern.length; i++) {
	            for (int j = 0; j < pattern[i].length; j++) {
	                System.out.print(pattern[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}
}

