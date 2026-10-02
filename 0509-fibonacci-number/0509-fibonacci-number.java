class Solution {
    public int fib(int n) 
    {
        if (n<=1)
        {
            return n;
        }
        int first =0;
        int second =1;
        int count =1;
        int fibb=0;
        while ( count != n)
        {
            fibb = first + second;
            first = second;
            second = fibb;
            count++;
        }
    return fibb;
        
    }
}