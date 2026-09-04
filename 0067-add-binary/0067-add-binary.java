import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) 
    {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        
        // Step 2: Add them together
        BigInteger sum = num1.add(num2);
        
        // Step 3: Convert the sum back to a binary string (base 2)
        return sum.toString(2);
        
    }
}