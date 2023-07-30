import java.util.Scanner;

public class Main {

    //Creating function to search our element
    public static boolean search(int array[][], int key){ //Key is, the element we want to search

        //Inner loop
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == key){
                    System.out.print("Key found at : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
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

        System.out.print("Search element : ");
        int key = sc.nextInt(); //Key is, the element we want to search

        //Calling out, our search function
        search(array, key);
    }
}