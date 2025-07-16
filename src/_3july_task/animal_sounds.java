package _3july_task;

public class animal_sounds {
    public static void main(String[] args) {


        Animal a = new Animal();
        Cat b = new Cat();
        Dog c = new Dog();
        Cow d = new Cow();

        a.sound();
        b.sound();
        c.sound();
        d.sound();


    }
}
class Animal{

    void sound(){
        System.out.println("grrr");

    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("bark");

    }


}


class Cat extends Animal{

    void sound(){

        System.out.println("meow");
    }

}


class Cow extends Animal{

    void sound(){
        System.out.println("moo");

    }

}