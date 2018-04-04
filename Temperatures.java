import static java.lang.System.out;

public class Temperatures {

    public static void main(String[] args) {

        int[][] chart = {{68, 70, 76, 70, 68, 71, 75}, {76, 76, 87, 84, 82, 75, 83}, {73, 72, 81, 78, 76, 73, 77}, {64, 65, 69, 68, 70, 74, 72}};

        String[] weekday = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int avg[] = new int[7];
        int timeavg[] = new int [4];
        int sum = 0;

        out.println("Temperature Calculator");
        out.println("The data provided are:");
        out.print("7 AM: ");

        for (int count = 0; count < 7; count++) {
            out.print(chart[0][count]);
            out.print(", ");
            sum = sum + chart[0][count];
        }
        timeavg[0] = sum/7;

        out.println('\n');
        out.print("3 PM: ");
        sum = 0;
        for (int count = 0; count < 7; count++) {
            out.print(chart[1][count]);
            out.print(", ");
            sum = sum + chart[1][count];
        }
        timeavg[1] = sum/7;

        out.println('\n');
        out.print("7 PM: ");
        sum = 0;
        for (int count = 0; count < 7; count++) {
            out.print(chart[2][count]);
            out.print(", ");
            sum = sum + chart[2][count];
        }
        timeavg[2] = sum/7;

        out.println('\n');
        out.print("3 AM: ");
        sum=0;
        for (int count = 0; count < 7; count++) {
            out.print(chart[3][count]);
            out.print(", ");
            sum = sum + chart[3][count];
        }
        timeavg[3] = sum/7;

        out.println('\n');
        out.println("Based on that data, the following are the average temperatures for the week.");
        out.println('\n');

        int overall = 0;
        // calculates and stores the daily average
        for (int day = 0; day < 7; day++) {
            //sunday [0][x]
            sum = 0;
            for (int time = 0; time < 4; time++) { //
                sum = sum + chart[time][day];
                overall = overall + chart[time][day];
            }
            avg[day] = sum / 4;
        }
        overall = overall/28;

        for(int count=0; count<7; count++){
            out.println(weekday[count] + ": " + avg[count]);
        }

        out.println('\n');
        out.println("7 AM: " + timeavg[0]);
        out.println("3 PM: " + timeavg[1]);
        out.println("7 PM: " + timeavg[2]);
        out.println("3 AM: " + timeavg[3]);
        out.println('\n');

        out.println("The final average temperature for the week was: " );
        out.println("Overall: " + overall);


    }
}
