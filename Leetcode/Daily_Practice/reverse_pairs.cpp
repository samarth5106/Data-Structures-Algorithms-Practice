class Solution {
public:
    int mergeSort(vector<int>& nums, int low, int high) {
        if (low >= high) return 0;

        int mid = (low + high) / 2;
        int count = 0;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);

        count += countPairs(nums, low, mid, high);

        merge(nums, low, mid, high);

        return count;
    }

    int countPairs(vector<int>& nums, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long long)nums[i] > 2LL * nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }

        return count;
    }

    void merge(vector<int>& nums, int low, int mid, int high) {
        vector<int> temp;
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.push_back(nums[left++]);
            } else {
                temp.push_back(nums[right++]);
            }
        }

        while (left <= mid) temp.push_back(nums[left++]);
        while (right <= high) temp.push_back(nums[right++]);

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }

    int reversePairs(vector<int>& nums) {
        return mergeSort(nums, 0, nums.size() - 1);
    }
};


Logic / Approach- 

Logic / Approach:

Is problem ka main intuition yeh hai ki hume brute force se bachna hai 
(jo O(n^2) hai), aur uske liye hum merge sort ka use karte hain, 
kyunki merge sort already array ko divide karke sort karta hai 
O(n log n) me.

Idea yeh hai ki jab hum array ko do parts me tod dete hain 
(left aur right), aur dono parts already sorted hote hain, 
tab hum efficiently count kar sakte hain ki kitne elements 
left part ke aise hain jo right part ke elements ke liye 
condition satisfy karte hain: nums[i] > 2 * nums[j].

Ab kyunki dono halves sorted hain, hum ek pointer left me 
aur ek pointer right me rakhte hain, aur har element ke liye 
right pointer ko sirf aage badhate hain (reset nahi karte), 
jisse overall counting linear time me ho jaati hai us merge 
step ke liye.

Is tarah har level par counting bhi ho jaati hai aur sorting bhi, aur total complexity O(n log n) ho jaati hai.

Your doubt was — agar merge sort me array sort ho raha hai, 
to kya original indices ka order change ho jaata hai aur 
kya isse reverse pairs ka answer galat ho jayega?

Answer — hum final sorted array pe count nahi karte. 
Hum merge sort ke beech me jab array left (pehle wale 
indices) aur right (baad wale indices) me split hota hai, 
tab unke beech pairs count karte hain.

Left part ke elements original me hamesha pehle aate hain 
aur right part ke baad, isliye jab hum i left me aur j right 
me lete hain, tab automatically i < j satisfy hota hai.

Sorting sirf help karti hai condition efficiently check 
karne me, lekin original index relation logically same 
rehta hai, isliye answer correct aata hai.
