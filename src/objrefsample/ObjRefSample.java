/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objrefsample;
import java.util.*;
/**
 *
 * @author Ali Zoubeidi
 */
public class ObjRefSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date today = new Date();
        //Date copyToday = new Date();
        Date copyToday = today;
        Date cloneToday = (Date) today.clone();
        
        System.out.println("Today: " + today);
        System.out.println("copyToday: " + copyToday);
        System.out.println("cloneToday: " + cloneToday);
        
        if (today==copyToday){
            System.out.println("\nToday and copyToday are references to the same address");
        } else {
            System.out.println("\nToday and copyToday are NOT references to the same address");
        }
        
         if (today==cloneToday){
            System.out.println("\nToday and cloneToday are references to the same address");
        } else {
            System.out.println("\nToday and cloneToday are NOT references to the same address");
        }
        today.setMonth(5);
        
        System.out.println("Today: " + today);
        System.out.println("copyToday: " + copyToday);
        System.out.println("cloneToday: " + cloneToday);
    }
    
}
