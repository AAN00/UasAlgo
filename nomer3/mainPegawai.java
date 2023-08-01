// Nama : Muhammad Raysa Farhan
// Npm  : 227064516100

package nomer3;

public class mainPegawai {

    public static void main(String[] args) {
       pegawai manusia1 = new pegawai("Muhammad Raysa Farhan", "Laki-Laki", "227064516100", true);
        manusia1.Show();
        System.out.println("Tunjangan : " +  manusia1.getTunjangan());
        System.out.println();
        
        pegawai manusia2 = new pegawai("Salma Salsabilla", "Perempuan", "227064516069", false);
        manusia2.Show();
        System.out.println("Tunjangan : " + manusia2.getTunjangan());
        System.out.println();
        
        Programmer programmer1= new Programmer("Farhan", "Laki Laki", "227064516100", false, 5, 5000000);
        programmer1.Show();
        System.out.println("Bonus : " + programmer1.getBonus());
         System.out.println();
         
        Programmer programmer2 = new Programmer("Salma Salsabilla", "Perempuan", "227064516069", true, 2, 5000000);
        programmer2.Show();
        System.out.println("Bonus : " + programmer2.getBonus());
         System.out.println();
         
        Programmer programmer3 = new Programmer("Farhan", "Laki Laki", "227064516100", true, 10, 5000000);
        programmer3.Show();
        System.out.println("Bonus : " + programmer3.getBonus());
         System.out.println();
        
    }
}