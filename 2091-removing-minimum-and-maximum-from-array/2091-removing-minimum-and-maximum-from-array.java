class Solution {
    public int minimumDeletions(int[] nums) 
    {
        int arrayLength = nums.length;
        int max=0;
        int min = 0;

        for ( int i =0 ; i< arrayLength ; i++)
        {
            if ( nums [i] > nums[ max])
            {
                max=i;
            }
            if ( nums [i] < nums [ min ])
            {
                min = i;
            }
        }
        int left = Math.min(max,min);
        int right = Math.max(max,min);
        
        int frontDeletion = right+1;
        int backDeletion = arrayLength -left ;

        int both = (left+1) +( arrayLength - right ) ;
        return Math.min(frontDeletion , Math.min( backDeletion , both));
        
    }
}