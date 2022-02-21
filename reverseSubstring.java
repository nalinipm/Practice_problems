//@author: Nalini Mehendale

public class reverseSubstring {
	
	public static void main(String[] args) {
		
		String str ="Nalini";
		//Finding substring
		String sub_str;
		sub_str = str.substring(2,4);
		System.out.println("The substring is:" + sub_str);	
		//Reversing a substring
		char ch;
		String newstr="";
		for(int i=0;i<sub_str.length(); i++)
		{
			ch = sub_str.charAt(i);
			newstr = ch+newstr;
		}
		System.out.println("Reversed substring is:" + newstr);						
	}
}
