class Solution {

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

         int[] arr=new int[nums.length];

            int dx=0;

        for(int v:nums){
            arr[dx]=v;
            dx++;
        }

        Arrays.sort(arr);

        int key=0;

        HashMap<Integer,Queue<Integer>> grp=new HashMap<>();
           
        HashMap<Integer,Integer> itskey=new HashMap<>();

            grp.put(key,new LinkedList<>());
            grp.get(key).add(arr[0]);

            itskey.put(arr[0],key);

        for(int i=1;i<arr.length;i++){

            if(Math.abs(arr[i]-arr[i-1])<=limit){
                grp.get(key).add(arr[i]);
                itskey.put(arr[i],key);
            }

            else{

                key++;
                grp.put(key,new LinkedList<>());
                 grp.get(key).add(arr[i]);
                 itskey.put(arr[i],key);

            }

        }
        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){

          
            //ab ye dekhna hai ki ye element kiss grp ko belog krta hai then uss grp ka smallest available elmnt assign kr denge
            int belongsto=itskey.get(nums[i]);
            //ab uss grp ka smallest present
            int toadd=grp.get(belongsto).remove();
            ans[i]=toadd;

        }
        return ans;

    }
}
