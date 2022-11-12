package LATIHAN2_PolymorphismStatic;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class polymorphismstatic {
    // Run | Debug
    public static void main(String[]args){
        // Memanggil metode perimeter denga satu argumen
        System.out.println("Sisi Persegi Adalah : 4\nKeliling Persegi adalah : " + CompileTime.keliling(4) + "\n");
        // memanggil metode perimeter dengan dua argumen
        System.out.println("Sisi Persegi panjang Adalah : 10, 13\nKeliling Persegi panjang adalah : " + CompileTime.keliling(10, 13));
    }
}