import java.util.Scanner; // untuk membaca input dari keyboard yaitu dengan mengguakan library Scanner yag di import kedalam program java.

 // Jobsheet 3 - Studi Kasus Pengisian Nilai Mahasiswa di SIAKAD

public class Siakad03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // untuk input scanner 

        String nama, nim, kelas; // untuk mendeklarasikan bahwa pada tipe data String terdapat variabel nama, nim, kelas
                                // char kelas; untuk mendeklarasikan bahwa pada tipe data char terdapat variabel kelas 
        byte absen; // untuk mendeklarasikan bahwa pada tipe data type terdapat variabel absen
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir; // untuk mendeklarasikan bahwa pada tipe data double terdapat variabel nilaiKuis, NilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir
        
        System.out.println("Masukkan nama\t\t: "); // untuk meminta  ke user memasukkan nama
        nama = sc.nextLine(); // untuk membaca input dari pengguna dan menyimpannya ke variabel nama
        System.out.println("Masukkan NIM\t\t: "); // untuk memberi tahu  ke user memasukkan NIM
        nim = sc.nextLine(); // untuk membaca input dari pengguna dan menyimpannya ke variabel nim
        System.out.println("Masukkan kelas\t\t: "); // untuk memberi tahu  ke user memasukkan kelas 
        kelas = sc.nextLine(); // untuk membaca input dari pengguna dan menyimpannya ke variabel kelas
        System.out.println("Masukkan nomor absen\t: "); // untuk memberi tahu  ke user memasukkan absen
        absen = sc.nextByte(); // untuk membaca input dari pengguna dan menyimpannya ke variabel absen dengan tipe data byte
        
        System.out.println("Masukkan nilai kuis\t: "); // untuk memberi tahu  ke user memasukkan nilai kuis 
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas\t: "); // untuk memberi tahu  ke user memasukkan nilai tugas
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian\t: "); // untuk memberi tahu  ke user memasukkan nilai ujian
        nilaiUjian = sc.nextDouble();
        System.out.println("Masukkan nilai UTS\t: "); // untuk memberi tahu  ke user memasukkan nilai UTS
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS\t: "); // untuk memberi tahu  ke user memasukkan nilai UAS 
        nilaiUAS = sc.nextDouble();
        System.out.println("Masukkan nilai akhir\t: "); // untuk memberi tahu  ke user memasukkan nilai akhir
        nilaiAkhir = sc.nextDouble();
       
        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35);
       
        System.out.printf("Output:\nNama\t\t: %s\nNIM\t\t: %s\nKelas\t\t: %s\nAbsen\t\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir); // untuk menampilkan keluaran format tertentu di Java
    

    }
}