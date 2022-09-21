import java.util.Scanner;

public class Tjahjo_Problem1 {
    public static void main(String[] args) {
        int number = 0;
        Scanner scrn = new Scanner(System.in);
        boolean isnumber = true;

        while(isnumber) {  // while loop to keep asking the user to enter an Integer
            try { // try catch to make sure the user enters an integer
                System.out.println("Enter an Integer: ");
                number = scrn.nextInt();
                isnumber = false;

            } catch (Exception e) { //prints the exception and ask user to try again
                scrn.nextLine();
                System.out.println("Error: " + e + "please try again");

            }
        }

        if(number < 0){ // * -1 in case if the number is negative
            number*=-1;
        }

        int length = (int)(Math.log10(number) + 1); // uses the log formula of log based 10 of the number and rounds down then adds 1 to round up
        System.out.println(length); // prints out the length
    }
}
