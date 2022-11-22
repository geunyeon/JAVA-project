package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		// 학점 계산기
		// if문으로 해결 >> switch문으로 변경
		// 사용자가 입력한 점수를 토대로 학점을 출력
		// 90이상 A
		// 89~80 B
		// 79~70 C
		// 69~60 D
		// 그 외  F
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력>");
		int score = Integer.parseInt(sc.nextLine());
		
		// switch문은 부등호 못씀.
		// 예시) 98 -> A, 85 -> B
		int value = score/10;
		
		switch(value) {
		case 10 :
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;			
		default :
			System.out.println("F");
			break;
		}
		
		
		
		
		
	}
}
