package infyTq;

import java.util.Scanner;

public class LeapYearProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		System.out.println(isLeapYear(year)?"Leap Year":"Not Leap Year");
	}
	public static Boolean isLeapYear(int year) {
		boolean isLeap=false;
		if(year>0) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				isLeap=true;
			}
		}
		return isLeap;
	}
}