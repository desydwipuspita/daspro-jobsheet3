import java.util.Scanner;

// jobsheet3 - Menghitung Total Tagihan Listrik

public class Listrik03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tarifListrik = 1500, jmlpenggunaan, totaltarifListrik;
        boolean penggunaanListrik;

        System.out.println("Masukkan Jumlah Penggunaan Listrik (kwh): ");
        jmlpenggunaan = sc.nextInt();

        penggunaanListrik = jmlpenggunaan > 500;

        totaltarifListrik = jmlpenggunaan * tarifListrik;

        System.out.printf("\nOutput:\n\nApakah Listrik Melebihi 500 kWh?\t: %s\nJumlah Penggunaan Listrik\t\t: %s\nHarga Listrik (kWh)\t\t\t: %s\nTotal Bayar Listrik\t\t\t: %s", penggunaanListrik, jmlpenggunaan, tarifListrik, totaltarifListrik);
    }    
}
