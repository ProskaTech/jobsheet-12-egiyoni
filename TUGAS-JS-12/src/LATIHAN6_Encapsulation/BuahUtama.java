package LATIHAN6_Encapsulation;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */
public class BuahUtama {
    // Run | Debug
    public static void main(String[]args){
        // menggunakan counstructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel","Rp.3000","Merah");
        
        //menggunakan getter ke nilai
        System.out.println("Nama Buah:" + Apel.getName()+"\nHarga"+Apel.getPrice()+"\nWarna: "+Apel.getColor());
                
        // update harga dan warna menggunakan setter
        Apel.setColor("hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait apel setelah di update");
        
        // menggunakan setter untuk mendapatkan nilai
        System.out.println("nama buah: "+ Apel.getName()+"\nHarga: "+Apel.getPrice()+"\nWarna: "+Apel.getColor());
    }
}
