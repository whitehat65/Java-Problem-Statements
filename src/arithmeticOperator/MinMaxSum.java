package arithmeticOperator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
		Collections.sort(arr);
        
        long minSum = 0;
        long maxSum = 0;

        // Sum the first four elements for the minimum sum
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }

        // Sum the last four elements for the maximum sum
        for (int i = arr.size() - 4; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }

        // Print the results
        System.out.println(minSum + " " + maxSum);
	}
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        miniMaxSum(arr);

        bufferedReader.close();
    }
	

}
