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
public class petugas implements user_perpus{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    // Constructor
    public petugas() {
        this.namaPetugas.add("Dinda");
        this.alamat.add("Malang");
        this.telepon.add("085722379057");
    }

    // Getter untuk jumlah petugas
    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    // Implementasi setter dari interface User
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }
//
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    // Implementasi getter dari interface User
    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }
}
