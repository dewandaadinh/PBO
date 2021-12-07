/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahanBakar;
import jenismobil.*;

/**
 *
 * @author DEWA
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Mobil A (Sedan) //  Solo - Kudus (103 KM) // 60KM/jam");
        sedan A = new sedan();
        A.jarak = 103;
        A.kecepatan = 60;
        A.Hasil();
        System.out.println("");
        
        System.out.println("Mobil B (Sedan) // Solo – Jakarta (563 KM) // 65KM/jam");
        sedan B = new sedan();
        B.jarak = 563;
        B.kecepatan = 65;
        B.Hasil();
        System.out.println("");
        
        
        System.out.println("Mobil C (SUV) // Solo – Banten (679 KM) // 57KM/jam");
        SUV C = new SUV();
        C.jarak = 679;
        C.kecepatan = 57;
        C.Hasil();
        System.out.println("");
        
        
        System.out.println("Mobil D (SUV) // Solo – Bandung (458 KM) // 62KM/jam");
        SUV D = new SUV();
        D.jarak = 458;
        D.kecepatan = 62;
        D.Hasil();
        System.out.println("");
        
        System.out.println("Mobil E (MPV) // Solo – Banyuwangi (505 KM) // 64KM/jam");
        MPV E = new MPV();
        E.jarak = 505;
        E.kecepatan = 64;
        E.Hasil();
        System.out.println("");
        
        System.out.println("Mobil F (MPV) // Solo – Jember (409 KM) // 53KM/jam");
        MPV F = new MPV();
        F.jarak = 409;
        F.kecepatan = 53;
        F.Hasil();
    }
}