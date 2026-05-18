package ai0430;

public class For_Test4 {
    public static void main(String[] args) {
        System.out.println("======= 1001 ~ 2000까지의 숫자 중에서 홀수값의 합계 구하기 ========");
        int sum = 0;

//        for(int i = 1001; i <+ 2000; i+=2)
//        {
//            sum += i;
//        }

        // 1001부터 1999까지 반복하며 홀수일 때만 합계에 더합니다.
        for (int i = 1001; i < 2000; i++)
        {
            if(i % 2 == 1)
                sum += i;
        }
        System.out.println(sum);
    }
}
