package LATIHAN5_AbstractionInterface;

/*
 * @author 21343005_EGI YONI SANDRA
 */

class AktivitasPagiAnak implements AktivitasPagi{
    
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }
    
    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
