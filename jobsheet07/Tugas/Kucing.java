package Tugas;

class Kucing extends Hewan {
    String warnaBulu;

    // Constructor tanpa parameter (overloading)
    Kucing() {
        super(); 
        this.warnaBulu = "Belum diketahui";
    }

    // Constructor berparameter (overloading)
    Kucing(String nama, int umur, String jenis, String warnaBulu) {
        super(nama, umur, jenis); // memanggil constructor parent berparameter
        this.warnaBulu = warnaBulu;
    }

    // Method overriding
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Warna Bulu : " + warnaBulu);
        System.out.println("");
    }
}
