package arithmeticOperator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		List<Integer> numbers = Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
		int n1 = numbers.get(0);
        int n2 =  numbers.get(1);
        int sum=Utility.addNumbers(n1, n2);
        int diff=Utility.subtractNumbers(n1, n2);
        int product=Utility.multiplyNumbers(n1, n2);
        int quotient=Utility.divideNumbers(n1, n2);
        System.out.println(sum+" "+diff+" "+product+" "+quotient);
        sc.close();
	}
}