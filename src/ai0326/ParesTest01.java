package ai0326;

public class ParesTest01 {
    public static void main(String[] args) {
        // 문자열로 저장된 숫자는 계산 전에 숫자 자료형으로 변환해야 합니다.
        String num1 = "2026";
        String num2 = "3,14";

        int parseNum1 = Integer.parseInt(num1);
        // "3,14"는 쉼표 때문에 실행 시 NumberFormatException이 발생할 수 있습니다.
        double parseNum2 = Double.parseDouble(num2);

        System.out.println("변환된 정수값:" + parseNum1);
        System.out.println("변환된 실수값:" + parseNum2);


    }
}
