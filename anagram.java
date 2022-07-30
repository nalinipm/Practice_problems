import java.util.Arrays;  
public class anagram {
	
	   
	  
	    static void isAnagram(String str1, String str2) { 
	    	//Removes all blank spaces
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        
	        //Length check
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	        	/**if length is same then convert to character array, sort and 
	        	check if they are equal**/
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	   
	    public static void main(String[] args) {  
	        isAnagram("Keep", "Peek");  
	        isAnagram("Mother In Law", "Hitler Woman");  
	    }  
	}  

