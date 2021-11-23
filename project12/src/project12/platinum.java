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
public class platinum extends silver{

    public platinum(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
        super(id, nama, jenis, pinjam, kembali);
    }
    // constructor
   
 
   int cashback(){
         int cash = 5000*lamaPinjam;
         return cash;
     }
   
   int bonusPulsa(){
       int bonus = 5000*lamaPinjam;
       return bonus;
   }
     
    // cetak data pegawai, rincian gaji, total gaji
    void printSilver(){
        System.out.println("ID Member   : " + this.idMember);
        System.out.println("Nama Member : " + this.nama);
        System.out.println("Jenis Member     : " + this.jenismember);
        System.out.println("Tgl Lahir    : " + this.tglpinjam);
        System.out.println("Tgl Kembali: "+ this.tglkembali);
        System.out.println("Lama sewa"+ this.lamaPinjam());
        System.out.println("Poin   : Rp " + this.poinPinjam());

    }
}
