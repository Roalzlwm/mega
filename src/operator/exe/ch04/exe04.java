package operator.exe.ch04;

//public class exe04 {
//    public static void main(String[] args) {
//        int age = 6;
//        int height = 120;
//        boolean parent = true;
//        boolean hearchDease = false;
//
//        System.out.println("1) " + age + "up ok(but, height" + height + "cm up parent" + parent);
//        System.out.println("2) height" + height + "cm up ok");
//        System.out.println("3) hearchDease" + hearchDease);
//    }
//}


// 쌤 답

public class exe04 {
    public static void main(String[] args) {

        // 정해지지 않은 값을 "쓰레기값"이라 부름
        int age = 0;
        double height = 0;
        boolean withParent = false;
        boolean hasHeartDisease = false;
                            // 6살 이상인 경우                                         // 6살 미만인 경우
        boolean canHeRide = ((age >= 6) && (height >= 120) && (!hasHeartDisease)) || (height >= 120 && withParent);
        System.out.println(canHeRide);

    }
}
