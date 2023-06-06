/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl_2023;
import java.util.ArrayList;
/**
 *
 * @author rafiskui
 */
public class input_buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    // Konstruktor
    public input_buku() {
        // Inisialisasi data awal
        this.namaBuku.add("RPAL        ");
        this.stok.add(999);
        this.harga.add(10000);

        this.namaBuku.add("RPUL        ");
        this.stok.add(999);
        this.harga.add(5000);

        this.namaBuku.add("Ensiklopedia");
        this.stok.add(999);
        this.harga.add(15000);
    }

    // Getter untuk jumlah buku
    public int getJmlBuku() {
        return this.namaBuku.size();
    }

    // Setter untuk menambahkan nama buku baru
    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }

    // Getter untuk mendapatkan nama buku berdasarkan ID buku
    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }

    // Setter untuk mengatur stok buku
    public void setStok(int stok) {
        this.stok.add(stok);
    }

    // Getter untuk mendapatkan stok buku berdasarkan ID buku
    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    // Metode untuk mengedit stok buku
    public void editStok(int idBuku, int stok) {
        this.stok.set(idBuku, stok);
    }

    // Setter untuk mengatur harga buku
    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    // Getter untuk mendapatkan harga buku berdasarkan ID buku
    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }
    
    public void kurangiStok(int idBuku, int jumlah) {
        if (jumlah <= stok.get(idBuku)) {
            stok.set(idBuku, stok.get(idBuku) - jumlah);
        } else {
            System.out.println("Stok buku tidak mencukupi");
        }
    }
}
