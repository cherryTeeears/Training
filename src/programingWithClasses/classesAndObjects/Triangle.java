package programingWithClasses.classesAndObjects;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;


    public Triangle(int firstSide, int secondSide, int thirdSide) {
        if((firstSide+secondSide>thirdSide) &&
                (secondSide+thirdSide>firstSide) &&
                (firstSide+thirdSide>secondSide)) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        } else{
            System.out.println("Incorrect side's sizes!!!");
        }
    }

    public Triangle(){

    }

    public int calculatePerimeter(){
        //int perimeter = this.firstSide+this.secondSide+this.thirdSide;
        //System.out.println("Perimeter - " + perimeter);
        return this.firstSide+this.secondSide+this.thirdSide;
    }

    public double calculateSquare(){
        int semiPerimeter = calculatePerimeter()/2;
        double square = Math.pow(semiPerimeter*(semiPerimeter-this.firstSide)*
                (semiPerimeter-this.secondSide)*(semiPerimeter-this.thirdSide), 0.5);
        return square;
    }

    public void findMedianPoint(){
        //TODO I don't know((
    }


    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }


}
