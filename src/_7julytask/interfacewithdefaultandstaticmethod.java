package _7julytask;

public class interfacewithdefaultandstaticmethod {

    public static void main(String[] args) {
        car c =new car();
        c.start();
        vechile.fueltype();
    }
}


class car implements vechile{


}
interface vechile{

    default void start(){

        System.out.println("vechile is starting");

    }


    static void fueltype(){

        System.out.println("petrol");

    }

}