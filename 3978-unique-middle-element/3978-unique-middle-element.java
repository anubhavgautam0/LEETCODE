class Solution {
    public boolean isMiddleElementUnique(int[] nums) 
    {
        int index = nums.length / 2 ; 
        int arrayLength = nums.length ; 
        int count = 0;

        for( int i =0 ; i< arrayLength ; i++)
        {
            if ( nums[i] == nums[index])
            {
                count++;
            }

        }

        if( count > 1)
        {
            return false;
        }
        return true;
    }
}