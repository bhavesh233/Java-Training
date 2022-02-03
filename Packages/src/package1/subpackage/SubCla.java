package package1.subpackage;

import package1.NewClass;

import static package1.NewClass.package1Methode;

public class SubCla {

    public static void main(String[] args) {
        package1Methode();
        NewClass c1 = new NewClass();
        System.out.println(c1.i);
//        c1.pac1Method();


    }
}
