package OOP;

public class Timer {

    private int second;
    private int minute;
    private int hour;

    Timer(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    void plusSecond(){
        if(this.second == 59){
            this.second = 0;
            plusMinute();
        }
        else this.second++;
    }

    void minusSecond(){
        if(this.second == 0){
            if(this.hour == 0 && this.minute == 0) System.out.println("time is zero!");
            else {
                this.second = 59;
                minusMinue();
            }
        }
        else this.second--;
    }


    void plusMinute(){
        if(this.minute == 59){
            this.minute = 0;
            plusHour();
        }
        else this.minute++;
    }

    void minusMinue(){
        if(this.minute == 0){
            if(this.hour == 0) System.out.println("time is under hour!");
            else {
                this.second = 59;
                this.minute = 59;
                minusHour();
            }
        }
    }


    void plusHour(){
        if(this.hour == 59){
            System.out.println("Hour is max!");
            this.hour = 59;
        }
        else this.hour++;
    }

    void minusHour(){
        if(this.hour == 0) System.out.println("Hour is zero!");
        else this.hour--;
    }


    void showTime(){
        System.out.println(this.hour+" : "+this.minute+" : "+this.second);
    }

}
