package Exceptions;
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





