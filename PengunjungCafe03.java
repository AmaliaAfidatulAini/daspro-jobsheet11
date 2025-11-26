import java.util.Scanner;

public class PengunjungCafe03 {

    static void daftarPengunjung(String... namaPengunjung) {
        for (String nama : namaPengunjung) {
            System.out.println(nama);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

    }
    
}
