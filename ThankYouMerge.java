import java.util.Scanner;
import static java.lang.System.out;

public class ThankYouMerge {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = ("amy");
        float amount = 5;
        boolean proceed = true;

        out.println("--- THANK YOU LETTERS ---");

        while (proceed) {

            out.println("Donors name: ");
            name = keyboard.nextLine();

            if (name.equals("quit")) {
                proceed = false;
            } else {
                out.println("Donation amount: ");
                amount = keyboard.nextInt();

                out.println("Dear " + name + ",");
                out.println('\n');
                out.println("Thank you for your donation! We rely on donors like " +
                        "you to keep our organization effective, and you came through " +
                        "for us. " + '\n' + "Your donation of " + amount + " will help our efforts to make a difference in the world. " +
                        " ");
                out.println('\n');
                out.println("As you may know, we are a registered non-profit organization, so your " +
                        "donation is tax deductible. " + '\n' + "You may use this letter as a receipt for tax" +
                        "purposes.");
                out.println("Thank you again for your support!");
                out.println('\n');
                out.println("Sincerly,");
                out.println("Paula Jones");
                out.println("YourCharity.org");

                keyboard.skip("\n");
            }
        }

    }
}


