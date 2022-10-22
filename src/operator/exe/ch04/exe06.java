package operator.exe.ch04;

public class exe06 {
    public static void main(String[] args) {

        int price = 187000;
        int oman = price / 50000;
        int ilman = (price - oman*50000) / 10000;
        int ochun = (price - oman*50000 - ilman*10000) / 5000;
        int ilchun = (price - oman*50000 - ilman*10000 - ochun*5000) / 1000;

        System.out.println("5man : "+oman);
        System.out.println("1man : "+ilman);
        System.out.println("5chun : "+ochun);
        System.out.println("1chun : "+ilchun);

    }
}
