class Solution {
    public int[] sumZero(int n) 
    {
        int ans[]=new int[n];
        int index =0;
        int sum =0;
        int temp = n;

        while (index != n-1 )
        {
            ans[index] = temp;
            index++;
            sum = sum + temp;
            temp = temp -1;
        }
        ans[n-1]=-sum;
    return ans;
    }
}