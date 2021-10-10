/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author DEWA
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi o = new Operasi ();
        
        System.out.println("Hasil penjumlahan adalah:"+o.jumlahkan(3,4));
        System.out.println("Hasil penjumlahan adalah:"+o.jumlahkan(4,7,9));
        System.out.println("Hasil penjumlahan adalah:"+o.jumlahkan(3.4,0.002,0.12313));
        System.out.println("perkalian adalah:"+o.kalikan(1.3,4));
        System.out.println("perkalian adalah:"+o.kalikan(2,1.5,4));

         
        
    }
    
}
