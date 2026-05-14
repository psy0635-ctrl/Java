package ai0409;

// 기본 자료형( 1. 숫자형 / 2. 숫자가 아닌 형 )
import java.util.Scanner;
public class DataType_Test {
    public static void main(String[] args) {
//        1.숫자형 : 정수형
        byte bt = -128; // 1 byte / 범위 : -128 ~ 127 == 2의 7승 ~ 2의 7승 -1
        short st = 300; // 2 byte / 범위 : 2의 15승 ~ 2의 15승 -1
        st = bt;
        int it = st; // 4 byte / 범위 : 2의 31승 ~ 2의 31승 -1
        System.out.println("it변수에 저장된 값 : " + it);
        long lg = 700000000;  // 8 byte / 범위 : 2의 63승 ~ 2의 63승 -1

//        1.숫자형 : 실수형
        float f1 = 1000;  // float (4 byte): 숫자 뒤에 f나 F를 붙여야 합니다. (예: 3.14f)
        f1 = lg;
        f1 = 1000.0f;
        f1 = 1000.0F;
        f1 = (float) 1000.0;

        double d1 = 200000; // double (8 byte): 실수의 기본형입니다. float보다 정밀한 숫자 표현 가능
        d1 = f1;
        d1 = bt;  // -128.0
        d1 = 207.9999;

//        1.숫자가 아닌 형 : 문자형
        char c = 'A';     // 유니코드 값 A = 65
        System.out.println(c);  // A
        System.out.println(c + 1);  // 66
        System.out.println((char)(c + 1)); // B  --> 형변환
        System.out.println((char)(c + 3)); // D  --> 형변환
        System.out.println((int)c); // 65

//        1.숫자가 아닌 형 : 논리형
        boolean b = true;

        System.out.println(b);    // true
        System.out.println(!b);   // false

        System.out.println(bt == st);  // true


    }
}
