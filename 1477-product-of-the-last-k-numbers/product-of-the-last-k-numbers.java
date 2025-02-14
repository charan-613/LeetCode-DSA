class ProductOfNumbers {

    ArrayList<Integer> arl;
    int size = 0;

    public ProductOfNumbers() {
        arl = new ArrayList<>();
        arl.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            arl = new ArrayList<>();
            arl.add(1);
        }
        else{
            arl.add(arl.get(arl.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        if(k > arl.size() - 1){
            return 0;
        }
        else{
            return arl.get(arl.size() - 1) / arl.get(arl.size() - 1 - k);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */