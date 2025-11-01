abstract class AlatMusik {
    private String nama;
    private String jenis;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void info() {
        System.out.println("Nama Alat Musik: " + nama);
        System.out.println("Jenis Alat Musik: " + jenis);
    }

    public abstract void mainkan();
}
