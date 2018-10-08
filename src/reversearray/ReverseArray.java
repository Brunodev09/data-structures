package reversearray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ReverseArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array you wish to reverse: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int j = 0; j < array.length; j++) {
            System.out.println("Please enter the value for slot #" + (j + 1) + ": ");
            array[j] = scanner.nextInt();
        }

//        reverse(array);
        reverse_faster(array);
        System.out.println(Arrays.toString(array));

    }

    private static void reverse(int[] array) {
        int[] aux2 = new int[array.length];

        for (int k = 0; k < array.length; k++) {
            aux2[k] = array[(array.length - 1) - k];
        }
        System.arraycopy(aux2, 0, array, 0, array.length);
    }

    private static void reverse_faster(int[] array) {
        int aux = array[0];
        for (int i = 0; i < (array.length / 2); i++) {
            aux = array[(array.length-1)-i];
            array[(array.length-1)-i] = array[i];
            array[i] = aux;
        }
    }

}
