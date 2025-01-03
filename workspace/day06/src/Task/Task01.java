package Task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		//로직구성필수!
		//다양항 방법
		
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다

		//1. 입력클래스
		//2. 변수 선언 int 1개
		//3. 출력 메시지 "입력 : "
		//4. 입력 메소드 sc.nextInt();
		//5. 조건1 - 변수%2 == 0 (짝수) 조건2 - 변수%2 == 1 (홀수)
		//6. 출력 메시지 "출력 : 입니다 "
		
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("입력 : ");
//		num = sc.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("출력 : 짝수입니다");
//		}else
//		System.out.println("출력 : 홀수입니다");
				
		
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다

		//1. 변수 선언 int 1개
		//2. 출력 메시지 "입력 : "
		//3. 입력 메소드 sc.nextInt();
		//4. 조건 3개 if~else if~else문 사용
		//조건 1 (변수 > 0) 조건 2 (변수 < 0) 조건 3 (변수 = 0)
		//출력
		
//		int num1 = 0;
//		System.out.print("입력 : ");
//		num1 = sc.nextInt();
//		if(num1 > 0) {
//			System.out.println("출력 : 양수입니다");
//		}else if(num1 < 0){
//			System.out.println("출력 : 음수입니다");
//		}else {
//			System.out.println("출력 : 0입니다");
//		}
			
		
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다

		//1.변수 int 1개 선언
		//2. 출력 메시지 "나이입력 : "
		//3. 입력 메소드 sc.nextInt();
		//4. if~else if~else문으로 출력
		
//		int age = 0;
//		System.out.println("나이입력 : ");
//		age = sc.nextInt();
//		if(age <= 12) {
//			System.out.println("어린이입니다");
//		}else if(age <= 19) {
//			System.out.println("청소년입니다");
//		}else {
//			System.out.println("성인입니다");
//		}
		
		
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9

		//1.변수 선언 int 3개
		//2.출력 메시지 "세 개의 정수 입력(띄어쓰기로 구분) : "
		//3.입력 메소드 sc.nextInt();
		//4. 삼항연산자 ( 조건식 ? true일때 값 : false일때 값)
		// 가장 작은 숫자 조건식	num3 > num1 < num2
		// 중간 숫자 조건식	num2 < num1 < num3, num3 < num1 < num2
		// 가장 큰 숫자 조건식 num3 < num1 > num2
		//5. 출력 "출력 : 조건1 조건2 조건3"
		
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.println("세 개의 정수 입력(띄어쓰기로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		int small = (num1 < num2 && num1 < num3) ? num1 : num2;
		
		System.out.println(small);
//		System.out.println(num1 < num2 && num1 < num3) ? "출력 : ");
		System.out.println("결과 : " + small);

//		  resultBig = (num01 > num02 && num01 > num03) ? num01 : num02 > num03 ? num02 :num03 ;
//	      resultMiddle = ((num01 != resultSmall) && (num01 != resultBig)) ? num01 : ((num02 != resultSmall) && (num02 != resultBig)) ? num02:num03;
//	      resultSmall = (num01 < num02 && num01 < num03) ? num01 : num02 < num03  ? num02 :num03 ;
//	               
//	     System.out.println("출력 : " + resultSmall+ " " + resultMiddle + " " + resultBig);




//		4번문제 삼항연산자를 어떻게 세워야할지 모르겠습니다..
		



		
		
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
//
		//1.String 변수 선언
		//2.출력 메시지 "문자열 입력(X를 입력하면 종료) : "
		//3.입력 메소드 sc.next();
		//4.while(조건식) => 변수 .equals사용 "X"{
		//5.입력 값 출력(변수)
		//6.출력 메시지 "문자열 입력(X를 입력하면 종료) : "
		//7.변수 sc.next();
		//}
		
//		String choice = "";
//		System.out.println("문자열 입력(X를 입력하면 종료) : ");
//		choice = sc.next();
//		while(true) {
//			System.out.println(choice);
//			System.out.println("문자열 입력(X를 입력하면 종료) : ");
//			choice = sc.next();
//			if(choice.equals("X")) {
//				break;
//			}
//		}
//		System.out.println("종료");
//		sc.close();
		
//
//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27

		//1. 변수 선언 int 1개
		//2. 출력 메시지 "단을 입력하세요 : "
		//3. 입력메소드 sc.nextInt();
		//4. for(초기식; 조건식; 증감식){
		//5. 출력
		//6.}
		
//		int num = 0;
//		System.out.println("단을 입력하세요 : 단");
//		num = sc.nextInt();
//		for(int i = 1; i <=9; i++) {
//		int	result = num * i;
//		System.out.println(num + " x " + i + " = " + result);
//		}
		
//
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ";

		//1. 변수 선언 int 4개
		//2. 출력 메시지 "msg"
      	//3. 입력 메소드 변수 = sc.nextInt();
      	//4. 출력 switch문
//		int choice = 0;
//		int money = 10000;
//		int in = 0;
//		int out = 0;
//		int bank = money += in -= out;
//		choice = sc.nextInt();
		
		//do ~ while문 사용
//		do {
//			System.out.println(msg);
//			
//		}while(choice == 1);
		
		
		
		
		
//		switch(choice) {
//		case 1:
//			System.out.println("잔액 : " + money);
//			break;
//		case 2:
//			System.out.println("입금 금액 : ");
//			in = sc.nextInt();
//			int bank1 = money += in -= out;
//			System.out.println("잔액 : " + bank1 );
//			break;
//		case 3:
//			System.out.println("출금 금액 : ");
//			out = sc.nextInt();
//			int bank2 = money += in -= out;
//			System.out.println("잔액 : " + bank2);
//			break;
//		case 4:
//			System.out.println("종료");
//			break;
//		}
		
//		System.out.println((choice == 1) ? money : msg );
//		System.out.println((choice == 2) ? money + in : msg);
//		System.out.println((choice == 3) ? money - out : msg);
//		System.out.println((choice == 4) ? "종료" : msg);
		
		

   }
}