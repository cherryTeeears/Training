package algorithmization.firstPart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        squeezeArray();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int element = 5;
        int sum = 0;
        int[] array = new int[SIZE];
        System.out.println("Enter elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int item : array) {
            if (item % element == 0) {
                sum += item;
            }
        }

        System.out.println("Result: " + sum);

    }

    private static void secondTask() {
        double[] array = new double[]{1, 2, 3, 4, 5, 6};
        double number = 3.5;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = number;
            }
        }

        System.out.println("New array: ");
        for (double item : array) {
            System.out.print(item + " ");
        }
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        double[] array = new double[SIZE];
        System.out.println("Enter elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        int countNegativeElements = 0;
        int countPositiveElements = 0;
        int countZeroElements = 0;
        for (double item : array) {
            if (item < 0) {
                countNegativeElements++;
            } else if (item > 0) {
                countPositiveElements++;
            } else {
                countZeroElements++;
            }
        }
        System.out.println("Count negative elements: " + countNegativeElements +
                "\nCount positive elements: " + countPositiveElements +
                "\nCount zero elements: " + countZeroElements);
    }

    private static void fourthTask() {
        double[] array = new double[]{-3, 2, 4, -10, 5, 6, 28, -3, 0};
        double minElement = array[0];
        double maxElement = array[0];

        int minElementIndex = 0;
        int maxElementIndex = 0;

        System.out.println("Old array: ");
        for (double item : array) {
            System.out.print(item + " ");
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= minElement) {
                minElement = array[i];
                minElementIndex = i;
            }
            if (array[i] >= maxElement) {
                maxElement = array[i];
                maxElementIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == minElementIndex) {
                array[i] = maxElement;
            } else if (i == maxElementIndex) {
                array[i] = minElement;
            }
        }

        System.out.println("\nNew array: ");
        for (double item : array) {
            System.out.print(item + " ");
        }
    }

    private static void fifthTask() {
        int[] array = new int[]{1, 1, 2, 3, 6, 2, 51, 6, 7, 4, 1};
        System.out.println("Array: ");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\nNumber more than index: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }

    private static void sixthTask() {
        final int SIZE = 7;
        double[] array = new double[SIZE];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < SIZE; i++) {
            array[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }
        System.out.println("Result: " + sum);
    }

    public static boolean isPrime(int x) {
        if (x < 2) return true;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    private static void seventhTask() {
        double[] array = new double[]{1, 2, 3, 4, 12, 8, 2, 5, 6, 3, 7};
        double max = array[0] + array[1];
        double sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum = array[i] + array[i + 1];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("Maximum sum: " + max);
    }

    private static void eighthTask() {
        int[] array = {1, 3, 5, -1, 4, 0, -7, 4, 5, -7};

        System.out.println("First array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }


        int count = 0;
        int min = array[0];

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        for (int element : array) {
            if (element == min) {
                count++;
            }
        }

        int[] resultArray = new int[array.length - 1];

        int j = 0;
        for (int element : array) {
            if (element != min) {
                resultArray[j++] = element;
            }
        }
        System.out.println("\nNew array: ");
        for (int element : resultArray) {
            System.out.print(element + " ");
        }

    }

    private static void findMaxCountSameNumbers() {

        int[] array = new int[] {4,4,3,2,1,2,3,2,4,5,6,7,8};


        System.out.println("Array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        int[] countArray = new int[array.length];
        int globCounter = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            int number = array[i];
            for (int element : array) {
                if (element == number) {
                    counter++;
                }
            }

            countArray[i] = counter;
            if (counter > globCounter) {
                globCounter = counter;
            }
        }

        int result = Integer.MAX_VALUE;

        for(int i = 0; i< countArray.length;i++){
            if(array[i] < result && countArray[i] == globCounter){
                result =array[i];
            }
        }

        System.out.println("\nResult: " + result);


    }

    private static void squeezeArray(){
        int[] array = {1,3,4,2,4,5,6,2,3,4,1,5};
        System.out.println("Array: ");
        for (int element:array) {
            System.out.print(element + " ");
        }

        for(int i = 0;i< array.length;i++){
            if(i%2==1){
                array[i] = 0;
            }
        }

        System.out.println("\nResult array: ");
        for (int element:array) {
            System.out.print(element + " ");
        }
    }

}
