package maxMinAvgProject;

import java.util.*;
import java.util.stream.IntStream;

public class steamFuc {
    public static void main(String[] args) {
        List<Integer> randomNumList = new ArrayList();
        // n개 값 입력 -> [0,0,0,0,0,0,...]
        System.out.print("How many integers will it generate?  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n개에 값 랜덤으로 채우기 -> [-1000,568,...,1000]
        IntStream intStr = new Random().ints(n,-1000,1000);
        intStr.forEach(randomNum -> randomNumList.add(randomNum));
        // 리스트 보여주기
        System.out.println(randomNumList);


        // 리스트 안 숫자에서 가장 큰 값 구하고 출력하기
        Integer maxStr = randomNumList.stream()
                // Stream에서 int원시 스트림 변환
                .mapToInt(x->x)
                .max()
                // 결과가 없는 경우 NoSuchElementException 예외를 throw한다
                .orElseThrow(NoSuchElementException::new);
        System.out.println("max : "+maxStr);

        // 리스트 안 숫자에서 가장 작은 값 구하고 출력하기
        Integer minStr = randomNumList.stream()
                .mapToInt(x->x)
                .min()
                .orElseThrow(NoSuchElementException::new);
        System.out.println("min : "+minStr);

        // 리스트 안 숫자의 평균값 구하고 출력하기
        Double arvStr = randomNumList.stream()
                .mapToInt(x->x)
                .average().orElse(0);
        System.out.println("average : "+arvStr);
    }
}
