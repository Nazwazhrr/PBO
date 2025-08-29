public class Praktikum1Hewan {

    static void makan(String nama) {
        System.out.println(nama + " Sedang makan...");
    }

    static void infoHewan(String nama, String jenis, int umur) {
        System.out.println(nama + " (" + jenis + ", umur " + umur + " tahun)");
    }

    public static void main(String[] args) {
        String nama1 = "Kucing";
        String jenis1= "Karnivora";
        int umur1 = 2;

        String nama2 = "Sapi";
        String jenis2= "Herbivora";
        int umur2 = 5;

        String nama3 = "Ayam";
        String jenis3= "Omnivora";
        int umur3 = 1;

        String nama4 = "Kambing";
        String jenis4= "Karnivora";
        int umur4 = 3;

        String nama5 = "Anjing";
        String jenis5= "Omnivora";
        int umur5 = 4;

        String nama6 = "Harimau";
        String jenis6= "Karnivora";
        int umur6 = 7;

        String nama7 = "Gajah";
        String jenis7= "Herbivora";
        int umur7 = 15;

        String nama8 = "Burung";
        String jenis8= "Omnivora";
        int umur8 = 2;

        String nama9 = "Singa";
        String jenis9= "Karnivora";
        int umur9 = 9;

        String nama10 = "Panda";
        String jenis10= "Herbivora";
        int umur10 = 6;

        makan(nama1);
        infoHewan(nama1, jenis1, umur1);
        System.out.println("-------------------------");
        makan(nama2);
        infoHewan(nama2, jenis2, umur2);
        System.out.println("-------------------------");
        makan(nama3);
        infoHewan(nama3, jenis3, umur3);
        System.out.println("-------------------------");
        makan(nama4);
        infoHewan(nama4, jenis4, umur4);
        System.out.println("-------------------------");
        makan(nama5);
        infoHewan(nama5, jenis5, umur5);
        System.out.println("-------------------------");
        makan(nama6);
        infoHewan(nama6, jenis6, umur6);
        System.out.println("-------------------------");
        makan(nama7);
        infoHewan(nama7, jenis7, umur7);
        System.out.println("-------------------------");
        makan(nama8);
        infoHewan(nama8, jenis8, umur8);
        System.out.println("-------------------------");
        makan(nama9);
        infoHewan(nama9, jenis9, umur9);
        System.out.println("-------------------------");
        makan(nama10);
        infoHewan(nama10, jenis10, umur10);
        System.out.println("-------------------------");
    }
}
