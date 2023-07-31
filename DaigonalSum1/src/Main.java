public class Main {

    //First Approach
    public static int diagonalSum(int matrix[][]){

        int sum = 0; //Variable to store value

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){

                //To calculate right to left -> 1, 6, 11, 16
                if(i == j){
                    sum += matrix[i][j];
                }
                //To calculate left to right -> 4, 7, 10, 13
                else if (i +  j == matrix[0].length-1) {
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        System.out.print(diagonalSum(matrix));
    }
}