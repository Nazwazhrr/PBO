public class Mahasiswa extends Pengguna implements IStudy {

    public Mahasiswa(String nama, String id) {
        super(nama, id);
    }

    @Override
    public void belajar() {
        System.out.println("Mahasiswa sedang belajar di kelas.");
    }

    @Override
    public void aktivitas() {
        belajar();
    }
}
