package LATIHAN2_PolymorphismStatic;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class CompileTime {
    // method keliling dengan simple argumen
    static int keliling(int a){
        return 4* a;
    }
    // method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b){
        return 2 * (l+b);
    }
}
