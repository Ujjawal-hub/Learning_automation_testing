package july2_task;

public class Vechile_construtor_plan {

    public static void main(String[] args) {


//Create a class Vehicle with a constructor that prints "Vehicle is ready".
//Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor.
// Create an object of Bike in the main method and observe constructor call order.
        Bike B = new Bike();

    }
}


class Vechile {

    Vechile() {
        System.out.println("vechle is ready");


    }
}


class Bike extends Vechile{


        Bike(){

            System.out.println("bike is ready");


        }
}


