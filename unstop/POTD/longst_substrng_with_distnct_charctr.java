int[] check=new int[128];
    int l=0;
    int maxi=0;

    for(int r=0;r<S.length();r++){
        char c=S.charAt(r);
        check[c]++;

        while(check[c]>1){
            check[S.charAt(l)]--;
            l++;
        }

        for(int i=l;i<=r;i++){
            if(Math.abs(S.charAt(i)-S.charAt(r))==D){
                maxi=Math.max(maxi,r-i+1);
            }
        }
    }
    return maxi;
