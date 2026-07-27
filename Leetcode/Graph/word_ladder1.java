class Pair{
    String s;
    int step;
    Pair(String s,int step){
        this.s=s;
        this.step=step;
    }
}
class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
       Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(beginWord,1));
       Set<String> st=new HashSet<>();

       for(int i=0;i<wordList.size();i++){
        st.add(wordList.get(i));
       }
        st.remove(beginWord);
        //int cnt=0;
       while(!q.isEmpty()){

        Pair pr=q.remove();
        String str=pr.s;
        int stp=pr.step;
       // cnt++;
        if(str.equals(endWord)) return stp;

        for(int i=0;i<str.length();i++){

            StringBuilder sb=new StringBuilder();
            sb.append(str);

            for(char c='a';c<='z';c++){

                sb.setCharAt(i,c);
                if(st.contains(sb.toString())){
                    st.remove(sb.toString());
                    Pair newpr=new Pair(sb.toString(),stp+1);
                    q.add(newpr);
                    
                }
            }
        }


       }
        return 0;
    }
}
