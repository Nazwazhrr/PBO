class Piano extends AlatMusik {
    private int jumlahTuts;

    public Piano(String nama, String jenis, int jumlahTuts) {
        super(nama, jenis);
        this.jumlahTuts = jumlahTuts;
    }

    @Override
    public void mainkan() {
        System.out.println("Piano dimainkan dengan cara ditekan pada tutsnya.");
        System.out.println("Jumlah tuts: " + jumlahTuts);
    }
}
