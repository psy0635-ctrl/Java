package ai0326;

import java.util.Scanner;

public class Delivery_Lab1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=택배보내기 입니다. 다음을 입력하세요");

        System.out.println("받는 사람:");
        String name = s.nextLine();

        System.out.println("주소:");
        String address = s.nextLine();

        System.out.println("무게(g):");
        int weight = s.nextInt();

        int deliveryfee = weight * 5;

        System.out.println("==받는 사람:" + name);
        System.out.println("==주소:" + address);
        System.out.println("==무게:" + weight);
        System.out.println("==배송비:" + deliveryfee +"원");

        s.close();










    }
}
