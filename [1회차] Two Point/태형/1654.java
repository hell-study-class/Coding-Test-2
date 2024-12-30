import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int k, n;
    int[] lines;
    long left, right;
    long currentCount;
    long res = 0;

    private void sol() throws IOException {
        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        lines = new int[k];

        for (int i = 0; i < k; i++) {
            lines[i] = Integer.parseInt(br.readLine());
        }
        left = 1;
        right = Long.MAX_VALUE;

        while (left < right) {
            long mid = (right - left) / 2 + left;
            currentCount = 0;
            for (int line : lines) {
                currentCount += getCount(line, mid);
            }

            if (currentCount < n) {
                right = mid;
            } else {
                res = Math.max(res, mid);
                left = mid + 1;
            }
        }

        System.out.println(res);
    }

    private long getCount(long length, long currentLength) {
        return length / currentLength;
    }

    public static void main(String[] args) throws IOException {
        new Main().sol();
    }
}
