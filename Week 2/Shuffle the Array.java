import java.util.*;

public class Solution {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = shuffle(nums, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);

            if (i < ans.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
