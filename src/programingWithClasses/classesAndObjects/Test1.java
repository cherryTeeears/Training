package programingWithClasses.classesAndObjects;

public class Test1 {
    public int firstVariable;
    public int secondVariable;


    public void print(){
        System.out.println("The first variable - " + firstVariable + "\nThe second variable - " + secondVariable);
    }

    public int changeFirstVariable(int a){
        firstVariable = a;
        return firstVariable;
    }

    public int changeSecondVariable(int b){
        secondVariable = b;
        return secondVariable;
    }

    public int calculateSum(){
        return firstVariable+secondVariable;
    }

    public int findMaxVariable(){
        if(firstVariable>secondVariable){
            return firstVariable;
        } else if(secondVariable>firstVariable){
            return secondVariable;
        } else
            return 0;
    }
}
