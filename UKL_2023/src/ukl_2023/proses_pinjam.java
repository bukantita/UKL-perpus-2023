/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl_2023;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rafiskui
 */
public class proses_pinjam {
     // Deklarasi variabel instance
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idSiswa= new ArrayList<Integer>();

    // Konstruktor
    public proses_pinjam() {
        // Nilai awal variabel
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }

    // Method untuk proses peminjaman buku
    public void prosesPeminjaman(siswa Siswa, proses_pinjam peminjaman, input_buku buku, laporan Laporan) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("");
        System.out.println("============SELAMAT DATANG============");
        System.out.print("Masukkan ID Siswa                 : ");
        int idSiswa = myObj.nextInt();
        System.out.println("Selamat datang " + Siswa.getNama(idSiswa));
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Ketik 99 bila selesai");
            System.out.print("Masukkan kode buku                 : ");
            temp = myObj.nextInt();
            
            if (temp != 99) {
                idBuku.add(temp);
                System.out.print(buku.getNamaBuku(idBuku.get(i)) + " sebanyak             : ");
                banyak.add(myObj.nextInt());
                //int stokSekarang = buku.getStok(idBuku.get(i));
                if (banyak.get(i) > buku.getStok(idBuku.get(i))) {
                    System.out.println("Stok tidak mencukupi, silahkan coba lagi");
                    System.exit(0);
                }
                //buku.editStok(idBuku.get(i), stokSekarang - banyak.get(i)); 
                buku.kurangiStok(i, temp);
                i++;
            }
        } while (temp != 99);
        System.out.println("");
        System.out.println("----Transaksi peminjaman " + Siswa.getNama(idSiswa) + " sebagai berikut----");
        System.out.println("Nama Buku \tQty \tHarga \tJumlah \t");
        

        int total = 0;
        int x = idBuku.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
            total += jumlah;
            
            System.out.println(buku.getNamaBuku(idBuku.get(j)) + "\t" + banyak.get(j) + "\t"+ "Rp." + buku.getHarga(idBuku.get(j)) + "\t" + "Rp." + jumlah);
            
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
        }

        System.out.println("\nTotal Peminjaman Buku             : " + "Rp." + total);
        Siswa.editStatus(idSiswa, Siswa.getStatus(idSiswa) == false);
        System.out.println("Status"+Siswa.getNama(idSiswa)+"                        :"+Siswa.getStatus(idSiswa));
        if (Siswa.getStatus(idSiswa)==true) {
            System.out.println("DAPAT MEMINJAM BUKU");
        } else{
            System.out.println("");
            System.out.println("TIDAK BOLEH MEMINJAM BUKU LAGI!");    
        
        }
        Laporan.laporan(buku);
        // Proses pengembalian buku
        
        System.out.print("\nApakah kamu mau mengembalikan buku?\n(yes/no)                          : ");
        String answer = myObj.next();
        if ("yes".equals(answer)) {
            Siswa.editStatus(idSiswa, true);
            System.out.println("Status " + Siswa.getNama(idSiswa) + "                      : " + Siswa.getStatus(idSiswa));
            
            for (int j = 0; j < x; j++) {
                peminjaman.setPengembalian(buku, idSiswa, idBuku.get(j), banyak.get(j));
                System.out.println("Dapat meminjam buku lagi");
            }
        } else {
            System.out.println("");
            System.out.println("ANDA BELUM MENGEMBALIKAN BUKU");
            Laporan.laporan(buku);
            Laporan.laporan(Siswa);
            System.exit(0);
        }
    }

    // Method untuk melakukan peminjaman buku
    public void setPeminjaman(input_buku buku, int idSiswa, int idBuku, int banyaknya) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyaknya);
    }

    // Method untuk melakukan pengembalian buku
    public void setPengembalian(input_buku buku, int idSiswa, int idBuku, int banyaknya) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) + banyaknya);
    }

    // Getter untuk mendapatkan ID buku berdasarkan indeks
    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    // Getter untuk mendapatkan banyaknya buku berdasarkan indeks
    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    // Getter untuk mendapatkan ID siswa berdasarkan indeks
    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    // Getter untuk mendapatkan jumlah peminjaman
    public int getJmlPeminjaman() {
        return this.idSiswa.size();
    }
    
}