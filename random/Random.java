package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Random {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input_1 = in.nextInt();
        int input_2 = in.nextInt();

        randomGen(input_1, input_2);

    }

    public static void randomGen(int totalNum, int range) {
        if (totalNum > range) return;
        
        int[] list = new int[totalNum];
        for (int i = 0; i < totalNum; i++) {
            list[i] = (int) (Math.random() * range);
            for (int j = 0; j < i + 1; j++) {
                if (list[i] == list[j] && i != j) {
                    i--;
                    break;
                }

            }
        }
        for (int k = 0; k < totalNum; k++) {
            System.out.println(list[k]);
        }
    }
}
