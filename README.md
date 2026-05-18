# Java Basic Practice Project

IntelliJ IDEA에서 작성한 Java 기초 문법 실습 프로젝트입니다. 변수, 자료형, 입력, 형변환, 조건문, 문자열 처리, 반복문, 배열, 랜덤 값을 이용한 간단한 게임까지 단계적으로 연습합니다.

## 프로젝트 목적

- Java 프로그램의 기본 구조인 `class`와 `main` 메서드 이해
- 변수 선언, 자료형, 연산자, 형변환 연습
- `Scanner`를 이용한 사용자 입력 처리
- `if`, `else if`, `switch` 조건문 연습
- `for`, `while`, `break`, `continue` 반복문 연습
- `String` 메서드와 배열, `Random` 클래스 활용

## 개발 환경

- Language: Java
- IDE: IntelliJ IDEA
- Project Type: Java 기초 실습
- Main Source Folder: `src`

## 패키지 구성

| 패키지 | 주요 내용 |
|---|---|
| `ai0319` | 변수, 정수/실수 연산, 문자열 연결, 출력 형식 |
| `ai0326` | `Scanner` 입력, 문자열 숫자 변환, BMI/나이/배송비 계산 |
| `ai0402` | 사칙연산 계산기, 단위 변환, 누적 계산, 조건문 기초 |
| `ai0409` | 기본 자료형, 형변환, 출력 포맷, 문자열 메서드, 가중 평균 |
| `ai0416` | `if-else`, 중첩 조건문, 문자열 메서드 종합 |
| `ai0423` | `else if`, BMI 분류, 가위바위보 게임, 나이 조건 판정 |
| `ai0430` | `for` 반복문, 배열 순회, 누적 합계, 팩토리얼, `switch` |
| `ai0514` | `while`, `break`, `continue`, 중첩 반복문, 숫자 게임 |

## 대표 실습 예제

- 사칙연산 계산기: `src/ai0402/Calculator_Test.java`
- BMI 계산기: `src/ai0326/BMI_ClassTest.java`, `src/ai0514/BMI_ClassTest3.java`
- 문자열 메서드 실습: `src/ai0416/ReplaceAll_Test.java`
- 가위바위보 게임: `src/ai0423/RPS_Test.java`
- 구구단 출력: `src/ai0514/Double_For_Test.java`
- 숫자 맞히기 게임: `src/ai0514/NumberGame_Test.java`

## 실행 방법

1. IntelliJ IDEA에서 프로젝트를 엽니다.
2. `src` 폴더 아래 원하는 Java 파일을 선택합니다.
3. `public static void main(String[] args)`가 있는 파일은 실행 버튼으로 실행합니다.
4. `static void main(String[] args)`처럼 `public`이 없는 파일은 컴파일은 가능하지만 IDE 실행 진입점으로 바로 인식되지 않을 수 있습니다.

## 컴파일 확인

IntelliJ IDEA에 포함된 JBR의 `javac`로 `src` 전체 컴파일을 확인했습니다.

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.3\jbr\bin\javac.exe" -encoding UTF-8 -d out_compile (rg --files src -g *.java)
```

현재 기준 컴파일 오류는 확인되지 않았습니다.

## 정리 방향 제안

현재 패키지는 수업 날짜별로 나뉘어 있어 학습 순서를 추적하기 좋습니다. GitHub 포트폴리오 관점에서는 날짜별 구조를 유지하되, README에서 각 날짜의 학습 주제를 명확히 설명하는 방식이 적절합니다.

추후 정리한다면 다음처럼 주제별 패키지로 재구성할 수 있습니다.

| 현재 방식 | 주제별 정리 예시 |
|---|---|
| `ai0319`, `ai0326` | `basic.variable`, `basic.input` |
| `ai0402`, `ai0416`, `ai0423` | `basic.condition` |
| `ai0409` | `basic.datatype`, `basic.string` |
| `ai0430`, `ai0514` | `basic.loop`, `basic.game` |

단, 아직은 파일 이동 없이 날짜별 패키지를 유지하는 편이 수업 기록 관리에 더 적합합니다.
