public class arraysum{

    public static void main(String[] args)
    {
        int[] nums = {5,6,7,8,9}; //intger array
        int i = 0;
        int sum = nums[0];
        System.out.println(sum);
        for(i=1; i<nums.length;i++)
            {
                sum = sum + nums[i];
            }
            System.out.println(sum);
    }
}