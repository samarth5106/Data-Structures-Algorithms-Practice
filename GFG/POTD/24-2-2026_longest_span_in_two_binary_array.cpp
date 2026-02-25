class Solution {
  public:
    int equalSumSpan(vector<int> &a1, vector<int> &a2) {
        // code here
        
     int sz=a1.size();
    unordered_map<int,int> unmp;
    int prefix=0;
    int maxl=0;
    unmp[0]=-1; 
    
    for(int i=0;i<sz;i++){
        
        prefix+=(a1[i]-a2[i]);
        if(unmp.find(prefix)!=unmp.end()){
            maxl=max(maxl,i-unmp[prefix]);
        }
        else unmp[prefix]=i;  
    }
    
    return maxl;
    }
};



Approach - see hame dono array me ek aisa common i to j window dhundna hai jiska sum is same for both the array so Sum(a1 from index i to j) = Sum(a2 from index i to j) hame chahie
	   On Rearranging  we get , Sum(a1[ i to j]) - Sum(a2[ i to j])=0
	   On expanding both Sum and a bit rearrangement we get this : a1[i]-a2[i]) + (a1[i+1]-a2[i+1]) + (a1[i+2]-a2[i+2]).......= 0
	   So basically har index par ham Array1 and Array2 ke element ka difference nkal rahe hai that is Diff[i] = a1[i] - a2[i] and un differences ka sum jab 0 milega tab eventually 
	   hamri condition hi satisfy hogi as hamne starting me hi expanding and rearrangement se hamne jaan lia tha ki longest span in both array basically mean 
	   this : a1[i]-a2[i]) + (a1[i+1]-a2[i+1]) + (a1[i+2]-a2[i+2]).......= 0
	   so ab hame uss differences ke array me longest subarray dhundhna hai jiska sum =0 ho HOW WE WILL FIND THAT ? == Prefix sum and Hashmap 
Uss difference vale array me ham prefeix sum use karenge if hame doo indices par prefix sum same milta hai it means ki unnk beech ka sum is 0, and tht's what we want so for this 
we used Hashmap, ham hashmap me prefis=x sum ki value and uska first occurence index store karte hai and while iterating if again we find the same value then uss index and first index 
(jo hamne map me store kia tha) ka difference nikalte hai which is the length and then only this , maxl=max(maxl,i-unmp[prefix])

and iss tarah we get our maxl means MAXMIMUM LENGTH = Longest Subarray
