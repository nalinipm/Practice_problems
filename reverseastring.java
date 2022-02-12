//This java program reverses given string by extracting every character and adding to a new string
public class reverseastring {
	public static void main(String [] args) {
		String str = "software";
		String newstr = "";
		char ch;
		
		System.out.println("Original word: " + str);
		System.out.println("");
		
		
		for(int i =0; i<str.length(); i++)
		{
			ch = str.charAt(i); //extract character
			newstr = ch+newstr; //adds each character in front of the existing string
		}
		System.out.println("Output: Reversed word: " + newstr);
	}

}
