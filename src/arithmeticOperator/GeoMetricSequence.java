package arithmeticOperator;

import java.util.Scanner;

public class GeoMetricSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int term=1;
		for(int i=0;i<size;i++){
			System.out.print(term);
			if(i<size-1) {
				System.out.print(",");
			}
			term*=2;
		}
	}
}