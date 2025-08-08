package _9julytask;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checkedexception {
    public static void main(String[] args) {


try {


    FileReader jk = new FileReader("C:\\");

}

catch(FileNotFoundException e){
    System.out.println(e.getMessage());

    
}

    }
}
