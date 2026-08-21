import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int t = Integer.parseInt(br.readLine().trim());

        HashSet<String> set = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String a = st.nextToken();
            String b = st.nextToken();

            String pair = a + "#" + b;

            set.add(pair);

            output.append(set.size()).append('\n');
        }

        System.out.print(output);

        br.close();
    }
}
