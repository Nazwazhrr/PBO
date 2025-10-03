public class KursusOnline {
    private String namaProduk;
    private double harga;
    private int durasiVideo;

    public KursusOnline(String namaProduk, double harga, int durasiVideo) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.durasiVideo = durasiVideo;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getDurasiVideo() {
        return durasiVideo;
    }

    public void setDurasiVideo(int durasiVideo) {
        this.durasiVideo = durasiVideo;
    }

    public void tampilInfo() {
        System.out.println("Nama Kursus : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Durasi Video: " + durasiVideo + " menit");
    }
}
