/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.lang.reflect.Array;
/**
 *
 * @author DEWA
 */import java.util.ArrayList;
public class DataArray {
    ArrayList<array> dataArray = new ArrayList <>();
    String dataArr;
    
    void tambahData(String dataArr, array data){
        this.dataArray.add(data);
    }
    
    void cariData(String dataArr){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.dataArray.size(); i++){
            if (this.dataArray.get(i).arraylist == null ? dataArr == null : this.dataArray.get(i).arraylist.equals(dataArr)){
                index = i;
                ditemukan = true;
            }
        }
         
        if (ditemukan == true){
            this.dataArray.get(index).print();
        } else {
            System.out.println("Data Array tidak ditemukan");
        }
       
    }
     void hapusData(String dataArr){
        this.dataArray.removeIf(item -> item.arraylist == dataArr);
    }
      void tampilanData(){
        System.out.println("-----------------");
        for(array item: this.dataArray){
            item.print();
        }
    }
        
    }
    
    
