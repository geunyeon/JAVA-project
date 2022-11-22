package com.yedam.variable;

public class Exam03 {
	public static void main(String[] args) {
			
		//자동 타입 변환.
		char cVar = 'A'+1;
		int iVar = cVar;
		System.out.println(iVar);
		
		double dVar = iVar;
		System.out.println(dVar); //데이터를 가지는 범위가 점점 커짐.
	
		
		//강제 타입 변환.   ()넣기
		iVar = (int)dVar;
		System.out.println(iVar);
		
		cVar = (char)iVar;
		System.out.println(cVar);
		System.out.println();
		
		double dVar2 = 3.1444444;
		int iVar2 = (int)dVar2;
		System.out.println(iVar2);
		
		// 정수타입 자동변환
		
		byte result = 10 + 20;
		System.out.println(result);
		
		byte x = 10;
		byte y = 20;
		int result2 = x+y; // byte > int
		
		byte result3 = (byte)(x+y);  //강제타입변환 활용
		
		//데이터 타입 크기에 따른 연산
		
		//long + int = long
		//byte + int = int
		
		byte bVar = 10;
		int iVar1 = 100;
		long lVar = 1000L;
		long result4 = bVar+iVar+lVar;
		System.out.println(result4);
		
		
		
		
		
}	

}
