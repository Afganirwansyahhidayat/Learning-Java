import java.util.Scanner;
public class Remed {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Angka A: ");
        int a = scanner.nextInt();

        System.out.println("Masukan Angka B: ");
        int b = scanner.nextInt();

        // Mencari nilai terkecil
        int min = (a < b) ? a : b;

        // Mencari nilai terbesar
        int max = (a > b) ? a : b;

        // Menghitung rata-rata
        double average = (a + b) / 2.0;

        // Outputnya
        System.out.println("Nilai terkecil: " + min);
        System.out.println("Nilai terbesar: " + max);
        System.out.println("Rata-rata: " + average);
        scanner.close();
    }
}
