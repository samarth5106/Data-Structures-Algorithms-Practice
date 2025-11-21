/*
Definition of special linked list:
struct ListNode
{
    int val;
    ListNode *next;
    ListNode *child;
    ListNode()
    {
        val = 0;
        next = NULL;
        child = NULL;
    }
    ListNode(int data1)
    {
        val = data1;
        next = NULL;
        child = NULL;
    }
    ListNode(int data1, ListNode *next1, ListNode* next2)
    {
        val = data1;
        next = next1;
        child = next1;
    }
};
*/

class Solution {
public:
ListNode* join(ListNode* temp1,ListNode* temp2){
    ListNode* dumm=new ListNode(-1);
    ListNode* temp=dumm;
    ListNode* t1=temp1,*t2=temp2;
    while(t1!=NULL&&t2!=NULL){
        if(t1->val<t2->val){
            temp->child=t1;
            t1=t1->child;
        }
        else{
            temp->child=t2;
            t2=t2->child;
        }
        temp->next=NULL;
        temp=temp->child;
    }
    if(t1) temp->child=t1;
    else temp->child=t2;
    return dumm->child;
}
    ListNode* flattenLinkedList(ListNode* &head) {
        
        if(head==NULL||head->next==NULL){
            return head;
        }
        ListNode* temp=head->next,*prev=head;
        ListNode* front=temp->next;
   
        while(front){
            prev=join(prev,temp);
            temp=front;
            front=front->next;
        }
        prev=join(prev,temp);
        return prev;

    }
};
