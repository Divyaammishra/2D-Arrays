public class Main {

    //Q. Print the number of 50’s that are in the 2d array
    public static void main(String[] args) {

        int matrix[][] = {{25, 50, 100},
                          {125, 50, 200}};

        int count = 0; 

        //Inner loop
        for(int i=0; i<matrix.length; i++){
            //Outer loop
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 50){
                    count++;
                }
            }
        }
        System.out.print(count + " 50's are present in the given matrix");
    }
}