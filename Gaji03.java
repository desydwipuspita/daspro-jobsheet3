import java.util.Scanner;

// Jobsheet 3 - Studi Kasus Menghitung Gaji Bulanan Karyawan

public class Gaji03 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       double jmlGaji, jmlJamkerja, upahPerjam, jmlGajiAkhir, jmlPajak, jmlBonus, pajak = 5 / 100, bonus = 10 / 100;

       System.out.println("Masukkan Jumlah Jam Kerja\t: ");
       jmlJamkerja = sc.nextDouble();
       System.out.println("Masukkan Upah Per Jam Kerja\t: ");
       upahPerjam = sc.nextDouble();

       jmlGaji = jmlJamkerja * upahPerjam;
       jmlBonus = jmlGaji * bonus;
       jmlPajak = (jmlGaji + jmlBonus) * pajak;
       jmlGajiAkhir = jmlGaji + jmlBonus - jmlPajak;

       System.out.printf("\nOutput:\n\nJumlah Jam Kerja\t\t: %.2f\nUpah Per Jam\t\t\t: Rp.%.2f\nBonus\t\t\t\t: 10%%\nPajak\t\t\t\t: 5%%\nJumlah Gaji\t\t\t: Rp.%.2f\nJumlah Bonus\t\t\t: Rp.%.2f\nJumlah Gaji + Bonus\t\t: Rp.%.2f\nJumlah Pajak\t\t\t: Rp.%.2f\nJumlah Gaji Akhir\t\t: Rp.%.2f", jmlJamkerja, upahPerjam, jmlGaji, jmlBonus, (jmlGaji + jmlBonus), jmlPajak, jmlGajiAkhir);

    }
    
}
