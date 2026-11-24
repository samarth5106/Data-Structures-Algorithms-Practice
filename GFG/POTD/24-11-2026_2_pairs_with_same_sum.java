class Solution {
    public ArrayList<Integer> findPairs(int[] arr) {
        int n=arr.length;
        HashMap<Integer,List<int[]>> mp=new HashMap<>();

        for(int c=0;c<n;c++){
            for(int d=c+1;d<n;d++){
                int sum=arr[c]+arr[d];
                mp.computeIfAbsent(sum,k->new ArrayList<>()).add(new int[]{c,d});
            }
        }

        for(int a=0;a<n;a++){
            for(int b=a+1;b<n;b++){
                int sum=arr[a]+arr[b];

                if(mp.containsKey(sum)){
                    for(int[] p:mp.get(sum)){
                        int c=p[0],d=p[1];

                        if(a!=c&&a!=d&&b!=c&&b!=d){
                            ArrayList<Integer> ans=new ArrayList<>();

                            if(a<c||(a==c&&b<d)){
                                ans.add(a);
                                ans.add(b);
                                ans.add(c);
                                ans.add(d);
                            }
                            else{
                                ans.add(c);
                                ans.add(d);
                                ans.add(a);
                                ans.add(b);
                            }

                            return ans;
                        }
                    }
                }
            }
        }

        return new ArrayList<>(Arrays.asList(-1,-1,-1,-1));
    }
}
