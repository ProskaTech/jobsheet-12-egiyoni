package LATIHAN1_Inheritance;

/*
 * @author 21343005_EGI YONI SANDRA
 */

class RodaDua extends Kendaraan {
    double NaikHargaKe = 0.20; // 0.2 kali
    void hargaAkhir()
    {
        hargaDasar =hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah selesai di modifikasi, harga sepeda menjadi Rp." + hargaDasar);
    }
}
