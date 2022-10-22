package DP;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }


    static int p[] = {-1, -1, -1, -1, -1, -1};
    //TopDown Approach
    static int fiboRec(int n) {
        if (n <= 2) {
            return 1;
        }
        if (p[n] != -1) {
            return p[n];
        }

        return p[n] = fiboRec(n - 1) + fiboRec(n - 2);
    }


    static int dp[] = {-1, -1, -1, -1, -1, -1};
    //Bottom UP Approach
    static int fibo(int n) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
