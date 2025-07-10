package array;

public class finding_second_largest_number {
    public static void main(String[] args){

        int[] a = {98,65,99,76,56,89,520,202,120,1,6,100};

        int g = secondhighestnumber(a);

        System.out.println(g);


    }

    static int secondhighestnumber(int[] b){

        int c  = b[0];
        int d = b[0];

        for (int i=0;i<b.length;i++){

            if (c < b[i]){

                c=b[i];
            }

        }

        for (int i=0;i<b.length;i++){
            if (b[i]==c){


                continue;
            }
            if (d < b[i]){

                d=b[i];
            }

        }
        return d;



    }












}
