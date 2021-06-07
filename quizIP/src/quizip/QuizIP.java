/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizip;

import java.util.Scanner;

/**
 *
 * @author Emad Osama
 */
public class QuizIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter IP address: ");  
        String IP= sc.nextLine();              //reads string  
        String x[] = IP.split("\\."); 
        for (String a : x)
            System.out.println(a);
    }
    
}
