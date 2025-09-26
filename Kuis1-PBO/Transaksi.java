import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Transaksi {
    private String tanggal;
    private ArrayList<ItemTransaksi> daftarItem;  // Composition - Transaksi memiliki banyak ItemTransaksi
    private double totalHarga;
    private static int nomorTransaksi = 1000;
    private String idTransaksi;
    
    public Transaksi() {
        this.idTransaksi = "TRX" + (++nomorTransaksi);
        this.tanggal = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        this.daftarItem = new ArrayList<>();
        this.totalHarga = 0.0;
    }
    
    public Transaksi(String tanggal) {
        this.idTransaksi = "TRX" + (++nomorTransaksi);
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
        this.totalHarga = 0.0;
    }

    public String getTanggal() {
        return tanggal;
    }
    
    public ArrayList<ItemTransaksi> getDaftarItem() {
        return daftarItem;
    }
    
    public double getTotalHarga() {
        return totalHarga;
    }
    
    public String getIdTransaksi() {
        return idTransaksi;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public void tambahItem(Produk produk, int jumlah) {
        if (produk != null && jumlah > 0) {
            boolean produkSudahAda = false;
            for (ItemTransaksi item : daftarItem) {
                if (item.getProduk().getKodeProduk().equals(produk.getKodeProduk())) {
                    item.setJumlah(item.getJumlah() + jumlah);
                    produkSudahAda = true;
                    System.out.println("Produk " + produk.getNamaProduk() + " sudah ada. Jumlah diperbarui menjadi: " + item.getJumlah());
                    break;
                }
            }

            if (!produkSudahAda) {
                ItemTransaksi itemBaru = new ItemTransaksi(produk, jumlah);
                daftarItem.add(itemBaru);
                System.out.println("Item ditambahkan: " + produk.getNamaProduk() + " x" + jumlah);
            }

            hitungTotal();
        } else {
            System.out.println("Error: Produk tidak valid atau jumlah harus lebih dari 0!");
        }
    }

    public double hitungTotal() {
        totalHarga = 0.0;
        for (ItemTransaksi item : daftarItem) {
            totalHarga += item.hitungSubtotal();
        }
        return totalHarga;
    }
    
    public void tampilNota() {
    System.out.println("============================================");
    System.out.println("           KANTIN KAMPUS POLINEMA");
    System.out.println("============================================");
    System.out.println("ID Transaksi : " + idTransaksi);
    System.out.println("Tanggal      : " + tanggal);
    System.out.println("Kasir        : Admin");
    System.out.println("--------------------------------------------");

    if (daftarItem.isEmpty()) {
        System.out.println("Tidak ada item dalam transaksi.");
    } else {
        System.out.println("Daftar Belanja:");
        for (ItemTransaksi item : daftarItem) {
            System.out.println("- " + item.getProduk().getNamaProduk() + " x" + item.getJumlah() + " = Rp" + item.hitungSubtotal());
        }
        System.out.println("--------------------------------------------");
        System.out.println("TOTAL BELANJA: Rp" + totalHarga);
        System.out.println("============================================");
        System.out.println("Terima kasih, selamat menikmati!");
    }
    System.out.println("============================================");
}

    public void tampilRingkasan() {
        System.out.println("\nRingkasan Transaksi");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Jumlah Item  : " + daftarItem.size());
        System.out.println("Total Harga  : Rp" + totalHarga);
        System.out.println("--------------------------------------------");
    }
}