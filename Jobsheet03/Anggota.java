package Jobsheet03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    //constructor
    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; //awal belum punya pinjaman
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    //Method pinjam
    public void pinjam(int uang) {
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }
    // Method angsur
    // public void angsur(int uang) {
    //     if (uang < (jumlahPinjaman * 0.1)) {
    //         System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
    //     } else {
    //         jumlahPinjaman -= uang;
    //     }
    // }

    // Method angsur modifikasi
    public void angsur(int uang) {
        int minimal = (int) (jumlahPinjaman * 0.1); // minimal 10% dari sisa pinjaman
        if (uang < minimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= uang;
        }
    }
}
