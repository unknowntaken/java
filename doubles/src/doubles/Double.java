/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class Double {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int n1 = 0;
       int n2 =  6;
       System.out.println("Do you want to roll the dice?");
       String answer = keyboard.nextLine();
       while(n2 !=n1 && answer.equals("yes")){
        n1 = (int) (Math.random() *6) +1;
            n2 = (int) (Math.random() *6) +1; 
            System.out.println ("you rolled the dice "+n1+" "+n2);
            if (n1==n2){
                System.out.println("congrats on doubles");
            }
            else{
                System.out.println("do you want to keep rolling?");
                answer = keyboard.nextLine();
            }
        
        
        
       }
       
       System.out.println("game over");
    }
}

    
            

