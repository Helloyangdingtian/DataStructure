package search;

import org.junit.Test;

public class BSearch {

    public int bSearch(int[] arr, int low, int high, int k) {
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            }
        }
        return 0;
    }

    @Test
    public void test() {
        int[] s = {2, 4, 6, 5, 7, 1, 9, 8, 3};
        int i = bSearch(s, 0, s.length, 6);
        System.out.println(i);
    }
}
