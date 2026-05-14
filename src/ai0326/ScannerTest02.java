package ai0326;

import java.util.Scanner;

public class ScannerTest02 {
     public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("이름을 입력하세요: ");
      String name = s.nextLine();
      System.out.println("나이를 입력하세요 : ");
      int age = s.nextInt();

         System.out.println("이름 :" + name);
         System.out.println("나이 :" + age);

         s.close();
    }
}


