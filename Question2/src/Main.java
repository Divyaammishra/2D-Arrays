public class Main {

    //Q. Print out the sum of the numbers in the third column of the array
    public static void main(String[] args) {

        int matrix[][] = {{12, 34, 23},
                          {30, 34, 59},
                          {54,96, 69}};

        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][2];
        }

        System.out.print("Sum of third  is : " + sum);
    }
}