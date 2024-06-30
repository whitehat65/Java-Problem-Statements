package infyTq;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the type of food
        System.out.println("Enter type of food (V for Vegetarian, N for Non-Vegetarian):");
        char foodType = sc.next().charAt(0);
        
        // Input the quantity
        System.out.println("Enter quantity of plates:");
        int quantity = sc.nextInt();
        
        // Input the distance
        System.out.println("Enter distance in kms:");
        int distance = sc.nextInt();
        
        // Validate inputs
        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            System.out.println("-1");
            return;
        }
        
        // Calculate cost per plate
        int costPerPlate = (foodType == 'V') ? 12 : 15;
        
        // Calculate delivery charges
        int deliveryCharge;
        if (distance <= 3) {
            deliveryCharge = 0;
        } else if (distance <= 6) {
            deliveryCharge = (distance - 3) * 1; // $1 per km for distance 4 to 6
        } else {
            deliveryCharge = 3 + (distance - 6) * 2; // $3 for first 6 kms, then $2 per km beyond that
        }
        
        // Calculate total cost
        int totalCost = (costPerPlate * quantity) + deliveryCharge;
        
        // Output the total cost
        System.out.println(totalCost);
        sc.close();
    }
}
