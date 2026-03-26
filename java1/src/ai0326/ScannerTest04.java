package ai0326;

import java.util.Scanner;

public class ScannerTest04 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

        System.out.println("문자를 입력하세요 : ");
            String n1 = s.next();
            String n2 = s.next();

            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);

        System.out.println("합: "+ (a+b));

        s.close();
    }
}
