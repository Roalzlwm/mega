package OOP;

public class timeTest {
    public static void main(String[] args) {
        Timer t = new Timer();
        for(int i = 0; i < 60; i++) t.plusHour();
        t.minusSecond();
        t.showTime();
        t.minusMinue();
        t.showTime();
    }
}
