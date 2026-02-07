class Solution{
    static int maxSum(int arr[],int n){
        long totsum=0;
        long cur=0;
        for(int i=0;i<n;i++){
            totsum+=arr[i];
            cur+=1L*i*arr[i];
        }
        long ans=cur;
        for(int i=1;i<n;i++){
            cur=cur+totsum-1L*n*arr[n-i];
            if(cur>ans)ans=cur;
        }
        return (int)ans;
    }
Approach- see ek thought tha ki if array ke max elmnt ko max 
arr.length-1th indx de and baaki ke array me circular way me iterate 
krte hue unhe remaining indces de o max sum mil skta hai as we gave the 
max elmnt the max index possible , but in array there can be duplicates 
so in that case this wont work

My method- given array ko rotate vegere kr jo permutations bnte he un sb ken lie sum krke dekhte hai but its BRUTEFORCE so TLE ,, so other thought was ki array ke elmnts ko vaise hi rkhte hai and only indices ko rotate krte hai and then observing and trying to find some pattern like on moving from moving from 1 permutation/pattern to next pattern the sum jo aaega usme hm kisi formula se nikal paaenge ,, so thi swas the ase of approach
