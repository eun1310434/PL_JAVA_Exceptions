/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/
package com.eun1310434.Exceptions;
import java.io.IOException;
public class TryCatchFinally {
	public static void main(String[] ar) {
		
		try {
			//���� �߻� ���� ����
			System.in.read();
			
		} catch(IOException ex) {
			//���� �߻� �� ó���� ����
			ex.printStackTrace();
			
		} finally {
			//���� �߻��� ������� �׻� ó���� ����
			
		}
	}
}





