/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//  class pair{
//     int val;
//     int idx;
//     pair(int val,int idx){
//         this.val=val;
//         this.idx=idx;
//     }
//  }

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans=new int[2];
        Arrays.fill(ans,-1);

        ListNode prev=head;
        ListNode curr=head.next;
        ArrayList<Integer> al=new ArrayList<>();
        int idx=0;
        ListNode front=curr.next;

        while(front!=null){
            idx++;
            if(prev.val>curr.val&&front.val>curr.val){
                al.add(idx);
               // idx++;
            }
            else if(prev.val<curr.val&&front.val<curr.val){
                 al.add(idx);
            }
            prev=curr;
            curr=front;
            front=front.next;
        }
        //Collectons.sort(al);
        //3, 5, 6
       if(al.isEmpty()||al.size()==1){
        return ans;
       }
        ans[1]=al.get(al.size()-1)-al.get(0);
        ans[0]=ans[1];

        for(int i=1;i<al.size();i++){
            if(al.get(i)-al.get(i-1)<ans[0]){
                ans[0]=al.get(i)-al.get(i-1);
            }
        }

        return ans;


        
    }
}
