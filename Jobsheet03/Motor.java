package Jobsheet03;

public class Motor {
    private  String platNomor;
    private  boolean isiMesinOn;
    private  int kecepatan;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isiMesinOn() {
        return isiMesinOn;
    }

    public void setIsiMesinOn(boolean isiMesinOn) {
        this.isiMesinOn =isiMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isiMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
    
        if (isiMesinOn) {
            System.out.println("Mesin On");
        }
        else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("==============================");
    }
}
