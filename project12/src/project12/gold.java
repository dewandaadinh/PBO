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
public class gold extends silver {

    public gold(String id, String nama, String jenis, LocalDate pinjam, LocalDate kembali) {
        super(id, nama, jenis, pinjam, kembali);
    }
     int cashback(){
         int cash = 5000*lamaPinjam;
         return cash;
     }
    
    void printSilver(){
        System.out.println("ID Member   : " + this.idMember);
        System.out.println("Nama Member : " + this.nama);
        System.out.println("Jenis Member     : " + this.jenismember);
        System.out.println("Tgl Lahir    : " + this.tglpinjam);
        System.out.println("Tgl Kembali: "+ this.tglkembali);
        System.out.println("Lama sewa"+ this.lamaPinjam());
        System.out.println("Poin   : Rp " + this.poinPinjam());
        System.out.println("Cashback: "+this.cashback());
    }
}
