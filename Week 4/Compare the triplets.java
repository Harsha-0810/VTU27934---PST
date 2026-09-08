import java.util.*;

public class Main {

    public static int[] compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        return new int[]{alice, bob};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }

        int[] result = compareTriplets(a, b);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}
