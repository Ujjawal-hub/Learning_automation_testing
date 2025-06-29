package array;

public class transpose_of_the_matrix {
    public static void main(String[] args){

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("This is the matrix");

        for(int c=0;c<3;c++){
            for(int d =0;d<3;d++){
                System.out.print(a[c][d]);

            }
            System.out.println();
        }




        // {1,2,3}
        //{4,5,6}
        //{7,8,9}


        // {1 4  7}
        // {2  5  8}
        // {3  6  9}


        System.out.println();

        System.out.println("transpose of the matrix is this");

        int[][] b = new int[3][3];



        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){

                b[i][j] = a[j][i];

                System.out.print(b[i][j]);
            }

            System.out.println();

        }




    }
}
