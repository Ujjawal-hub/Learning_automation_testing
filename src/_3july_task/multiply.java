package _3july_task;

public class multiply {
    public static void main(String[] args) {


        Mathoperations hello = new Mathoperations();
        int c= hello.Multiply(2,3,4);
        int a = hello.Multiply(2,3);

        System.out.println(c);
        System.out.println(a);
    }
}
class  Mathoperations {


    int Multiply(int a,int b){

        return a*b;
    }

    int Multiply(int d,int e,int f){

        return d*e*f;
    }


}