class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    
    public Produk(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getKodeProduk() {
        return kodeProduk;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
   
    public void tampilInfo() {
        System.out.println("Kode: " + kodeProduk + " | " + namaProduk + " | Rp " + String.format("%.0f", harga));
    }

    public String toString() {
        return kodeProduk + " - " + namaProduk + " (Rp " + String.format("%.0f", harga) + ")";
    }
}