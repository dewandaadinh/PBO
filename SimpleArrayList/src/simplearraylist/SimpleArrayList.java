/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

/**
 *
 * @author DEWA
 */
import java.util.Scanner;
import java.lang.System;
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DataArray d = new DataArray();
        System.out.println("Menu Data ArrayList:");
        System.out.println("1. Tambah Data:");
        System.out.println("2.Cari Data:");
        System.out.println("3.Hapus Data");
        System.out.println("4.Tampil Data");
        System.out.println("5. Keluar");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Menu: ");
        int pilih = input.nextInt();
       
        switch(pilih){
            case 1:
                
                System.out.println("masukkan array list:");
                String a = input.next();
                d.dataArr=a;
                break;
            case 2: 
                System.out.println("masukkan array list:");
                String b = input.next();
                d.dataArr=b;
                break;
            case 3: 
                System.out.println("masukkan array yang ingin dihapus:");
                String c = input.next();
                d.dataArr=c;
                break;
            case 4:
                System.out.println("tampilkan data:");
                String e = input.next();
                d.dataArr=e;
                break;
            case 5:
                System.out.println("exit");
                System.exit(0);
                break;
        }
    
}
}
