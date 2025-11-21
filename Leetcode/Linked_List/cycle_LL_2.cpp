/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* slow=head,*fast=head;
        int flag=0;
        while(fast!=NULL&&fast->next!=NULL){
            if(flag==1&&fast==slow){
                return slow;
            }
            slow=slow->next;
            if(flag==0)
            fast=fast->next->next;
            else
            fast=fast->next;
            if(slow==fast){
                if(flag==1){
                    return slow;
                }
                slow=head;
                flag=1;
            }
        }
        return NULL;
    }
};
        
    
