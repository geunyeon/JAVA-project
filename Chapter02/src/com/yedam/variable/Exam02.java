package com.yedam.variable;

public class Exam02 {
	public static void main(String[] args) {
		int var1 = 0b1011; //2진수  0b
		int var2 = 0206;   //8진수  02
		int var3 = 365;    //10진수
		int var4 = 0xb3;   //16진수 0x
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//byte -128 ~ 127
		
		byte bVal = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		int bVal4 = 500;
		
		// long
		
		long lVal = 10;
		long lVal2 = 20L;
		long lVal3 = 10000000000L;
		
		//char (유니코드)
		//문자만 넣을 수 있음.
		//문자열과 문자는 다름.
		//문자열=> 문자가 모여서 만들어 진 것.  String
		//ex) "apple"
		//문자 => 하나의 알파벳  따옴표차이!!!!!
		//ex) 'A', 'B'
		
		char cVar = 'A'; //65
		char cVar2 = '가'; 
		char cVar3 = 67; // C
		char cVar4 = 0x0041;
		
		System.out.println(cVar);
		System.out.println(cVar2);
		System.out.println(cVar3);
		System.out.println(cVar4);
		
		
		//문자열 ""
		
		String str = "홍길동";
		//char cVal5 = "홍길동";
		//String str = '홍길동';
		String str2= "프로그래머";
		System.out.println(str2);
		System.out.println(str);
		
		
		//탭만큼 띄움
		System.out.println("번호\t이름\t직업");
		//엔터
		System.out.println("행 단위 출력 \n");
		// 특수문자 존재여부확인(")
		System.out.println("우리는 \"개발자\" 입니다.");
		//특수문자 존재 여부 확인(\)
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수 타입
		//float
		float fVal = 3.14f; // dou flo 타입 구분
		//double
		double dVal = 3.14; // 주로 더블씀
		
		//e 사용하기.
		double dVal2 = 3e6;  // 3 * 10의 6승
		float fVal2 = 3e6f;  // 3 * 10의 6승
		double dVal3 = 2e-3; // 2 * 10의 -3승 => 2/1000
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		
		// 논리타입 - true false
		//if (내용~)
			
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		//함수 return
		//while(조건문
		//do ~ (조건문
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
