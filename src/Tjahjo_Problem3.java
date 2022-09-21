import java.util.*;
public class Tjahjo_Problem3 {
    public static void main(String[] args) {
        int arraysize = 10;
        Random Rand = new Random();
        int[] newArray = new int[arraysize];
        for(int i = 0; i < 10; i++){     //inserts random values into the array to check for multiple cases. For loop used because loop runs based on array size
            newArray[i] = Rand.nextInt(100);
        }
        System.out.println("Original Array"); //prints original array
        for(int i = 0; i < 10; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        int tempval;
        while(arraysize > 0){
            for(int p = 0; p < arraysize-1; p++){ // reverses array. The loop takes the p value and swaps the value with the value in front of it until it reaches the end of the array
                tempval = newArray[p];
                newArray[p] = newArray[p+1];
                newArray[p+1] = tempval;
            }
            arraysize--;
        }
        System.out.println("reversed array"); //prints reversed array
        for(int i = 0; i < 10; i++){
            System.out.print(newArray[i] + " ");
        }

    }
}
