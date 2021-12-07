/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenismobil;

/**
 *
 * @author DEWA
 */
public abstract class mobil {
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktuPerjalanan();
    
    public void Hasil() {
        System.out.println("Bahan Bakar Minimal   : " + this.hitungBahanBakar() + " liter");
        System.out.println("Waktu Perjalanan      : " + this.hitungWaktuPerjalanan() + " jam");
    }
}
