package arithmeticOperator;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String time=sc.next();
		System.out.println(timeConversion(time));
		sc.close();
	}
	public static String timeConversion(String s) {
		String period=s.substring(s.length()-2);
		int hour = Integer.parseInt(s.substring(0,2));
		String minute=s.substring(3, 5);
		String second=s.substring(6,8);
//		System.out.println(hour+" "+minute+" "+second);
		if(period.equals("AM")) {
			if(hour==12) {
				hour=0;
			}
		}else {
			if(hour!=12) {
				hour+=12;
			}
		}
		String hour24=hour+":"+minute+":"+second;
		return hour24;
	}

}
