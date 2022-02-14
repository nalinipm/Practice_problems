
public class sortusingtemp {

	public static void main(String[] args) {
		
		int a[] = {9, 0, 5, -21, 3, 45, 32};
		System.out.println("Sorted array:" );
		for(int i =0; i< a.length; i++) {
			for (int j =i+1; j<a.length; j++) {
				int tmp = 0;
				
				if(a[i]>a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			
			System.out.println(a[i]);
		}
	}
}
