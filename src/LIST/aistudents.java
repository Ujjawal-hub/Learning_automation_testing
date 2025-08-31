package LIST;

import java.util.ArrayList;
import java.util.List;

public class aistudents {
    public static void main(String[] args) {
        Studentsss s1 = new Studentsss("Amit","1");
        Studentsss s2 = new Studentsss("Ritwik","2");
        Studentsss s3 = new Studentsss("Shubham","3");

        List<Studentsss> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.printDetails();
        s2.printDetails();

    }
}


class Studentsss{

    private String name;
    private String rollNo;

    public Studentsss(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }


    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }

    @Override
    public String toString() {
       return "Student{" +
               "name='" + name + '\'' +
              ", rollNo='" + rollNo + '\'' +
               '}';
   }
}
