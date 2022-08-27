package algorithmization.twoDemensionalArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findMaxElement();
    }

    private static void firstTask() {
        int[][] array = {{1, 2, 3, 4},
                {9, 2, 1, 4},
                {3, 2, 3, 4},
                {3, 5, 1, 1}};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 1) {
                continue;
            }
            int firstElement = array[i][0];
            int lastElement = array[i][array.length - 1];

            if (firstElement > lastElement) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void printArray(double[][] array) {
        for (double[] item : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(item[j] + " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] array) {
        for (int[] item : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(item[j] + " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] array, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void displayDiagonalElements() {
        int[][] array = {
                {1, 2, 3, 4},
                {9, 2, 1, 4},
                {3, 2, 3, 4},
                {3, 5, 1, 1}
        };
        System.out.println("Diagonal's elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    private static void displayAnyRowAndColumn() {
        int[][] array = {
                {1, 2, 3, 4},
                {9, 2, 1, 4},
                {3, 2, 3, 4},
                {3, 5, 1, 1}
        };

        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k-row: ");
        int row = scanner.nextInt() - 1;

        int[] rowArray = new int[array.length];

        System.out.println("Enter p-column: ");
        int column = scanner.nextInt() - 1;
        int[] columnArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (i == row) {
                    rowArray[j] = array[i][j];
                }
                if (j == column) {
                    columnArray[i] = array[i][j];
                }
            }
        }

        System.out.println("k-row: ");
        for (int element : rowArray) {
            System.out.print(element + " ");
        }
        System.out.println("\np-column: ");
        for (int element : columnArray) {
            System.out.print(element + " ");
        }
    }

    private static void makeTwoDemensionalArray() {
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            int number = SIZE;
            if (i % 2 == 0) {
                for (int j = 0; j < SIZE; j++) {
                    array[i][j] = j + 1;
                }

            } else {
                for (int j = 0; j < SIZE; j++) {
                    array[i][j] = number;
                    number--;
                }
            }
        }

        printArray(array);
    }

    private static void makeTwoDemensionalArraySecondTask() {
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i; j++) {
                array[i][j] = i + 1;
            }

        }

        printArray(array);
    }

    private static void makeTwoDemensionalArrayThirdTask() {
        //TODO remake method
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i; j++) {
                array[i][j] = 1;
            }
        }

        printArray(array);
    }

    private static void makeTwoDemensionalArrayFourthTask() {
        final int SIZE = 6;
        int countPositiveNumber = 0;
        double result;
        double[][] array = new double[SIZE][SIZE];
        double scale = Math.pow(10, 2);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result = Math.ceil(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / SIZE) * scale) / scale;
                array[i][j] = result;
                if (result > 0) {
                    countPositiveNumber++;
                }
            }
        }

        printArray(array);

        System.out.println("Count positive number: " + countPositiveNumber);
    }

    private static void replaceTwoColumns() {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {
                {1, 2, 3, 4},
                {9, 2, 1, 4},
                {3, 2, 3, 4},
                {3, 5, 1, 1}};

        System.out.println("Enter number of the first column: ");
        int firstColumnNumber = scanner.nextInt();

        System.out.println("Enter number of the second column: ");
        int secondColumnNumber = scanner.nextInt();

        int[][] refactorArray = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == firstColumnNumber) {
                    refactorArray[i][secondColumnNumber] = array[i][j];
                } else if (j == secondColumnNumber) {
                    refactorArray[i][firstColumnNumber] = array[i][j];
                } else {
                    refactorArray[i][j] = array[i][j];
                }
            }
        }
        System.out.println("New array: ");
        printArray(refactorArray);
    }

    private static void calculateSumInEveryColumns() {
        final int SIZE = 6;
        double[][] positiveNumberArray = new double[SIZE][SIZE];
        double scale = Math.pow(10, 2);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                positiveNumberArray[i][j] = Math.ceil(Math.random() * 100 * scale) / scale;
            }
        }

        printArray(positiveNumberArray);

        double sum = 0;
        double[] sums = new double[SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sum += positiveNumberArray[j][i];
            }

            sums[i] = Math.ceil(sum * scale) / scale;
            ;
        }

        double maxSum = sums[0];

        int indexMaxSum = 0;
        for (int i = 0; i < sums.length; i++) {
            if (maxSum < sums[i]) {
                maxSum = sums[i];
                indexMaxSum = i;
            }
        }
        indexMaxSum++;
        System.out.println("Sums:");
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i] + " ");
        }

        System.out.println("\nIndex with max sum in column: " + indexMaxSum);

    }

    private static void findPositiveElementOnDiagonal() {
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (int) (Math.random() * 200 - 100);
            }
        }

        printArray(array);
        System.out.println("Positive elements on the main diagonal: ");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }


    }

    private static void printRowsNumberWithNumberFiveXThree() {
        final int ROWS_COUNT = 10;
        final int COLUMNS_COUNT = 20;
        int[][] array = new int[ROWS_COUNT][COLUMNS_COUNT];

        for (int i = 0; i < ROWS_COUNT; i++) {
            for (int j = 0; j < COLUMNS_COUNT; j++) {
                array[i][j] = (int) (Math.random() * 15);
            }
        }

        printArray(array, ROWS_COUNT, COLUMNS_COUNT);

        System.out.println("Number of rows with number 5 three and more time: ");
        for (int i = 0; i < ROWS_COUNT; i++) {
            int countNumberFive = 0;
            for (int j = 0; j < COLUMNS_COUNT; j++) {
                if (array[i][j] == 5) {
                    countNumberFive++;
                }
            }
            if (countNumberFive >= 3) {
                System.out.print((i + 1) + " ");
            }
        }

    }

    private static void sortRows() {
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        printArray(array);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int k = j + 1; k < SIZE; k++) {
                    if (array[i][j] > array[i][k]) {
                        int tmp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = tmp;
                    }
                }

            }
        }
        System.out.println("Sorted array: ");
        printArray(array);
    }

    private static void sortColumns() {
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        printArray(array);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int k = i + 1; k < SIZE; k++) {
                    if (array[i][j] > array[k][j]) {
                        int tmp = array[i][j];
                        array[i][j] = array[k][j];
                        array[k][j] = tmp;
                    }
                }

            }
        }
        System.out.println("Sorted array: ");
        printArray(array);
    }

    private static void createMatrixWithOneZero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row's count: ");
        int rows = scanner.nextInt();

        System.out.println("Enter column's count: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < columns; i++) {
            int counter = i + 1;
            for (int j = 0; j < rows; j++) {
                if (j <= i) {
                    matrix[j][i] = 1;
                } else {
                    matrix[j][i] = 0;
                }
            }
        }
        System.out.println("Matrix: ");
        printArray(matrix, rows, columns);
    }

    private static void findMaxElement() {
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (int) (Math.random() * 200 - 100);
            }
        }

        printArray(array);
        int maxElement = array[0][0];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = maxElement;
                }
            }
        }
        System.out.println("New matrix: ");
        printArray(array);
    }

    private static void magicSquare(){
        //TODO magic square???
        final int SIZE = 3;
        
        int[][] matrix = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
            matrix[i][j] = (int) (1+Math.random()*Math.pow(SIZE,2));
            }
        }
        printArray(matrix);
    }

}
