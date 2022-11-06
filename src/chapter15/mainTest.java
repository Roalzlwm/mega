package chapter15;

@FunctionalInterface
interface LambdaInterface4{
    int cal(int x, int y);
}

interface TestEx{
    int num(int a, int b, int c, int x);
}


public class mainTest {
    public static void main(String[] args) {

        LambdaInterface4 f4 = (x,y) -> {
            return x * y;
        };
        System.out.println("x * y = " + f4.cal(3,2));

        f4 = (x, y) -> x + y;
        System.out.println("x + y = " + f4.cal(3,2));

        f4 = (x, y) -> { return x/y; };
        System.out.println("en tndml ahrt = " + f4.cal(5,2));

        f4 = (x, y) -> x % y;
        System.out.println("en tndml skajwl = " + f4.cal(3,2));

        TestEx te = (a,b,c,x) -> a * (int)Math.pow(x,2) + b*x + c;
        System.out.println(te.num(2,1,3,4));
    }

    static int sum(int x, int y) {
        return x + y;
    }
}
