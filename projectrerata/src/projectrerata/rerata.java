/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

/**
 *
 * @author DEWA
 */
import java.util.Scanner;
public class rerata {
    int [] dataBil = new int [100];
    
    int n,i,j,swap;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya data (n):");
        this.n = input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Masukkan bil ke-"+(i+1)+":");
            this.dataBil[1]=input.nextInt();
        }
     }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0;i<this.n;i++){
            sum +=data[1];
        }
        double rerata = sum/this.n;
        return rerata;
    } 
    
    int urutkan(int[] data){
        
        for(i=0;i<(this.n);i++){
            for(j=0;j<this.n-1;j++){
                if(dataBil[j]>dataBil[j+1]){
                    swap = dataBil[j];
                    dataBil[j]=dataBil[j+1];
                    dataBil[j+1]=swap;
                    
                }
            }
        }
        return swap;
    }
    
    void output(){
        System.out.println("Rerata:"+this.hitungRerata(this.dataBil));
        System.out.println("\n\nBilangan Terurutnya adalah :");
            for(i=0;i<this.n; i++)
            System.out.print(this.urutkan(this.dataBil)+" ");
    }
}
