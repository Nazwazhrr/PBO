public class DemoReservasi {
    public static void main(String[] args) {
        Ruangan r1 = new Ruangan("R101", "Lab Pemrograman", 40, "tersedia");

        Reservasi reservasi = new Reservasi("2025-09-27", 3, r1);

        Mahasiswa m1 = new Mahasiswa("244107060146", "Nazwa Azahra Audina");
        Mahasiswa m2 = new Mahasiswa("244107060120", "Sayyidati Aisya");
        Mahasiswa m3 = new Mahasiswa("244107060150", "Zulfa Salsabilla");

        reservasi.tambahMahasiswa(m1);
        reservasi.tambahMahasiswa(m2);
        reservasi.tambahMahasiswa(m3);

        reservasi.tampilReservasi();
    }
}
