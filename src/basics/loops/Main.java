package basics.loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        eighthTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive whole number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of the numbers [1.." + number + "] :" + sum);
    }

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the boundaries of the segment: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Enter step: ");
        int h = scanner.nextInt();


        double y;
        while (Math.abs(b - a) > 0) {
            if (a > 2) {
                y = a;
                System.out.println("x: " + a + " Result: " + y);
            } else {
                y = -a;
                System.out.println("x: " + a + " Result: " + y);
            }
            a += h;
        }

    }

    private static void thirdTask() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Result: " + sum);
    }

    private static void fourthTask() {
        BigInteger composition = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            composition =composition.multiply(BigInteger.valueOf((long)i*i));
        }
        System.out.println("Composition: " + composition);
    }

    private static void fifthTask(){
        double e = Math.pow(10,-2);
        double sum = 0;
        int n = 1;
        double member = (1/Math.pow(2,n))+(1/Math.pow(3,n));
        while(Math.abs(member)>=e){
            sum +=member;
            n++;
            member = (1/Math.pow(2,n))+(1/Math.pow(3,n));
        }
        System.out.println("Result: " + sum);
    }

    private static void sixthTask(){
        System.out.println("ASCII number\tSymbol");
        for(int i = 1; i <256;i++){
            char symbol = (char)i;
            System.out.println(i + "\t\t\t\t\t" + symbol);
        }
    }

    private static void seventhTask(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        while(Math.abs(m-n)>0){
            System.out.print(m + " ----- ");
            for(int i =2; i<m;i++){
                if(m%i==0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
            m++;
        }
    }

    private static void eighthTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int firstNumberLength = String.valueOf(Math.abs(firstNumber)).length();
        int secondNumberLength = String.valueOf(Math.abs(secondNumber)).length();

        //System.out.println(firstNumberLength + " " + secondNumberLength);
        for(int i = 0; i <firstNumberLength;i++){
            int firstNumberDigit = firstNumber%10;
            firstNumber /=10;
            int sn = secondNumber;
            for(int j = 0; j <secondNumberLength;j++){
                int secondNumberDigit = sn%10;
                sn /=10;
                if(firstNumberDigit==secondNumberDigit){
                    System.out.print(firstNumberDigit + " ");
                }
            }
        }
    }
}
