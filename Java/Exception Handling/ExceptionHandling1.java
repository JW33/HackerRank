import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int first = scan.nextInt();
			int second = scan.nextInt();
			System.out.println(first / second);
		} catch(InputMismatchException ime)
		{
			System.out.println("java.util.InputMismatchException");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
    }
}
