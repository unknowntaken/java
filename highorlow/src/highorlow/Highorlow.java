/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highorlow;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class Highorlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
       int n = (int) (Math.random() *100) +1;
       System.out.println("im thinking of a number between 1 and 100");
       int guess = Integer.parseInt(keyboard.nextLine());
       
      while(guess !=n){
        if (guess < n ){
            System.out.println("too low");
        }
        else{
            System.out.println("too high");
        }
          System.out.println("guess again");
        guess = Integer.parseInt(keyboard.nextLine());
        
       }
    }
    
}
