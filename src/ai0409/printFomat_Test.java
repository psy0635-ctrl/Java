package ai0409;

public class printFomat_Test {
    public static void main(String[] args) {

        //      이스케이프 문자(Escape Sequence)
        // printf는 %d, %s 같은 서식 문자를 이용해 출력 모양을 조절합니다.
        System.out.printf("%d\n",345);
        System.out.printf("%5d\n",345);     // 5칸의 공간을 확보(앞에 빈칸 2개가 생깁니다.)
        System.out.printf("%05d\n",345);    //5칸의 공간을 확보하되, 빈 곳을 0으로 채웁니다. (결과: 00345)

        System.out.println("난생 처음 자바");
        System.out.printf("%s","난생 처음 자바\n");
        System.out.printf("%30s","난생 처음 자바\n");

        String s1 ="인공지능\'소프트웨어학과\'";  // \'	작은따옴표
        System.out.println(s1);

        // \n은 줄바꿈, \t는 탭, \\는 역슬래시 문자 자체를 의미합니다.
        String s2 = "한국\n" + "폴리텍\n" + "대학";
        System.out.println(s2);
        String s3 = "한국\n폴리텍\n대학";
        System.out.println(s3);

        String s4 = "한국\n폴리\\텍\n대\t학";  // \\	역슬래시
        System.out.println(s4);

        String s5 = "한국\n폴\b리\\텍\n대\t학";  // /b = backspace
        System.out.println(s5);

    }
}
