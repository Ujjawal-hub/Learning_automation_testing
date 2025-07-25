package thro;

import java.util.Scanner;

public class Throw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");

        try {
            int age = sc.nextInt();
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void validateAge(int age) throws Exception {
        if(age < 18){
            throw new Exception("You are a minor, Can't go to GOA!");
        }
    }

}


