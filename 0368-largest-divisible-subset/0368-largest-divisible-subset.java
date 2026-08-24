class Solution {

    List<Integer>[][] memo;

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;

        memo = new ArrayList[n][n + 1];

        return helper(nums, 0, -1);
    }
    List<Integer> helper(int[] nums, int idx, int prev){
        if (idx == nums.length) {
            return new ArrayList<>();
        }
        
        if (memo[idx][prev + 1] != null) {
            return memo[idx][prev + 1];
        }

        List<Integer> skip = helper(nums, idx + 1, prev);

        List<Integer> best = skip;

        if (prev == -1 || nums[idx] % nums[prev] == 0) {

            List<Integer> take = new ArrayList<>(helper(nums, idx + 1, idx));

            take.add(0, nums[idx]);

            if (take.size() > best.size()) {
                best = take;
            }
        }

        memo[idx][prev + 1] = best;

        return best;
    }
}