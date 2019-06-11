package com.yt.sort;

import org.junit.Test;

/*
public class HeapSort {

    public void sift(int[] arr, int low, int high) {
        int i = low,j = 2*i;
        int temp = arr[i];

        while (j <= high) {

            if (j < high && arr[j] < arr[j + 1]) {
                ++j;
            }
            if (temp < arr[j]) {
                arr[i] = arr[j];
                i = j;
                j = 2*i + 1;
            }
            else
                break;
            arr[i] = temp;
        }
    }

    public int[] heapSort(int arr[], int n) {
        int i;
        int temp;

        for (i = n / 2; i >= 1; --i) {
            sift(arr, i, n);
        }
        for (i = n; i >= 2; --i) {
            temp = arr[1];
            arr[1] = arr[i];
            arr[i] = temp;
            sift(arr, 1, i - 1);
        }

        return arr;
    }


    @Test
    public void test() {
        int[] s = {2, 4, 6, 5, 7, 1, 9, 8, 3};
        int[] list = heapSort(s, 9);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
*/

