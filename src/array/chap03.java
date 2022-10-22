package array;

public class chap03 {
    public static void main(String[] args) {

        int[][] students = new int[3][3];
        // [[1][][]]
        students[0][0] = 1;
        // [[1,7][][]]
        students[0][1] = 7;
        // [[1,7,123][][]]
        students[0][2] = 123;

        int[][] classes = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

    }
}
