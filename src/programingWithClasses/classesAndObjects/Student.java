package programingWithClasses.classesAndObjects;

public class Student {
    private String female;
    private int groupsNumber;
    public int[] marks = new int[10];

    public Student(){

    }
    public Student(String female, int groupsNumber){
        setFemale(female);
        setGroupsNumber(groupsNumber);
    }


    public void createMarksArray(int[] inputMarks){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = inputMarks[i];
            System.out.print(marks[i] + " ");
        }
        System.out.println("\n");
    }

    public void printSuccessfulStudents(){
        int countSuccessMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == 9 || marks[i]==10){
                countSuccessMarks++;
            }
        }

        if(countSuccessMarks==10){
            System.out.println(getFemale() + "\t" + getGroupsNumber());
        }
    }
    public void setFemale(String female) {
        this.female = female;
    }

    public void setGroupsNumber(int groupsNumber) {
        this.groupsNumber = groupsNumber;
    }

    public String getFemale() {
        return female;
    }

    public int getGroupsNumber() {
        return groupsNumber;
    }
}
