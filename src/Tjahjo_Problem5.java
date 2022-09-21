public class Tjahjo_Problem5 {
    public static void main(String[] args) {
        int[][] twoDarray = {{5,6,7}, // hardcoded array
                             {4,2,1},
                             {1,2,3}};
        for(int i = 0; i < 3; i++){  // prints original array
            for(int p = 0; p < 3; p++){
                System.out.print("| " + twoDarray[i][p] + " |");
            }
            System.out.println("");
        }
        int[][] duplicate = twoDarray; // duplicates the array

        for (int i = 0; i < 3; i++) { // uses two for loops for each index of the 2d array
            for (int j = i + 1; j < 3; j++) {
                int temp = twoDarray[i][j]; // takes the temporary the value at the index and puts it into and temp val
                twoDarray[i][j] = twoDarray[j][i]; // swaps the position of the value to a switched position
                twoDarray[j][i] = temp; // replaces the original position with the swapped value;
            }
        }
        System.out.println();
        for(int i = 0; i < 3; i++){ // uses two for loops for each index of the 2d array
            for(int p = 0; p < 3; p++){
                System.out.print("| " + twoDarray[i][p] + " |");
            }
            System.out.println("");
        }

    }
}
