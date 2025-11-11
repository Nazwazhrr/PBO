public class Dosen extends Pengguna implements ITeach {

    public Dosen(String nama, String id) {
        super(nama, id);
    }

    @Override
    public void mengajar() {
        System.out.println("Dosen sedang mengajar mahasiswa.");
    }

    @Override
    public void aktivitas() {
        mengajar();
    }
}
