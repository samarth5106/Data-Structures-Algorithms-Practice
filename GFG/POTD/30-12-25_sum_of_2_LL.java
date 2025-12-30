class Solution{
    public Node addTwoLists(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;

        Node front=null;
        Node prev=null;

        while(temp1!=null){
            front=temp1.next;
            temp1.next=prev;
            prev=temp1;
            temp1=front;
        }
        head1=prev;

        prev=null;
        front=null;
        while(temp2!=null){
            front=temp2.next;
            temp2.next=prev;
            prev=temp2;
            temp2=front;
        }
        head2=prev;

        temp1=head1;
        temp2=head2;

        int carry=0;
        Node node=new Node(-1);
        Node cur=node;

        while(temp1!=null||temp2!=null){
            int sum=carry;
            if(temp1!=null){
                sum+=temp1.data;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.data;
                temp2=temp2.next;
            }
            carry=sum/10;
            cur.next=new Node(sum%10);
            cur=cur.next;
        }

        if(carry!=0){
            cur.next=new Node(carry);
        }

        Node res=node.next;
        prev=null;
        front=null;
        while(res!=null){
            front=res.next;
            res.next=prev;
            prev=res;
            res=front;
        }
        while(prev!=null&&prev.data==0&&prev.next!=null){
    prev=prev.next;
}

        return prev;
    }
}
