package com.company;

public class Main {

    public static void main(String[] args) {

        int[] unsArray = {5, -6, 98, 55, 0, 89};

        ShellSort shellSort = new ShellSort();
        shellSort.shelSort(unsArray);
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.insertionSort(unsArray);

//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(unsArray);
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.selectionSort(unsArray);


    }


//    public static void swap(int[] array, int i, int j) {
//        if (i == j) {
//            return;
//        }
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
}
