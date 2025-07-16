package _3july_task;

public class Employee_Role_Info {
    public static void main(String[] args) {

        Employee a = new Employee();
        Employee b = new Manager();
        Employee c = new clerk();
        Employee d = new tester();

        a.role();
        b.role();
        c.role();
        d.role();


    }
}

class Employee{

    void role(){

        System.out.println("general employee");

    }


}


class Manager extends Employee{

    @Override
    void role() {
        System.out.println("i am a manager");;
    }
}


class clerk extends Employee{

    @Override
    void role() {
        System.out.println(" i am a clerk");;
    }
}


class tester extends Employee{

    @Override
    void role() {
        System.out.println(" i am a tester");;
    }
}