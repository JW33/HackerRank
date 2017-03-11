import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int length = A.length();
        int last = length - 1;
        
        char[] chars = A.toCharArray();
        
        for(int x = 0; x < length / 2; x++)
        {
        	char c = chars[x];
        	chars[x] = chars[last - x];
        	chars[last - x] = c;
        }
        String reversed = new String(chars);
        
        if(reversed.equals(A))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
        
    }
}

