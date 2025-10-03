import java.util.ArrayList;

public class KeranjangBelanja {
    private ArrayList<BukuDigital> daftarBuku;
    private ArrayList<KursusOnline> daftarKursus;

    public KeranjangBelanja() {
        this.daftarBuku = new ArrayList<>();
        this.daftarKursus = new ArrayList<>();
    }

    public void tambahProduk(BukuDigital buku) {
        daftarBuku.add(buku);
    }

    public void tambahProduk(KursusOnline kursus) {
        daftarKursus.add(kursus);
    }

    public double hitungTotalHarga() {
        double total = 0;
        
        for (BukuDigital buku : daftarBuku) {
            total += buku.getHarga();
        }
        
        for (KursusOnline kursus : daftarKursus) {
            total += kursus.getHarga();
        }
        
        return total;
    }

    public void tampilKeranjang() {
        System.out.println("\n==========================================");
        System.out.println("         ISI KERANJANG BELANJA");
        System.out.println("==========================================");
        
        int totalItem = daftarBuku.size() + daftarKursus.size();
        
        if (totalItem == 0) {
            System.out.println("Keranjang masih kosong.");
        } else {
            int nomor = 1;
            
            for (BukuDigital buku : daftarBuku) {
                System.out.println("Produk " + nomor + ":");
                buku.tampilInfo();
                System.out.println("--------------------");
                nomor++;
            }

            for (KursusOnline kursus : daftarKursus) {
                System.out.println("Produk " + nomor + ":");
                kursus.tampilInfo();
                System.out.println("--------------------");
                nomor++;
            }
            
            System.out.println("TOTAL HARGA: Rp" + hitungTotalHarga());
            System.out.println("TOTAL ITEM: " + totalItem + " produk");
            System.out.println("==========================================");
        }
    }
}