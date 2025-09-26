import java.util.ArrayList;

public class Reservasi {
    private String tanggal;
    private int durasi;
    private Ruangan ruangan;
    private ArrayList<Mahasiswa> daftarMahasiswa; 

    public Reservasi(String tanggal, int durasi, Ruangan ruangan) {
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.ruangan = ruangan;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public String getTanggal() { 
        return tanggal; 
    }

    public void setTanggal(String tanggal) { 
        this.tanggal = tanggal; 
    }

    public int getDurasi() { 
        return durasi; 
    }

    public void setDurasi(int durasi) { 
        this.durasi = durasi; 
    }

    public Ruangan getRuangan() { 
        return ruangan; 
    }

    public void setRuangan(Ruangan ruangan) { 
        this.ruangan = ruangan; 
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilReservasi() {
        System.out.println("=== ==DATA RESERVASI =====");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Durasi  : " + durasi + " jam\n");

        System.out.println("===== DATA RUANGAN =====");
        ruangan.tampilInfo();

        System.out.println("\n===== DAFTAR MAHASISWA =====");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa terdaftar.");
        } else {
            for (Mahasiswa m : daftarMahasiswa) {
                m.tampilInfo();
                System.out.println("------------------------");
            }
        }
    }
}
