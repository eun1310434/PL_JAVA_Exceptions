package Exceptions;
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





