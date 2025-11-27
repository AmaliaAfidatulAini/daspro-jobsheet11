import java.util.Scanner;

public class RekapPenjualanCafe03 {
    
        static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
    static int[][] data = new int[5][7];

    
    static void inputData() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    //Fungsi untuk menampilkan seluruh data penjualan
    static void tampilData() {
        System.out.println("=== DATA PENJUALAN 7 HARI ===");
        System.out.printf("%-12s", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf("H%-4d", h);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        // Isi tabel
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-12s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-5d", data[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    //Fungsi untuk menampilkan menu dengan total penjualan tertinggi
    static void penjualanTertinggi() {
        int max = 0;
        int indexMax = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }

            if (total > max) {
                max = total;
                indexMax = i;
            }
        }

        System.out.println("=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println(menu[indexMax] + " dengan total " + max + " porsi");
        System.out.println();
    }

    //Fungsi untuk menampilkan rata-rata penjualan setiap menu
    static void rataRata() {
        System.out.println("=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }

           double rata = total / 7.0;
            System.out.println(menu[i] + " : " + rata);
        }
        System.out.println();
    }

    // fungsi main untuk menampilkan
    public static void main(String[] args) {

        inputData(); 
        tampilData();
        penjualanTertinggi();
        rataRata();
    }
}
