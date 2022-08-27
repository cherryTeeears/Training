package programingWithClasses.classesAndObjects.airport;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Airport airport = new Airport();
        airport.createAirlineList();
        airport.printAirlineList();
        airport.findFlightByWeekdayAndDepartureTime("Monday", "10:00");
        airport.findFlightByWeekday("Friday");
        airport.findFlightByDestination("Minsk");
    }
}
