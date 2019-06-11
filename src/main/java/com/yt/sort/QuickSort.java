package com.yt.sort;

import org.junit.Test;

public class QuickSort {

    public int[] quickSort(int[] arr, int low, int high) {
        int temp;
        int i = low, j = high;

        if (low < high) {

            temp = arr[low];
            while (i < j) {
                while (j>i && arr[j]>temp) --j;
                if (i < j) {
                    arr[i] = arr[j];
                    ++i;
                }
                while(i<j && arr[i]<temp) ++i;
                if (i < j) {
                    arr[j] = arr[i];
                    --j;
                }
                arr[i] = temp;
                quickSort(arr, low, i);
                quickSort(arr, i + 1, high);

            }
        }
        return arr;
    }

    @Test
    public void test() {
        int[] s = {1, 2, 4, 3, 5, 9, 8, 7, 6};
        int[] s1 = quickSort(s, 0, s.length - 1);

        for (int i : s1) {
            System.out.println(i);
        }

    }
}
