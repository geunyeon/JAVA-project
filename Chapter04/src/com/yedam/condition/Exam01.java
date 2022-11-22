package com.yedam.condition;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
		//Math.random() -> 0 <= Math.random() < 1
		// 0* 60 <= Math.random() * 60 < 1 *60
		// 0 <= Math.random() <60
		// 0+40 <= Math.random() <100 40~99의 실수
		// 실수 -> 정수, casting
		//10239123.123 -> int -> 10239123
		int score = (int)(Math.random() * 60) + 40; 
		System.out.println(score); // score:40 ~ 99
		
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 삼항연산자
		                  // 비교조건 ?  true : false
		String pass = (score >= 60) ? "합격" : "불합격";
		System.out.println(pass);
		
		
		// 90 이상 : A
		// 90~80  : B
		//80~70   : C
		// 70 미만 : D
		
		if (score >= 90) {  // 90보다 큰 점수
			pass ="A";
		}	else {
				if (score >= 80 ) { // 80~90
					pass = "B"; 
			}	else{
					if(score >= 70) { // 70~80
						pass = "C";
				}	else {
						pass = "d"; // ~70
				}
			}
		}
		
		
		// if~else //효율 및 가독성
		
		if(score >= 90) {
			pass ="A";
		} else if(score >= 80) {
			pass ="B";
		} else if(score >= 70) {
			pass ="C";
		} else {
			pass ="D";
		}
		
		
		//if문을 활용한 예제
		// 사용자가 입력한 값이 1,2, ... 9 이면 "one" , "two" , ... "nine"
		// 과 같이 출력하는 프로그램작성, 1~9사이가 아니면 other 출력
		
		Scanner sc = new Scanner(System.in);
		//사용자가 데이터 입력
		System.out.println("숫자 입력>");
		int no =Integer.parseInt(sc.nextLine());		
		
		
		
		// 1~9 switch문
		switch (no) {    // no == 1  >> break   no =/= 1 >> 2,3,4,5... >
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("other");
			break;
		}
		
		//break문 없는 switch문
		 
		int time = (int)Math.random() * 4 + 8; // 8~11사이의 정수
		
		System.out.println("현재 시각 : " + time + "시");
		
		switch (time) {
		case 8 :
			System.out.println("출근을 합니다.");
		case 9 :
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 합니다.");
		}
		
		// 문자를 활용한 switch문 (성적 확인
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
			System.out.println("휼륭한 학생입니다.");
			break;
		case 'B' :
			System.out.println("우수한 학생입니다.");
			break;
		case 'C' :
			System.out.println("조금 노력하세요.");
			break;
		case 'D' :
			System.out.println("분발 하세요.");
			break;
		}
		
		// 문자열을 활용한 switch문 (성과급
		
		String position = "과장";
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "차장" :
			System.out.println("600만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
			break;		
		}
		
		
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if ( num == 1 ) {
//			System.out.println("one");			
//		} else if( num == 2){
//			System.out.println("two");
//		} else if (num == 3) {
//			System.out.println("three");
//		} else if (num == 4) {
//			System.out.println("four");
//		} else if (num == 5) {
//			System.out.println("five");
//		}else if (num == 6) {
//			System.out.println("six");
//		}else if (num == 7) {
//			System.out.println("seven");
//		}else if (num == 8) {
//			System.out.println("eight");
//		}else if (num == 9) {
//			System.out.println("nine");
//		} else {
//			System.out.println("other");
//		}
		
 	}	
}
