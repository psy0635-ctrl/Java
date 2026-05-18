package ai0430;

import java.util.Scanner;

public class Lab_Switch {
    public static void main(String[] args) {
        System.out.println("====== 출생년도에 따른 12간지 ======");
        System.out.print("출생년도를 입력하세요 : ");
        Scanner s = new Scanner(System.in);

        int birthyear = s.nextInt();
        String animal = "";

        // 출생연도를 12로 나눈 나머지에 따라 12간지 문자열을 선택합니다.
        switch (birthyear % 12)
        {
            case 0:
                animal="원숭이띠";
                break;
            case 1:
                animal="닭띠";
                break;
            case 2:
                animal="개띠";
                break;
            case 3:
                animal="돼지띠";
                break;
            case 4:
                animal="쥐띠";
                break;
            case 5:
                animal="소띠";
                break;
            case 6:
                animal="호랑이띠";
                break;
            case 7:
                animal="토끼띠";
                break;
            case 8:
                animal="용띠";
                break;
            case 9:
                animal="뱀띠";
                break;
            case 10:
                animal="말띠";
                break;
            case 11:
                animal="양띠";
                break;
            default:
                animal ="잘못된 출생년도 입니다.";

        }

        System.out.printf("출생년도 %d년생은 %s 입니다.",birthyear,animal);

        s.close();
    }
}
