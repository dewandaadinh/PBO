/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project12;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author dewan
 */
public class Project12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        silver s = new silver ("M001","Mr. X", "Silver", LocalDate.of(2021, 12,5 ),LocalDate.of(2021, 12, 14 ));
        s.printsilver();
        
        gold g = new gold ("M002","Mr. Y", "Gold", LocalDate.of(2021, 12,5 ),LocalDate.of(2021, 12, 14 ));
        g.printsilver();
        
        platinum p = new platinum ("M003","Mr. z", "Platinum", LocalDate.of(2021, 12,5 ),LocalDate.of(2021, 12, 14 ));
        p.printsilver();
        
    }
    
}
