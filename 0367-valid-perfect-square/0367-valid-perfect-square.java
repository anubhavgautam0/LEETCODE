class Solution {
    public boolean isPerfectSquare(int num) 
    {
        long pivot = num;
        long end = 0;

        while( pivot * pivot >= num)
        {
            end= pivot;
            pivot = pivot / 2;
        }
        for ( long start =0 ; start <= end ; start++)
        {
            if( start*start == num)
            {
                return true;
            }
        }
    return false;    
    }
}