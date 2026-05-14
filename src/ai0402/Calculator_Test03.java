package ai0402;

import java.util.Scanner;
public class Calculator_Test03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("<==== 계산기 =====>");

        System.out.println("정수1 입력 : ");
        int num1 = s.nextInt();

        System.out.println("정수2 입력 : ");
        int num2 = s.nextInt();

        if(num1==0){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        else {
            System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));
            System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
        }

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));

        s.close();
    }
}
