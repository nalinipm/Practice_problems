
public class palindromeString {
	
		 
	    // Method
	    // Returning true if string is palindrome
	    static boolean isPalindrome(String str)
	    {
	 
	        // Pointers pointing to the beginning
	        // and the end of the string
	        int i = 0, j = str.length() - 1;
	 
	        // While there are characters to compare
	        while (i < j) {
	 
	            // If there is a mismatch
	            if (str.charAt(i) != str.charAt(j))
	                return false;
	 
	            // Increment first pointer and
	            // decrement the other
	            i++;
	            j--;
	        }
	 
	        // Given string is a palindrome
	        return true;
	    }
	    //Main driver method
	    public static void main(String[] args)
	    {
	    	String str = "aaacbaaa";
	    	String str1 = "uttu";
	    	
	    	System.out.println("String1: ");
	    	
	    	if(isPalindrome(str))
	    		System.out.println("It is a palindrome string");
	    	else
	    		System.out.println("It is not a palindrome string");
	    	
	    	System.out.println();
	    	
	    	//For string 2
	    	System.out.println("String 2: ");
	    	
	    	if(isPalindrome(str1))
	    		System.out.println("It is a palindrome string");
	    	else
	    		System.out.println("It is not a palindrome string");
	    }
}
