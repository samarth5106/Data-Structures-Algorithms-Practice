int l=0;
int cntsubar=0;
int discnt=0;

int maxi=0;
for(int i=0;i<arr.length;i++)maxi=Math.max(maxi,arr[i]);

int[] check=new int[maxi+1];

for(int i=0;i<arr.length;i++){
    if(check[arr[i]]==0)discnt++;
    check[arr[i]]++;

    while(discnt>k){
        check[arr[l]]--;
        if(check[arr[l]]==0)discnt--;
        l++;
    }

    cntsubar+=i-l+1;
}

return cntsubar;
