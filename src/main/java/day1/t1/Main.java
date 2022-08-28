package day1.t1;
/*
* Заполните двумерный массив случайным числами и выведите максимальное, минимальное и среднее значение.
* */
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[2][10];
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j <array[i].length;j++) {
                array[i][j] = (int)(1 + Math.random() * 100);
            }
        }
        int max = max(array),
            min = min(array),
            average = average(array);

        printMatrix(array);
        System.out.println("Max = " + max + ";");
        System.out.println("Min = " + min + ";");
        System.out.println("Average = " + average + ";");
    }

    public static void printMatrix(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0)
                    System.out.print(array[i][j]);
                else
                    System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
    public static int max(int[][] array) {
        int temp = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (temp < array[i][j])
                    temp = array[i][j];
            }
        }
        return temp;
    }

    public static int min(int[][] array) {
        int temp = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (temp > array[i][j])
                    temp = array[i][j];
            }
        }
        return temp;
    }

    public static int average(int[][] array) {
        int temp = 0,
            count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp +=array[i][j];
                count++;
            }
        }
        temp = temp / count;
        return temp;
    }

}
