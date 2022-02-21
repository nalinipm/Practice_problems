/*Given 2 strings, merge them in an alternate way, i.e. the final string’s first character is 
 * the first character of the first string, 
 * the second character of the final string is the first character of the second string
 *  and so on. And if once you reach end of one string while if another string is still
 *   remaining then append the remaining of that string to final string*/ 
public class AlternativelyMergetwoStrings {
	public static String merge(String s1, String s2) {
		//To store the final string
		StringBuilder result = new StringBuilder();
		
		//For every index in string
		for (int i=0; i<s1.length()||i<s2.length(); i++) {
			if(i<s1.length())
				result.append(s1.charAt(i));
			if(i<s2.length())
				result.append(s2.charAt(i));
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(merge(s1,s2));
	}
}
