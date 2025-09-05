package jobsheet02;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "033536";
        m2.nama = "Nazwa";
        m2.alamat = "Batu, Jawa Timur";
        m2.kelas = "2D";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "043637";
        m3.nama = "Aisya";
        m3.alamat = "Solo, Jawa";
        m3.kelas = "2F";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}