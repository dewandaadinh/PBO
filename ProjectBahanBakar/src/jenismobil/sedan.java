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
public class sedan extends mobil {
    public double jarak;
    public double kecepatan;
    
    public double hitungBahanBakar() {
        return this.jarak / 10;
    }

    public double hitungWaktuPerjalanan() {
        return this.jarak / this.kecepatan;
    }
}