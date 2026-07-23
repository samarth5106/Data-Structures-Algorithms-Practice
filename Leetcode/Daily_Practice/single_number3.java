class Solution {
    public int[] singleNumber(int[] nums) {
        // Step 1: XOR all numbers to get (xorResult = A ^ B)
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }

        // Step 2: Find the rightmost set bit (where A and B differ)
        // Using bitwise AND with two's complement (-xorResult)
        int rightmostBit = xorResult & -xorResult;

        // Step 3: Divide numbers into two groups and XOR each group
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & rightmostBit) != 0) {
                a ^= num; // Numbers with the bit set
            } else {
                b ^= num; // Numbers with the bit NOT set
            }
        }

        return new int[]{a, b};
    }
}
