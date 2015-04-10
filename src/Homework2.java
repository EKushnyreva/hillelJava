/**
 * Created by Lena on 10.04.2015.
 */
public class Homework2 {
    public static void main(String args[]) {
        int[] array = new int[5];
        System.out.println("UNSORTED:");

        generator(array);
        printArray(array);
        sorting (array);


        System.out.println("SORTED:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "  ");
        }
    }

    public static void generator(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }
    public static void sorting (int[] array){
        for (int q = 1; q < array.length; q++) {
            for (int w = array.length - 1; w >= q; w--) {
                if (array[w - 1] > array[w]) {
                    int number = array[w - 1];
                    array[w - 1] = array[w];
                    array[w] = number;
                }
            }
        }
    }

}

