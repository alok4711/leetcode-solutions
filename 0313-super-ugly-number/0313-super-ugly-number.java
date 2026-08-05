class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] ugly = new long[n];
        ugly[0] = 1;

        int[] idx = new int[primes.length];

        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, ugly[idx[j]] * (long)primes[j]);
            }

            ugly[i] = min;

            for (int j = 0; j < primes.length; j++) {
                if (ugly[idx[j]] * (long)primes[j] == min) {
                    idx[j]++;
                }
            }
        }

        return (int) ugly[n - 1];
    }
}