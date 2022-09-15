package c.exceptions;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UncheckedExceptionsExamples {

	public static void main(String[] args) {
		
		try {
			
			Object obj = "aaa";
			Scanner sc = (Scanner) obj;
			
			String number = JOptionPane.showInputDialog("enter number");
			int x = Integer.parseInt(number);
			
			int[] arr2 = new int[10];
			arr2[10] = 5;
			
			int[] arr = new int[-3];
			
			String str = "aaa";
			System.out.println(str.length());
			str = null;
			System.out.println(str.length());
			
			System.out.println(5/0D);
			System.out.println(5/0); // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
			System.out.println(e);
		}catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException");
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
			System.out.println(e);
		}catch (ClassCastException e) {
			System.out.println("ClassCastException");
			System.out.println(e);
		}
		System.out.println("END");
	}

}
