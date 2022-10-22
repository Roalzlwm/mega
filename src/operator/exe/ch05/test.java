package operator.exe.ch05;

public class test {
    public static void main(String[] args) {

        char alphabet = 97;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i >= j) System.out.print(alphabet);
            }
            ++alphabet;
            System.out.println("");
        }

    }
}
