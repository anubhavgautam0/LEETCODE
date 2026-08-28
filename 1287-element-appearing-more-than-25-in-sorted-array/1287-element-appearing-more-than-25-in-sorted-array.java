class Solution {
    public int findSpecialInteger(int[] nums) 
    {
        int arrayLength = nums.length;
        int criteria = arrayLength  / 4 ;
        int count =1;

        
        for( int i =0 ; i < arrayLength -1 ; i++)
        {
            if (nums [ i ] == nums [ i+1 ])
            {
                count++;
            }
            if (count > criteria)
            {
                return nums[i];
            }
            if ( nums [i] != nums [i+1])
            {
                count=1;
            }
        }
    return nums [0];
    }
}