import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		int numberConverted = Integer.parseInt(number);
		
		String doubler = scan.nextLine();
		double doublerConverted = Double.parseDouble(doubler);
		String contents = scan.nextLine();
		
		System.out.println("String: " + contents);
		System.out.println("Double: " + doublerConverted);
		System.out.println("Int: " + numberConverted);
		scan.close();
    }
}
