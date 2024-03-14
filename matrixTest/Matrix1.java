package matrixTest;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] mtx = new int[10][10];
        int k = 0;
        for (int i = 0; i < mtx.length; i++){
            for (int j = 0; j< mtx[i].length; j++){
                mtx[i][j] = k;
                k++;

            }

        }
        for (int i = 0; i < mtx.length; i++){
            for (int j = 0; j < mtx[i].length; j++){

                System.out.println(i + " * " + j + " = " + (i * j));
            }

        }


    }
}
