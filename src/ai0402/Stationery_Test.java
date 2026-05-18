package ai0402;

import java.util.Scanner;

public class Stationery_Test {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

         int totalBuy = 0;
         int totalSell = 0;

         // 구입 금액과 판매 금액을 각각 누적해서 총 이익을 계산합니다.
         totalBuy += 500 * 20;
         totalBuy += 300 * 30;

         totalSell += 1000 * 10;
         totalSell += 800 * 20;
         totalSell += 500 * 50;

         int totalSales = totalSell - totalBuy;

        System.out.println("총 이익 : " + totalSales + "원");
    }
}
