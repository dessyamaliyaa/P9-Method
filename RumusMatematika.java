public class RumusMatematika{
    double a, t;
    double l_segitiga;

    public static void main(String[] args){ // method static .. method main
        RumusMatematika rm = new RumusMatematika(); // deklarasi objek
        rm.luasSegitiga(); // memanggil method luasSegitiga
    } 

    void luasSegitiga(){ // method void .. method tanpa return value
        a = 7;
        t = 10;
        l_segitiga = 0.5 * 1 * t;
        System.out.println("Luas Segitiga = " + l_segitiga);
    }
}

/**
Karena luasSegitiga adalah bukan method static jadi pemanggilan methodnya harus dideklarasikan terlebih dahulu yaitu di baris 6
modifier static void pemanggilannya:
Dalam satu class, langsung tulis nama methodnya
Beda class, lakukan deklarasi objek seperti diatas
*/