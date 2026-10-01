class Solution {
    public int smallestRangeI(int[] num, int k) 
    {
        Arrays.sort(num);
        num[0]=num[0]+k;
        num[num.length -1]=num[num.length -1] -k;
        
        int diff = num[num.length -1] - num[0];
        if (diff <0)
        return 0;

    return diff;



        
    }
}