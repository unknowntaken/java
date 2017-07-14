/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);     
        String answer ="";
       ArrayList<String> l = new ArrayList();
       l.add ("random");
       l.add ("Griffin");
       l.add ("Dwarves");
       l.add ("knight");
       l.add ("forbidden");
       l.add ("cyclopes");
       l.add ("jackknifes");
       l.add ("jackhammer");
       l.add ("pozzolanas");
       l.add ("survival");
       l.add ("podzolizes");
       l.add ("real life");
       l.add ("surfs up");
       l.add ("dragons");
       l.add ("killerbunny");
       l.add ("grunt");
       l.add ("covanent");
       l.add ("end of life");
       
       
       
       int n = (int) (Math.random() *l.size());
       String word =l.get(n);
        boolean playing = true;
        boolean win = false;
        
        ArrayList<Character> letters= new ArrayList();
        ArrayList<Character> guessed = new ArrayList();
        ArrayList<Character> wrong = new ArrayList();
        for (char c : word.toCharArray()) {
            letters.add(c);
        }
                

        
        
        while (!win){
            String soFar="";
            for (char x:letters){
                if (guessed.contains(x)){
                    soFar+=x;
                }
                else {
                    soFar+="-";
                }
            } 
            if (word.equals(soFar)) {
                System.out.println("congrats");
                win=true;
                break;
        }
             System.out.println("Word: " +soFar);
             System.out.println("wrong guesses: "+ wrong);
              System.out.println("Make a guess: ");
             char guess = keyboard.nextLine().charAt(0);
            if (letters.contains(guess)) {
                System.out.println("You got a letter!");
                guessed.add (guess);
            }
            else {
                System.out.println("better try again");
                wrong.add(guess);
            }
            
           
            
                
        }
             }
}