public class Smartphone implements Kamera, Musik {
    public void ambilFoto() {
        System.out.println("Mengambil foto dengan resolusi tinggi...");
    }

    public void putarLagu(String judul) {
        System.out.println("Memutar lagu: " + judul);
    }
}
