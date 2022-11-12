package LATIHAN1_Inheritance;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class JavaInheritance {
    // Run | debug
    public static void main(String[]args){
        // Membuat objek kendaraan roda dua
        RodaDua sepeda =  new RodaDua();
        // Membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir(); 
    }
}
