package day1.t2;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};
        printArray(array);
        bubbleSort(array);
        System.out.println();
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                System.out.print(array[i]);
            else
                System.out.print(" " + array[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
