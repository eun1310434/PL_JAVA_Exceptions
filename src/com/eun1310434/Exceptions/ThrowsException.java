/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Exceptions;

public class ThrowsException {

	public static void ExceptionOccur() throws Exception{
		System.out.println("ExceptionOccur!!!!");
	}

	public static void a() throws Exception{
		ExceptionOccur();
	}

	public static void b() throws Exception{
		a();
	}
	
	public static void main(String[] ar) throws Exception {
		b();
	}
}
