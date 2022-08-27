package programingWithClasses.classesAndObjects.airport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Airport {
    private Airline[] airlines = new Airline[10];

    public Airport() {
    }

    public Airport(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void findFlightByDestination(String destination){
        boolean flag = true;
        System.out.println("\nSelect flight by destination " + destination);
        for (Airline airline: airlines) {
            if(airline.getDestination().equals(destination)){
                flag = false;
                System.out.println(airline.toString());
            }
        }

        if(flag){
            System.out.println("We haven't flights to " +destination);
        }
    }

    public  void findFlightByWeekday(String weekday){
        boolean flag = true;
        System.out.println("\nSelect flight by weekday " + weekday);
        for (Airline airline: airlines) {
            if(airline.getWeekDay().equals(weekday)){
                flag = false;
                System.out.println(airline.toString());
            }
        }

        if(flag){
            System.out.println("We haven't flights on " +weekday);
        }
    }

    public  void findFlightByWeekdayAndDepartureTime(String weekday, String depTime) throws ParseException {
        boolean flag = true;
        System.out.println("\nSelect flight by weekday " + weekday + " after "+ depTime);
        SimpleDateFormat sdf = new SimpleDateFormat("h:m");

        for (Airline airline: airlines) {
            if(airline.getWeekDay().equals(weekday) && sdf.parse(depTime)
                    .before(sdf.parse(airline.getDepartureTime()))){
                flag = false;
                System.out.println(airline.toString());
            }
        }

        if(flag){
            System.out.println("We haven't flights on " +weekday + " after " + depTime);
        }
    }
    public void createAirlineList(){
        Scanner scanner = new Scanner(System.in);
        String[] destinations = new String[]{"Milan", "Rome", "Paris", "Minsk", "Vilnus", "Warshaw"};
        String[] aircraftTypes = new String[]{"Airbus","Boeing","Embraer"};
        String[] departureTimes = new String[]{"12:00","20:22","11:10", "17:45", "19:00", "21:20",
        "13:10","07:00","03:40","06:30"};
        String[] weekdays = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Random random= new Random();

        for (int i = 0; i < airlines.length; i++) {
            Airline airline;
            String dest = destinations[random.nextInt(6)];
            int flightNumber = random.nextInt(800) + 200;
            String aircrType = aircraftTypes[random.nextInt(3)];
            String departureTime = departureTimes[random.nextInt(10)];
            String weekday = weekdays[random.nextInt(7)];

            airline = new Airline(dest, flightNumber, aircrType, departureTime, weekday);
            airlines[i]=airline;
        }

    }

    public void printAirlineList(){
        for (Airline airline: airlines) {
            System.out.println(airline.toString());
        }
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }
}
