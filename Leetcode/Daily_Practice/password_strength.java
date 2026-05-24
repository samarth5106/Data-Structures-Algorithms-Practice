class Solution {
    public int passwordStrength(String password) {
        int pt=0;
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i=0;i<password.length();i++){
           mp.put(password.charAt(i),mp.getOrDefault(password.charAt(i),0)+1);
            
        }
        for(char ch:mp.keySet()){
            if(ch>=97&&ch<=122){
                pt+=1;
            }
            else if(ch>=65&&ch<=90) pt+=2;
            else if(ch>=48&&ch<=57) pt+=3;
            else pt+=5;
        }
        return pt;
    }
}©leetcode
