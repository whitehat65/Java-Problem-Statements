package numberProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		List<Integer> numbers=Arrays.stream(input.split(","))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int n1=numbers.get(0);
		int n2=numbers.get(1);
		int[] result = withoutUsingThirdVariable(n1, n2);
		int[] result1 = usingThirdVariable(n1, n2);
	    System.out.println("without Using Third Variable n1 = " + result[0] + ", n2 = " + result[1]);
	    System.out.println("Using Third Variable n1 = " + result[0] + ", n2 = " + result[1]);
	}
	public static int[] withoutUsingThirdVariable(int n1,int n2) {
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		return new int[]{n1, n2};
	}
	public static int[] usingThirdVariable(int n1,int n2) {
		int temp=n1;
		n1=n2;
		n2=temp;
		return new int[] {n1,n2};
	}
}
