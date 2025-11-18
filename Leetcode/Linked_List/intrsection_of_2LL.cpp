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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* temp1=headA;
        ListNode* temp2=headB;
        int cnt1=0,cnt2=0;
        while(temp1){
            cnt1++;
            temp1=temp1->next;
        }
        while(temp2){
            cnt2++;
            temp2=temp2->next;
        }
         temp2=headB;
            temp1=headA;
            ListNode* add;
        if(cnt1<=cnt2){
           while(temp2){
            add=temp2;
            temp1=headA;
            while(temp1){
                if(temp1==add){
                    return temp1;
                   
                }
                temp1=temp1->next;
            }
            temp2=temp2->next;
           }
        }
        else{
            while(temp1){
            add=temp1;
            temp2=headB;
            while(temp2){
                if(temp2==add){
                    return temp2;
                   
                }
                temp2=temp2->next;
            }
            temp1=temp1->next;
           }
           }
          return NULL;
        
    }
};
