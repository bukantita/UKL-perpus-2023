/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl_2023;

/**
 *
 * @author dyahs
 */

public class laporan {
    public void laporan(input_buku buku) {
        int x = buku.getJmlBuku();
        System.out.println("\n------------TABEL BUKU------------");
        System.out.println("Nama Buku \tStok \t harga ");
        for (int i = 0; i < x; i++) {
            System.out.println(buku.getNamaBuku(i) + "\t" + buku.getStok(i) + "\t" + "Rp." + buku.getHarga(i));
        }
    }

    public void laporan(siswa Siswa) {
        int x = Siswa.getJmlSiswa();

        System.out.println();
        System.out.println("------------TABEL SISWA------------");
        System.out.println("Nama \tAlamat \tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(Siswa.getNama(i) + "\t" +
                    Siswa.getAlamat(i) + "\t" + Siswa.getTelepon(i) + "\t" +
                    Siswa.getStatus(i));
        }
    }

    public void laporan(proses_pinjam peminjaman, input_buku buku) {
        int x = peminjaman.getJmlPeminjaman();

        System.out.println();
        System.out.println("------------LAPORAN PEMINJAMAN------------");
        System.out.println("Nama Buku\tQty \tHarga \t\tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknya(i) * buku.getHarga(peminjaman.getIdBuku(i));
            total += jumlah;

            System.out.println(buku.getNamaBuku(peminjaman.getIdBuku(i)) + "\t" +
                    peminjaman.getBanyaknya(i) + "\t" + "Rp." + buku.getHarga(peminjaman.getIdBuku(i)) + "\t"
                    + "Rp." + jumlah);
        }
        System.out.println("Total Omset =" + total);
    }
}
