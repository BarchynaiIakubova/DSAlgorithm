package com.company;

public class SelectionSort {

    public void selectionSort(int[] unsArray) {

        for (int lastUnsortedIndex = unsArray.length - 1; lastUnsortedIndex > 0;
        lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (unsArray[i] > unsArray[largest]) {
                    largest = i;
                }
            }
          swap(unsArray, largest, lastUnsortedIndex);

        }
        for (int i = 0; i < unsArray.length; i++)
            System.out.println(unsArray[i]);

    }

    public void swap(int[] array, int i , int j) {

        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
