package package2;

import package1.NewClass;
import static package1.NewClass.package1Methode;

public class NewClass2 {
    public static void main(String[] args) {
        package1Methode();
        NewClass n1 =new NewClass();
        System.out.println( n1.i);
//        n1.pac1Method();

    }
}
