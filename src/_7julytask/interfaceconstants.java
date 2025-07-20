package _7julytask;

public class interfaceconstants {

    public static void main(String[] args) {

        CARS c = new CARS();
        c.speed();
    }



}
interface speedlimit{

    int maxspeed =120;
}


class CARS implements speedlimit{

    void speed(){

        System.out.println("max speed is" + maxspeed);

    }


}