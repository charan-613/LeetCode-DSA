class ProductOfNumbers {
    private List<Integer> arl;

    public ProductOfNumbers() {
        arl = new ArrayList<>();
        arl.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            arl.clear();
            arl.add(1);
        } else {
            arl.add(arl.get(arl.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int n = arl.size();
        if (n <= k) {
            return 0;
        }
        return arl.get(n - 1) / arl.get(n - 1 - k);
    }
}
