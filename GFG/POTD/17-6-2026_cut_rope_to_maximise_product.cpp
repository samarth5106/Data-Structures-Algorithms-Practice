class Solution {
  public:
  

    int maxProduct(int n) {
        // code here
        
        if (n == 2) return 1;
    if (n == 3) return 2;

    int product = 1;
    
    // Case 1: Remainder is 1, save a 4 (which becomes 2 * 2)
    if (n % 3 == 1) {
        product *= 4;
        n -= 4;
    }
    // Case 2: Remainder is 2, save a 2
    else if (n % 3 == 2) {
        product *= 2;
        n -= 2;
    }

    // The remaining length is now perfectly divisible by 3
    while (n > 0) {
        product *= 3;
        n -= 3;
    }

    return product;
       // return ans;
    }
    //min - 1
    //max- 
};
