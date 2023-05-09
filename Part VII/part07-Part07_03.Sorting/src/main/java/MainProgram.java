
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int aux = array[0];
        int smallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < aux) {
                aux = array[i];
            }
        }
        smallest = aux;
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int aux = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < aux) {
                aux = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int aux = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < aux) {
                aux = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int aux = 0;

        aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            if (smallestIndex != i) {
                swap(array, i, smallestIndex);
            }
            System.out.println(Arrays.toString(array));
        }
    }

}
