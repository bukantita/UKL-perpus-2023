/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl_2023;
import java.util.ArrayList;
/**
 *
 * @author dyahs         
 */
public class siswa implements user_perpus{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    // Konstruktor untuk inisialisasi data awal
    public siswa() {
        this.namaSiswa.add("muhamadd");
        this.alamat.add("kaliseweu");
        this.telepon.add("086588903453");
        this.status.add(true);

        this.namaSiswa.add("rafi");
        this.alamat.add("malang");
        this.telepon.add("085432789987");
        this.status.add(true);
        
        this.namaSiswa.add("revyanto");
        this.alamat.add("amerika");
        this.telepon.add("0866478965676");
        this.status.add(true);
        
        this.namaSiswa.add("nasbro");
        this.alamat.add("borito");
        this.telepon.add("0843387987767");
        this.status.add(true);
    }

    // Getter dan Setter menggunakan enkapsulasi
    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public Boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }

    public void editStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }

    public int getJmlSiswa() {
        return this.status.size();
    }

    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
}
