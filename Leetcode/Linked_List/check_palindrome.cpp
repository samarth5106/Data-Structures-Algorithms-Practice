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
    bool isPalindrome(ListNode* head) {
        ListNode* temp1=head;
        vector<int> vec;
        while(temp1){
           vec.push_back(temp1->val);
           temp1=temp1->next;
        }
        int s=0,end=vec.size()-1;
        while(s<=end){
             if(vec[s] != vec[end]){
        return false;
    }
    s++;
    end--;
        }
        return true;
        
    }
};
