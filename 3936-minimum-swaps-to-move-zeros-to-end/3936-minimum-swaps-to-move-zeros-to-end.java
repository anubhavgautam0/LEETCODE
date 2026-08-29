class Solution {
    public int minimumSwaps(int[] nums) 
    {
        int arrayLength = nums.length;
        int left = 0;
        int  right = arrayLength - 1; 
        int count =0;
        while( left <= right)
        {
            if ( ( nums[left] == 0 ) && (nums[ right ] != 0 ))
            {
                count ++;
                right --;
                left ++;
            }
            else if (( nums[left]!= 0) && (nums[ right ] != 0))
            {
                left++;
            }
            else if ((nums [left]==0) && (nums[right]==0))
            {
                right--;
            }
            else
            {
                left++;
                right--;

            }
        }
    return count ;    
    }
}