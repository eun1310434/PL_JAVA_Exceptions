/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Exceptions;

import java.util.Scanner;

public class MakeException {
	public static void input() throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("Insert number 5 !!!!");
		
		int num = in.nextInt();
		if(num != 5){
			Exception ex = new Exception("ERROR OCCUR : It is not number 5");
			in.close();
			throw ex;
		}
		System.out.println("number = "+num);
		in.close();
	}
	
	public static void main(String[] ar) throws Exception {
		input();
	}
}


