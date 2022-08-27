package programingWithClasses.classesAndObjects;

public class Test2 {
    private int firstVariable;
    private int secondVariable;

    public Test2(int firstVariable, int secondVariable){
       setFirstVariable(firstVariable);
       setSecondVariable(secondVariable);
    }
    public Test2(){
        setFirstVariable(10);
        setSecondVariable(7);
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }
}
