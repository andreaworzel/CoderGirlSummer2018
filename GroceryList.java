import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        String item1 = keyboard.nextLine();
        out.println();
        out.print("Item 2? ");
        String item2 = keyboard.nextLine();
        out.println();
        out.print("Item 3? ");
        String item3 = keyboard.nextLine();
        out.println();
        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + item1 + "? ");
        int item1Quantity = keyboard.nextInt();
        out.println();
        out.print("How many " + item2 + "? ");
        int item2Quantity = keyboard.nextInt();
        out.println();
        out.print("How many " + item3 + "? ");
        int item3Quantity = keyboard.nextInt();
        out.println();
        out.println("Now, please enter the price of each item.");
        out.print("How much does one " + item1 + " cost? ");
        float item1Cost = keyboard.nextFloat();
        out.println();
        out.print("How much does one " + item2 + " cost? ");
        float item2Cost = keyboard.nextFloat();
        out.println();
        out.print("How much does one " + item3 + " cost? ");
        float item3Cost = keyboard.nextFloat();
        out.println();
        out.println("Calculating your grocery bill.");
        float totalCostOf1 = item1Quantity * item1Cost;
        float totalCostOf2 = item2Quantity * item2Cost;
        float totalCostOf3 = item3Quantity * item3Cost;
        float totalGroceryCost = totalCostOf1 + totalCostOf2 + totalCostOf3;
        out.print("Your total cost is $" + totalGroceryCost);
    }
}
