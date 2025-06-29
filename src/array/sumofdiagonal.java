package array;

public class sumofdiagonal {

    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,7},{7,8,9}};

        int sum=0;

        for(int i=0;i<a.length;i++){

            sum = sum+a[i][i];

        }
        System.out.println(sum);



    }
}
