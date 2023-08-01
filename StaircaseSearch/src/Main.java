import java.util.Scanner;

public class Main {

    public static boolean staircaseSearch(int matrix[][], int search){

        int row = matrix[0].length-1, column = 0;

        while(row<matrix.length && column>=0){
            if(matrix[row][column] == search){
                System.out.println("Element found at : " + "(" + row + "," + column + ")");
                return true;
            } else if (search > matrix[row][column]){
                column++;
            }else {
                row--;
            }
        }
        System.out.println("Element does not found");
        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        int search = scanner.nextInt();

        staircaseSearch(matrix,search);
    }
}