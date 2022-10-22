package OOP;

public class gametest {
    public static void main(String[] args) {

        CGV sinchon = new CGV();
        sinchon.makeSchedule();
        sinchon.makeReservation(1,5,5);
        sinchon.showAllSchedule();

    }
}
