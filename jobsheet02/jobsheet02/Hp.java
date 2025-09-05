package jobsheet02;

public class Hp {
    public String merk;
    public double harga;
    public String warna;
    public String tipeHp;
    public int memori;

    public void nyalakan(boolean power) {
        if (power) {
            System.out.println(merk + " menyala...");
        } else {
            System.out.println(merk + " dimatikan.");
        }
    }

    public int isiBaterai(int persen) {
        System.out.println("Mengisi baterai hingga " + persen + "%");
        return persen;
    }

    public String kirimPesan(String pesan) {
        return "Pesan terkirim: " + pesan;
    }

    public void telpon(String nomor) {
        System.out.println("Sedang menelpon nomor " + nomor + " ...");
    }

    public void bukaAplikasi(String namaApp) {
        System.out.println("Membuka aplikasi " + namaApp);
    }

    public void infoHp() {
        System.out.println("Merk   : " + merk);
        System.out.println("Harga  : " + harga);
        System.out.println("Warna  : " + warna);
        System.out.println("Tipe   : " + tipeHp);
        System.out.println("Memori : " + memori + "GB");
    }
}
