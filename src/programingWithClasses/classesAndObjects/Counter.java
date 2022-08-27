package programingWithClasses.classesAndObjects;

import java.util.Random;

public class Counter {
    private int number;

    public Counter(int number) {
        this.number = number;
    }

    public Counter(){
        Random random = new Random();
        this.number= random.nextInt(100);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addValue(int value){
        number+=value;
    }
    public void takeAwayValue(int value){
        number-=value;
    }
    public void addOneMore(){
        number++;
    }

    public void takeOneAway(){
        number--;
    }
    public void printCurrentState(){
        System.out.println("Current state - " + number);
    }
}
