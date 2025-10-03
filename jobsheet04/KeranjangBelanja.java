import java.util.ArrayList;

public class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public void tampilkanProduk() {
        for (Produk p : daftarProduk) {
            p.tampilInfo();
            System.out.println("--------------------");
        }
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHarga();
        }
        return total;
    }
}
