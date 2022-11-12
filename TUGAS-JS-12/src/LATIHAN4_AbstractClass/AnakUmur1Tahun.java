package LATIHAN4_AbstractClass;

/*
 * @author 21343005_EGI YONI SANDRA
 */

class AnakUmur1Tahun extends Orang{
    
    public void namaAyahKu(){
        System.out.println ("Nama Ayah Adalah : "+ namaAyah);
    }
    
    @Override
    public void makan(){
        System.out.println("Anak umur 1 tahun makan asi");
    }
    
    @Override
    public void minum(){
        System.out.println("Anak umur 1 tahun minum asi");
    }
}
