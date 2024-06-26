package arrayExamples;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int[] ascendingArray=ascendingSort(arr);
		for(int i=0;i<ascendingArray.length;i++) {
			System.out.print(ascendingArray[i]+" ");
		}
		
		sc.close();
	}
	
	public static int[] ascendingSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static int[] ascendingSort(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			int minIndex=i;
//			System.out.println("Start iteration " + (i + 1) + ", initial minIndex: " + minIndex + " (value: " + arr[minIndex] + ")");
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[minIndex] > arr[j]) {
//                    System.out.println("Found new minimum at index " + j + " (value: " + arr[j] + "), previous minimum was at index " + minIndex + " (value: " + arr[minIndex] + ")");
//                    minIndex = j;
//                }
//            }
//            // Swap the found minimum element with the first element
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//            System.out.println("Swapped elements at index " + i + " and " + minIndex + ": " + arr[i] + " <--> " + arr[minIndex]);
//        }            
//        return arr;
//	}
	
}
