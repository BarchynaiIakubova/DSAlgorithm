package com.company;

public class ShellSort {
    public void shelSort(int[] array) {
        for (int gap = array.length/2; gap > 0; gap /= 2) {
                for (int i = gap; i < array.length; i++) {
                    int newElement = array[i];
                    int j = i;
                    while (j >= gap && array[j - gap] > newElement) {
                        array[j] = array[j - gap];
                        j -= gap;
                    }
                    array[j] = newElement;
                }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
