package operator.exe.ch05;

public class exe03 {
    public static void main(String[] args) {

        for (int x=1; x<=6; x++) {
            for (int y=1; y<=6; y++) {
                int nice = x + y;
                if (nice == 6) System.out.println("("+x+","+y+")");
            }
        }

    }
}
