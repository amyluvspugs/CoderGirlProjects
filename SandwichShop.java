import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
	//This program allows the sandwich shop manager to check if they met their daily sales goals.
	// The manager is asked how much of each item they sold and it compares that to the sales goal set.
	// If they met their goal they are notified the goal was met otherwise they are informed they fell short of their goal.

	Scanner keyboard = new Scanner(System.in);

	//variables declared and initialized with the sales goals
		int goalForVeggies = 50;
		int goalForBurgers = 250;
		int goalForSubs = 180;
		int goalForSoup = 70;

	int salesVeggies, salesBurgers, salesSubs, salesSoup;

	out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
	out.println("How many veggies sandwiches were sold today?");

	salesVeggies = keyboard.nextInt();

	if (salesVeggies >= goalForVeggies)
  	{
         out.println("Goal Achieved for veggie sandwiches.");
    	}
    	else
    	{
         out.println("Goal was not reached for veggie sandwiches.");
    	}

    	out.println('\n');
	out.println("The sales goal for burgers is " + goalForBurgers);
	out.println("How many burgers were sold today?");

	salesBurgers = keyboard.nextInt();

	if (salesBurgers >= goalForBurgers)
	{
		out.println("Goal Achieved for burgers.");
	}
	else
	{
		out.println("Goal was not reached for burgers.");
	}

	out.println('\n');
	out.println("The sales goal for subs is " + goalForSubs);
	out.println("How many subs were sold today?");

	salesSubs = keyboard.nextInt();

	if (salesSubs >= goalForSubs)
	{
		out.println("Goal Achieved for subs.");
	}
	else
	{
		out.println("Goal was not reached for subs.");
	}

		out.println('\n');
		out.println("The sales goal for soup is " + goalForSoup);
		out.println("How many soups were sold today?");

		salesSoup = keyboard.nextInt();

	if (salesSoup >= goalForSoup)
	{
		out.println("Goal Achieved for soup.");
	}
	else
	{
		out.println("Goal was not reached for soup.");
	}

	if(salesVeggies >= goalForVeggies && salesBurgers >= goalForBurgers &&
			salesSubs >= goalForSubs && salesSoup >= goalForSoup)
	{
		out.println("Congratulations you made ALL of your sales goals!");
	}

    }
}
