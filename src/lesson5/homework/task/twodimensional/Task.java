package lesson5.homework.task.twodimensional;

import java.util.Scanner;

public class Task {
    /*
     Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
     случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
     матрицы).
     */
    public static void main(String[] args) {
        System.out.println("Input size of 2 dimensional array");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] array = new int[a][a];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51);
            }
        }

        for (int[] arr1 : array) {
            for (int i : arr1) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }

        //1) Почитать сумму четных элементов стоящих на главной диагонали.
        System.out.println("\n1) Count the number of even elements on the main diagonal.");
        int dia = 0;
        int sum = 0;
        while (dia != array.length) {
            if (array[dia][dia] % 2 == 0) {
                sum += array[dia][dia];
            }
            dia++;
        }
        System.out.println("Sum of all odds in the main diag = " + sum);


        //2) Вывести нечетные элементы находящиеся под главной диагональю(включительно).
        System.out.println("\n2) Output odd elements under the main diagonal (inclusive)");
        dia = 0;
        System.out.println("odd elements under the main diagonal (inclusive) :");
        for (int i = 0; i < array.length; i++, dia++) {
            for (int j = 0; j < array.length && j <= dia; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.printf(array[i][j] + " ");
                }
            }
        }

        //3)Проверить произведение элементов какой диагонали больше.
        System.out.println("\n\n3)Check the product of elements of which diagonal is greater.");
        int mainDiagComp = 1;
        dia = 0;
        while (dia != array.length) {
            mainDiagComp *= array[dia][dia];
            dia++;
        }
        System.out.println("Product of the main diagonal of a matrix = " + mainDiagComp);

        int rightDiaComp = 1;
        dia = array.length - 1;
        int subIndex = 0;
        while (dia >= 0) {
            rightDiaComp *= array[dia][subIndex];
            dia--;
            subIndex++;
        }
        System.out.println("The product of the secondary diagonal of a matrix= " + rightDiaComp);

        if (mainDiagComp == rightDiaComp) {
            System.out.println("The product of both diagonals are equal");
        } else {
            System.out.println(String.format("The product %s diagonals greater", mainDiagComp > rightDiaComp ? "main" : "secondary"));
        }

        //4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
        System.out.println("\n4)Calculate the sum of even elements above the secondary diagonal (not inclusive)");
        dia = 0;
        int sumOfEven = 0;
        for (int i = 0; i < array.length; i++, dia++) {
            for (int j = array.length - 1; j > dia; j--) {
                if (array[i][j] % 2 == 0) {
                    System.out.printf(array[i][j] + " ");
                    sumOfEven += array[i][j];
                }
            }
        }
        System.out.println("sum of even elements above the secondary diagonal (not included) = " + sumOfEven);

        //5) Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
        System.out.println("\n5) Transpose the matrix (1st column becomes 1st row, 2nd column becomes 2nd row, etc.)");
        int[][] newMatrix = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                newMatrix[i][j] = array[j][i];
                newMatrix[j][i] = array[i][j];
            }
        }

        for (int[] arr1 : newMatrix) {
            for (int i : arr1) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }
    }
}