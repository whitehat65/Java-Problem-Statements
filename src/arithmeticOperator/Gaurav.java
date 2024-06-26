package arithmeticOperator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Gaurav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println(input1);
		List<Integer> numbers = Arrays.stream(input1.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
		Map<String,Integer> numMap=new HashMap<>();
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i)+" ");
		}
		for(int i=0;i<numbers.size();i++) {
			numMap.put("num"+(i+1), numbers.get(i));
		}
		for (int i = 1; i <= numbers.size(); i++) {
            System.out.println("num" + i + ": " + numMap.get("num" + i));
        }
		System.out.println(numMap.get("num5"));
		
	}
}