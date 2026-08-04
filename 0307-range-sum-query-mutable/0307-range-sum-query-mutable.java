class NumArray {
    private int[] tree;
    private int[] nums;
    private int n;
    
    public NumArray(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        this.tree = new int[n + 1];

        for (int i = 0; i < n; i++) {
            init(i, nums[i]);
        }
    }

    private void init(int i, int val) {
        i++;
        while (i <= n) {
            tree[i] += val;
            i += i & (-i);
        }
    }
    
    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        init(index, diff);
    }

    private int getSum(int i) {
        int sum = 0;
        i++;
        while (i > 0) {
            sum += tree[i];
            i -= i & (-i);
        }
        return sum;
    }
    
    public int sumRange(int left, int right) {
        return getSum(right) - getSum(left - 1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */