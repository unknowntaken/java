/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.loops;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ForLoopsFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       for (int i = 0; i < 10; i++) {
           System.out.println("I love Java");
    }
System.out.println("enter a number.");       
    int num=Integer.parseInt(keyboard.nextLine());
     for (int i = 0; i <= num; i++) {
         System.out.print(i +" ");
     }
     System.out.println("enter starting number.");
    int start=Integer.parseInt(keyboard.nextLine());
     System.out.println("enter ending number.");
    int end=Integer.parseInt(keyboard.nextLine()); 
     System.out.println("enter counting number.");
    int countby=Integer.parseInt(keyboard.nextLine());
    for (int i = start; i <= end; i+= countby) {
         System.out.print(i +" ");
     }
    
    
    int[]array = new int[10];
    for (int i = 0; i < 10; i++) {
        array[i]=i;
    }
     int[]array2 = new int[10];
    for (int i = 0; i < 10; i++) {
        array2[i]=array[i]+2;
        System.out.println(array2[i]);
    }
    //System.out.println(array2);
}}
