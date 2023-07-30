import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[][] = new int[3][3];
        int row = array.length, column = array[0].length; //or -> int row = 3, column = 3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element : ");

        //Inner loop to insert element
        for(int i=0; i<row; i++){
            //Outer loop
            for(int j=0; j<column; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(); //Taking new line

        //For print the element
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}