class Solution {
    public boolean isPowerOfFour(int n) 
    {
        if (n==1)
        return true;
        if (n<=0)
        return false;
        
        while (n>0)
        {
            int quotient = n/4;
            int rem = n%4;
            n=quotient;
            if (rem != 0)
            {
                return false;
            }
            if (quotient ==1 )
            {
                return  true;
            }
        }
        
    return false;    
    }
}