package ai0416;

public class ReplaceAll_Test {
    public static void main(String[] args) {

        // 문자열 메서드가 어떤 값을 반환하는지 확인하는 종합 연습 파일입니다.
        // ────────────────────────────────────────────
        // 1. replaceAll() - 특정 문자 제거
        // ────────────────────────────────────────────

        // 공백이 여러 개 섞인 문자열 생성
        String s1 = new String("  한국    폴리텍  대학    서울    정수      캠퍼스");

        // replaceAll(" ", "") → 공백(" ")을 빈 문자열("")로 전부 교체 = 공백 제거
        String s2 = s1.replaceAll(" " , "");

        System.out.println("원래 문자열 : " + s1);  // 공백 포함
        System.out.println("바꾼 문자열 : " + s2);  // 공백 제거됨 → "한국폴리텍대학서울정수캠퍼스"


        // ────────────────────────────────────────────
        // 2. indexOf() - 문자열의 위치(인덱스) 찾기
        // ────────────────────────────────────────────

        String s3 = "인공지능소프트웨어학과 1학년";
        //           0123456789...
        //           인=0, 공=1, 지=2, 능=3, 소=4, 프=5, 트=6, 웨=7 ...

        // "지능" 이 시작되는 인덱스 → 2 ('지'의 위치)
        System.out.println("\"지능\"의 인덱스 번호 : " + s3.indexOf("지능"));  // 2

        // "웨" 가 있는 인덱스 → 7
        System.out.println("\"웨\" 의 인덱스 번호 : " + s3.indexOf("웨"));    // 7


        // ────────────────────────────────────────────
        // 3. indexOf(문자열, 시작위치) - 특정 위치부터 검색
        // ────────────────────────────────────────────

        String s4 = "한국에는 한국 폴리텍 대학이 한국 전체에 많은 곳에 캠퍼스가 위치해 있습니다";
        //           0123 4 5...
        //           한=0, 국=1, 에=2, 는=3, 공백=4, 한=5, 국=6 ...

        // indexOf("한국", 4) → 인덱스 4번부터 검색 시작
        // 맨 앞 "한국"(0번)은 건너뛰고, 다음 "한국"(5번)을 찾음
        System.out.println("s4의 4번 위치부터 찾아서 한국 이라는 문자열의 인덱스 번호 : "
                + s4.indexOf("한국", 4));  // 5


        // ────────────────────────────────────────────
        // 4. length() / charAt() - 길이 & 한 글자 꺼내기
        // ────────────────────────────────────────────

        String s5 = "서울정수";
        //            0 1 2 3  ← 인덱스 번호

        // length() → 문자열 전체 글자 수 반환
        System.out.println("전체 문자열 길이 : " + s5.length()); // s1 기준 길이 출력

        // charAt(인덱스) → 해당 위치의 글자 1개 반환
        System.out.println(s5.charAt(0)); // 서
        System.out.println(s5.charAt(1)); // 울
        System.out.println(s5.charAt(2)); // 정
        System.out.println(s5.charAt(3)); // 수

        // charAt(4) → s5는 인덱스 0~3까지만 존재
        // 4번 인덱스는 없으므로 StringIndexOutOfBoundsException 오류 발생!
//      System.out.println(s5.charAt(4));  // ← 주석 처리된 이유

        //위 코드 for문으로 변환
        // 문자열 길이만큼 반복하면서 한 글자씩 꺼내 출력합니다.
        for(int i = 0; i < s5.length(); i++)
        {
            char c = s5.charAt(i);
            System.out.println(i + "번 :" + c);
        }


        // ────────────────────────────────────────────
        // 5. substring(start, end) - 문자열 잘라내기
        // ────────────────────────────────────────────

        // substring(1, 3) → 인덱스 1부터 3 "미만"까지 반환 (3은 포함 안 됨!)
        // s5 = "서울정수"
        //       0 1 2 3
        //         ↑   ↑
        //       start  end(미포함)  → "울정" 반환


        System.out.println(s5.substring(1, 3)); // 울정

        //연습
        String email = "user@example.com";

        int atIndex = email.indexOf("@");          // @ 위치 찾기 → 4
        String id = email.substring(0, atIndex);   // 0부터 @ 직전까지

        System.out.println(id); // user



        // ────────────────────────────────────────────
        // 6. charAt() 응용 - 문자열 거꾸로 출력
        // ────────────────────────────────────────────

        String s6 = "블랙핑크";
        //            0 1 2 3

        System.out.println("전체 문자열 길이 : " + s6.length()); // 4
        System.out.println("원본 문자열 ==>" + s6);              // 블랙핑크

        // charAt()으로 마지막 인덱스(3)부터 역순으로 한 글자씩 출력
        // println 대신 print 사용 → 줄바꿈 없이 이어서 출력
        System.out.print("반대 문자열 ==>");
        System.out.print(s6.charAt(3)); // 크
        System.out.print(s6.charAt(2)); // 핑
        System.out.print(s6.charAt(1)); // 랙
        System.out.print(s6.charAt(0)); // 블
        // 최종 출력 → "크핑랙블"


    }
}
