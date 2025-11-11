public abstract class Pengguna {
    private String nama;
    private String id;

    public Pengguna(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID  : " + id);
    }

    public abstract void aktivitas();
}
