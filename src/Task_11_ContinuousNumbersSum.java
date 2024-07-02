import java.util.Scanner;

public class Task_11_ContinuousNumbersSum {
    public static void main(String[] args) {
        /*
        * Task 11:
        * Write a program that will take integer numbers as user input continuously and print the sum of numbers until user input q from the keyboard. When user input q, the program will be quit. If the user inputs another character, then the program will ask to input the number again.
        * */
        try {
            Scanner input = new Scanner(System.in);
            String number;
            int sum = 0;
            while(true)
            {
                System.out.print("Enter a number or 'q' to quit: ");
                number = input.nextLine();
                if(number.equalsIgnoreCase("q"))
                {
                    break;
                }
                try {
                    sum = sum + Integer.parseInt(number);
                }catch (NumberFormatException e) {
                    System.out.println("Not a valid number");
                }
                System.out.println("The sum of the numbers: "+sum);

            }
            System.out.println("The final sum of the numbers: "+sum);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
