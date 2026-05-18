package ai0402;

import java.util.Scanner;
public class Temp_Test {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("<==== 섭씨->화씨 ====>");
        System.out.println("섭씨 입력 : ");
        int temp1 = s.nextInt();
        // 섭씨를 화씨로 바꾸는 공식: 섭씨 * 9 / 5 + 32
        System.out.println(temp1 + "섭씨 온도는" + ((temp1 * 9/5) + 32) + "도 입니다.");

        System.out.println("<==== 화씨->섭씨 ====>");
        System.out.println("화씨 입력 : ");
        int temp2 = s.nextInt();
        // 화씨를 섭씨로 바꾸는 공식: (화씨 - 32) * 5 / 9
        System.out.println(temp2 + "화씨 온도는" + ((temp2-32)*5/9) + "도 입니다.");

    }
}
