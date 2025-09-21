package Tugas;

import java.util.ArrayList;

public class Pasien {
    private String idPasien;
    private String nama;
    private String alamat;
    private ArrayList<Resep> daftarResep;

    public Pasien(String idPasien, String nama, String alamat) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.alamat = alamat;
        this.daftarResep = new ArrayList<>();
    }

    public String getIdPasien() { 
        return idPasien; 
    }
    
    public void setIdPasien(String idPasien) { 
        this.idPasien = idPasien; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getAlamat() { 
        return alamat; 
    }

    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }

    public ArrayList<Resep> getDaftarResep() { 
        return daftarResep; 
    }

    public void buatResep(Resep resep) {
        daftarResep.add(resep);
    }

    public void lihatResep() {
        System.out.println("=========================");
        System.out.println("Resep milik " + nama );
        for (Resep r : daftarResep) {
            System.out.println(r.getInfo());
        }
    }
}

