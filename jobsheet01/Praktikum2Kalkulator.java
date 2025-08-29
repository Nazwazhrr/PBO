import java.util.Scanner;
public class Praktikum2Kalkulator {
    
    static int tambah(int a, int b){
        return a + b;
    }

    static int kurang(int a, int b){
        return a - b;
    }

    static int kali(int a, int b){
        return  a * b;
    }

    static double bagi(int a, int b){
        if (b == 0)  {
            System.out.println("Error : Tidak bisa dibagi 0!");
            return 0;
        }
        return (double) a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1= sc.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka ke dua: ");
        int angka2 = sc.nextInt();

        if (operator == '+') {
            System.out.println("Hasil: " + (angka1 + angka2));
        } else if (operator == '-') {
            System.out.println("Hasil: " + (angka1 - angka2));
        } else if (operator == '*') {
            System.out.println("Hasil: " + (angka1 * angka2));
        } else if (operator == '/')
            if (angka2 == 0) {
                System.out.println("Error tidak bisa dibagi 0!");
            }else {
                System.out.println("Hasil: " + ((double) angka1 / angka2));
        } else {
            System.out.println("Operator tidak dikenal");
        }
    }
}
   