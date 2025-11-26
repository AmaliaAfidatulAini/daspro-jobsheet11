import java.util.Scanner;

public class Kafe03 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("Selamat Datang " + namaPelanggan + " ! ");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("====== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan Pilih Menu Yang Anda Inginkan");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String kodePromo = "DISKON30";
        Menu("Budi", true, kodePromo);

        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int totalKeseluruhan = 0;

        System.out.print("Berapa jenis menu yang ingin dipesan? ");
        int jumlahJenis = sc.nextInt();

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);

            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = sc.nextInt();

            int subtotal = hargaItems[pilihanMenu - 1] * jumlahItem;

            totalKeseluruhan += subtotal;
        }

        totalKeseluruhan = hitungDiskon(totalKeseluruhan, kodePromo);

        System.out.println("\n====================================");
        System.out.println("Total akhir seluruh pesanan Anda: Rp " + totalKeseluruhan);
    }

    public static int hitungDiskon(int totalHarga, String kodePromo) {

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50%");
            return totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Diskon 30%");
            return totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode promo invalid (Tidak ada diskon)");
            return totalHarga;
        }
    }

}
