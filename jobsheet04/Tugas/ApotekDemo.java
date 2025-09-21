package Tugas;

public class ApotekDemo {
    public static void main(String[] args) {
        // Buat Obat
        Obat o1 = new Obat("O001", "Paracetamol", 5000, 50);
        Obat o2 = new Obat("O002", "Amoxicillin", 10000, 30);
        Obat o3 = new Obat("O003", "Vitamin C", 7000, 40);

        // Buat Resep
        Resep r1 = new Resep("R001", "21-09-2025");
        r1.tambahObat(o1);
        r1.tambahObat(o3);

        Resep r2 = new Resep("R002", "22-09-2025");
        r2.tambahObat(o1);
        r2.tambahObat(o2);

        // Buat Pasien
        Pasien p1 = new Pasien("P001", "Rizky", "Jl. Mawar No.10");
        p1.buatResep(r1);

        Pasien p2 = new Pasien("P002", "Budi", "Jl. Melati No.20");
        p2.buatResep(r2);

        p1.lihatResep();
        p2.lihatResep();
    }
}
