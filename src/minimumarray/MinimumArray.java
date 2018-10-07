package minimumarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class MinimumArray {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("How many integers would you like to compare?");
        int input = scanner.nextInt();
        int[] myArray = readIntegers(input);
        System.out.println("Your roll was: " + Arrays.toString(myArray));
        System.out.println("Your minimum value is: " + minimumValue(myArray));
        
    }
    
    public static int[] readIntegers(int counter) {
        
        int [] array = new int[counter];
        for (int i = 0; i < counter; i++) {
            System.out.println("Please input integer #" + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    } 
    
    public static int minimumValue(int[] array) {

        int aux = array[0];
     
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] <= array[i+1]) {
                 if(aux > array[i]) aux = array[i];
            }  else if (aux > array[i + 1]) aux = array[i + 1];
        }
        return aux;
    }
}
