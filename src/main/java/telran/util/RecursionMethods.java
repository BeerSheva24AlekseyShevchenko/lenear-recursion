package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }

    public static long factorial(int n) {
        // n! = 1 * 2 * 3 * ... * n
        n = Math.abs(n);
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    public static long pow(int num, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }

        boolean isNegative = num < 0 && degree % 2 > 0;
        long res = powCalc(abs(num), degree);

        return isNegative ? -res : res;
    }

    private static long powCalc(int num, int degree) {
        return degree == 0 ? 1 : multiply(num, powCalc(num, degree - 1));
    }

    public static int square(int x) {
        x = x < 0 ? -x : x;

        return  x == 0 ? 0 : x + x - 1 + square(x - 1);
    }


    private static long multiply(int num, long times) {
        return times == 0 ? 0 : num + multiply(num, times - 1);
    }

    public static int sum(int[] arr) {
        return sum(arr, arr.length);
    }

    private static int sum(int[] arr, int length) {
        return length == 0 ? 0 : arr[length - 1] + sum(arr, length - 1);
    }

    private static int abs(int num) {
        return num < 0 ? -num : num;
    }

    public static boolean isSubstring(String str, String subStr) {
        return subStr.length() <= str.length() &&
            (startsWith(str, subStr) || isSubstring(str.substring(1), subStr));
    }

    private static boolean startsWith(String str, String subStr) {
        boolean res = str.charAt(0) == subStr.charAt(0);
        
        if (subStr.length() > 1 && res) {
            res = startsWith(str.substring(1), subStr.substring(1));
        }

        return res;
    }
}
