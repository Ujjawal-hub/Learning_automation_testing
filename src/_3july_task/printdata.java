package _3july_task;

public class printdata {

    public static void main(String[] args) {


        Print g = new Print();

        g.Printdata("hello");
        g.Printdata(2);
        g.Printdata(9.9f);

    }

}
class Print{


    void Printdata(String a){

        System.out.println(a);
    } void Printdata(int b){

        System.out.println(b);
    } void Printdata(float c){

        System.out.println(c);
    }


}