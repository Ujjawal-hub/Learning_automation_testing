package _7julytask;

public class abstractclass1 {
    public static void main(String[] args){

        dog d = new dog();
        cat c = new cat();

        d.makesound();
        c.makesound();



    }


}


class dog extends Animal{

    void makesound(){

        System.out.println("bark");

    }



}

class cat extends Animal{

    void makesound(){

        System.out.println("mewo");

    }


}




abstract class Animal{

    abstract void makesound();


}



