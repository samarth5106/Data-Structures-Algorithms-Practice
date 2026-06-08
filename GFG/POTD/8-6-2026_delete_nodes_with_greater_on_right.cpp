/* Structure of a Linked List node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = nullptr;
    }
};
*/
class Solution {
  public:
    Node *compute(Node *head) {
        if(head->next==NULL) return head;
        // code here
        Node* curr=head;
         Node* prev=NULL;
         int currval;
        while(curr!=NULL){
           
        Node* next=curr->next;
         currval=curr->data;
        while(next!=NULL){
            if(next->data>currval&&curr==head){
                currval=next->data;
                head=next;
                curr=head;
                currval=curr->data;
                next=curr->next;
                prev=NULL;
                continue;
            }
            else if(next->data>currval&&curr!=head){
                prev->next=next;
               // prev=next;
                curr=next;
                currval=curr->data;
                next=curr->next;
                continue;
            }
            
            next=next->next;
        }
        prev=curr;
        curr=curr->next;
            
            
        }
        return head;
        
    }
};
