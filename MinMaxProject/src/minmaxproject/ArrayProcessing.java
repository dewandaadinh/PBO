/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

import java.util.Scanner;

/**
 *
 * @author DEWA
 */
public class ArrayProcessing {
    int [] dataBil = new int [100];
    
    int n,j;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya data (n):");
        this.n = input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Masukkan bil ke-"+(i+1)+":");
            this.dataBil[i]=input.nextInt();
        }
    }
        
    int cariMax(int[] data){
        int maksimum = dataBil[0];
        for(j=0; j<this.n; j++) {
            if (dataBil[j] > maksimum){
                maksimum = dataBil[j];
            }
        }
        
        return maksimum;
    }
        
    int cariMin(int[]data){ 
        int minimum = dataBil[0];
        for(j=0; j<this.n; j++) {
            if (dataBil[j] < minimum){
                minimum = dataBil[j];
            }
        }
        
        return minimum;
    }
    
        
    void output(){    
        System.out.println("Nilai maksimum adalah "+this.cariMax(dataBil));
        System.out.println("Nilai minimum adalah "+this.cariMin(dataBil));
    }
}