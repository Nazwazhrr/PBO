package jobsheet02;

public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih() {
        return  hargaKotor - diskon * hargaKotor;
    }

    public void displayInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Harga KOtor : " + hargaKotor);
        System.out.println("Diskon      : " + diskon);
        System.out.println("HArga Bersih: " + getHargaBersih());
    }
}
