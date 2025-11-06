public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Angin Tornado", 250000, "Putih", "Cosmos");
        TV tv = new TV("LED", 20, 3000000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 4500000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(10, 3, 8000000, "Abu-Abu", "Panasonic");

        System.out.println("=== DATA ALAT ELEKTRONIK ===");
        System.out.println("\n--- KIPAS ---");
        System.out.println(kipas.getInfo());

        System.out.println("\n--- TV ---");
        System.out.println(tv.getInfo());
        tv.naikkanVolume(5);
        System.out.println("Setelah volume dinaikkan: " + tv.getVolume());
        tv.turunkanVolume(3);
        System.out.println("Setelah volume diturunkan: " + tv.getVolume());

        System.out.println("\n--- KULKAS ---");
        System.out.println(kulkas.getInfo());

        System.out.println("\n--- SMART FRIDGE ---");
        System.out.println(smartFridge.getInfo());
        smartFridge.naikkanVolume(4);
        System.out.println("Setelah volume dinaikkan: " + smartFridge.getVolume());
        smartFridge.turunkanVolume(2);
        System.out.println("Setelah volume diturunkan: " + smartFridge.getVolume());
    }
}
