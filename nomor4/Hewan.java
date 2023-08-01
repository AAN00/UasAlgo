//Muhammad Raysa Farhan
//227064516100
package nomor4;

abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void jenis();
}

 class Harimau extends Hewan {
    public Harimau(String nama) {
        super(nama);
    }

    public void jenis() {
        System.out.println("Harimau :Karnivora");
    }
}

 class Kelinci extends Hewan {
    public Kelinci(String nama) {
        super(nama);
    }

    public void jenis() {
        System.out.println("Kelinci : Herbivora");
    }
}

