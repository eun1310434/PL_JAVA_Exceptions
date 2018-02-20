/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/
package com.eun1310434.Exceptions;
import java.util.Scanner;
public class TryCatchFinally1 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);

		int x = 0, y = 0, tot = 0;
		boolean bool = false;
		
		do {
			bool = false;
			System.out.print("X = ");
			try {
				x = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("X : You have to insert number");
				bool = true;
			}
		} while(bool);
		
		do {
			bool = false;
			System.out.print("Y = ");
			try {
				y = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Y : You have to insert number");
				bool = true;
			}
		} while(bool);
		
		
		
		try {
			tot = x / y;
		} catch (ArithmeticException ex) {
			System.out.println("Y is 0...this is ArithmeticException...");
			tot = -1;
		} finally {
			System.out.printf("%d / %d = %d", x, y, tot);
		}
		
		in.close();
	}
}


