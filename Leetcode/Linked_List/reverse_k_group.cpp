/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        if(head==NULL||head->next==NULL||k==1){
            return head;

        }
        stack<int> st;
        int cnt=0;
        ListNode* temp=head;
        ListNode* strt=head;
        while(temp){
            cnt++;
           st.push(temp->val);
           if(cnt==k){
            while(strt!=temp->next){
                strt->val=st.top();
                st.pop();
                strt=strt->next;
            }
            cnt=0;
           }
           temp=temp->next;

        }
        return head;
        
    }
};
