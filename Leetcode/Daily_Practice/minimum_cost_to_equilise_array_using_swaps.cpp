class Solution {
public:
    int minCost(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> unmp;
       // int cost=0;
        int n=nums1.size();
        for(int i=0;i<n;i++){
            unmp[nums1[i]]++;
        }
        for(int i=0;i<n;i++){
            unmp[nums2[i]]++;
        }
        for(auto const&p: unmp){
            if(p.second%2==1){
                return -1;
            }
        }
        unordered_map<int,int> unmp1;
         unordered_map<int,int> unmp2;
        int cost=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            unmp1[nums1[i]]++;
            maxi=max(maxi,nums1[i]);
        }
        for(int i=0;i<n;i++){
            unmp2[nums2[i]]++;
            maxi=max(maxi,nums2[i]);
        }
        vector<int> exchange(n,0);
        vector<int> same(maxi+1,0);
        int exchng=0;
        for(int i=0;i<n;i++){
            int total=unmp[nums1[i]];
            int eq=total/2;
            int give;
            if(same[nums1[i]]==0){
                if(unmp1[nums1[i]]>eq){
                    give=unmp1[nums1[i]]-eq;
                    //exchange[give]++;
                    while(give--){
                        exchng++;
                    }
                    
                }
                else if(unmp2[nums1[i]]>eq){
                    give=unmp2[nums1[i]]-eq;
                   // exchange[give]++;
                    while(give--){
                        exchng++;
                    }
                }
                same[nums1[i]]=1;
            }
        }

        for(int i=0;i<n;i++){
            int total=unmp[nums2[i]];
            int eq=total/2;
            int give;
            if(same[nums2[i]]==0){
                if(unmp1[nums2[i]]>eq){
                    give=unmp1[nums2[i]]-eq;
                   // exchange[give]++;
                    while(give--){
                        exchng++;
                    }
                }
                else if(unmp2[nums2[i]]>eq){
                    give=unmp2[nums2[i]]-eq;
                   // exchange[give]++;
                    while(give--){
                        exchng++;
                    }
                }
                same[nums2[i]]=1;
            }
        }
        
        
     return exchng/2;
    }
    
};©leetcode
