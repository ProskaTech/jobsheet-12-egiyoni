package LATIHAN6_Encapsulation;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class EncapsulationBuah {
    // Data members of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    
    // declaration of constructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah){
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    
    // Declaration setter for all fields 
    public void setName(String namaBuah) {
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor (String warnaBuah){
        this.warnaBuah = warnaBuah;
    }
    
    // Declaring getter for all fields
    public String getName(){
        return namaBuah;
    }
    public String getPrice(){
        return hargaBuah;
    }
    public String getColor(){
        return warnaBuah;
    }
}
