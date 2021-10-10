/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author DEWA
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persegi p = new persegi();
        
        System.out.println("Luas Persegi adalah : "+p.hitungluas(7));
        System.out.println("Luas Persegi adalah : "+p.hitungluas(4.5));
        System.out.println("keliling Persegi adalah : "+p.hitungkeliling(7));
        System.out.println("keliling Persegi adalah : "+p.hitungkeliling(4.5));
        
        persegipanjang pp = new persegipanjang();
        
        System.out.println("Luas Persegi Panjang adalah : "+pp.hitungluas(10,5));
        System.out.println("Luas Persegi Panjang adalah : "+pp.hitungluas(3.6,8));
        System.out.println("Luas Persegi Panjang adalah : "+pp.hitungluas(6,8.3));
        System.out.println("Luas Persegi Panjang adalah : "+pp.hitungluas(5.6,8.8));
        System.out.println("keliling Persegi Panjang adalah : "+pp.hitungkeliling(10,5));
        System.out.println("keliling Persegi Panjang adalah : "+pp.hitungkeliling(3.6,8));
        System.out.println("keliling Persegi Panjang adalah : "+pp.hitungkeliling(6,8.3));
        System.out.println("keliling Persegi Panjang adalah : "+pp.hitungkeliling(5.6,8.8));
        
        
        lingkaran l = new lingkaran ();
        
        System.out.println("Luas lingkaran adalah : "+l.hitungluas(5));
        System.out.println("Luas lingkaran adalah : "+l.hitungluas(7.4));
        System.out.println("keliling lingkaran adalah : "+l.hitungkeliling(5));
        System.out.println("keliling lingkaran adalah : "+l.hitungkeliling(7.4));
        
        segitiga s = new segitiga();
        
        System.out.println("Luas segitiga adalah : "+s.hitungluas(8,10));
        System.out.println("Luas segitiga adalah : "+s.hitungluas(8,11.5));
        System.out.println("Luas segitiga adalah : "+s.hitungluas(12.2,9));
        System.out.println("Luas segitiga adalah : "+s.hitungluas(13.9,20.7));
    }
