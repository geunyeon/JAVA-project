package com.yedam.variable;

public class Exam01 {
	
	//stsic int v4;
	public static void main(String[]args) {
		int value;		
		value = 10;
		System.out.println(value);
		
		int value2 = 20;
		
		int value3;
//		int result = value3 + 10;
		
		// 변수 값 복사
		
		int x = 3;
		int y = 5;
		int temp; // 임시적으로 쓰는 변수?
		
		//데이터변경 전
		System.out.println("x : " + x + "," + "y : " + y);
		
		temp = x;   // 3 =3
		x = y;     // 5 =5
		y = temp;  // 3 =3
		
		//데이터변경 후
		System.out.println("x : " + x + "," + "y : " + y);
		
		
		int v1 = 15;
		if( v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}		
	//	int v3 = v1 +v2 + 5;
	}
//	v1 = 5;	
	}
