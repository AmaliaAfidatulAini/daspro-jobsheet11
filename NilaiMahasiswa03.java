import java.util.Scanner;

public class NilaiMahasiswa03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //fungsi untuk membaca nilai n
        System.out.print("Masukkan jumlah mahasiswa : ");
        int N = input.nextInt();

        int[] nilaiMhs = new int[N];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("Total nilai seluruh mahasiswa = " + totalNilai);
    }

    static void isianArray(int[] nilai) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] nilai) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa" + (i + 1) + " : " + nilai[i]);
        }
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
    
}
