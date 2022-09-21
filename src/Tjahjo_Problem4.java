import java.util.*;
public class Tjahjo_Problem4 {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        Random rand = new Random();
        int secondlargeNumber = 0;
        int secondsmall;
        int column = 0;
        int row = 0;

boolean isnumber = true;
        while(isnumber) {  // while loop for try catch to make sure user enters an integer
            try {
                System.out.println("Enter amount of rows (if a single array please enter 0 and press enter)"); // ask user to input number of rows and columns so that the program would work with single and multidimensional arrays
                column = scrn.nextInt();
                isnumber = false;
                if (column == 0) {
                    column = 1;
                }

            } catch (Exception e) {
                scrn.nextLine();
                System.out.println("not an integer try again");

            }

        }
        isnumber = true;
        while(isnumber) { // while loop for try catch to make sure user enters an integer
            try {
                System.out.println("Enter the amount of column (if single array please input size of array)");
                row = scrn.nextInt();
                isnumber = false;
                if (row == 0) {
                    row = 1;
                }

            } catch (Exception e) {
                scrn.nextLine();
                System.out.println("Not an Integer try again");
            }
        }
        int[][] arrays = new int[column][row];   // inputs random values into the array
        for(int i = 0; i < column; i++)  {
            for(int p = 0; p < row; p++){
                arrays[i][p] =rand.nextInt(10, 100);
            }
        }
        for(int i = 0; i < column; i++){ // prints the array
            for(int p = 0; p < row; p++){
                System.out.print("| " + arrays[i][p] + " |");
            }
            System.out.println("");
        }

        int[] linearsearch = new int[column * row]; // new array for sorted array
        int a = 0; // counter to check what element the sorted array is on

        for(int i = 0; i < column; i++){ // takes all the values from the multidimensional array and inserts them into a single array
            for(int p = 0; p < row; p++){
                linearsearch[a] = arrays[i][p];
                a++;
            }

        }

        for (int i = 1; i < linearsearch.length; ++i) { //this is insertion sort for linear search sorting from smallest to largest
            int currentindex = linearsearch[i];
            int previousindex = i - 1;

            while (previousindex >= 0 && linearsearch[previousindex] > currentindex) { //used a while loop because previous index is initialized beforehand.
                linearsearch[previousindex + 1] = linearsearch[previousindex];
                previousindex = previousindex - 1;
            }
            linearsearch[previousindex + 1] = currentindex;
        }

        secondlargeNumber = linearsearch[linearsearch.length -2]; //assigns the second smallest and largest from the sorted array to variables
        secondsmall = linearsearch[1];


        System.out.println("second largest: " + secondlargeNumber); //prints the output
        System.out.println("second smallest: " + secondsmall);


    }
}
