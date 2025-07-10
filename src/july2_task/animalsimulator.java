package july2_task;

public class animalsimulator {

    public static void main( String[] args){

        Cat kitty = new Cat();

        kitty.makeSound();
        kitty.meow();



    }




}

class Animal{


    void makeSound(){

        System.out.println("Grrrrr");

    }

}


class Cat extends Animal{

    void meow(){

        System.out.println("meow meow");


    }

}


