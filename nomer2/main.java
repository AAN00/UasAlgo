//Muhammad Raysa Farhan
//227064516100
package nomer2;

public class main {

    public static void main(String[] args) {
        book buku1 = new book();
        
        buku1.setTitle("Laskar Pelangi");
        buku1.setAuthor("andrea hinata");
        buku1.setPrice("Rp.75000");
        buku1.setIsbn("979-3062-79-7");
        buku1.setYear("2005");
        
        System.out.println("title : " + buku1.getTitle());
        System.out.println("author : " + buku1.getAuthor());
        System.out.println("price : " + buku1.getPrice());
        System.out.println("isbn : " + buku1.getIsbn());
        System.out.println("year : " + buku1.getYear());
    }
}
