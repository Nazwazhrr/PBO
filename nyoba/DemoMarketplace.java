public class DemoMarketplace {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("    MARKETPLACE INTERNAL POLINEMA");
        System.out.println("==========================================");

        BukuDigital buku1 = new BukuDigital("Pemrograman Web", 150000, 250);
        BukuDigital buku2 = new BukuDigital("Algoritma dan Struktur Data", 200000, 350);
        
        KursusOnline kursus1 = new KursusOnline("Kursus Excel", 750000, 480);
        KursusOnline kursus2 = new KursusOnline("Machine Learning", 900000, 360);

        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(buku2);
        keranjang.tambahProduk(kursus1);
        keranjang.tambahProduk(kursus2);

        keranjang.tampilKeranjang();

        System.out.println("\n==========================================");
        System.out.println("        TERIMA KASIH!");
        System.out.println("==========================================");
    }
}