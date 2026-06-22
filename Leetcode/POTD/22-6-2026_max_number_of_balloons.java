class Solution {
    public int maxNumberOfBalloons(String text) {
     HashMap<Character,Integer> mp=new HashMap<>();
     int k=0;

     for(int i=0;i<text.length();i++){
        if(text.charAt(i)=='b'||text.charAt(i)=='a'||text.charAt(i)=='l'||text.charAt(i)=='o'||text.charAt(i)=='n'){
            mp.put(text.charAt(i),mp.getOrDefault(text.charAt(i),0)+1);
            k++;
        }
     }
     if(mp.get('a')==null||mp.get('b')==null||mp.get('n')==null||mp.get('o')==null||mp.get('l')==null) return 0;
    int atleast=Math.min(mp.get('b'),Math.min(mp.get('a'),mp.get('n')));
    
    int atleast2=Math.min(mp.get('o'),mp.get('l'));
    if(atleast==0||atleast2<2) return 0;
    atleast2/=2;
    return Math.min(atleast,atleast2);
    }
}
