package if_else_practice;

import java.util.Scanner;

public class gradationsystem {

    public static void main(String[] args){
        System.out.println("enetr your marks");

        Scanner marks = new Scanner(System.in);
        int thismarks = marks.nextInt();

        String a = thismarks>=90?"you got A":(thismarks>=80?"you got B":(thismarks>=70?"you got C":(thismarks>=60?"you got D":"you got F")));
        System.out.print(a);

    }
}
