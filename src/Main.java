import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Color Codes
        String GREEN  = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE   = "\u001B[34m";
        String CYAN   = "\u001B[36m";
        String RESET  = "\u001B[0m";

        //Create a Scanner "object"
        Scanner scan = new Scanner(System.in);

        //Top Header
        System.out.println(GREEN + "════════════════════════════════════════════════════════" );
        System.out.println(GREEN + "║" + CYAN + "                   TIP CALCULATOR                     " + GREEN + "║");
        System.out.println(GREEN + "║" + CYAN + "!Important! | Do not use symbols when inputting data." + GREEN + " ║");
        System.out.println("════════════════════════════════════════════════════════");

        //Inputs
        System.out.println("\n══════════════════════════════");
        System.out.print(CYAN + "Enter your bill($): ");
        double value = scan.nextDouble();
        System.out.print("Tip Percent: ");
        int tipPercent = scan.nextInt();
        System.out.print("Number of People: ");
        int numOfPeople = scan.nextInt();
        System.out.println(GREEN + "══════════════════════════════");


        //convert our value double to a string in order to check the amnt of digits
        String valueString = Double.toString(value);
        int decimalPointIndex = valueString.indexOf('.');
        String subString =  valueString.substring(decimalPointIndex);


        //logic checks
        if(subString.length() <= 3 && tipPercent < 100 && numOfPeople >=1) //continue
        {
            double tipAmount = Math.round((value * tipPercent / 100) * 100.0) / 100.0;
            double billCost = Math.round((tipAmount + value) * 100.0) / 100.0;
            double tipPerPerson = Math.round((tipAmount / numOfPeople) * 100.0) / 100.0;
            double billPerPerson = Math.round((billCost / numOfPeople) * 100.0) / 100.0;
            System.out.println("\n" + GREEN + "╔══════════════════════════════════════════════════════╗" + RESET);
            System.out.println(GREEN + "║  " + BLUE + "Total tip amount: " + YELLOW + "$" + tipAmount + RESET);
            System.out.println(GREEN + "║══════════════════════════════════════════════════════" + RESET);
            System.out.println(GREEN + "║  " + BLUE + "Total bill cost: " + YELLOW + "$" + billCost + RESET);
            System.out.println(GREEN + "║══════════════════════════════════════════════════════" + RESET);
            System.out.println(GREEN + "║  " + BLUE + "Tip per person: " + YELLOW + "$" + tipPerPerson + RESET);
            System.out.println(GREEN + "║══════════════════════════════════════════════════════" + RESET);
            System.out.println(GREEN + "║  " + BLUE + "Total bill per person: " + YELLOW + "$" + billPerPerson + RESET);
            System.out.println(GREEN + "╚══════════════════════════════════════════════════════╝" + RESET);
        }
        else //break
        {
            System.out.println("Number is not a valid money format OR tip percent is over 100 OR there is less than one person.");
            System.out.println("Please try again with valid arguments.");
        }
    }
}