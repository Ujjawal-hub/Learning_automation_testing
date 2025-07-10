package july2_task;

//Create a class User with a method login().
//Extend it with a class AdminUser that adds a method accessAdminPanel().
//Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().

//Use an object of SuperAdmin to call all three methods.

public class Multilevel_Login_System{
    public static void main(String[] args){

        SuperAdmin tina = new SuperAdmin();

        tina.login();
        tina.accessadminpanel();
        tina.systemshutdown();



    }

}

class User{

    void login(){

        System.out.println("user login success");
    }


}
class AdminUser extends User {

    void accessadminpanel(){

        System.out.println("admin is logged in");
    }


}

class SuperAdmin extends AdminUser{


    void systemshutdown(){


        System.out.println("system shut down");
    }


}







