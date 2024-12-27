import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n, res, target, val;
    int s, e;
    int[] nums;

    private void sol() throws IOException {
        n = Integer.parseInt(br.readLine());
        nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        target = Integer.parseInt(br.readLine());
        res = 0;

        s = 0;
        e = n - 1;
        while (s < e) {
            val = nums[s] + nums[e];
            if (val == target) {
                res++;
                e--;
            } else if (val < target) {
                s++;
            } else {
                e--;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        new Main().sol();
    }
}
