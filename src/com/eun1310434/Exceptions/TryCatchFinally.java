/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Exceptions;
import java.io.IOException;
public class TryCatchFinally {
	public static void main(String[] ar) {
		
		try {
			//예외 발생 예상 영역
			System.in.read();
			
		} catch(IOException ex) {
			//예외 발생 시 처리할 내용
			ex.printStackTrace();
			
		} finally {
			//예외 발생에 관계없이 항상 처리할 내용
			
		}
	}
}





