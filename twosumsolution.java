
public class twosumsolution {
	 static int[] twosum(int[] nums, int target)
	{
		for(int i=0; i< nums.length; i++)
		{
			for (int j=i+1; j<nums.length; j++)
			{
				if(target == nums[i]+nums[j])
					{
						return new int[]{nums[i],nums[j]};		
					}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int nums[] = {10, 20, 5, 7};
		int target = 30;
		int[] result = twosum(nums,target);
		
		if(result.length ==2) {
			System.out.println(result[0]+ " "+ result[1]);
		}
		else {
			System.out.println("No solution found.") ;
		}
		
	}
}
