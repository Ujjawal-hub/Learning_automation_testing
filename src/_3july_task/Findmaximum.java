package _3july_task;

public class Findmaximum {
    public static void main(String[] args) {

        utility j =new utility();

        System.out.println(j.max(2,3));
        System.out.println(j.max(2,3,4));
        System.out.println(j.max(3.3,3.5));





    }
}
class utility{

    int max(int a,int b){

        if (a>b){

            return a;

        }
        else{

            return b;
        }
    }

    int max(int e,int d,int c){

        int g = e>d && e>c ? e:(d>c?d:c)  ;

        return g;
    }
     double max(double h,double k){

        if(h>k){

            return h;
        }
        else{

            return k;

        }
     }

}