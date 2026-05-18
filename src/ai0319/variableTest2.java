package ai0319;

public class variableTest2 {
    public static void main(String[] args) {
        // 여러 개의 정수형 변수를 한 번에 선언하는 연습입니다.
        int num1 , num2 , result , result2;

        num1 = 300;
        num2 = 500;
        result = num1 + num2;
        result2 = num1  * num2;
        // int끼리 나누면 결과도 int가 되어 소수점 아래는 버려집니다.
        int result3 = num1 / num2;  // int 정수로 바꿔줬기 때문에 소수점자리는 표시안됨.
//        result = 10;

        //지역 변수는 초기화를 꼭 하고 사용해야 한다.
        System.out.println(num1 + "+" + num2 + "=" + result);
        System.out.printf("%d + %d = %d\n" , num1 ,num2 , result );
        System.out.printf("%d × %d = %d\n" , num1 ,num2 , result2 );
        System.out.printf("%d ÷ %d = %d" , num1 ,num2 , result3 );
    }

}

