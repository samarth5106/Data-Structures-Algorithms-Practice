// class Solution {
//     public void sortIt(int[] arr) {
        // code here
    //     ArrayList<Integer> odd=new ArrayList<>();
    //     ArrayList<Integer> even=new ArrayList<>();
     
    //     //SC= O(2n);
    //     //TC =O(n);
        
    //     for(int x:arr){
    //         if((x&1)=+=1){
    //             odd.add(x);
    //         }
    //         else even.add(x);
    //     }
        
    //     Collections.sort(odd);
    //     Collections.sort(even);
    //     int n=odd.size();
    //     int i=0;
    //   while(i<n){
    //         arr[i]=odd.get(n-i-1);
    //         i++;
    //     }
    //   // n=even.size();
    //     int N=even.size()+n;
    //     int k=0;
    //     while(i<N){
    //         arr[i]=even.get(k);
    //         k++;
    //         i++;
            
    //     }
    
    class Solution {

        public void sortIt(int[] arr) {

            for(int i=0;i<arr.length;i++){

                if(arr[i]%2==1){

                    arr[i]*=-1;

                }

            }

            Arrays.sort(arr);

            for(int i=0;i<arr.length;i++)

            if(arr[i]<0){

                arr[i]*=-1;

            }



        }

    }


    
    
    
        
        
//     }
// }
