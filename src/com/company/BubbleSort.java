package com.company;

public class BubbleSort {

    public void bubbleSort(int[] unsArray) {
        for (int lastUnsortedIndex = unsArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (unsArray[i] > unsArray[i + 1]) {
                    if (i == i + 1) {
                        return;
                    }
                    int temp = unsArray[i];
                    unsArray[i] = unsArray[i + 1];
                    unsArray[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < unsArray.length; i++)
            System.out.println(unsArray[i]);
    }
}
