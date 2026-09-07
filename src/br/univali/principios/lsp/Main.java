package br.univali.principios.lsp;
import java.util.Random;

public class Main {

    public static int[] makeArray(int size){
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(100);
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    static void main() {

        Sort quickSort = new QuickSort();
        Sort mergeSort = new MergeSort();
        Sort shellSort = new ShellSort();

        int[] arrA = makeArray(10);
        printArray(arrA);
        quickSort.sort(arrA);
        printArray(arrA);

        int[] arrB = makeArray(10);
        printArray(arrB);
        mergeSort.sort(arrB);
        printArray(arrB);

        int[] arrC = makeArray(10);
        printArray(arrC);
        shellSort.sort(arrC);
        printArray(arrC);

    }
}
