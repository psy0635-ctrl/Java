package ai0402;

import java.util.Scanner;
public class CvStore_Test {
    public static void main(String[] args) {
            int totalBuy = 0; // 총 구입 금액
            int totalSell = 0;  // 총 판매 금액

        //누적 구매 금액
        // +=는 기존 값에 계산 결과를 더해서 다시 저장하는 누적 대입 연산자입니다.
        totalBuy += 900 * 10;   // 삼각 김밥 10개 구입
        totalBuy += 3500 * 5;   // 도시락 5개 구입

        //누적 판매 금액
        totalSell += 1800 *2;   // 바나나맛 우유 2개 판매
        totalSell += 4000 *4;   // 도시락 4개 판매
        totalSell += 1500 *1;   // 콜라 1개 판매
        totalSell += 2000 *4;   // 새우깡 4개 판매
        totalSell += 1800 *5;   // 캔커피 5개 판매

        // 총매출액: 판매 금액에서 구매 금액을 빼서 이익을 구합니다.
        int totalSales = totalSell - totalBuy;

        System.out.println("오늘 총 매출액은 " + totalSales + " 원입니다.");

    }
}
