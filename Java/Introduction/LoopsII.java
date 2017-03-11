import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int number = Integer.parseInt(input);
		
		String[] myArray = null;
		String tempVal = scan.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x < number; x++)
		{
			try
			{
				tempVal = scan.nextLine();
				
				myArray = tempVal.split(" ");
				
				int last = myArray.length - 1;
				int firstNumber = Integer.parseInt(myArray[0]);
				int secondNumber = Integer.parseInt(myArray[1]);
				
				int loopValue = Integer.parseInt(myArray[last]);
				
				int printAnswer = 0;
				
				for(int y = 0; y < loopValue; y++)
				{
					printAnswer = printAnswer + (int)Math.pow(2, y) * secondNumber;
					if (y == 0)
					{
						printAnswer += firstNumber;
					}
					sb.append(printAnswer + " ");
				}
				System.out.println(sb.toString().trim());
                sb.setLength(0);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		scan.close();		
    }
}
