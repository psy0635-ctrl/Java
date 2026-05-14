package ai0430;

import java.util.Scanner;

public class For_Test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++)
        {
            System.out.printf("%4d",i);
            if(i % 10 == 0)
             System.out.print("\n");
        }

    }
}
