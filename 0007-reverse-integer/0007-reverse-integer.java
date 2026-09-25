class Solution {
    public int reverse(int x)
    {
        int  rem;
        long  newNum =0 ; 

        while (  x !=0)
        {
            rem = x% 10;
            newNum = (newNum *10) + rem;
            x= x/ 10;
        }
        if ( newNum >= 2147483647 || newNum< -2147483648 )
        {
            return 0;
        }
        return (int)newNum;

        
    }
}