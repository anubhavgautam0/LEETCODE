class Solution {
    public int maximum69Number (int num) 
    {
        int index = 1;
        int add =0;
        int temp = num;

        while (temp>0)
        {
            int rem = temp %10;
            if (rem ==6)
            {
                add = 3 * index ;
            }
            index= index *10;
            temp = temp/10;
        }
        
        return num+add;
        
    }
}