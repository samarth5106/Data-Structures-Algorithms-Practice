class ProductOfNumbers {
    //StringBuilder sb=new StringBuilder();
       ArrayList<Integer> al=new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
        int ans=1;
        int n=al.size();
        for(int i=n-k;i<n;i++){
            ans*=al.get(i);
        }
        return ans;

    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
