class Solution {
  public:
    vector<int> findClosestPair(vector<int> &arr1, vector<int> &arr2, int x) {
        // code here
        int i=0;
        int j=arr2.size()-1;
        vector<int> ans;
        int sum;
        int mini=INT_MAX;
        bool first=true;
        int diff;
        while(i<arr1.size()&&j>=0){
            sum=arr1[i]+arr2[j];
            diff=abs(x-sum);
            if(first){
                mini=diff;
                ans.push_back(arr1[i]);
                ans.push_back(arr2[j]);
                first=false;
            }
            if(diff<mini){
                ans.clear();
                ans.push_back(arr1[i]);
                ans.push_back(arr2[j]);
                mini=diff;    
            }
            if(sum>x){
                j--;
            }
            else{
                i++;
            }
            
            /*if(diff>mini){
                if(sum>x){
                    j--;
                }
                else{
                    i++;
                }
            }
            */
        }
       return ans;
    }
};



My Approach - See que padh ke samaz to gya tha ki 2 pointers use karna hai firstly maine start  kia i and j ko from index =0 from their respective arrays, and was incrementing i and j by 
                 1 simultaneously, so basically mai only same index vale pairs ka sum check kr rha tha ,,,

Correct Approach - then maine ek pointer i ko start kia fromthe beginning and 2nd pointer ko start kia j ko from the end of array so and just check kia if the sum is greater than x 
			then  it means ki mujhe sum ko drecease krna hoga to get it near to the value of X so for that ham 'j' ko decrease krenge and also if sum is less than X 
			then we need to increase the value of of sum so need of increment so we will increment 'i',
