public class MainPembayaran {
    public static void main(String[] args) {
        Pembayaran p1 = new Dana();
        Pembayaran p2 = new OVO();

        p1.prosesPembayaran(50000);
        p2.prosesPembayaran(100000);
    }
}
