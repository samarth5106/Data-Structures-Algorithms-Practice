class Solution {
    public int numberOfSpecialChars(String word) {
        int[] visited=new int[26];
        Arrays.fill(visited,0);
        int cnt=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=97&&word.charAt(i)<=122){
                if(visited[word.charAt(i)-97]==0){
                    for(int j=0;j<word.length();j++){
                        if(word.charAt(j)==word.charAt(i)-32){
                            visited[word.charAt(i)-97]=1;
                            cnt++;break;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
