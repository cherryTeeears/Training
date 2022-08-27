package basics.linear;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        fifthTask();
    }

    private static void firstTask(){
        System.out.println("\t\t\tThe first Task" +
                "\nEnter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double z = ((a-3)*b/2)+c;
        System.out.println("Result: " + z);
    }

    private static void secondTask(){
        System.out.println("\t\t\tThe second Task" +
                "\nEnter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double z = ((b + Math.sqrt(Math.pow(b,2) + 4*a*c))/2*a) - Math.pow(a,3)*c+ Math.pow(b,-2);
        System.out.println("Result: " + z);
    }

    private static void thirdTask(){
        System.out.println("\t\t\tThird Task" +
                "\nEnter x, y: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)))*Math.tan(x*y);
        System.out.println("Result: " + z);
    }

    private static void fourthTask(){
        System.out.println("\t\t\tFourth Task" +
                "\nEnter number like nnn.ddd: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int wholePart = (int)number;
        double fraction = (number - wholePart)*1000;
        System.out.println("Result: " + (int)fraction + "." + wholePart);
    }
    private static void fifthTask(){
        int SECONDS_IN_MINUTE = 60;
        int SECONDS_IN_HOUR = 3600;
        System.out.println("Enter time in seconds:");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hour = seconds / SECONDS_IN_HOUR;
        if(hour >= 24){
            seconds = seconds - hour*SECONDS_IN_HOUR;
        }
        hour = seconds / SECONDS_IN_HOUR;
        int minute = (seconds - hour*SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        seconds = seconds - hour*SECONDS_IN_HOUR - minute*SECONDS_IN_MINUTE;
        System.out.println(String.format("%02dч:%02dмин:%02dс", hour, minute,seconds));
    }

    private static void sixthTask(){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        //TODO last condition
        boolean condition = (y>=0 && y <= 4 && x>=-2 && x <= 2) ||
                            (y<=0 && y >= -3 && x >=-4 && x <= 4);

        System.out.println("Result = " + condition);
    }



}
