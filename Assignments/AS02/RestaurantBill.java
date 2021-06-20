import java.util.Scanner;

/**
 * This program computes the tax and tip on a restaurant bill
 * */

public class RestaurantBill

{

    public static void main(String[] args)
    
    {

        Scanner keyboard = new Scanner(System.in);
        //Define the tax as 6.75 percent
        final double MEAL_TAX = .0675;
        //Define the tip as 20 percent (after tax)
        final double TIP = .2;

        //Ask the user to enter the charge for the meal
        System.out.print("Enter the charge for the meal: ");
        //Set user input as charge variable
        double charge = keyboard.nextDouble();
        //Calculate total for the restaurant
        double total = (TIP + 1) * ((MEAL_TAX + 1) * charge);
        System.out.println("Meal Charge: $" + charge);
        System.out.println("Tax: $" + (MEAL_TAX * charge));
        System.out.println("Tip: $" + (TIP) * (( 1 + MEAL_TAX) * charge));
        System.out.println("Total: $" + total);


    }

}
