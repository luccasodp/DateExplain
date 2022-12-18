/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author lucca
 */
public class Main {

    public static void main(String args[]){
        //get atual date local in ISO format
        LocalDate ld = LocalDate.now();
        //get atual date AND TIME local in ISO format
        LocalDateTime ldt = LocalDateTime.now();
        //get A CUSTOM date in ISO format
        LocalDate ldtc = LocalDate.parse("2022-12-18");
        
        
        // format a custom date type 
        //for more information, acess: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy"); 
        
        // get a date with custom format
        System.out.println("Date custom format: "+ ld.format(dtf)); 
        //or ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        //NOTE: all objetc of LocalDate and LocalDateTime have a ToString()
        System.out.println("Atual and local date in ISO format: "+ ld); 
        System.out.println("Atual and local date and time in ISO format: "+ ldt); 
        System.out.println("Custom date in ISO format: "+ ldtc); 
        
    }
}