class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        int index =0;
        List<Integer> ans = new ArrayList<>();
        for( int i = left ; i<= right ; i++)
        {
            int temp = i;
            int sum =0 ;
            while ( temp > 0)
            {
                int rem = temp%10 ;
                if ( rem == 0 )
                {
                    sum =1;
                    break;
                }
                int div =i % rem; 
                sum = div + sum ;
                temp= temp/10;
            }
            if ( sum ==0)
            {
                ans.add(i);
                index++;
            }
        }
    return ans;    
    }
}