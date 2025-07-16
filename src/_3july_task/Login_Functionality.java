package _3july_task;

public class Login_Functionality {

    public static void main(String [] args) {
User a = new User();
User b =  new Adminuser();
User c = new Regularuser();

a.login();
b.login();
c.login();
    }
}
 class User{

    void login(){

        System.out.println("user login");
    }

 }


 class Adminuser extends User{

     @Override
     void login() {
         System.out.println("admin login");;
     }
 }

 class Regularuser extends User{

     @Override
     void login() {
         System.out.println("regular user login ");;
     }
 }