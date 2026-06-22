class Solution {
  public:
    int maxArea(vector<int> &h) {
        // code here
        int l=0;
int r=h.size()-1;
int area=0;


while(l<r){

    area=max(area,min(h[l],h[r])*(r-l-1));
    if(h[l]<h[r]){
        l++;
    }else{
        r--;
    }
}
return area;
   }
};
