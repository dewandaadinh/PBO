/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project12;

/**
 *
 * @author dewan
 */
import java.time.*;
public class silver {
    // atribut
    String idMember;
    String nama;
    String jenismember;
    LocalDate tglpinjam;
    LocalDate tglkembali;
    int lamaPinjam;
    
     
    // constructor
    silver(String id, String nama, String jenis, LocalDate pinjam,LocalDate kembali){
        this.idMember = id;
        this.nama = nama;
        this.jenismember = jenis;
        this.tglpinjam = pinjam;
        this.tglkembali = kembali;
    }
    
     
   long member(){
        long membr = 0;
        if (this.jenismember == "silver"){
            membr = 25000;
            }
        else if (this.jenismember == "gold"){
            membr = 30000;
        }
        else if (this.jenismember == "platinum"){
            membr = 45000;
        }
        return membr;
    }
    
     
    
    int lamaPinjam(){
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(this.tglkembali, today);
        return selisih.getYears();
    }
     
   
   
   int poinPinjam(){
       int poin = 1*lamaPinjam;
       return poin;
   }
    
     
    // mencetak data pegawai dan gaji pokoknya
    void printsilver(){
        System.out.println("ID Member   : " + this.idMember);
        System.out.println("Nama Member : " + this.nama);
        System.out.println("Jenis Member     : " + this.jenismember);
        System.out.println("Tgl Lahir    : " + this.tglpinjam);
        System.out.println("Tgl Kembali: "+ this.tglkembali);
        System.out.println("Lama sewa"+ this.lamaPinjam());
        System.out.println("Poin   : Rp " + this.poinPinjam());
    }
}
