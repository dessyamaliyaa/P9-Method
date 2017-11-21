public class CetakSiswa1{
    public static void main(String[]args){
        Siswa1 sis = new Siswa1(12345, "Jonowati");
        System.out.println("NIS : "+sis.getNis());
        System.out.println("Nama : "+sis.getNama());
    }
}

/**
    Baris 3 : Deklarasi objek Siswa1 harus ditambahkan paramater karena pada class Siswa1 yaitu pada method constructor
    memiliki parameter dan sesuaikan tipe data pada parameternya
*/