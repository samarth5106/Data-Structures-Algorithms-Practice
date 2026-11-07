class Solution {
    public ArrayList<String> generateUsernames(String[] arr) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        
        HashMap<String,Integer> mp=new HashMap<>();
        // HashMap<String,Integer> all=new HashMap<>();
        
        // for(int i=0;i<arr.length;i++){
        //     all.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        // }
        
        for(int i=0;i<arr.length;i++){
           // StringBuilder 
            StringBuilder sb=new StringBuilder(arr[i]);
            
                if(!mp.containsKey(arr[i])){
                    mp.put(arr[i],1);
                    ans.add(arr[i]);
                    
                }
                
                else{
                  int baseLen = arr[i].length();
                  int val = 1;
                  boolean got = true;

                  while (got) {
                      got = false;
                      sb.append(val);
                      String candidate = sb.toString();

                      if (mp.containsKey(candidate)) {
                          sb.setLength(baseLen); // resets back to original name
                          val++;
                          got = true;
                          continue;
                      }

                      for (int j = i + 1; j < arr.length; j++) {
                          if (arr[j].equals(candidate)) {
                              got = true;
                              sb.setLength(baseLen); // resets back to original name
                              break;
                          }
                      }

                      if (got) {
                          val++;
                      }
                  }

                  ans.add(sb.toString());
                  mp.put(sb.toString(), 1);
                   
                    
                }
            
        }
        return ans;
    }
}
