package com.yt.sort;

import org.junit.Test;

public class BubbleSort {

    public int[] bubbleSort(int[] arr) {

        int flag;
        int temp;
        int length = arr.length;
        for (int i=0; i < length; i++) {
            flag = 0;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return arr;
            }
        }
        return null;
    }

    @Test
    public void test() {
        int[] s = {2, 4, 6, 5, 7, 1, 9, 8, 3};
        int[] sort = bubbleSort(s);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
