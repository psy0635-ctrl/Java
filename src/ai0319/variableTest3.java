package ai0319;

public class variableTest3 {
    public static void main(String[] args) {
        // 정수 나눗셈과 실수 나눗셈의 차이를 확인하는 예제입니다.
        int n1 ,n2 ;
        double result;

        n1 = 300;
        n2 = 500;
        result = n1 / n2;  // n1,n2 둘 다 정수(int) 여서 소수 버리고 정수만 나옴

        result = (double)n1 / n2;  // n1을 double로 바꾼 후 계산하므로 소수점 결과가 나옵니다.

        // %.2f 소수점 둘째까지 출력
        System.out.printf("%d ÷ %d =%.2f \n", n1 , n2 , result);


    }
}
