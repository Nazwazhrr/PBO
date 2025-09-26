public class DemoKasir {
    public static void main(String[] args) {
        System.out.println("=== SISTEM KASIR KANTIN KAMPUS POLINEMA ===\n");
   
        Produk produk1 = new Produk("P001", "Nasi Gudeg", 12000);
        Produk produk2 = new Produk("P002", "Es Teh Manis", 3000);
        Produk produk3 = new Produk("P003", "Ayam Penyet", 15000);
        Produk produk4 = new Produk("P004", "Jus Alpukat", 8000);
        Produk produk5 = new Produk("P005", "Mie Ayam", 10000);

        System.out.println(">>> DAFTAR PRODUK TERSEDIA <<<");
        produk1.tampilInfo();
        produk2.tampilInfo();
        produk3.tampilInfo();
        produk4.tampilInfo();
        produk5.tampilInfo();

        System.out.println("\n" + "=".repeat(55));

        System.out.println("\n>>> TRANSAKSI PERTAMA <<<");
        Transaksi transaksi1 = new Transaksi();
        transaksi1.tambahItem(produk1, 2);
        transaksi1.tambahItem(produk2, 3);
        transaksi1.tambahItem(produk3, 1);
        transaksi1.tambahItem(produk4, 2);

        transaksi1.tambahItem(produk1, 1);

        transaksi1.tampilRingkasan();
        transaksi1.tampilNota();

        System.out.println("\n" + "=".repeat(55));

        System.out.println("\n>>> TRANSAKSI KEDUA <<<");
        Transaksi transaksi2 = new Transaksi("27-09-2025 14:30:00");
        transaksi2.tambahItem(produk5, 2);
        transaksi2.tambahItem(produk2, 1);

        transaksi2.tampilRingkasan();
        transaksi2.tampilNota();

    }
}
