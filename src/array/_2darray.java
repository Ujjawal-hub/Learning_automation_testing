package array;

public class _2darray {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9
        int[][] array_2d_old = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 10,20
        // 30,40
        // 50,60

        int[][] array;
        array = new int[][]{
                {10, 20},
                {30, 40},
                {50, 60}


        };


        int[][] _3a = new int[][]{

                {1,2},
                {3,4}
        };

        System.out.println(array[0][1]);
        System.out.println(_3a[0][0]);

    }
}
