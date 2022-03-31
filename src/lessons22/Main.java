package lessons22;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] matrixA;
        matrixA = new int[2][3];
        matrixA[0][0] = 1;
        matrixA[0][1] = 7;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = 8;
        matrixA[1][2] = 9;
        System.out.println("matrixA:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("matrixB:");
        int[][] matrixB = {{1, 2, 3},
                {-1, -2, -3},
                {0, 8, 6}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        int [][] matrixC = new int[5][];
        matrixC[0] = new int[1];
        matrixC[1] = new int[2];
        matrixC[2] = new int[3];
        matrixC[3] = new int[4];
        matrixC[4] = new int[5];
        System.out.println("matrixC:");
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

        char [][] matrixF = new char[7][];
        matrixF[0] = new char[1];
        matrixF[1] = new char[2];
        matrixF[2] = new char[3];
        matrixF[3] = new char[4];
        matrixF[4] = new char[5];
        matrixF[5] = new char[6];
        matrixF[6] = new char[7];
        System.out.println("matrixF:");
        for (int i = 0; i < matrixF.length; i++) {
            for (int j = 0; j < matrixF[i].length; j++) {
                matrixF[i][j]=((i+j)%2==0)?'+':'-';
                System.out.print(matrixF[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
