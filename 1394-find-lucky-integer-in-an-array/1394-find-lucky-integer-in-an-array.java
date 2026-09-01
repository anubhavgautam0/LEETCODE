class Solution {
    public int findLucky(int[] nums) 
    {
        int arrayLength = nums.length;
        int ans=-1;
        int count = 0;

        for( int i = 0 ; i < arrayLength ; i++)
        {
            count = 0;
            for ( int j =0 ; j < arrayLength ;j++ )
            {
                if ( nums[i] == nums[j])
                {
                    count++;
                }


            }
                if ( count == nums[i])
                {
                ans = Math.max(ans, nums[i]);
                }
        }
    return ans;   
    }
}