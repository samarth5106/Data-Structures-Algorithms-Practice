long minEnergyCost(const vector<int>& T,int K){
    int n=T.size();
    vector<long long>a(n);
    for(int i=0;i<n;i++)a[i]=T[i];
    long long cost=0;

    for(int i=1;i<n;i++){
        if(a[i]>a[i-1]+K){
            cost+=a[i]-(a[i-1]+K);
            a[i]=a[i-1]+K;
        }
    }

    for(int i=n-2;i>=0;i--){
        if(a[i]>a[i+1]+K){
            cost+=a[i]-(a[i+1]+K);
            a[i]=a[i+1]+K;
        }
    }

    return cost;
}
