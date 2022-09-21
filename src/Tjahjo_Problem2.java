public class Tjahjo_Problem2 {
    public static void main(String[] args) {
        int[][] matrix1 = { //declaring matrix 1
                { 20, 25, 18 },
                { 10, 23, 15 },
                { 12, 23, 45 }
        };
        int[][] matrix2 = { // declaring matrix 2
                { 52, 12, 6 },
                { 12, 78, 2 },
                { 10, 12, 98 }
        };

        int[][] diffrence = new int[3][3]; // creates a new array to for the diffrence between the two martrixes
        for (int i = 0; i < 3; i++) {  // nested for loops for each element of the array
            for (int j = 0; j < 3; j++) {
                diffrence[i][j] = matrix1[i][j] - matrix2[i][j]; // subtracts the two values and inserts them into the diffrence array
            }
        }
        for (int i = 0; i < 3; i++) { // for loops to print the diffrence array
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(diffrence[i][j] + " ");
            }
        }

    }
}
