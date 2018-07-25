import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        // Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        // Your code goes below here.

        boolean madeGoalForEverything = true;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        int veggiesSold = keyboard.nextInt();
        out.println();

        if(veggiesSold >= goalForVeggies) {
            out.println("Made goal for veggies.");
        } else {
            out.println("Fell short");
            madeGoalForEverything = false;
        }

        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        int burgersSold = keyboard.nextInt();
        out.println();

        if (burgersSold >= goalForBurgers) {
            out.println("Made goal for burgers.");
        } else {
            out.println("Fell short");
            madeGoalForEverything = false;
        }

        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        int subsSold = keyboard.nextInt();
        out.println();

        if (subsSold >= goalForSubs) {
            out.println("Made goal for subs.");
        } else {
            out.println("Fell short");
            madeGoalForEverything = false;
        }

        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        int soupSold = keyboard.nextInt();
        out.println();

        if (soupSold >= goalForSoup) {
            out.println("Made goal for soup.");
        } else {
            out.println("Fell short");
            madeGoalForEverything = false;
        }

        out.println();
        if (madeGoalForEverything) {
            out.println("Made goal for everything!");
        }
    }
}

