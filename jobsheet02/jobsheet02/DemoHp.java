package jobsheet02;

public class DemoHp {
    public static void main(String[] args) {
        Hp hp1 = new Hp();
        hp1.merk = "Samsung";
        hp1.harga = 3500000;
        hp1.warna = "Hitam";
        hp1.tipeHp = "Galaxy A52";
        hp1.memori = 128;

        Hp hp2 = new Hp();
        hp2.merk = "iPhone";
        hp2.harga = 12000000;
        hp2.warna = "Putih";
        hp2.tipeHp = "iPhone 13";
        hp2.memori = 256;

        hp1.warna = "Biru";
        hp2.harga = 11000000;

        hp1.infoHp();
        hp1.nyalakan(true);
        System.out.println(hp1.kirimPesan("Halo, apa kabar?"));
        hp1.bukaAplikasi("WhatsApp");

        System.out.println();

        hp2.infoHp();
        hp2.nyalakan(true);
        hp2.telpon("08123456789");
        hp2.isiBaterai(85);
    }
}
