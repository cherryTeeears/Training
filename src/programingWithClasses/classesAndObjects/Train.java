package programingWithClasses.classesAndObjects;

public class Train {
    private String destinationName;
    private int trainsNumber;
    private String departureTime;

    Train(){

    }
    Train(String destinationName, int trainsNumber, String departureTime){
        setDestinationName(destinationName);
        setTrainsNumber(trainsNumber);
        setDepartureTime(departureTime);
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public void setTrainsNumber(int trainsNumber) {
        this.trainsNumber = trainsNumber;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void printInformation(){

        System.out.println("Train: " + getTrainsNumber() + "\nDestination: " + getDestinationName() +
                "\nDeparture time:" + getDepartureTime());
    }

    public int getTrainsNumber() {
        return trainsNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
