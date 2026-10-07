class Solution {
    public int subtractProductAndSum(int n) 
    {
        int sum=0;
        int product=1;

        while (n>0)
        {
            int quotient = n%10;
            sum= sum + quotient;
            product = product * quotient;
            n=n/10;

        }
        return product - sum;
        
    }
}