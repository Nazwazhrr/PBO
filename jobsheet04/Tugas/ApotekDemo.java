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

        // Buat Pasien
        Pasien p1 = new Pasien("P001", "Rizky", "Jl. Mawar No.10");
        p1.buatResep(r1);

        p1.lihatResep();
    }
}
