
public class repeatingCharactersinString {
	// Java program to find the maximum consecutive
	// repeating character in given string
	
	     
	    // function to find out the maximum repeating
	    // character in given string
	    static char maxRepeating(String str)
	    {
	        int len = str.length();
	        int count = 0;
	 
	        // Find the maximum repeating character
	        // starting from str[i]
	        char res = str.charAt(0);
	        for (int i=0; i<len; i++)
	        {
	            int cur_count = 1;
	            for (int j=i+1; j<len; j++)
	            {
	                if (str.charAt(i) != str.charAt(j))
	                    break;
	                cur_count++;
	            }
	 
	            // Update result if required
	            if (cur_count > count)
	            {
	                count = cur_count;
	                res = str.charAt(i);
	            }
	            
	        }
	        System.out.println("Character repeats " + count + " times.");
	        return res;
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	 
	        String str = "aaaabbaaccde";
	        System.out.println("Repeating character is: " + maxRepeating(str));
	        
	    }
	}

