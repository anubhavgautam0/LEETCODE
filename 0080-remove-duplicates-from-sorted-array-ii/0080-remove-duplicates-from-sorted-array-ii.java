class Solution {
    public int removeDuplicates(int[] nums) 
    
    {
        if (nums.length <= 2) {
            return nums.length;
        }
        
        // 'i' keeps track of where the next valid element should be placed
        int i = 2;
        
        // 'j' scans through the array
        for (int j = 2; j < nums.length; j++) {
            // Compare current element with the one two places behind the placement index
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        
        return i;
        
    }
}