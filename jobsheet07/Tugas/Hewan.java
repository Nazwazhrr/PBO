package Tugas;

public class Hewan {
    String nama;
    int umur;
    String jenis;

    Hewan() {
        this.nama = "Tidak diketahui";
        this.umur = 0;
        this.jenis = "Belum ditentukan";
    }

    Hewan(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    void tampilInfo() {
        System.out.println("===== Informasi Hewan ===== ");
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("Jenis : " + jenis);
    }
}
