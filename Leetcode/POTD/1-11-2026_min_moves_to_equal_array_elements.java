class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        //chote numbers ko hi bada krna hoga
        //ek common number jaha sb numebrs meet ho sake
        // maxi ek hi hai,-> n-1 increment honge toreachmaxi
        //when the mini element of those n-1 reaches maxi then ab hamara old maxi is not maxi anymore
        //2nd maxi will be the new maxi now ->we incrementd (oldMaxi-mini) times
        // now old maxi and other elements will be incremented to achieve new maxi
        // so this way tree/recurrence bnte jaega deep....
        
        //what when duplicates exist?

        // 1, 2, 3, 4, 5
        // 5, 6, 7, 8, 5
        // 8, 9, 10, 8, 8
        // 10, 11, 10, 10, 10
        // 11, 11, 11, 11, 11
        
        Arrays.sort(nums);
        int maxi=nums[n-1];
        int mini=nums[0];
        int times=1;
        int cnt=0;
        while(times!=n+1){

            maxi=nums[n-times];
            int minidx=n-times+1;
            if(minidx>=n) minidx=0;
            mini=nums[minidx];
            if(mini==maxi) break;
            cnt+=maxi-mini;
            int diff=maxi-mini;

            for(int i=0;i<n;i++){
                if(i==n-times) continue;
                nums[i]+=diff;
            }

            times++;

        }
        return cnt;
    }
}
