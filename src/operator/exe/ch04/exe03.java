package operator.exe.ch04;

public class exe03 {
    public static void main(String[] args) {

        int colorPen = 5 * 12;
        int studentCount = 27;

        int divColorPen = colorPen / studentCount;
        System.out.println("divColorPen :"+divColorPen);

        int remainColorPen = colorPen % studentCount;
        System.out.println("remainColorPen :"+remainColorPen);

    }
}

// 쌤 답

//public class exe03 {
//    public static void main(String[] args) {
//
//        final int DOZEN = 12;
//
//        int pens = 5 * DOZEN;
//        int students = 27;
//
//        int dividedPen = pens / students;
//        int remainedPen = pens % students;
//
//        System.out.println("dividedPen : "+dividedPen);
//        System.out.println("remainedPen : "+remainedPen);
//
//    }
//}

