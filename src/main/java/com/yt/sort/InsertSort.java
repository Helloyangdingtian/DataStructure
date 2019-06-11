package com.yt.sort;

import org.junit.Test;

public class InsertSort {

    public int[] insertSort(int[] arr) {

        int j;

        for (int p = 1; p < arr.length; p++) {
            int temp = arr[p];
            for (j = p-1; j >= 0 && arr[j] >= temp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }

        return arr;
    }

    @Test
    public void test() {
        int[] s = {2, 4, 6, 5, 7, 1, 9, 8, 3};
        int[] list = insertSort(s);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
