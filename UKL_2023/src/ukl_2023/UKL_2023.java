/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ukl_2023;
import java.util.Scanner;
public class UKL_2023 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        int temp = 0;

        do {
            // Membuat objek dari kelas-kelas yang dibutuhkan
            input_buku buku = new input_buku(); // Penerapan konstruktor
            laporan Laporan = new laporan();
            siswa Siswa= new siswa();
            proses_pinjam peminjaman = new proses_pinjam();

            Laporan.laporan(buku); // Memanggil metode laporan untuk buku
            Laporan.laporan(Siswa); // Memanggil metode laporan untuk siswa
            peminjaman.prosesPeminjaman(Siswa, peminjaman, buku, Laporan); // Polimorfisme, memanggil metode prosesPeminjaman dari objek peminjaman
            
            Laporan.laporan(peminjaman, buku); // Memanggil metode laporan untuk peminjaman dan buku
            Laporan.laporan(buku); // Memanggil metode laporan untuk buku
            Laporan.laporan(Siswa); // Memanggil metode laporan untuk siswa
            System.out.println("\nJika ingin meminjam buku ketik 1\nJika tidak ketik 99");

            temp = myObj.nextInt();
            
            } while (temp != 99);

            System.exit(0);
     }
    
}