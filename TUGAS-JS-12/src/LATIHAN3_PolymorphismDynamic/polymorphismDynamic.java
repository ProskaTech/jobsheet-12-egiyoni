package LATIHAN3_PolymorphismDynamic;

/*
 * @author 21343005_EGI YONI SANDRA
 */

class polymorphismDynamic {
    // Run | Debug
    public static void main(String[]args){
        // creating variabel of bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah : " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah : " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga MANDIRI adalah : " + B.sukuBunga());
    }
}
