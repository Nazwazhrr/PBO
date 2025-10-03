public class BukuDigital {
    private String namaProduk;
    private double harga;
    private int jumlahHalaman;

    public BukuDigital(String namaProduk, double harga, int jumlahHalaman) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void tampilInfo() {
        System.out.println("Nama Buku   : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }
}
