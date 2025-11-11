public class AsistenDosen extends Pengguna implements IStudy, ITeach {

    public AsistenDosen(String nama, String id) {
        super(nama, id);
    }

    @Override
    public void belajar() {
        System.out.println("Asisten dosen sedang belajar materi kuliah.");
    }

    @Override
    public void mengajar() {
        System.out.println("Asisten dosen sedang membantu dosen mengajar.");
    }

    @Override
    public void aktivitas() {
        belajar();
        mengajar();
    }
}
