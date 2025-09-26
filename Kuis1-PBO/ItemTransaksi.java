class ItemTransaksi {
    private Produk produk;  // Composition - ItemTransaksi memiliki 1 Produk
    private int jumlah;
    
    public ItemTransaksi(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk getProduk() {
        return produk;
    }
    
    public int getJumlah() {
        return jumlah;
    }
 
    public void setProduk(Produk produk) {
        this.produk = produk;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public double hitungSubtotal() {
        return produk.getHarga() * jumlah;
    }

    public void tampilItem() {
        System.out.printf("%-3s %-20s %2d x %8.0f = %10.0f%n", 
            produk.getKodeProduk(), 
            produk.getNamaProduk(), 
            jumlah, 
            produk.getHarga(), 
            hitungSubtotal());
    }
}
