package jobsheet04;

public public class DemoMarketplace {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Notebook", 50000);
        BukuDigital buku = new BukuDigital("Belajar Java", 75000, 200);
        KursusOnline kursus = new KursusOnline("Java OOP Masterclass", 150000, 120);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(produk1);

        // Catatan: BukuDigital & KursusOnline tidak extend Produk,
        // jadi tidak bisa langsung dimasukkan ke ArrayList<Produk>.
        // Kalau mau, bisa bikin overload method tambahProduk.

        keranjang.tampilkanProduk();
        System.out.println("Total Harga: Rp" + keranjang.hitungTotalHarga());
    }
}
