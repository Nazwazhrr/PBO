package Tugas;

import java.util.ArrayList;

public class Resep {
    private String nomorResep;
    private String tanggal;
    private ArrayList<Obat> daftarObat;  
    
    public Resep(String nomorResep, String tanggal) {
        this.nomorResep = nomorResep;
        this.tanggal = tanggal;
        this.daftarObat = new ArrayList<>();
    }

    public void tambahObat(Obat obat) {
        daftarObat.add(obat);
    }

    public void hapusObat(Obat obat) {
        daftarObat.remove(obat);
    }

    public String getNomorResep() {
        return  nomorResep;
    }

    public void setNomorResep(String nomorResep) {
        this.nomorResep = nomorResep;
    }

    public String getTanggal() { 
        return tanggal; 
    }
    public void setTanggal(String tanggal) { 
        this.tanggal = tanggal; 
    }

    public ArrayList<Obat> getDaftarObat() { 
        return daftarObat; 
    }

    public double hitungTotal() {
        double total = 0;
        for (Obat o : daftarObat) {
            total += o.getHarga();
        }
        return total;
    }

    public String getInfo() {
        String info = "Nomor Resep : " + nomorResep + "\n";
        info += "Tanggal     : " + tanggal + "\n\n";
        info += "Daftar Obat \n";
    
        for (Obat o : daftarObat) {
            info += o.getInfo() + "\n"; 
        }

        info += "Total Harga : Rp " + hitungTotal() + "\n";
        return info;
    }
}
