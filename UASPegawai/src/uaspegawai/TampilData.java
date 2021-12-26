/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspegawai;
import Pegawai.pagawai;
import java.util.ArrayList;

/**
 *
 * @author DEWA
 */
public class TampilData {
    private ArrayList<pagawai> datap = new ArrayList<pagawai>();
    
    protected void hapus(String kode){
        this.datap.removeIf(item -> item.kode.equals(kode));
    }
    protected void tambah(pagawai data){
        this.datap.add(data);
    }
    
    protected void tampil(){
        System.out.println("===================================");
        System.out.println("DATA PEGAWAI");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("KODE PEGAWAI	 NAMA PEGAWAI	  GOL	  UMUR	   STATUS NIKAH		  JUMLAH ANAK");
        System.out.println("-------------------------------------------------------------------------------------");
        for(pagawai item: this.datap){
            item.printTable();
        }
    }
    
    protected void cari(String kode){
        boolean found = false;
        int index = -1;
        for(int i=0; i<this.datap.size(); i++){
            if (this.datap.get(i).kode.equals(kode)){
                index = i;
                found = true;
            }
        }
        if (found == true){
            this.datap.get(index).printpagawai();
        } else {
            System.out.println("Data pegawai tidak ditemukan");
          }
    }
    
}


