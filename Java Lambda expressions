
import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return new PerformOperation() {
            public boolean check(int n) {
                return n % 2 != 0;
            }
        };
    }

    public static PerformOperation isPrime() {
        return new PerformOperation() {
            public boolean check(int n) {
                if (n < 2) return false;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome() {
        return new PerformOperation() {
            public boolean check(int n) {
                String s = Integer.toString(n);
                return s.equals(new StringBuilder(s).reverse().toString());
            }
        };
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;

        while (T-- > 0) {
            String line = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(line);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            String ans;

            if (ch == 1) {
                op = MyMath.isOdd();
                ans = MyMath.checker(op, num) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = MyMath.isPrime();
                ans = MyMath.checker(op, num) ? "PRIME" : "COMPOSITE";
            } else {
                op = MyMath.isPalindrome();
                ans = MyMath.checker(op, num) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
