class Solution {

    public int superPow(int a, int[] b) {

        int ans = 1;

        for (int digit : b) {

            ans = power(ans, 10);
            ans = (ans * power(a, digit)) % 1337;
        }

        return ans;
    }

    int power(int a, int n) {

        int result = 1;

        a %= 1337;

        while (n > 0) {

            if (n % 2 == 1) {
                result = (result * a) % 1337;
            }

            a = (a * a) % 1337;
            n /= 2;
        }

        return result;
    }
}