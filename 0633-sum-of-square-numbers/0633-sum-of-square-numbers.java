class Solution {
    public boolean judgeSquareSum(int c) 
    {
        int start = 0;
        long end = (long) Math.sqrt(c);
        while (  start <= end )
        {
            long sum = ((start * start) + ( end * end) );
 
            if (  sum < c)
            {
                start ++;

            }
            else if (  sum > c)
            
                end--;
            
            else if ( sum == c)
            {
                return true;
            }

        }
   return false;    
    }
}