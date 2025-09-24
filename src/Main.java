import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"


        System.out.println("!Important! | Do not use symbols when inputting data.");
        System.out.println("--------------------------------------------------------");
        System.out.print("Enter your bill($): ");
        double value = scan.nextDouble();
        System.out.print("Tip Percent: ");
        int tipPercent = scan.nextInt();
        System.out.print("Number of People: ");
        int numOfPeople = scan.nextInt();


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
            System.out.println("--------------------------------------------------------");
            System.out.println();
            System.out.println("Total tip amount: " + tipAmount);
            System.out.println("--------------------------------------------------------|");
            System.out.println("Total bill cost: " + billCost);
            System.out.println("--------------------------------------------------------|");
            System.out.println("Tip per person: " + tipPerPerson);
            System.out.println("--------------------------------------------------------|");
            System.out.println("Total bill per person: " + billPerPerson);
            System.out.println("--------------------------------------------------------|");


        }
        else //break
        {
            System.out.println("Number is not a valid money format OR tip percent is over 100 OR there is less than one person");
        }


    }
}



