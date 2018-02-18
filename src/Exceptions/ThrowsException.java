package Exceptions;

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
