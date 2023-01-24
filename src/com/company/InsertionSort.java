package com.company;

public class InsertionSort {

    public void insertionSort(int[] array) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
        firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > array[i]; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }
}
