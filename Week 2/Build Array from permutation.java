import java.util.*;

public class Solution {

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = buildArray(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
