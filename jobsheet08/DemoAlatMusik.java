public class DemoAlatMusik {
    public static void main(String[] args) {
        Gitar gitar1 = new Gitar("Gitar Akustik", "Petik", 6);
        Piano piano1 = new Piano("Piano Klasik", "Tekan", 88);

        System.out.println("=== Data Gitar ===");
        gitar1.info();
        gitar1.mainkan();

        System.out.println("\n=== Data Piano ===");
        piano1.info();
        piano1.mainkan();
    }
}
