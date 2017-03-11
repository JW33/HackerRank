import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String number1 = scan.nextLine();
		String number2 = scan.nextLine();
		scan.close();
		
		BigInteger firstValue;
		BigInteger secondValue;
		BigInteger sum;
		BigInteger product;
		
		firstValue = new BigInteger(number1);
		secondValue = new BigInteger(number2);
		
		sum = firstValue.add(secondValue);
		
		product = firstValue.multiply(secondValue);
		
		System.out.println(sum);
		System.out.println(product);
    }
}
