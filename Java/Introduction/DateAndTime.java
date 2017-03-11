import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
        in.close();
        
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);

        System.out.println(new DateFormatSymbols().getWeekdays()[c.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    }
}
