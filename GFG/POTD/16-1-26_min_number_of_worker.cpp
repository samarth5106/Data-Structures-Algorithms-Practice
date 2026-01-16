

int minPeople(vector<int>&arr){
    int n=arr.size();
    vector<pair<int,int>>seg;
    for(int i=0;i<n;i++){
        if(arr[i]!=-1){
            int l=max(0,i-arr[i]);
            int r=min(n-1,i+arr[i]);
            seg.push_back({l,r});
        }
    }
    sort(seg.begin(),seg.end());
    int i=0,cnt=0,cur=0,best=-1;
    while(cur<n){
        while(i<seg.size()&&seg[i].first<=cur){
            best=max(best,seg[i].second);
            i++;
        }
        if(best<cur)return -1;
        cnt++;
        cur=best+1;
    }
    return cnt;
}
