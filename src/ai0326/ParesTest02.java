package ai0326;

public class ParesTest02 {
    static void main(String[] args) {
        // 문자열 "10", "3"을 정수로 바꾼 뒤 나눗셈을 연습합니다.
        String n1 = "10";
        String n2 = "3";

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);

        // a를 double로 형변환해서 소수점 이하까지 계산합니다.
        double result = (double) a/b;

        System.out.printf("%.6f",result);





    }

}
