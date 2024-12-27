import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n, m;
    int[] a, b;

    private void sol() throws IOException {
        n = Integer.parseInt(br.readLine());
        a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        m = Integer.parseInt(br.readLine());
        b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            if (binarySearch(b[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private boolean binarySearch(int target) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (a[mid] == target) {
                return true;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        new Main().sol();
    }
}
