package _4julytask;

public class program2super {
    public static void main(String[] args) {

        jrcops g =new jrcops();
        g.rank();

    }
}


class cops{

    void designation(){

        System.out.println("elite cop");

    }

}


class jrcops extends cops{

      void rank(){

          super.designation();

      }


}