class Solution{
    public boolean isPalindrome(Node head){
        if(head==null||head.next==null) return true;

        Stack<Integer> st=new Stack<>();
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            st.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;
        }

        if(fast!=null){
            slow=slow.next;
        }

        while(slow!=null){
            if(st.isEmpty()||slow.data!=st.peek()){
                return false;
            }
            st.pop();
            slow=slow.next;
        }
        return true;
    }
}
