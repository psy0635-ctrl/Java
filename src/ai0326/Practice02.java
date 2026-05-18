package ai0326;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("태어난 년도를 입력하세요: ");

        // 사용자가 입력한 정수를 year 변수에 저장합니다.
        int year =s.nextInt();

        System.out.println( year + "년생입니다. ");

        s.close();


    }
}

