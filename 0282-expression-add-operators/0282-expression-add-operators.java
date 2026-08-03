class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        dfs(num, target, 0, "", 0, 0, ans);
        return ans;
    }
    void dfs(String num, int target, int index, String expr, long value, long prev, List<String> ans) {
        if (index == num.length()) {
            if (value == target) ans.add(expr);
            return;
        }
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') break;
            long curr = Long.parseLong(num.substring(index, i + 1));
            if (index == 0) {
                dfs(num, target, i + 1, "" + curr, curr, curr, ans);
            }
            else {
                dfs(num, target, i + 1, expr + "+" + curr, value + curr, curr, ans);
                dfs(num, target, i + 1, expr + "-" + curr, value - curr, -curr, ans);
                dfs(num, target, i + 1, expr + "*" + curr, value - prev + prev * curr, prev * curr, ans);
            }
        }
    }
}