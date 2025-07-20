package _7julytask;

public class abstractcalsswithcounstrutor {

    public static void main(String[] args) {

        tyson t = new tyson();
        t.hello();


    }
}


class tyson extends abstrc{



}


abstract class abstrc {

      abstrc() {

          System.out.println("abstract construtor is called");
      }
        void hello(){

              System.out.println("hello");



      }

}