package ai0430;

public class For_Test3 {
    public static void main(String[] args) {
        int sum = 0;

        // sum에 i 값을 계속 더해서 1부터 10까지의 누적 합계를 구합니다.
        for (int i = 1; i <= 10; i++)
        {
            sum += i;

            if(i < 10)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");

        }
        System.out.println(sum);
    }
}
