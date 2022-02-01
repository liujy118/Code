package Code;

/**
 * 斐波那契数列
 */
public class JZ10 {
    public int fib(int n) {
        int[] arr = new int[n + 1];
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }
        return arr[n];
    }
}
