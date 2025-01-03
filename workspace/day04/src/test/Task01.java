package test;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기

		// 1. 입력 클래스
		// 2. 변수 선언 int 1개
		// 3. 출력 메시지 "금액을 입력하세요 : "
		// 4. 입력 메소드 변수 = sc.nextInt();
		// 5. 출력 / 5만,1만,5천,천

		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("금액을 입력하세요 : ");
		number = sc.nextInt();
		System.out.printf("5만원 : %d 1만원 : %d 5천원 : %d 1천원 : %d", number / 50000, number / 10000, number / 5000, number / 1000);

		// 2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)

		// 1. 변수 선언 double 2개
		// 2. 출력 메시지 "키와 몸무게를 입력하세요 : "
		// 3. 입력 메소드 변수 = sc.nextInt();
		// 4. 출력 (공식)
		// 5. 남은 엔터값 소모 nextLine()

		double cm = 0, weight = 0;
		System.out.println("키와 몸무게를 입력하세요 : ");
		cm = sc.nextDouble();
		weight = sc.nextDouble();
		System.out.println("BMI : " + weight / (cm * cm));
		sc.nextLine();

		// 3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
		// 공식 : 0.5 * 밑면 * 높이

		// 1. 변수 선언 double 2개
		// 2. 출력 메시지 "삼각형의 밑변과 높이를 입력하세요 : "
		// 3. 입력 메소드 변수 = sc.nextDouble();
		// 4. 출력 (공식)
		// 5. 남은 엔터값 소모 nextLine()

		double length = 0, height = 0;
		System.out.println("삼격형의 밑변과 높이를 입력하세요 : ");
		length = sc.nextDouble();
		height = sc.nextDouble();
		System.out.printf("높이 : " + length * height * 0.5);
		sc.nextLine();

		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)

		// 1. 변수 선언 int 두 정수
		// 2. 출력 메시지 " 두 정수를 입력하세요 : "
		// 3. 입력 메소드 변수 = sc.nextInt();
		// 4. 출력 두 정수 > 0 = "true || false"
		// 5. 남은 엔터값 소모 nextLine();

		int number1 = 0, number2 = 0;
		System.out.println("두 정수를 입력하세요 : ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println(number1 > 0);
		System.out.println(number2 > 0);
		sc.nextLine();

//		System.out.println(true || false);

		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원

		// 1. 변수 선언 int(개수, 가격)
		// 2. 출력 메시지 " 물건의 개수 :, 물건의 가격 : "
		// 3. 입력메소드 변수 = sc.nextInt();
		// 4. 총액 출력 "총액 : 00원 "
		// 5. 남은 엔터값 소모 nextLine();

		int count = 0, price = 0;
		System.out.println("물건의 개수 : ");
		count = sc.nextInt();
		System.out.println("물건의 가격 : ");
		price = sc.nextInt();
		System.out.printf("총액 : %d원", count * price);
		sc.nextLine();

		// 6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하기(각 자리수의 합)

		// 1. 변수 선언 int (두 자리수의 정수)
		// 2. 출력 메시지 " 두 자리수의 정수 : "
		// 3. 입력 메소드 변수 = sc.nextInt();
		// 4. 출력 - 변수/10 + 변수%10 = 각 자리수의 합
		// 5. 남은 엔터값 소모 nextLine();

		int number3 = 0;
		System.out.print("두 자리수의 정수 : ");
		number3 = sc.nextInt();
		System.out.println(number3 / 10 + number3 % 10);
		sc.nextLine();

		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false

		// 1. 변수 선언 int 정수
		// 2. 출력 메시지 " 정수를 입력하세요 : "
		// 3. 입력 메소드 변수 = sc.nextInt();
		// 4. 출력 양수 and 짝수 = (정수>0) && (정수%2=0)
		// 5. 버퍼 비우기 : nextLine();

		int num = 0;

		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		System.out.println(num > 0 && num % 2 == 0);
		sc.nextLine();

		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false

		// 1. 변수 선언 int (두 숫자)                 // 변수 boolean 저장
		// 2. 출력 메시지 "두 숫자를 입력하세요 : "
		// 3. 입력 메소드 변수 = sc.nextInt();
		// 4. 출력 (첫번째 숫자 >= 두번째 숫자)
		// 5. 버퍼 비우기 : nextLine();

		
		int num1 = 0, num2 = 0;
//		boolean result = false;
//		boolean result1 = false;
		System.out.print("두 숫자를 입력하세요(띄어쓰기로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1 >= num2);
		sc.nextLine();

		// 음수 * 양수 == 음수, 양수 * 음수 == 음수, 양수 * 양수 == 양수, 음수 * 음수 == 양수
//		result1 = num3 * num4 < 0;
//		System.out.println(result1);
		
		
		
		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false

		// 1. 변수 선언 int (두 숫자)	//boolean 1개
		// 2. 출력 메시지 "두 숫자를 입력하세요 : "
		// 3. 입력 메소드 변수 = sc.nextInt();
		// 4. 출력 (숫자1>0) or (숫자2>0) 여부 출력	// 관계연산자와 논리 연산자를 이용하여 1개의 숫자만 양수인지 여부 확인
		// (변수1 > 0 && 변수2 <=0 || (변수2 > 0 && 변수1 <= 0)
		// 5. 버퍼 비우기 : sc.nextLine();

		int num3 = 0, num4 = 0;
		// boolean result1 = false;
		System.out.print("숫자1 입력 : ");
		num3 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		num4 = sc.nextInt();
		//result = (num3 > 0 && num4 <=0) || (num4 > 0 && num3 <= 0);
		System.out.println(num3 > 0 || num4 > 0);
		sc.nextLine();

		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		// true or false => ture이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다

		// 1. 변수 선언 int (연도) , boolean1개
		// 2. 출력 메시지 "연도 : "
		// 3. 입력 메소드 sc.nextInt();
		// 4. boolean 타입 변수 윤년 여부 계산
		// 5. 출력
		// (연도%4 == 0 && 연도%100 != 0) || 연도%400 == 0
		// true = "0000년은 윤년입니다" , false = "0000년은 윤년이 아닙니다"
		// sc.close();
		
		int year = 0;
		boolean result3 = false;
		System.out.print("연도 : ");
		yeer = sc.nextInt();
		boolean result3 = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		System.out.printf("%s", result3 ? year + "년은 윤년입니다" : year + "년은 윤년이 아닙니다");
//		System.out.println(result3 ? year + "는 윤년입니다" : year + "년은 윤년이 아닙니다");
		sc.close();
//		System.out.println((yeer % 4 == 0 && yeer % 100 != 0) || yeer % 400 == 0);
//		System.out.println(string);

	}
}