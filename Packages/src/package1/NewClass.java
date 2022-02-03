package package1;


class secondClass{

    protected void pac1Method(){
        System.out.println("Pack 1 class");
    };
}

public class NewClass {
    public int i =10;


    public static void package1Methode(){
        System.out.println("Package 1 Class");
    }
//    protected static void package1Methode(){    // protected method can not run another package and  their sub package
//        System.out.println("Package 1 Class");
//    }

//    private static void package1Methode(){
//       System.out.println("Package 1 Class");
//    }

    public static void main(String[] args) {
        package1Methode();
        secondClass sc1 = new secondClass();
        sc1.pac1Method();

    }


}
