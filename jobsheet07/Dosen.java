public class Dosen extends Pegawai{
    public String nidn;
    
    public Dosen(String nip, String nama, double gaji, String nidn) {
        //System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
        this.nidn = nidn;
        super(nip, nama, gaji);
    }

    public Dosen() {
    }

    public String getInfo() {
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "NIDN   : " + nidn;

        return info;
    }
}