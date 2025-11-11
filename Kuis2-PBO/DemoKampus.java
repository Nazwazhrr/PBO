public class DemoKampus {
    public static void main(String[] args) {
        Pengguna[] pengguna = {
            new Mahasiswa("Caca", "M001"),
            new Dosen("Prof. Budi", "D001"),
            new AsistenDosen("Rina", "A001")
        };

        for (Pengguna p : pengguna) {
            p.tampilkanInfo();
            p.aktivitas();
            System.out.println("=============================================");
        }
    }
}
