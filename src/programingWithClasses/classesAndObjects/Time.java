package programingWithClasses.classesAndObjects;

public class Time {
    private int second;
    private int minute;
    private int hour;


    public Time(){

    }
    public void setTime(int second, int minute, int hour){
        if(second >0&& second<=60 &&
        minute>0 && minute<=60
        && hour>0&&hour<24) {
            this.second = second;
            this.minute = minute;
            this.hour = hour;
        } else{
            System.out.println("Wrong data!!! We set 00:00:00");
            this.second=0;
            this.minute=0;
            this.hour=0;
        }
    }

    public void printTime(){
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }
    public void changeTime(int second, int minute, int hour){
        int result = (this.second + this.minute*60 + this.hour*3600) - (second + minute*60+hour*3600);
        this.hour = result/3600;
        this.minute = (result - this.hour*3600)/60;
        this.second = result - this.hour*3600 - this.minute*60;
    }
    public void setSecond(int second) {
        if(second>0&& second<=60){
            this.second = second;
        } else{
            this.second= 0;
        }
    }

    public void setMinute(int minute) {
        if(minute>0 && minute <=60){
            this.minute = minute;
        } else{
            this.minute=0;
        }
    }

    public void setHour(int hour) {
        if(hour>0 && hour<24) {
            this.hour = hour;
        } else{
            this.hour=0;
        }
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
}
