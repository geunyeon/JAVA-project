package com.yedam.operator;

public class Exam01 {
	public static void main(String[] args) {
		// 부호 연산자 +,-
		int x = -100;
		int result1 = -x; // 100
		int result2 = +x; // -100
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		byte b = 100;
		// byte result3 = -b;
		
		int result3 = -b;
		
		//증감연산자 ++, --
		//위치에 따라 연산 타이밍이 다름.
		int value = 100;
		
		//출력문이 실행되고 나서 value값 1증가
		System.out.println(value++);   // 100 > 101 >> 100
		
		//출력문이 실행되기 전 value값 1 증가
		System.out.println(++value); //101 > +1 >> 102
		
		
		//논리 부정 연산자(not)
		// true + not(!) =flase
		// flase + not(!) = true
		boolean flag = true;
		
		if(!flag) {
			System.out.println("flase");
		}
		if(!flag) {
			System.out.println("true");
		}
		
		//이항 연산자(사칙연산자)
		int v1 = 10;
		int v2 = 4;
		
		System.out.println(v1+v2); // +
		
		System.out.println(v1-v2); // -
		
		System.out.println(v1*v2); // *
		
		
		//나누기가 2개 존재
		
		System.out.println("/ :" + v1/v2); // / : 몫
		System.out.println("% :" + v1%v2); // % : 나머지
		
		// 문자열 결합 연산자(+)
		System.out.println("자바"+ "jdk" + "11버전");
		
		// 비교 연산자
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2); //true
		System.out.println(num1 != num2); //false
		System.out.println(num1 >= num2); //true
		
		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		
		System.out.println(char1<char2); // true
		
		// 문자열 비교는 == 아니고 문자열. equals(비교대상)
		
		//논리 연산자 ==> && <-> & , || <-> |
		// &&  => 단 하나의 조건이 F => F   (F && T && F && T )
		// 0 * 1 => 0                   (0  * 1  * 0  * 1 )
		
		// || => 단 하나의 조건이 T => T (F || T || F || T)
		// 0 +1 => 1이상              (0 +  1 +  0 +  1)
		
		
		int charCode = 'A';
		// 'A'~'Z'
		if (charCode>=65 && charCode<=90) {
			System.out.println("참이면 대문자.");
		}
		
		// 48~57
		// charCode >=48 charCode<=57
		// !< == >=  !> == <=
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("참이면 0~9 숫자.");
		}
		
		
		int value2 = 6;
		// 2 4 6 8 10 12 14 16 18 20 
		if(value2%2 ==0 || value2%3==0) {
			System.out.println("참이면 2 또는 3의배수");
		}
		
		//대입 연산자 = , += ,  -= , .....?
		
		int result5 = 0;
		
		result5 += 1; // resurlt5 = result5 +1
		
		result5 -= 1;
		result5 *= 3;
		result5 /= 10;
		System.out.println(result5);
		
		// 삼항 연산자
		
		int score = 85;
		
		char grade = (score>90) ? 'A' : 'B';   // 3개의 항을 활용해서 쓰는 연산자| ()조건이 참이냐 거짓이냐에따라 a[true] or b[false] 
		
		
		char grade2;
		if(score > 90) {
			grade2 = 'A';
		} else {
			grade2 = 'B';
		}
		
		char grade3 = (score>90) ? 'A' : (score > 80) ? 'B' : 'C';   
		System.out.println(grade3);
		System.out.println(grade2);
		System.out.println(grade);
		
	}
}
