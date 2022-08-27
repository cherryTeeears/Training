package programingWithClasses.classesAndObjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 Task
//        Test1 test1 = new Test1();
//        test1.firstVariable = 3;
//        test1.secondVariable = 5;
//        test1.print();
//        test1.changeFirstVariable(2);
//        test1.changeSecondVariable(7);
//        test1.print();
//        System.out.println("Summa - "+test1.calculateSum());
//        System.out.println("Maximum variable - " + test1.findMaxVariable());

            //2 Task
//        Test2 test2 = new Test2();
//        System.out.println("The first variable - "+test2.getFirstVariable() + "\nThe second variable - "
//                +test2.getSecondVariable());
//        Test2 t2 = new Test2(3,3);
//        System.out.println("The first variable of the second object - "
//                +t2.getFirstVariable() + "\nThe second variable of the second object - "
//                + t2.getSecondVariable());

        //3 Task
        Scanner scanner = new Scanner(System.in);
//        Student bykov = new Student("Bykov A.S.", 10701119);
//        Student kluchnik = new Student("Kluchnik Z.S.", 10701119);

//        int[] bykovMarks = new int[10];
//        System.out.println("Enter bykov marks:");
//        for (int i = 0; i < bykovMarks.length; i++) {
//            bykovMarks[i] = scanner.nextInt();
//        }
//        int[] kluchnikMarks = new int[10];
//        System.out.println("Enter kluchnik marks:");
//
//        for (int i = 0; i < kluchnikMarks.length; i++) {
//            kluchnikMarks[i] = scanner.nextInt();
//        }
//
//        bykov.createMarksArray(bykovMarks);
//        kluchnik.createMarksArray(kluchnikMarks);
//
//
//        bykov.printSuccessfulStudents();
//        kluchnik.printSuccessfulStudents();


        //Task 4

//        boolean flag = true;
//        Train[] trains = new Train[5];
//        setTrainsArray(trains);
//        while(flag) {
//            System.out.println("!!!!Train schedule menu"
//                    + "\n1.Print all trains;" +
//                    "\n2.Sort by train number;" +
//                    "\n3.Sort by destination name and departure time;" +
//                    "\n4.Find train by number;" +
//                    "\n5.Exit;");
//
//            int menuNumber = scanner.nextInt();
//            switch (menuNumber) {
//                case 1 -> {
//                    printTrains(trains);
//                }
//                case 2 -> {
//                    sortByTrainsNumber(trains);
//                    System.out.println("\tSort by train number!!!");
//                    printTrains(trains);
//                }
//                case 3 -> {
//                    sortByDestinationAndDepartureTime(trains);
//                    System.out.println("\tSort by departure name and then by departure time!!!");
//                    printTrains(trains);
//                }
//                case 4 -> {
//                    System.out.println("Enter train's number, which info you can find: ");
//                    int selectNumber = scanner.nextInt();
//
//                    findTrainByNumber(selectNumber, trains);
//
//                }
//                case 5 -> {
//                    flag = false;
//                }
//                default -> {
//                    System.out.println("Enter number from 1 to 5");
//                }
//            }
//
//        }


        //Task 5

//        Counter firstNumber = new Counter();
//        firstNumber.printCurrentState();
//        firstNumber.addValue(5);
//        firstNumber.addOneMore();
//        firstNumber.takeAwayValue(7);
//        firstNumber.printCurrentState();
//        Counter secondNumber = new Counter(10);
//        secondNumber.takeAwayValue(3);
//        secondNumber.printCurrentState();

        //Task6
//        Time time = new Time();
//        time.setTime(30,20,2);
//        time.printTime();
//        time.changeTime(10,30,1);
//        time.printTime();
//        time.setSecond(64);
//        time.printTime();

        //Task7
//        Triangle triangle = new Triangle(5,7,8);
//        System.out.println("Square - " + triangle.calculateSquare());
//        System.out.println("Perimeter - " + triangle.calculatePerimeter());


        //Task8
//        Bank bank = new Bank();
//        bank.setCustomerList();
//        bank.printCustomerList();
//
//        System.out.println("Enter FROM - TO !!! Customers with credit card number FROM - TO:");
//        long from = scanner.nextLong();
//        long to = scanner.nextLong();
//
//        bank.findCustomersByCreditCardNumber(from,to);
//
//        System.out.println("Sort by name: ");
//        bank.sortCustomerByName();



    }

//Task with Customer



    //Task with Train
    private static void findTrainByNumber(int number, Train[] trains){
        boolean flag = false;
        for (Train train : trains) {
            if (train.getTrainsNumber() == number) {
                System.out.println("Train: " + train.getTrainsNumber() + "\nDestination: " + train.getDestinationName() +
                        "\nDeparture time:" + train.getDepartureTime());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("There is no train with number - " + number);
        }
    }

    private static void sortByDestinationAndDepartureTime(Train[] trains){
        Comparator<Train> byDestination = Comparator.comparing(Train::getDestinationName);
        Comparator<Train> byDepartureTime = Comparator.comparing(Train ::getDepartureTime);
        Arrays.sort(trains,byDestination.thenComparing(byDepartureTime));
    }
    private static void setTrainsArray(Train[] trains){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < trains.length;i++) {
            System.out.println("Enter destination name:");
            String destinationName = scanner.next();
            System.out.println("Enter train's number:");
            int trainNumber=scanner.nextInt();
            System.out.println("Enter departure time:");
            String departureTime = scanner.next();
            trains[i] = new Train(destinationName,trainNumber,departureTime);
        }

    }
    private static void printTrains(Train[] trains){
        for (Train train : trains) {
            System.out.println("Train: " + train.getTrainsNumber() + "\nDestination: " + train.getDestinationName() +
                    "\nDeparture time:" + train.getDepartureTime());
            System.out.println("\n");
        }

    }
    private  static void sortByTrainsNumber(Train[] trains){
        for (int i = trains.length-1;i>0;i--){
            for (int j = 0; j < i; j++) {
                if(trains[j].getTrainsNumber() > trains[j + 1].getTrainsNumber()){
                    Train tmp = trains[j];
                    trains[j]=trains[j+1];
                    trains[j+1]= tmp;

                }
            }
        }
    }
}
