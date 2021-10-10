/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author DEWA
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.s = 42;
        
        
        lingkaran l = new lingkaran();
        l.r = 21;
        
        int luasTotal = (int) (p.hitungLuas()+2*l.hitungLuas());
        System.out.println("Luas Total: " + luasTotal);
        
        PersegiPanjang p2 = new PersegiPanjang ();
        p2.p=28;
        p2.l=14;
        
        lingkaran l2 = new lingkaran();
        l2.r = 14;
        
        lingkaran l3 = new lingkaran();
        l3.r = 7;
        
        int luasTotal1 = (int) (0.5*l2.hitungLuas()- p2.hitungLuas() + l3.hitungLuas());
                System.out.println("Luas Total2: " + luasTotal1);

       
        
    }
    
}
