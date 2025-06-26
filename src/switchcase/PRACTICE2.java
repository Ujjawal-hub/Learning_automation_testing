package switchcase;

import javax.management.MBeanAttributeInfo;

public class PRACTICE2  {

    public static void main(String[] args) {

        long a = 2l;

        switch((short)a){

            case 65 :
                System.out.println("this is case 65");
                break;
            case 2:
                System.out.printf("tis is case 2");
                 break;
            default:
                System.out.println("this is monday");
        }
    }
}
