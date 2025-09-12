package Jobsheet03;

public class Motor {
    public String platNomor;
    public boolean isiMesinOn;
    public int kecepatan;
    
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
