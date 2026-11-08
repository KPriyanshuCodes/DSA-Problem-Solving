class Solution {

    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long a = power(5, even);
        long b = power(4, odd);

        return (int)((a * b) % MOD);
    }

    static long power(long base, long exp) {

        long result = 1;

        while (exp > 0) {

            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;

            exp = exp / 2;
        }

        return result;
    }
}