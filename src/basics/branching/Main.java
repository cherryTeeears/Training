package basics.branching;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fifthTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        int firstAngle = scanner.nextInt();
        int secondAngle = scanner.nextInt();

        if (firstAngle + secondAngle == 90) {
            System.out.println("The triangle is right angled");
        } else if (firstAngle + secondAngle < 180) {
            System.out.println("A triangle of such angles exists");
        } else {
            System.out.println("A triangle of such angles does not exists");
        }
    }

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int minimumValue = d;
        //TODO make with equals values
        if ((a < b && c < d && a < c) || (a < b && d < c && a < d) || a == b) {
            minimumValue = a;
        } else if ((a < b && c < d && c < a) || (b < a && c < d && c < b) || c == d) {
            minimumValue = c;
        } else if ((b < a && c < d && b < c) || (b < a && d < c && b < d) || c == b) {
            minimumValue = b;
        }
        System.out.println("Minimum value - " + minimumValue);
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Points A[" + x1 + ";" + y1 + "],B[" + x2 + ";" + y2 + "],C["
                    + x3 + ";" + y3 + "] are on the same line");
        } else {
            System.out.println("Points A[" + x1 + ";" + y1 + "],B[" + x2 + ";" + y2 + "],C["
                    + x3 + ";" + y3 + "] are not on the same line");
        }
    }

    private static void fourthTask() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if ((a > x && b > y) || (a > x && b > z) || (a >y && b>x) ||
                (a>y && b>z) || (a>z && b>x) || (a>z && b>y)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }

    private static void fifthTask(){
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double result;
        if(x<=3){
            result = Math.pow(x,2) - 3*x +9;
        } else{
            result = 1/(Math.pow(x,3)+6);
        }
        System.out.println("Result: " + result);

    }

}
