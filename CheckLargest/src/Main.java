import java.util.Scanner;

public class Main {

    //Creating function to get large number
    public static int getLargest(int array[][]){

        int largest = Integer.MIN_VALUE; // To get smaller number, use MAX_VALUE & change

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(largest < array[i][j]){ // > operator instead to get small number
                    largest = array[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[][] = new int[3][3];
        int row = array.length, column = array[0].length; //or -> int row = 3, column = 3;

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

        System.out.println();

        //Calling out the function to get the largest element
        System.out.print("Largest number in given array is : "  + getLargest(array));
    }
}