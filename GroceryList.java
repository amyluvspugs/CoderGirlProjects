import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {
    //Program asks user for three grocery items along with quantity desired and cost per item.
    // It calculates total cost and displays to user.

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String item1, item2, item3;  //variables for grocery items
        int qty1, qty2, qty3;  //variables for quantity of items
        float cost1, cost2, cost3; //variables for cost of items
        float totalCost;   //variable for calculating the total cost of items


        out.println("What is the first item on your grocery list? ");
        item1 = keyboard.nextLine();
        out.println("How many " + item1 + "  do you want?");
        qty1 = keyboard.nextInt();
        out.println("How much does " + item1 + " cost?");
        cost1 = keyboard.nextFloat();
        keyboard.skip("\n");

        out.println("What is the second item on your grocery list?");
        item2 = keyboard.nextLine();
        out.println("How many " + item2 + " do you want?");
        qty2 = keyboard.nextInt();
        out.println("How much does " + item2 + " cost?");
        cost2 = keyboard.nextFloat();
        keyboard.skip("\n");

        out.println("What is the third item on your grocery list?");
        item3 = keyboard.nextLine();
        out.println("How many " + item3 + " do you want?");
        qty3 = keyboard.nextInt();
        out.println("How much does " + item3 + " cost?");
        cost3 = keyboard.nextFloat();

        totalCost = (qty1 * cost1) + (qty2 * cost2) + (qty3 * cost3);  //calculating total cost of all items

        out.println("The total for your items is " + totalCost + ".");


    }
}
