class Solution {

    class pair{

        int level;
        String s;

        pair(String s,int level){
            this.s=s;
            this.level=level;
        }

    }

    public int minMutation(String startGene, String endGene, String[] bank) {

        Map<String, Integer> visited=new HashMap<>();

        visited.put(startGene,1);

        Queue<pair> q=new LinkedList<>();

        q.add(new pair(startGene,0));

        while(!q.isEmpty()){
            pair pr=q.remove();
            String s=pr.s;
             visited.put(s,1);
            int level=pr.level;

            if(s.equals(endGene)){
                return level;
            }
            //A C G T
            for(int i=0;i<4;i++){
               char c='x';
               if(i==0)c='A';
               if(i==1)c='C';
               if(i==2)c='G';
               if(i==3)c='T';
                for(int j=0;j<8;j++){
                     StringBuilder sb=new StringBuilder(s);
                     sb.setCharAt(j,c);
                     for(int k=0;k<bank.length;k++){
                       if(bank[k].equals(sb.toString()) && !visited.containsKey(sb.toString())){
                            q.add(new pair(sb.toString(),level+1));
                        }
                     }
                }
            }
        }
        return -1;
    }
}
