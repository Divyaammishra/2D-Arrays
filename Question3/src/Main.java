public class Main {

    //Q. Find the transpose of the matrix

    public static void print(int matrix[][]){
        System.out.println("The matrix is : ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int matrix[][] = {{11, 21, 31},
                          {19, 29, 39}};


        //SOLUTION

        int row = 2, column = 3;

            //Print original matrix
        print(matrix);


        int transpose[][] = new int[column][row];

        for(int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        print(transpose);
    }
}