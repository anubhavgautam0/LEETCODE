class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int num =1;
        Arrays.sort(nums);
        ArrayList <Integer> ans = new ArrayList<>();
        for (int i = 0; i< nums.length ; i++)
        {
            if (nums[i]==num)
            {
                num++;
            }
            else if (nums[i] > num)
            {
                ans.add(num);
                num++;
                i--;

            }
        }
            while (num <= nums.length)
        {
            ans.add(num);
            num++;
        }

        
    return ans;
        
    }
}