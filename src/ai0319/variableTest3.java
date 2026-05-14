package ai0319;

public class variableTest3 {
    public static void main(String[] args) {
        int n1 ,n2 ;
        double result;

        n1 = 300;
        n2 = 500;
        result = n1 / n2;  // n1,n2 둘 다 정수(int) 여서 소수 버리고 정수만 나옴

        result = (double)n1 / n2;  // n1을 double로 바꿔서 계산

        // %.2f 소수점 둘째까지 출력
        System.out.printf("%d ÷ %d =%.2f \n", n1 , n2 , result);


    }
}
