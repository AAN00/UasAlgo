// Nama : Muhammad Raysa Farhan
// Npm  : 227064516100

package nomer3;
public class pegawai {
    
    String nama, jk, noPegawai;
    boolean menikah;
    int getTunjangan(){
        if (menikah) {
            return (jk.equalsIgnoreCase("lakilaki")) ? 150000 : 200000;
        } else {
            return 100000;
        }
    }
    pegawai(String nama, String jk, String noPegawai, boolean menikah){
        this.nama = nama;
        this.jk = jk;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }
    void Show(){
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("No Pegawai: " + noPegawai);
        System.out.println("Status Menikah: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
}
class Programmer extends pegawai{
    int lama;
    double gaji;

    Programmer(String nama, String jk, String noPegawai, boolean menikah, int lama, double gaji) {
        super(nama, jk, noPegawai, menikah);
        this.lama = lama;
        this.gaji = gaji; 
        System.out.println("Lama Bekerja : " + lama);
        System.out.println("Gaji :"+ gaji);    
    }
    double getBonus(){
        if (lama < 5) {
            return gaji * 0.05;
        } else {
            return gaji * 0.010;
        }
    }
    @Override
    void Show(){
        super.Show();
    }
}