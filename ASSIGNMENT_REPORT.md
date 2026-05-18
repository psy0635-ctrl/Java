# Java 기초 실습 프로젝트 과제 보고서

## 1. 목적

이 프로젝트의 목적은 Java 프로그래밍의 기본 문법을 직접 실습하며 익히는 것이다. 변수 선언, 자료형, 연산자, 입력 처리, 조건문, 반복문, 문자열 처리, 배열, 랜덤 값 사용 등 Java 기초 학습에 필요한 내용을 날짜별 예제 파일로 작성하였다.

## 2. 사용 문법

| 구분 | 사용 문법 | 예시 파일 |
|---|---|---|
| 변수와 자료형 | `int`, `double`, `String`, `char`, `boolean` | `ai0319`, `ai0409/DataType_Test.java` |
| 출력 | `System.out.print`, `println`, `printf` | `ai0319/variableTest1.java`, `ai0409/printFomat_Test.java` |
| 입력 | `Scanner`, `nextInt`, `nextDouble`, `nextLine` | `ai0326/ScannerTest*.java` |
| 형변환 | `(double)`, `Integer.parseInt`, `Double.parseDouble` | `ai0319/variableTest3.java`, `ai0326/ParesTest*.java` |
| 조건문 | `if`, `else`, `else if`, 중첩 `if` | `ai0416`, `ai0423` |
| 선택문 | `switch-case` | `ai0430/Switch_Test.java`, `ai0430/Lab_Switch.java` |
| 반복문 | `for`, `while` | `ai0430`, `ai0514` |
| 반복 제어 | `break`, `continue` | `ai0514/LAB_Break.java`, `ai0514/Continue_Test.java` |
| 문자열 처리 | `length`, `charAt`, `substring`, `indexOf`, `replaceAll`, `trim` | `ai0416/ReplaceAll_Test.java`, `ai0409/String_Test.java` |
| 배열과 랜덤 | 배열, `Random` | `ai0423/RPS_Test.java`, `ai0514/NumberGame_Test.java` |

## 3. 실행 결과

프로젝트의 각 파일은 독립적인 콘솔 프로그램으로 실행된다. 예를 들어 계산기 프로그램은 두 정수를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력한다. BMI 프로그램은 키와 몸무게를 입력받아 BMI 값을 계산하고 체중 상태를 출력한다. 반복문 예제는 1부터 100까지 숫자를 출력하거나 누적 합계를 계산하며, 구구단 프로그램은 중첩 반복문을 이용해 2단부터 9단까지 출력한다.

가위바위보와 숫자 맞히기 예제에서는 `Random` 클래스를 사용해 컴퓨터의 선택을 만들고, 사용자의 입력과 비교하여 결과를 출력한다. 이를 통해 입력, 조건문, 배열, 랜덤 값, 반복 제어를 함께 연습할 수 있다.

## 4. 컴파일 오류 확인

IntelliJ IDEA에 포함된 JBR의 `javac`로 전체 `src` 폴더를 컴파일한 결과, 현재 기준 컴파일 오류는 확인되지 않았다.

다만 일부 파일은 `static void main(String[] args)`처럼 `main` 메서드가 `public`으로 선언되어 있지 않다. 이 경우 Java 문법상 컴파일은 가능하지만, IntelliJ에서 실행 버튼으로 바로 실행 진입점이 잡히지 않을 수 있다. 또한 `ParesTest01.java`의 `"3,14"`를 `Double.parseDouble`로 변환하는 코드는 컴파일 오류는 아니지만 실행 시 숫자 형식 오류가 발생할 수 있다.

## 5. 패키지 구조 확인 및 정리 방향

현재 `src` 안의 패키지는 `ai0319`, `ai0326`, `ai0402`처럼 수업 날짜 기준으로 구성되어 있다. 이 방식은 학습 흐름과 수업 진행 순서를 확인하기 쉽다는 장점이 있다.

포트폴리오용으로 더 명확히 정리하려면 주제별 패키지 구조도 고려할 수 있다.

| 정리 방향 | 예시 |
|---|---|
| 변수/자료형 | `basic.variable`, `basic.datatype` |
| 입력/형변환 | `basic.input`, `basic.casting` |
| 조건문 | `basic.condition` |
| 문자열 | `basic.string` |
| 반복문 | `basic.loop` |
| 게임/응용 | `basic.game` |

현재는 파일 이동 없이 날짜별 구조를 유지하고, README에서 각 패키지의 학습 주제를 설명하는 방식이 가장 안전하다.

## 6. 느낀 점

Java 기초 문법은 각각 따로 배우는 것보다 작은 프로그램을 직접 작성하면서 익히는 것이 이해에 도움이 되었다. 특히 `Scanner` 입력, 형변환, 조건문, 반복문은 여러 예제에서 반복적으로 사용되면서 자연스럽게 익숙해졌다. BMI 계산기, 계산기, 가위바위보, 숫자 맞히기 게임처럼 간단한 응용 프로그램을 만들면서 문법이 실제 프로그램 흐름 안에서 어떻게 연결되는지 확인할 수 있었다.

앞으로는 중복되는 코드를 메서드로 분리하고, 입력값 검증과 예외 처리까지 추가하면 더 완성도 있는 Java 프로그램으로 발전시킬 수 있을 것이다.
