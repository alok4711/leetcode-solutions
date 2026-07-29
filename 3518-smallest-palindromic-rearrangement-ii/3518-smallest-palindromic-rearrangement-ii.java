import java.util.*;
class Solution {
    private static final long CAP = 1_000_001L;
    public String smallestPalindrome(String s, int k) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        int[] halfCounts = new int[26];
        char midChar = ' ';
        boolean hasMid = false;

        for (int i = 0; i < 26; i++) {
            halfCounts[i] = counts[i] / 2;
            if (counts[i] % 2 == 1) {
                midChar = (char) ('a' + i);
                hasMid = true;
            }
        }

        long totalPerms = countArrangements(halfCounts);
        if ((long) k > totalPerms) {
            return "";
        }

        int halfLen = 0;
        for (int count : halfCounts) {
            halfLen += count;
        }

        StringBuilder leftHalf = new StringBuilder();
        long currentK = k;

        for (int pos = 0; pos < halfLen; pos++) {
            for (int i = 0; i < 26; i++) {
                if (halfCounts[i] == 0) continue;

                halfCounts[i]--;
                long arrangements = countArrangements(halfCounts);

                if (arrangements >= currentK) {
                    leftHalf.append((char) ('a' + i));
                    break;
                } else {
                    currentK -= arrangements;
                    halfCounts[i]++;
                }
            }
        }

        String left = leftHalf.toString();
        StringBuilder sb = new StringBuilder(left);
        if (hasMid) {
            sb.append(midChar);
        }
        sb.append(leftHalf.reverse().toString());

        return sb.toString();
    }

    private long nCk(int n, int r) {
        if (r < 0 || r > n) return 0;
        if (r == 0 || r == n) return 1;

        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
            if (res >= CAP) {
                return CAP;
            }
        }
        return res;
    }

    private long countArrangements(int[] freq) {
        int total = 0;
        for (int count : freq) {
            total += count;
        }

        long res = 1;
        for (int count : freq) {
            if (count == 0) continue;
            res *= nCk(total, count);
            if (res >= CAP) {
                return CAP;
            }
            total -= count;
        }
        return res;
    }
}