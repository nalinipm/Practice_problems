/*Input:  num
(1) Initialize rev_num = 0
(2) Loop while num > 0
     (a) Multiply rev_num by 10 and add remainder of num  
          divide by 10 to rev_num
               rev_num = rev_num*10 + num%10;
     (b) Divide num by 10
(3) Return rev_num*/

public class reverseNumber {
	
	static int reverseDigits(int num)
	{
		int rev_num = 0;
		while(num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num/10;
		}
		return rev_num;
	}

	public static void main(String[] args)
	{
		int num = 4562;
		System.out.println("Reverse of a number is " + reverseDigits(num));
	}
}
