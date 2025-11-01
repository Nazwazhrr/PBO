class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(String nama, String jenis, int jumlahSenar) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println("Gitar dimainkan dengan cara dipetik.");
        System.out.println("Jumlah senar: " + jumlahSenar);
    }
}
